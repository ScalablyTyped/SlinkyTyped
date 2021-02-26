package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarIcon extends IconObject {
  
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}
object AvatarIcon {
  
  @scala.inline
  def apply(): AvatarIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarIcon]
  }
  
  @scala.inline
  implicit class AvatarIconMutableBuilder[Self <: AvatarIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
  }
}
