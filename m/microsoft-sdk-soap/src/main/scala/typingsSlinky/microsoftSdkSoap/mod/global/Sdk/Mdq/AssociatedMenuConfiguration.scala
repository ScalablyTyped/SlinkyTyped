package typingsSlinky.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatedMenuConfiguration extends js.Object {
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
  implicit class AssociatedMenuConfigurationOps[Self <: AssociatedMenuConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: AssociatedMenuBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: AssociatedMenuGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

