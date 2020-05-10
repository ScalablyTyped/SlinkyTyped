package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allows tuning how model updates are done.
// https://docs.angularjs.org/api/ng/directive/ngModelOptions
@js.native
trait INgModelOptions extends js.Object {
  var allowInvalid: js.UndefOr[Boolean] = js.native
  var debounce: js.UndefOr[Double | StringDictionary[Double]] = js.native
  var getterSetter: js.UndefOr[Boolean] = js.native
  /**
    * Defines if the time and datetime-local types should show seconds and milliseconds.
    * The option follows the format string of date filter.
    * By default, the options is undefined which is equal to 'ss.sss' (seconds and milliseconds)
    */
  var timeSecondsFormat: js.UndefOr[String] = js.native
  /**
    * Defines if the time and datetime-local types should strip the seconds and milliseconds
    * from the formatted value if they are zero. This option is applied after `timeSecondsFormat`
    */
  var timeStripZeroSeconds: js.UndefOr[Boolean] = js.native
  var timezone: js.UndefOr[String] = js.native
  var updateOn: js.UndefOr[String] = js.native
}

object INgModelOptions {
  @scala.inline
  def apply(): INgModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INgModelOptions]
  }
  @scala.inline
  implicit class INgModelOptionsOps[Self <: INgModelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounce(value: Double | StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(js.undefined)
        ret
    }
    @scala.inline
    def withGetterSetter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterSetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetterSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterSetter")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSecondsFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSecondsFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSecondsFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSecondsFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeStripZeroSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStripZeroSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeStripZeroSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStripZeroSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(js.undefined)
        ret
    }
  }
  
}

