package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceChange extends js.Object {
  /**
    * The change action.
    */
  var Action: js.UndefOr[ChangeAction] = js.native
  /**
    * Information about the resource changes.
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.native
  /**
    * The ID of the resource, as defined in the CloudFormation template.
    */
  var LogicalResourceId: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.LogicalResourceId] = js.native
  /**
    * The ID of the resource, if it was already created.
    */
  var PhysicalResourceId: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PhysicalResourceId] = js.native
  /**
    * If the change type is Modify, indicates whether the existing resource is deleted and replaced with a new one.
    */
  var Replacement: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Replacement] = js.native
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[PlanResourceType] = js.native
  /**
    * The change scope.
    */
  var Scope: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Scope] = js.native
}

object ResourceChange {
  @scala.inline
  def apply(): ResourceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChange]
  }
  @scala.inline
  implicit class ResourceChangeOps[Self <: ResourceChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ChangeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: ResourceChangeDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalResourceId(value: LogicalResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalResourceId(value: PhysicalResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacement(value: Replacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replacement")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: PlanResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(js.undefined)
        ret
    }
  }
  
}

