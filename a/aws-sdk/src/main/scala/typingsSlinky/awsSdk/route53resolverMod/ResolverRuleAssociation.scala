package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleAssociation extends js.Object {
  /**
    * The ID of the association between a resolver rule and a VPC. Resolver assigns this value when you submit an AssociateResolverRule request.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The name of an association between a resolver rule and a VPC.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of the resolver rule that you associated with the VPC that is specified by VPCId.
    */
  var ResolverRuleId: js.UndefOr[ResourceId] = js.native
  /**
    * A code that specifies the current status of the association between a resolver rule and a VPC.
    */
  var Status: js.UndefOr[ResolverRuleAssociationStatus] = js.native
  /**
    * A detailed description of the status of the association between a resolver rule and a VPC.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.StatusMessage] = js.native
  /**
    * The ID of the VPC that you associated the resolver rule with.
    */
  var VPCId: js.UndefOr[ResourceId] = js.native
}

object ResolverRuleAssociation {
  @scala.inline
  def apply(): ResolverRuleAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleAssociation]
  }
  @scala.inline
  implicit class ResolverRuleAssociationOps[Self <: ResolverRuleAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverRuleId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResolverRuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ResolverRuleAssociationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withVPCId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVPCId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCId")(js.undefined)
        ret
    }
  }
  
}

