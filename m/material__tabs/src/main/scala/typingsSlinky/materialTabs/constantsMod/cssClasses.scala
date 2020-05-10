package typingsSlinky.materialTabs.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTabs.materialTabsStrings.`mdc-tab-bar-scroller__indicator--back`
import typingsSlinky.materialTabs.materialTabsStrings.`mdc-tab-bar-scroller__indicator--enabled`
import typingsSlinky.materialTabs.materialTabsStrings.`mdc-tab-bar-scroller__indicator--forward`
import typingsSlinky.materialTabs.materialTabsStrings.`mdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back` = js.native
  var INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled` = js.native
  var INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward` = js.native
  var TAB: `mdc-tab` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back`,
    INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled`,
    INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward`,
    TAB: `mdc-tab`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(INDICATOR_BACK = INDICATOR_BACK.asInstanceOf[js.Any], INDICATOR_ENABLED = INDICATOR_ENABLED.asInstanceOf[js.Any], INDICATOR_FORWARD = INDICATOR_FORWARD.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withINDICATOR_BACK(value: `mdc-tab-bar-scroller__indicator--back`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_BACK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDICATOR_ENABLED(value: `mdc-tab-bar-scroller__indicator--enabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_ENABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDICATOR_FORWARD(value: `mdc-tab-bar-scroller__indicator--forward`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_FORWARD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAB(value: `mdc-tab`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

