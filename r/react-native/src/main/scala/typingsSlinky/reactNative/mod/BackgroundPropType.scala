package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.RippleAndroid
import typingsSlinky.reactNative.reactNativeStrings.ThemeAttrAndroid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNative.mod.RippleBackgroundPropType
  - typingsSlinky.reactNative.mod.ThemeAttributeBackgroundPropType
*/
trait BackgroundPropType extends StObject
object BackgroundPropType {
  
  @scala.inline
  def RippleBackgroundPropType(`type`: RippleAndroid): typingsSlinky.reactNative.mod.RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNative.mod.RippleBackgroundPropType]
  }
  
  @scala.inline
  def ThemeAttributeBackgroundPropType(attribute: String, `type`: ThemeAttrAndroid): typingsSlinky.reactNative.mod.ThemeAttributeBackgroundPropType = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNative.mod.ThemeAttributeBackgroundPropType]
  }
}
