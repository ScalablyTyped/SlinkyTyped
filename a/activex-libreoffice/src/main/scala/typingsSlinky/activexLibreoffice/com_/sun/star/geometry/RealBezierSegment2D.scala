package typingsSlinky.activexLibreoffice.com_.sun.star.geometry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains the relevant data for a cubic Bezier curve.
  *
  * The data is stored real-valued. The last point of the segment is taken from the first point of the following segment, and thus not included herein.
  * That is, when forming a polygon out of cubic Bezier segments, each two consecutive {@link RealBezierSegment2D} define the actual curve, with the very
  * last segment providing only the end point of the last curve, and the remaining members ignored.
  * @see com.sun.star.rendering.XBezierPolyPolygon2D
  * @since OOo 2.0
  */
@js.native
trait RealBezierSegment2D extends StObject {
  
  var C1x: Double = js.native
  
  var C1y: Double = js.native
  
  var C2x: Double = js.native
  
  var C2y: Double = js.native
  
  var Px: Double = js.native
  
  var Py: Double = js.native
}
object RealBezierSegment2D {
  
  @scala.inline
  def apply(C1x: Double, C1y: Double, C2x: Double, C2y: Double, Px: Double, Py: Double): RealBezierSegment2D = {
    val __obj = js.Dynamic.literal(C1x = C1x.asInstanceOf[js.Any], C1y = C1y.asInstanceOf[js.Any], C2x = C2x.asInstanceOf[js.Any], C2y = C2y.asInstanceOf[js.Any], Px = Px.asInstanceOf[js.Any], Py = Py.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealBezierSegment2D]
  }
  
  @scala.inline
  implicit class RealBezierSegment2DMutableBuilder[Self <: RealBezierSegment2D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC1x(value: Double): Self = StObject.set(x, "C1x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC1y(value: Double): Self = StObject.set(x, "C1y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC2x(value: Double): Self = StObject.set(x, "C2x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC2y(value: Double): Self = StObject.set(x, "C2y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPx(value: Double): Self = StObject.set(x, "Px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPy(value: Double): Self = StObject.set(x, "Py", value.asInstanceOf[js.Any])
  }
}
