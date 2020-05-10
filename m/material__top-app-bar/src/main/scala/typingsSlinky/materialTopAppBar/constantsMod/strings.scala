package typingsSlinky.materialTopAppBar.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.MDCTopAppBarColonnav
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar__action-item`
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar__navigation-icon`
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar__title`
import typingsSlinky.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ACTION_ITEM_SELECTOR: `Dotmdc-top-app-bar__action-item` = js.native
  var NAVIGATION_EVENT: MDCTopAppBarColonnav = js.native
  var NAVIGATION_ICON_SELECTOR: `Dotmdc-top-app-bar__navigation-icon` = js.native
  var ROOT_SELECTOR: `Dotmdc-top-app-bar` = js.native
  var TITLE_SELECTOR: `Dotmdc-top-app-bar__title` = js.native
}

object strings {
  @scala.inline
  def apply(
    ACTION_ITEM_SELECTOR: `Dotmdc-top-app-bar__action-item`,
    NAVIGATION_EVENT: MDCTopAppBarColonnav,
    NAVIGATION_ICON_SELECTOR: `Dotmdc-top-app-bar__navigation-icon`,
    ROOT_SELECTOR: `Dotmdc-top-app-bar`,
    TITLE_SELECTOR: `Dotmdc-top-app-bar__title`
  ): strings = {
    val __obj = js.Dynamic.literal(ACTION_ITEM_SELECTOR = ACTION_ITEM_SELECTOR.asInstanceOf[js.Any], NAVIGATION_EVENT = NAVIGATION_EVENT.asInstanceOf[js.Any], NAVIGATION_ICON_SELECTOR = NAVIGATION_ICON_SELECTOR.asInstanceOf[js.Any], ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACTION_ITEM_SELECTOR(value: `Dotmdc-top-app-bar__action-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACTION_ITEM_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAVIGATION_EVENT(value: MDCTopAppBarColonnav): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAVIGATION_ICON_SELECTOR(value: `Dotmdc-top-app-bar__navigation-icon`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_ICON_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withROOT_SELECTOR(value: `Dotmdc-top-app-bar`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTITLE_SELECTOR(value: `Dotmdc-top-app-bar__title`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TITLE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

