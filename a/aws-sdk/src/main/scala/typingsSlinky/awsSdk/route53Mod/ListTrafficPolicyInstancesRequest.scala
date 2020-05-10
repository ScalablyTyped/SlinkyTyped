package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesRequest extends js.Object {
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of HostedZoneId, specify the value of HostedZoneIdMarker from the previous response, which is the hosted zone ID of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  /**
    * The maximum number of traffic policy instances that you want Amazon Route 53 to return in response to a ListTrafficPolicyInstances request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance in the next group of MaxItems traffic policy instances.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstances request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the type of the first traffic policy instance in the next group of traffic policy instances. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
}

object ListTrafficPolicyInstancesRequest {
  @scala.inline
  def apply(): ListTrafficPolicyInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrafficPolicyInstancesRequest]
  }
  @scala.inline
  implicit class ListTrafficPolicyInstancesRequestOps[Self <: ListTrafficPolicyInstancesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostedZoneIdMarker(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneIdMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneIdMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneIdMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItems(value: PageMaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficPolicyInstanceNameMarker(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstanceNameMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficPolicyInstanceNameMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstanceNameMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficPolicyInstanceTypeMarker(value: RRType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstanceTypeMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficPolicyInstanceTypeMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstanceTypeMarker")(js.undefined)
        ret
    }
  }
  
}

