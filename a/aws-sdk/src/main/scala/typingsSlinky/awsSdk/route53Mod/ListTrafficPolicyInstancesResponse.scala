package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesResponse extends js.Object {
  /**
    * If IsTruncated is true, HostedZoneIdMarker is the ID of the hosted zone of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var HostedZoneIdMarker: js.UndefOr[ResourceId] = js.native
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get more traffic policy instances by calling ListTrafficPolicyInstances again and specifying the values of the HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for the MaxItems parameter in the call to ListTrafficPolicyInstances that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance that Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance that Amazon Route 53 will return if you submit another ListTrafficPolicyInstances request. 
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request.
    */
  var TrafficPolicyInstances: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstances = js.native
}

object ListTrafficPolicyInstancesResponse {
  @scala.inline
  def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, TrafficPolicyInstances: TrafficPolicyInstances): ListTrafficPolicyInstancesResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyInstances = TrafficPolicyInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesResponse]
  }
  @scala.inline
  implicit class ListTrafficPolicyInstancesResponseOps[Self <: ListTrafficPolicyInstancesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTruncated(value: PageTruncated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxItems(value: PageMaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficPolicyInstances(value: TrafficPolicyInstances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstances")(value.asInstanceOf[js.Any])
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

