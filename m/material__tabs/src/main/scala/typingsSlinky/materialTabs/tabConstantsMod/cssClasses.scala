package typingsSlinky.materialTabs.tabConstantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTabs.materialTabsStrings.`mdc-tab--active`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ACTIVE: `mdc-tab--active` = js.native
}

object cssClasses {
  @scala.inline
  def apply(ACTIVE: `mdc-tab--active`): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any])
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
  }
  
}

