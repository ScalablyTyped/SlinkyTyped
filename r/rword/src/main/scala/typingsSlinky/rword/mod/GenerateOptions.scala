package typingsSlinky.rword.mod

import typingsSlinky.rword.rwordStrings.all
import typingsSlinky.rword.rwordStrings.first
import typingsSlinky.rword.rwordStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOptions extends js.Object {
  /**
    * Sets the capitalization of the randomly chosen words
    */
  var capitalize: js.UndefOr[none | first | all] = js.native
  /**
    * Regex words must match to have a chance of being randomly chosen
    * @example "word"
    * @example /ing$/
    */
  var contains: js.UndefOr[js.RegExp | String] = js.native
  /**
    * A length or range of lengths that a word must match for it to have a
    *  chance of being randomly chosen
    * @example 5
    * @example "3-10"
    */
  var length: js.UndefOr[String | Double] = js.native
}

object GenerateOptions {
  @scala.inline
  def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapitalize(value: none | first | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: js.RegExp | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
  }
  
}

