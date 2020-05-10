package typingsSlinky.materialRipple.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--background-focused`
import typingsSlinky.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--foreground-activation`
import typingsSlinky.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--foreground-deactivation`
import typingsSlinky.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--unbounded`
import typingsSlinky.materialRipple.materialRippleStrings.`mdc-ripple-upgraded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var BG_FOCUSED: `mdc-ripple-upgraded--background-focused` = js.native
  var FG_ACTIVATION: `mdc-ripple-upgraded--foreground-activation` = js.native
  var FG_DEACTIVATION: `mdc-ripple-upgraded--foreground-deactivation` = js.native
  // Ripple is a special case where the "root" component is really a "mixin" of sorts,
  // given that it's an 'upgrade' to an existing component. That being said it is the root
  // CSS class that all other CSS classes derive from.
  var ROOT: `mdc-ripple-upgraded` = js.native
  var UNBOUNDED: `mdc-ripple-upgraded--unbounded` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    BG_FOCUSED: `mdc-ripple-upgraded--background-focused`,
    FG_ACTIVATION: `mdc-ripple-upgraded--foreground-activation`,
    FG_DEACTIVATION: `mdc-ripple-upgraded--foreground-deactivation`,
    ROOT: `mdc-ripple-upgraded`,
    UNBOUNDED: `mdc-ripple-upgraded--unbounded`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(BG_FOCUSED = BG_FOCUSED.asInstanceOf[js.Any], FG_ACTIVATION = FG_ACTIVATION.asInstanceOf[js.Any], FG_DEACTIVATION = FG_DEACTIVATION.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], UNBOUNDED = UNBOUNDED.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBG_FOCUSED(value: `mdc-ripple-upgraded--background-focused`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BG_FOCUSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFG_ACTIVATION(value: `mdc-ripple-upgraded--foreground-activation`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FG_ACTIVATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFG_DEACTIVATION(value: `mdc-ripple-upgraded--foreground-deactivation`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FG_DEACTIVATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-ripple-upgraded`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNBOUNDED(value: `mdc-ripple-upgraded--unbounded`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNBOUNDED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

