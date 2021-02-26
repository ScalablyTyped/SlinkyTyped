package typingsSlinky.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceDotAxisConfiguration extends StObject {
  
  var scale: ScaleCalculator = js.native
}
object ReferenceDotAxisConfiguration {
  
  @scala.inline
  def apply(scale: /* x */ Double | String => Double): ReferenceDotAxisConfiguration = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale))
    __obj.asInstanceOf[ReferenceDotAxisConfiguration]
  }
  
  @scala.inline
  implicit class ReferenceDotAxisConfigurationMutableBuilder[Self <: ReferenceDotAxisConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: /* x */ Double | String => Double): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
  }
}
