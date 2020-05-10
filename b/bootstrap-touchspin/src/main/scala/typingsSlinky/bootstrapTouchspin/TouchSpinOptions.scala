package typingsSlinky.bootstrapTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TouchSpinOptions. All options are optional
  */
@js.native
trait TouchSpinOptions extends js.Object {
  /**
    * Boost at every nth step.
    */
  var boostat: js.UndefOr[Double] = js.native
  /**
    * If enabled, the the spinner is continually becoming faster as holding the button.
    */
  var booster: js.UndefOr[Boolean] = js.native
  /**
    * Class(es) of down button.
    */
  var buttondown_class: js.UndefOr[String] = js.native
  /**
    * Class(es) of up button.
    */
  var buttonup_class: js.UndefOr[String] = js.native
  /**
    * Number of decimal points.
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * How to force the value to be divisible by step value: 'none' | 'round' | 'floor' | 'ceil'
    */
  var forcestepdivisibility: js.UndefOr[String] = js.native
  /**
    * Applied when no explicit value is set on the input with the value attribute.
    * Empty string means that the value remains empty on initialization.
    */
  var initval: js.UndefOr[Double | String] = js.native
  /**
    * Maximum value.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Maximum step when boosted.
    */
  var maxboostedstep: js.UndefOr[Double | Boolean] = js.native
  /**
    * Minimum value.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Enables the mouse wheel to change the value of the input.
    */
  var mousewheel: js.UndefOr[Boolean] = js.native
  /**
    * Text after the input.
    */
  var postfix: js.UndefOr[String] = js.native
  /**
    * Extra class(es) for postfix.
    */
  var postfix_extraclass: js.UndefOr[String] = js.native
  /**
    * Text before the input.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Extra class(es) for prefix.
    */
  var prefix_extraclass: js.UndefOr[String] = js.native
  /**
    * Incremental/decremental step on up/down change.
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Refresh rate of the spinner in milliseconds.
    */
  var stepinterval: js.UndefOr[Double] = js.native
  /**
    * Time in milliseconds before the spinner starts to spin.
    */
  var stepintervaldelay: js.UndefOr[Double] = js.native
  /**
    * Enables the traditional up/down buttons.
    */
  var verticalbuttons: js.UndefOr[Boolean] = js.native
  /**
    * Class of the down button with vertical buttons mode enabled.
    */
  var verticaldownclass: js.UndefOr[String] = js.native
  /**
    * Class of the up button with vertical buttons mode enabled.
    */
  var verticalupclass: js.UndefOr[String] = js.native
}

object TouchSpinOptions {
  @scala.inline
  def apply(): TouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchSpinOptions]
  }
  @scala.inline
  implicit class TouchSpinOptionsOps[Self <: TouchSpinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoostat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boostat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoostat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boostat")(js.undefined)
        ret
    }
    @scala.inline
    def withBooster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booster")(js.undefined)
        ret
    }
    @scala.inline
    def withButtondown_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttondown_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtondown_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttondown_class")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonup_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonup_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonup_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonup_class")(js.undefined)
        ret
    }
    @scala.inline
    def withDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimals")(js.undefined)
        ret
    }
    @scala.inline
    def withForcestepdivisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcestepdivisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcestepdivisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcestepdivisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withInitval(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initval")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxboostedstep(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxboostedstep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxboostedstep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxboostedstep")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
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
    def withPostfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(js.undefined)
        ret
    }
    @scala.inline
    def withPostfix_extraclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix_extraclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostfix_extraclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix_extraclass")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix_extraclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix_extraclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix_extraclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix_extraclass")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withStepinterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepinterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepinterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepinterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStepintervaldelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepintervaldelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepintervaldelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepintervaldelay")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalbuttons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalbuttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalbuttons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalbuttons")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticaldownclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticaldownclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticaldownclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticaldownclass")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalupclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalupclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalupclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalupclass")(js.undefined)
        ret
    }
  }
  
}

