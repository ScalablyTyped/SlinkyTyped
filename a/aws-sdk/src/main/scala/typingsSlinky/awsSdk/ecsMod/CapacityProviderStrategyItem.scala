package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityProviderStrategyItem extends js.Object {
  
  /**
    * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
    */
  var base: js.UndefOr[CapacityProviderStrategyItemBase] = js.native
  
  /**
    * The short name of the capacity provider.
    */
  var capacityProvider: String = js.native
  
  /**
    * The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. For example, if you have a strategy that contains two capacity providers and both have a weight of 1, then when the base is satisfied, the tasks will be split evenly across the two capacity providers. Using that same logic, if you specify a weight of 1 for capacityProviderA and a weight of 4 for capacityProviderB, then for every one task that is run using capacityProviderA, four tasks would use capacityProviderB.
    */
  var weight: js.UndefOr[CapacityProviderStrategyItemWeight] = js.native
}
object CapacityProviderStrategyItem {
  
  @scala.inline
  def apply(capacityProvider: String): CapacityProviderStrategyItem = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderStrategyItem]
  }
  
  @scala.inline
  implicit class CapacityProviderStrategyItemOps[Self <: CapacityProviderStrategyItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCapacityProvider(value: String): Self = this.set("capacityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: CapacityProviderStrategyItemBase): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setWeight(value: CapacityProviderStrategyItemWeight): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
