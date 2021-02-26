package typingsSlinky.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avg extends StObject {
  
  /**
    * The average facet value in the result set.
    */
  var avg: Double = js.native
  
  /**
    * The maximum value in the result set.
    */
  var max: Double = js.native
  
  /**
    * The minimum value in the result set.
    */
  var min: Double = js.native
  
  /**
    * The sum of all values in the result set.
    */
  var sum: Double = js.native
}
object Avg {
  
  @scala.inline
  def apply(avg: Double, max: Double, min: Double, sum: Double): Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avg]
  }
  
  @scala.inline
  implicit class AvgMutableBuilder[Self <: Avg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
  }
}
