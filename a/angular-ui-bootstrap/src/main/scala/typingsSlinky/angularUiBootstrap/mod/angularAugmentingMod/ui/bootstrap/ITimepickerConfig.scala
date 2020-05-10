package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimepickerConfig extends js.Object {
  /**
    * Whether the user can use up/down arrowkeys inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var arrowkeys: js.UndefOr[Boolean] = js.native
  /**
    * Number of hours to increase or decrease when using a button.
    *
    * @default 1
    */
  var hourStep: js.UndefOr[Double] = js.native
  /**
    * Meridian labels based on locale. To override you must supply an array like ['AM', 'PM'].
    *
    * @default null
    */
  var meridians: js.UndefOr[js.Array[String]] = js.native
  /**
    * Number of minutes to increase or decrease when using a button.
    *
    * @default 1
    */
  var minuteStep: js.UndefOr[Double] = js.native
  /**
    * Whether the user can scroll inside the hours & minutes input to increase or decrease it's values.
    *
    * @default true
    */
  var mousewheel: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user can type inside the hours & minutes input.
    *
    * @default false
    */
  var readonlyInput: js.UndefOr[Boolean] = js.native
  /**
    * Number of seconds to increase or decrease when using a button.
    *
    * @default 1
    */
  var secondStep: js.UndefOr[Double] = js.native
  /**
    * Whether to display 12H or 24H mode.
    *
    * @default true
    */
  var showMeridian: js.UndefOr[Boolean] = js.native
  /**
    * Show seconds input.
    *
    * @default false
    */
  var showSeconds: js.UndefOr[Boolean] = js.native
  /**
    * Shows spinner arrows above and below the inputs.
    *
    * @default true
    */
  var showSpinners: js.UndefOr[Boolean] = js.native
  /**
    * Add the ability to override the template used on the component.
    *
    * @default 'uib/template/timepicker/timepicker.html'
    */
  var templateUrl: js.UndefOr[String] = js.native
}

object ITimepickerConfig {
  @scala.inline
  def apply(): ITimepickerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimepickerConfig]
  }
  @scala.inline
  implicit class ITimepickerConfigOps[Self <: ITimepickerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowkeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowkeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowkeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowkeys")(js.undefined)
        ret
    }
    @scala.inline
    def withHourStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMeridians(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridians")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeridians: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridians")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(js.undefined)
        ret
    }
    @scala.inline
    def withMousewheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withReadonlyInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonlyInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonlyInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonlyInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMeridian(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeridian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSpinners(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSpinners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpinners")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(js.undefined)
        ret
    }
  }
  
}

