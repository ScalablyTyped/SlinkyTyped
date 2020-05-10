package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSet extends js.Object {
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from. If the WebACL is associated with a CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the CloudFront access logs.
    */
  var IPSetDescriptors: typingsSlinky.awsSdk.wafMod.IPSetDescriptors = js.native
  /**
    * The IPSetId for an IPSet. You use IPSetId to get information about an IPSet (see GetIPSet), update an IPSet (see UpdateIPSet), insert an IPSet into a Rule or delete one from a Rule (see UpdateRule), and delete an IPSet from AWS WAF (see DeleteIPSet).  IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId = js.native
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}

object IPSet {
  @scala.inline
  def apply(IPSetDescriptors: IPSetDescriptors, IPSetId: ResourceId): IPSet = {
    val __obj = js.Dynamic.literal(IPSetDescriptors = IPSetDescriptors.asInstanceOf[js.Any], IPSetId = IPSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSet]
  }
  @scala.inline
  implicit class IPSetOps[Self <: IPSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPSetDescriptors(value: IPSetDescriptors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSetDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
  }
  
}

