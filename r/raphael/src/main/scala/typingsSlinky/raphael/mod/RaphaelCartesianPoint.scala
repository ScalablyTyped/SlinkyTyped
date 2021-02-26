package typingsSlinky.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelCartesianPoint extends StObject {
  
  /** The x coordinate of the point. */
  var x: Double = js.native
  
  /** The y coordinate of the point. */
  var y: Double = js.native
}
object RaphaelCartesianPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): RaphaelCartesianPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelCartesianPoint]
  }
  
  @scala.inline
  implicit class RaphaelCartesianPointMutableBuilder[Self <: RaphaelCartesianPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
