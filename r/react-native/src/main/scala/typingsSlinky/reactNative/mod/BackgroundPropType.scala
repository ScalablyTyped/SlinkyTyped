package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.RippleAndroid
import typingsSlinky.reactNative.reactNativeStrings.ThemeAttrAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.RippleBackgroundPropType
  - typingsSlinky.reactNative.mod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends js.Object
object BackgroundPropType {
  
  @scala.inline
  def RippleBackgroundPropType(`type`: RippleAndroid): BackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPropType]
  }
  
  @scala.inline
  def ThemeAttributeBackgroundPropType(attribute: String, `type`: ThemeAttrAndroid): BackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPropType]
  }
}
