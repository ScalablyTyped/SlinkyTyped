package typingsSlinky.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRange extends StObject {
  
  /**
    * Highest value in the range
    * Double
    */
  var qMax: Double = js.native
  
  /**
    * If set to true, the range includes the highest value in the range of
    * selections (Equals to ). [bn(50500)]
    * Example: The range is [1,10]. If qMinInclEq is set to true it means
    * that 10 is included in the range of selections.
    */
  var qMaxInclEq: Boolean = js.native
  
  /**
    * Lowest value in the range
    * Double
    */
  var qMin: Double = js.native
  
  /**
    * If set to true, the range includes the lowest value in the range of
    * selections (Equals to ). [bn(50500)]
    * Example: The range is [1,10]. If qMinInclEq is set to true it means
    * that 1 is included in the range of selections.
    */
  var qMinInclEq: Boolean = js.native
}
object IRange {
  
  @scala.inline
  def apply(qMax: Double, qMaxInclEq: Boolean, qMin: Double, qMinInclEq: Boolean): IRange = {
    val __obj = js.Dynamic.literal(qMax = qMax.asInstanceOf[js.Any], qMaxInclEq = qMaxInclEq.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qMinInclEq = qMinInclEq.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRange]
  }
  
  @scala.inline
  implicit class IRangeMutableBuilder[Self <: IRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMaxInclEq(value: Boolean): Self = StObject.set(x, "qMaxInclEq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMinInclEq(value: Boolean): Self = StObject.set(x, "qMinInclEq", value.asInstanceOf[js.Any])
  }
}
