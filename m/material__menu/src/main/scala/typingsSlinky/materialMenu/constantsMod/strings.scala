package typingsSlinky.materialMenu.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialMenu.materialMenuStrings.MDCMenuColoncancel
import typingsSlinky.materialMenu.materialMenuStrings.MDCMenuColonselected
import typingsSlinky.materialMenu.materialMenuStrings.`Dotmdc-menu__items`
import typingsSlinky.materialMenu.materialMenuStrings.`aria-disabled`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ARIA_DISABLED_ATTR: `aria-disabled` = js.native
  var CANCEL_EVENT: MDCMenuColoncancel = js.native
  var ITEMS_SELECTOR: `Dotmdc-menu__items` = js.native
  var SELECTED_EVENT: MDCMenuColonselected = js.native
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED_ATTR: `aria-disabled`,
    CANCEL_EVENT: MDCMenuColoncancel,
    ITEMS_SELECTOR: `Dotmdc-menu__items`,
    SELECTED_EVENT: MDCMenuColonselected
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED_ATTR = ARIA_DISABLED_ATTR.asInstanceOf[js.Any], CANCEL_EVENT = CANCEL_EVENT.asInstanceOf[js.Any], ITEMS_SELECTOR = ITEMS_SELECTOR.asInstanceOf[js.Any], SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARIA_DISABLED_ATTR(value: `aria-disabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DISABLED_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCANCEL_EVENT(value: MDCMenuColoncancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CANCEL_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withITEMS_SELECTOR(value: `Dotmdc-menu__items`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ITEMS_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSELECTED_EVENT(value: MDCMenuColonselected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

