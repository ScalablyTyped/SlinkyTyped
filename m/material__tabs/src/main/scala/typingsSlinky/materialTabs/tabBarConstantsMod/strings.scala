package typingsSlinky.materialTabs.tabBarConstantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTabs.materialTabsStrings.MDCTabBarColonchange
import typingsSlinky.materialTabs.materialTabsStrings.`Dotmdc-tab-bar__indicator`
import typingsSlinky.materialTabs.materialTabsStrings.`Dotmdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var CHANGE_EVENT: MDCTabBarColonchange = js.native
  var INDICATOR_SELECTOR: `Dotmdc-tab-bar__indicator` = js.native
  var TAB_SELECTOR: `Dotmdc-tab` = js.native
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCTabBarColonchange,
    INDICATOR_SELECTOR: `Dotmdc-tab-bar__indicator`,
    TAB_SELECTOR: `Dotmdc-tab`
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INDICATOR_SELECTOR = INDICATOR_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHANGE_EVENT(value: MDCTabBarColonchange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDICATOR_SELECTOR(value: `Dotmdc-tab-bar__indicator`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAB_SELECTOR(value: `Dotmdc-tab`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

