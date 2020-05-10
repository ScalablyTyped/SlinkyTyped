package typingsSlinky.angularTouchspin.mod.angularTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITouchSpinOptions extends js.Object {
  var buttonDownClass: js.UndefOr[String] = js.native
  var buttonDownShow: js.UndefOr[Boolean] = js.native
  var buttonDownTxt: js.UndefOr[String] = js.native
  var buttonUpClass: js.UndefOr[String] = js.native
  var buttonUpShow: js.UndefOr[Boolean] = js.native
  var buttonUpTxt: js.UndefOr[String] = js.native
  var decimals: js.UndefOr[Double] = js.native
  var decimalsDelimiter: js.UndefOr[String] = js.native
  var forceStepDivisibility: js.UndefOr[StepDivisibilityType] = js.native
   // default is 'round' ('none' | 'floor' | 'round' | 'ceil') 
  var inputReadOnly: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var mousewheel: js.UndefOr[Boolean] = js.native
  var postfix: js.UndefOr[String] = js.native
  var postfixExtraClass: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var prefixExtraClass: js.UndefOr[String] = js.native
  var step: js.UndefOr[Double] = js.native
  var stepInterval: js.UndefOr[Double] = js.native
  var stepIntervalDelay: js.UndefOr[Double] = js.native
  var verticalButtons: js.UndefOr[Boolean] = js.native
  var verticalDownClass: js.UndefOr[String] = js.native
  var verticalUpClass: js.UndefOr[String] = js.native
}

object ITouchSpinOptions {
  @scala.inline
  def apply(): ITouchSpinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITouchSpinOptions]
  }
  @scala.inline
  implicit class ITouchSpinOptionsOps[Self <: ITouchSpinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonDownClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDownClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonDownClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDownClass")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonDownShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDownShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonDownShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDownShow")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonDownTxt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDownTxt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonDownTxt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonDownTxt")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonUpClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonUpClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonUpClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonUpClass")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonUpShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonUpShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonUpShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonUpShow")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonUpTxt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonUpTxt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonUpTxt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonUpTxt")(js.undefined)
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
    def withDecimalsDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalsDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalsDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalsDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withForceStepDivisibility(value: StepDivisibilityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceStepDivisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceStepDivisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceStepDivisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withInputReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputReadOnly")(js.undefined)
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
    def withPostfixExtraClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfixExtraClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostfixExtraClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfixExtraClass")(js.undefined)
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
    def withPrefixExtraClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixExtraClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixExtraClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixExtraClass")(js.undefined)
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
    def withStepInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withStepIntervalDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepIntervalDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepIntervalDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepIntervalDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalDownClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDownClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalDownClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalDownClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalUpClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalUpClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalUpClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalUpClass")(js.undefined)
        ret
    }
  }
  
}

