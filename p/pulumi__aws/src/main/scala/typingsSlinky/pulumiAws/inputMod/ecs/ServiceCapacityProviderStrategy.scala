package typingsSlinky.pulumiAws.inputMod.ecs

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceCapacityProviderStrategy extends StObject {
  
  /**
    * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
    */
  var base: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The short name of the capacity provider.
    */
  var capacityProvider: Input[String] = js.native
  
  /**
    * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
    */
  var weight: js.UndefOr[Input[Double]] = js.native
}
object ServiceCapacityProviderStrategy {
  
  @scala.inline
  def apply(capacityProvider: Input[String]): ServiceCapacityProviderStrategy = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCapacityProviderStrategy]
  }
  
  @scala.inline
  implicit class ServiceCapacityProviderStrategyMutableBuilder[Self <: ServiceCapacityProviderStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Input[Double]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setCapacityProvider(value: Input[String]): Self = StObject.set(x, "capacityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
