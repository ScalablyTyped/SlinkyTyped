package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateComponentRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typingsSlinky.awsSdk.applicationinsightsMod.ComponentName = js.native
  /**
    * The new name of the component.
    */
  var NewComponentName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.NewComponentName] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceList] = js.native
}

object UpdateComponentRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): UpdateComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentRequest]
  }
  @scala.inline
  implicit class UpdateComponentRequestOps[Self <: UpdateComponentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentName(value: ComponentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceGroupName(value: ResourceGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewComponentName(value: NewComponentName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewComponentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewComponentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewComponentName")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceList(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceList")(js.undefined)
        ret
    }
  }
  
}

