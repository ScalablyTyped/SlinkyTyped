package typingsSlinky.pulumiAws.resolverRuleAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverRuleAssociationArgs extends js.Object {
  /**
    * A name for the association that you're creating between a resolver rule and a VPC.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the resolver rule that you want to associate with the VPC.
    */
  val resolverRuleId: Input[String] = js.native
  /**
    * The ID of the VPC that you want to associate the resolver rule with.
    */
  val vpcId: Input[String] = js.native
}

object ResolverRuleAssociationArgs {
  @scala.inline
  def apply(resolverRuleId: Input[String], vpcId: Input[String]): ResolverRuleAssociationArgs = {
    val __obj = js.Dynamic.literal(resolverRuleId = resolverRuleId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverRuleAssociationArgs]
  }
  @scala.inline
  implicit class ResolverRuleAssociationArgsOps[Self <: ResolverRuleAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolverRuleId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

