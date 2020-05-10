package typingsSlinky.materialTab.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTab.materialTabStrings.`mdc-tab--active`
import typingsSlinky.materialTab.materialTabStrings.`mdc-tab--animating-activate`
import typingsSlinky.materialTab.materialTabStrings.`mdc-tab--animating-deactivate`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ACTIVE: `mdc-tab--active` = js.native
  var ANIMATING_ACTIVATE: `mdc-tab--animating-activate` = js.native
  var ANIMATING_DEACTIVATE: `mdc-tab--animating-deactivate` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: `mdc-tab--active`,
    ANIMATING_ACTIVATE: `mdc-tab--animating-activate`,
    ANIMATING_DEACTIVATE: `mdc-tab--animating-deactivate`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], ANIMATING_ACTIVATE = ANIMATING_ACTIVATE.asInstanceOf[js.Any], ANIMATING_DEACTIVATE = ANIMATING_DEACTIVATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTIVE(value: `mdc-tab--active`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIMATING_ACTIVATE(value: `mdc-tab--animating-activate`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_ACTIVATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIMATING_DEACTIVATE(value: `mdc-tab--animating-deactivate`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_DEACTIVATE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

