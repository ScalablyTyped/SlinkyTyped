package typingsSlinky.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bezier t values for an arc path segment in a bezier curve.
  */
@js.native
trait IBezierRange extends StObject {
  
  /**
    * The bezier t-value at the end point.
    */
  var endT: Double = js.native
  
  /**
    * The bezier t-value at the starting point.
    */
  var startT: Double = js.native
}
object IBezierRange {
  
  @scala.inline
  def apply(endT: Double, startT: Double): IBezierRange = {
    val __obj = js.Dynamic.literal(endT = endT.asInstanceOf[js.Any], startT = startT.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBezierRange]
  }
  
  @scala.inline
  implicit class IBezierRangeMutableBuilder[Self <: IBezierRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndT(value: Double): Self = StObject.set(x, "endT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartT(value: Double): Self = StObject.set(x, "startT", value.asInstanceOf[js.Any])
  }
}
