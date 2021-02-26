package typingsSlinky.reactNativeCalendars.mod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkedDateCustomStyles extends StObject {
  
  var container: StyleProp[ViewStyle] = js.native
  
  var text: StyleProp[TextStyle] = js.native
}
object MarkedDateCustomStyles {
  
  @scala.inline
  def apply(): MarkedDateCustomStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkedDateCustomStyles]
  }
  
  @scala.inline
  implicit class MarkedDateCustomStylesMutableBuilder[Self <: MarkedDateCustomStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: StyleProp[ViewStyle]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setText(value: StyleProp[TextStyle]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
