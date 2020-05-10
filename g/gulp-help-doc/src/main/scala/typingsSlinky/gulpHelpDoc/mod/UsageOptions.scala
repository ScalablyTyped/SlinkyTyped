package typingsSlinky.gulpHelpDoc.mod

import typingsSlinky.gulpHelpDoc.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageOptions extends js.Object {
  /**
    * Path to a gulpfile (default is gulpfile.js)
    * Normally, there is no need to change this option. It may be used
    * for some special cases, like mocking gulpfile for testing.
    */
  var gulpfile: js.UndefOr[String] = js.native
  /**
    * Defines max width of the column width tasks or args names
    * (by default is 20 characters long)
    */
  var keysColumnWidth: js.UndefOr[Double] = js.native
  /**
    * Defines  max line width for the printed output lines
    * (by default is 80 characters long)
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * Printing engine (by default is console). Accepted any device
    * which has log() function defined to do output.
    */
  var logger: js.UndefOr[AnonLog] = js.native
  /**
    * Defines number of empty characters for left-padding of the output
    */
  var padding: js.UndefOr[Double] = js.native
}

object UsageOptions {
  @scala.inline
  def apply(): UsageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageOptions]
  }
  @scala.inline
  implicit class UsageOptionsOps[Self <: UsageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGulpfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gulpfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGulpfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gulpfile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeysColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keysColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: AnonLog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
  }
  
}

