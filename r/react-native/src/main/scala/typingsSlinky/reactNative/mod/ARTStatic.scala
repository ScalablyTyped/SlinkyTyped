package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARTStatic extends StObject {
  
  var ClippingRectangle: Instantiable0[typingsSlinky.reactNative.mod.ClippingRectangle] = js.native
  
  var Group: Instantiable0[typingsSlinky.reactNative.mod.Group] = js.native
  
  var Shape: Instantiable0[typingsSlinky.reactNative.mod.Shape] = js.native
  
  var Surface: Instantiable0[typingsSlinky.reactNative.mod.Surface] = js.native
  
  var Text: Instantiable0[ARTText] = js.native
}
object ARTStatic {
  
  @scala.inline
  def apply(
    ClippingRectangle: Instantiable0[ClippingRectangle],
    Group: Instantiable0[Group],
    Shape: Instantiable0[Shape],
    Surface: Instantiable0[Surface],
    Text: Instantiable0[ARTText]
  ): ARTStatic = {
    val __obj = js.Dynamic.literal(ClippingRectangle = ClippingRectangle.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], Surface = Surface.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTStatic]
  }
  
  @scala.inline
  implicit class ARTStaticMutableBuilder[Self <: ARTStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClippingRectangle(value: Instantiable0[ClippingRectangle]): Self = StObject.set(x, "ClippingRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: Instantiable0[Group]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: Instantiable0[Shape]): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurface(value: Instantiable0[Surface]): Self = StObject.set(x, "Surface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Instantiable0[ARTText]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
