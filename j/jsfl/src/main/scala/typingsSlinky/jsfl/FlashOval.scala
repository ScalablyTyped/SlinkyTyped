package typingsSlinky.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Oval object is a shape that is drawn using the Oval Primitive tool. To determine if an item is an Oval object, use shape.isOvalObject. */
@js.native
trait FlashOval extends StObject {
  
  /** Read-only property; a Boolean value that specifies whether the Close Path check box in the Property inspector is selected. If the start angle and end angle values for the object are the same, setting this property has no effect until the values change. To set this value, use document.setOvalObjectProperty(). */
  var closePath: Boolean = js.native
  
  /** Read-only property; a float value that specifies the end angle of the Oval object. Acceptable values are from 0 to 360. */
  var endAngle: Double = js.native
  
  /** Read-only property; a float value that specifies the inner radius of the Oval object as a percentage. Acceptable values are from 0 to 99. */
  var innerRadius: Double = js.native
  
  /** Read-only property; a float value that specifies the start angle of the Oval object. Acceptable values are from 0 to 360. To set this value, use document.setOvalObjectProperty(). */
  var startAngle: Double = js.native
}
object FlashOval {
  
  @scala.inline
  def apply(closePath: Boolean, endAngle: Double, innerRadius: Double, startAngle: Double): FlashOval = {
    val __obj = js.Dynamic.literal(closePath = closePath.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashOval]
  }
  
  @scala.inline
  implicit class FlashOvalMutableBuilder[Self <: FlashOval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
