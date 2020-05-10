package typingsSlinky.materialDrawer.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--animate`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--closing`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--dismissible`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--modal`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--open`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer--opening`
import typingsSlinky.materialDrawer.materialDrawerStrings.`mdc-drawer`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ANIMATE: `mdc-drawer--animate` = js.native
  var CLOSING: `mdc-drawer--closing` = js.native
  var DISMISSIBLE: `mdc-drawer--dismissible` = js.native
  var MODAL: `mdc-drawer--modal` = js.native
  var OPEN: `mdc-drawer--open` = js.native
  var OPENING: `mdc-drawer--opening` = js.native
  var ROOT: `mdc-drawer` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    ANIMATE: `mdc-drawer--animate`,
    CLOSING: `mdc-drawer--closing`,
    DISMISSIBLE: `mdc-drawer--dismissible`,
    MODAL: `mdc-drawer--modal`,
    OPEN: `mdc-drawer--open`,
    OPENING: `mdc-drawer--opening`,
    ROOT: `mdc-drawer`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ANIMATE = ANIMATE.asInstanceOf[js.Any], CLOSING = CLOSING.asInstanceOf[js.Any], DISMISSIBLE = DISMISSIBLE.asInstanceOf[js.Any], MODAL = MODAL.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], OPENING = OPENING.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANIMATE(value: `mdc-drawer--animate`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLOSING(value: `mdc-drawer--closing`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISMISSIBLE(value: `mdc-drawer--dismissible`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISMISSIBLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODAL(value: `mdc-drawer--modal`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN(value: `mdc-drawer--open`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPENING(value: `mdc-drawer--opening`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-drawer`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

