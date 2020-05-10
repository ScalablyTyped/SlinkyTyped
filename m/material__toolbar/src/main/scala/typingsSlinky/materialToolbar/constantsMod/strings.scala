package typingsSlinky.materialToolbar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialToolbar.materialToolbarStrings.MDCToolbarColonchange
import typingsSlinky.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__icon`
import typingsSlinky.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__rowColonfirst-child`
import typingsSlinky.materialToolbar.materialToolbarStrings.`Dotmdc-toolbar__title`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var CHANGE_EVENT: MDCToolbarColonchange = js.native
  var FIRST_ROW_SELECTOR: `Dotmdc-toolbar__rowColonfirst-child` = js.native
  var ICON_SELECTOR: `Dotmdc-toolbar__icon` = js.native
  var TITLE_SELECTOR: `Dotmdc-toolbar__title` = js.native
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCToolbarColonchange,
    FIRST_ROW_SELECTOR: `Dotmdc-toolbar__rowColonfirst-child`,
    ICON_SELECTOR: `Dotmdc-toolbar__icon`,
    TITLE_SELECTOR: `Dotmdc-toolbar__title`
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], FIRST_ROW_SELECTOR = FIRST_ROW_SELECTOR.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHANGE_EVENT(value: MDCToolbarColonchange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFIRST_ROW_SELECTOR(value: `Dotmdc-toolbar__rowColonfirst-child`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIRST_ROW_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withICON_SELECTOR(value: `Dotmdc-toolbar__icon`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ICON_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTITLE_SELECTOR(value: `Dotmdc-toolbar__title`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TITLE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

