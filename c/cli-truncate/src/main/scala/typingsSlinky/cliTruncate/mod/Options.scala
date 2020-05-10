package typingsSlinky.cliTruncate.mod

import typingsSlinky.cliTruncate.cliTruncateStrings.end
import typingsSlinky.cliTruncate.cliTruncateStrings.middle
import typingsSlinky.cliTruncate.cliTruncateStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Position to truncate the string.
  		@default 'end'
  		*/
  val position: js.UndefOr[start | middle | end] = js.native
  /**
  		Truncate the string from a whitespace if it is within 3 characters from the actual breaking point.
  		@default false
  		@example
  		```
  		cliTruncate('unicorns rainbow dragons', 20, {position: 'start', preferTruncationOnSpace: true});
  		//=> '…rainbow dragons'
  		cliTruncate('unicorns rainbow dragons', 20, {position: 'middle', preferTruncationOnSpace: true});
  		//=> 'unicorns…dragons'
  		cliTruncate('unicorns rainbow dragons', 6, {position: 'end', preferTruncationOnSpace: true});
  		//=> 'unico…'
  		````
  		*/
  val preferTruncationOnSpace: js.UndefOr[Boolean] = js.native
  /**
  		Add a space between the text and the ellipsis.
  		@default false
  		@example
  		```
  		cliTruncate('unicorns', 5, {position: 'end', space: true});
  		//=> 'uni …'
  		cliTruncate('unicorns', 5, {position: 'end', space: false});
  		//=> 'unic…'
  		cliTruncate('unicorns', 6, {position: 'start', space: true});
  		//=> '… orns'
  		cliTruncate('unicorns', 7, {position: 'middle', space: true});
  		//=> 'uni … s'
  		```
  		*/
  val space: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: start | middle | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferTruncationOnSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferTruncationOnSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferTruncationOnSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferTruncationOnSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
  }
  
}

