package typingsSlinky.materialMenu.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialMenu.materialMenuStrings.`mdc-list-item--selected`
import typingsSlinky.materialMenu.materialMenuStrings.`mdc-menu--animating-closed`
import typingsSlinky.materialMenu.materialMenuStrings.`mdc-menu--animating-open`
import typingsSlinky.materialMenu.materialMenuStrings.`mdc-menu--open`
import typingsSlinky.materialMenu.materialMenuStrings.`mdc-menu`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ANIMATING_CLOSED: `mdc-menu--animating-closed` = js.native
  var ANIMATING_OPEN: `mdc-menu--animating-open` = js.native
  var OPEN: `mdc-menu--open` = js.native
  var ROOT: `mdc-menu` = js.native
  var SELECTED_LIST_ITEM: `mdc-list-item--selected` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    ANIMATING_CLOSED: `mdc-menu--animating-closed`,
    ANIMATING_OPEN: `mdc-menu--animating-open`,
    OPEN: `mdc-menu--open`,
    ROOT: `mdc-menu`,
    SELECTED_LIST_ITEM: `mdc-list-item--selected`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ANIMATING_CLOSED = ANIMATING_CLOSED.asInstanceOf[js.Any], ANIMATING_OPEN = ANIMATING_OPEN.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], SELECTED_LIST_ITEM = SELECTED_LIST_ITEM.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANIMATING_CLOSED(value: `mdc-menu--animating-closed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_CLOSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIMATING_OPEN(value: `mdc-menu--animating-open`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_OPEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPEN(value: `mdc-menu--open`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT(value: `mdc-menu`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECTED_LIST_ITEM(value: `mdc-list-item--selected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_LIST_ITEM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

