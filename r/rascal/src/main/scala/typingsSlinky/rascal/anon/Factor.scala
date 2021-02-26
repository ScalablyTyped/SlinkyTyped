package typingsSlinky.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factor extends StObject {
  
  var factor: Double = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var strategy: String = js.native
}
object Factor {
  
  @scala.inline
  def apply(factor: Double, max: Double, min: Double, strategy: String): Factor = {
    val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factor]
  }
  
  @scala.inline
  implicit class FactorMutableBuilder[Self <: Factor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
