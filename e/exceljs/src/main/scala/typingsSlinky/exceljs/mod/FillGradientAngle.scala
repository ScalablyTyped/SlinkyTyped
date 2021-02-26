package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.angle
import typingsSlinky.exceljs.exceljsStrings.gradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillGradientAngle extends Fill {
  
  /**
  	 * For 'angle' gradient, specifies the direction of the gradient. 0 is from the left to the right.
  	 * Values from 1 - 359 rotates the direction clockwise
  	 */
  var degree: Double = js.native
  
  var gradient: angle = js.native
  
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop] = js.native
  
  var `type`: gradient = js.native
}
object FillGradientAngle {
  
  @scala.inline
  def apply(degree: Double, gradient: angle, stops: js.Array[GradientStop], `type`: gradient): FillGradientAngle = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillGradientAngle]
  }
  
  @scala.inline
  implicit class FillGradientAngleMutableBuilder[Self <: FillGradientAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradient(value: angle): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStops(value: js.Array[GradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: GradientStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setType(value: gradient): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
