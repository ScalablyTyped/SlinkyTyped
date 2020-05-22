package typingsSlinky.materialTabs.tabConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTabs.materialTabsStrings.`mdc-tab--active`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ACTIVE: `mdc-tab--active`
}

object cssClasses {
  @scala.inline
  def apply(ACTIVE: `mdc-tab--active`, StringDictionary: StringDictionary[String] = null): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

