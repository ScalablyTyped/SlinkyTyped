package typingsSlinky.atMaterialTabs.tabDashBarDashScrollerConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atMaterialBase.foundationMod.MDCStrings
import typingsSlinky.atMaterialTabs.atMaterialTabsStrings.`mdc-tab-bar-scroller__indicator--back`
import typingsSlinky.atMaterialTabs.atMaterialTabsStrings.`mdc-tab-bar-scroller__indicator--enabled`
import typingsSlinky.atMaterialTabs.atMaterialTabsStrings.`mdc-tab-bar-scroller__indicator--forward`
import typingsSlinky.atMaterialTabs.atMaterialTabsStrings.`mdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back`
  var INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled`
  var INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward`
  var TAB: `mdc-tab`
}

object cssClasses {
  @scala.inline
  def apply(
    INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back`,
    INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled`,
    INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward`,
    TAB: `mdc-tab`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(INDICATOR_BACK = INDICATOR_BACK.asInstanceOf[js.Any], INDICATOR_ENABLED = INDICATOR_ENABLED.asInstanceOf[js.Any], INDICATOR_FORWARD = INDICATOR_FORWARD.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

