package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ARTClippingRectangleProps extends ARTNodeMixin {
  
  var height: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ARTClippingRectangleProps {
  
  @scala.inline
  def apply(): ARTClippingRectangleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ARTClippingRectangleProps]
  }
  
  @scala.inline
  implicit class ARTClippingRectanglePropsMutableBuilder[Self <: ARTClippingRectangleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
