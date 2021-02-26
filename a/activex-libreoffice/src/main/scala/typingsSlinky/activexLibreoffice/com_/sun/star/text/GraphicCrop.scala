package typingsSlinky.activexLibreoffice.com_.sun.star.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the cropping of graphic objects. Cropping means to show only parts of the object.
  *
  * Negative values cut the visible area; positive values extend the visible area by filling it with background color. The absolute sum of top and bottom
  * crop must be smaller than the objects original height. The absolute sum of the left and right crop must be smaller than the object's original width.
  *
  * If this property is applied to a graphic object, then this object will correct these values if necessary.
  */
@js.native
trait GraphicCrop extends StObject {
  
  /** contains the bottom value to cut (if negative) or to extend (if positive) */
  var Bottom: Double = js.native
  
  /** contains the left value to cut (if negative) or to extend (if positive) */
  var Left: Double = js.native
  
  /** contains the right value to cut (if negative) or to extend (if positive) */
  var Right: Double = js.native
  
  /** contains the top value to cut (if negative) or to extend (if positive) */
  var Top: Double = js.native
}
object GraphicCrop {
  
  @scala.inline
  def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): GraphicCrop = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicCrop]
  }
  
  @scala.inline
  implicit class GraphicCropMutableBuilder[Self <: GraphicCrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "Bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
  }
}
