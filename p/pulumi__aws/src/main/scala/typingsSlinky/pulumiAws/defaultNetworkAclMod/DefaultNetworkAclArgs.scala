package typingsSlinky.pulumiAws.defaultNetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress
import typingsSlinky.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultNetworkAclArgs extends js.Object {
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: Input[String] = js.native
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclEgress]]]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[DefaultNetworkAclIngress]]]] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DefaultNetworkAclArgs {
  @scala.inline
  def apply(defaultNetworkAclId: Input[String]): DefaultNetworkAclArgs = {
    val __obj = js.Dynamic.literal(defaultNetworkAclId = defaultNetworkAclId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNetworkAclArgs]
  }
  @scala.inline
  implicit class DefaultNetworkAclArgsOps[Self <: DefaultNetworkAclArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultNetworkAclId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNetworkAclId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEgress(value: Input[js.Array[Input[DefaultNetworkAclEgress]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("egress")(js.undefined)
        ret
    }
    @scala.inline
    def withIngress(value: Input[js.Array[Input[DefaultNetworkAclIngress]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingress")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

