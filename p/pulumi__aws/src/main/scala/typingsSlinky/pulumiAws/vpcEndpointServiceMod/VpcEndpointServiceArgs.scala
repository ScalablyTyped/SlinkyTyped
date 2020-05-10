package typingsSlinky.pulumiAws.vpcEndpointServiceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointServiceArgs extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: Input[Boolean] = js.native
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: Input[js.Array[Input[String]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VpcEndpointServiceArgs {
  @scala.inline
  def apply(acceptanceRequired: Input[Boolean], networkLoadBalancerArns: Input[js.Array[Input[String]]]): VpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any], networkLoadBalancerArns = networkLoadBalancerArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceArgs]
  }
  @scala.inline
  implicit class VpcEndpointServiceArgsOps[Self <: VpcEndpointServiceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptanceRequired(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkLoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedPrincipals(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPrincipals")(js.undefined)
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

