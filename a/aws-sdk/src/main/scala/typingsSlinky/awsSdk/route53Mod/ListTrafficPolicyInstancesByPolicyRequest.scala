package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesByPolicyRequest extends js.Object {
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request.  For the value of hostedzoneid, specify the value of HostedZoneIdMarker from the previous response, which is the hosted zone ID of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  /**
    * The maximum number of traffic policy instances to be included in the response body for this request. If you have more than MaxItems traffic policy instances, the value of the IsTruncated element in the response is true, and the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker represent the first traffic policy instance that Amazon Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * The ID of the traffic policy for which you want to list traffic policy instances.
    */
  var TrafficPolicyId: typingsSlinky.awsSdk.route53Mod.TrafficPolicyId = js.native
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancename, specify the value of TrafficPolicyInstanceNameMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If the value of IsTruncated in the previous response was true, you have more traffic policy instances. To get more traffic policy instances, submit another ListTrafficPolicyInstancesByPolicy request. For the value of trafficpolicyinstancetype, specify the value of TrafficPolicyInstanceTypeMarker from the previous response, which is the name of the first traffic policy instance that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more traffic policy instances to get.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  /**
    * The version of the traffic policy for which you want to list traffic policy instances. The version must be associated with the traffic policy that is specified by TrafficPolicyId.
    */
  var TrafficPolicyVersion: typingsSlinky.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}

object ListTrafficPolicyInstancesByPolicyRequest {
  @scala.inline
  def apply(TrafficPolicyId: TrafficPolicyId, TrafficPolicyVersion: TrafficPolicyVersion): ListTrafficPolicyInstancesByPolicyRequest = {
    val __obj = js.Dynamic.literal(TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByPolicyRequest]
  }
  @scala.inline
  implicit class ListTrafficPolicyInstancesByPolicyRequestOps[Self <: ListTrafficPolicyInstancesByPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficPolicyId(value: TrafficPolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficPolicyVersion(value: TrafficPolicyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyVersion")(value.asInstanceOf[js.Any])
        ret
    }
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

