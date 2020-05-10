package typingsSlinky.materialRipple.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCNumbers
import typingsSlinky.materialRipple.materialRippleNumbers.`0.6`
import typingsSlinky.materialRipple.materialRippleNumbers.`10`
import typingsSlinky.materialRipple.materialRippleNumbers.`150`
import typingsSlinky.materialRipple.materialRippleNumbers.`225`
import typingsSlinky.materialRipple.materialRippleNumbers.`300`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait numbers extends MDCNumbers {
  var DEACTIVATION_TIMEOUT_MS: `225` = js.native
   // Corresponds to $mdc-ripple-translate-duration (i.e. activation animation duration)
  var FG_DEACTIVATION_MS: `150` = js.native
  var INITIAL_ORIGIN_SCALE: `0.6` = js.native
  var PADDING: `10` = js.native
   // Corresponds to $mdc-ripple-fade-out-duration (i.e. deactivation animation duration)
  var TAP_DELAY_MS: `300` = js.native
}

object numbers {
  @scala.inline
  def apply(
    DEACTIVATION_TIMEOUT_MS: `225`,
    FG_DEACTIVATION_MS: `150`,
    INITIAL_ORIGIN_SCALE: `0.6`,
    PADDING: `10`,
    TAP_DELAY_MS: `300`
  ): numbers = {
    val __obj = js.Dynamic.literal(DEACTIVATION_TIMEOUT_MS = DEACTIVATION_TIMEOUT_MS.asInstanceOf[js.Any], FG_DEACTIVATION_MS = FG_DEACTIVATION_MS.asInstanceOf[js.Any], INITIAL_ORIGIN_SCALE = INITIAL_ORIGIN_SCALE.asInstanceOf[js.Any], PADDING = PADDING.asInstanceOf[js.Any], TAP_DELAY_MS = TAP_DELAY_MS.asInstanceOf[js.Any])
    __obj.asInstanceOf[numbers]
  }
  @scala.inline
  implicit class numbersOps[Self <: numbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEACTIVATION_TIMEOUT_MS(value: `225`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEACTIVATION_TIMEOUT_MS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFG_DEACTIVATION_MS(value: `150`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FG_DEACTIVATION_MS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINITIAL_ORIGIN_SCALE(value: `0.6`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_ORIGIN_SCALE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPADDING(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PADDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAP_DELAY_MS(value: `300`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAP_DELAY_MS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

