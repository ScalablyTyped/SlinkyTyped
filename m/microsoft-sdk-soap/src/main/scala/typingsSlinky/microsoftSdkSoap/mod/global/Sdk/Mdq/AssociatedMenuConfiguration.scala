package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedMenuConfiguration extends StObject {
  
  var Behavior: AssociatedMenuBehavior = js.native
  
  var Group: AssociatedMenuGroup = js.native
  
  var Label: typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq.Label = js.native
  
  var Order: Double = js.native
}
object AssociatedMenuConfiguration {
  
  @scala.inline
  def apply(Behavior: AssociatedMenuBehavior, Group: AssociatedMenuGroup, Label: Label, Order: Double): AssociatedMenuConfiguration = {
    val __obj = js.Dynamic.literal(Behavior = Behavior.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedMenuConfiguration]
  }
  
  @scala.inline
  implicit class AssociatedMenuConfigurationMutableBuilder[Self <: AssociatedMenuConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: AssociatedMenuBehavior): Self = StObject.set(x, "Behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: AssociatedMenuGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
  }
}
