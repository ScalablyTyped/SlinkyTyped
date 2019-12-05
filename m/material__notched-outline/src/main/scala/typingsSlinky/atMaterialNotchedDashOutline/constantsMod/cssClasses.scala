package typingsSlinky.atMaterialNotchedDashOutline.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atMaterialBase.foundationMod.MDCStrings
import typingsSlinky.atMaterialNotchedDashOutline.atMaterialNotchedDashOutlineStrings.`mdc-notched-outline--notched`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var OUTLINE_NOTCHED: `mdc-notched-outline--notched`
}

object cssClasses {
  @scala.inline
  def apply(OUTLINE_NOTCHED: `mdc-notched-outline--notched`, StringDictionary: StringDictionary[String] = null): cssClasses = {
    val __obj = js.Dynamic.literal(OUTLINE_NOTCHED = OUTLINE_NOTCHED.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

