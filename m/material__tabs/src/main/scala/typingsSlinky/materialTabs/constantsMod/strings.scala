package typingsSlinky.materialTabs.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__indicator--back`
import typingsSlinky.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__indicator--forward`
import typingsSlinky.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__scroll-frame__tabs`
import typingsSlinky.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__scroll-frame`
import typingsSlinky.materialTabs.materialTabsStrings.`Dotmdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var FRAME_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame` = js.native
  var INDICATOR_BACK_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--back` = js.native
  var INDICATOR_FORWARD_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--forward` = js.native
  var TABS_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame__tabs` = js.native
  var TAB_SELECTOR: `Dotmdc-tab` = js.native
}

object strings {
  @scala.inline
  def apply(
    FRAME_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame`,
    INDICATOR_BACK_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--back`,
    INDICATOR_FORWARD_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--forward`,
    TABS_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame__tabs`,
    TAB_SELECTOR: `Dotmdc-tab`
  ): strings = {
    val __obj = js.Dynamic.literal(FRAME_SELECTOR = FRAME_SELECTOR.asInstanceOf[js.Any], INDICATOR_BACK_SELECTOR = INDICATOR_BACK_SELECTOR.asInstanceOf[js.Any], INDICATOR_FORWARD_SELECTOR = INDICATOR_FORWARD_SELECTOR.asInstanceOf[js.Any], TABS_SELECTOR = TABS_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFRAME_SELECTOR(value: `Dotmdc-tab-bar-scroller__scroll-frame`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FRAME_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDICATOR_BACK_SELECTOR(value: `Dotmdc-tab-bar-scroller__indicator--back`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDICATOR_FORWARD_SELECTOR(value: `Dotmdc-tab-bar-scroller__indicator--forward`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTABS_SELECTOR(value: `Dotmdc-tab-bar-scroller__scroll-frame__tabs`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TABS_SELECTOR")(value.asInstanceOf[js.Any])
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

