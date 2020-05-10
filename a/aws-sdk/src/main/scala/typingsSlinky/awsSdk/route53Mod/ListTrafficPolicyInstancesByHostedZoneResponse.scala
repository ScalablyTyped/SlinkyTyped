package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTrafficPolicyInstancesByHostedZoneResponse extends js.Object {
  /**
    * A flag that indicates whether there are more traffic policy instances to be listed. If the response was truncated, you can get the next group of traffic policy instances by submitting another ListTrafficPolicyInstancesByHostedZone request and specifying the values of HostedZoneIdMarker, TrafficPolicyInstanceNameMarker, and TrafficPolicyInstanceTypeMarker in the corresponding request parameters.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for the MaxItems parameter in the ListTrafficPolicyInstancesByHostedZone request that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceNameMarker is the name of the first traffic policy instance in the next group of traffic policy instances.
    */
  var TrafficPolicyInstanceNameMarker: js.UndefOr[DNSName] = js.native
  /**
    * If IsTruncated is true, TrafficPolicyInstanceTypeMarker is the DNS type of the resource record sets that are associated with the first traffic policy instance in the next group of traffic policy instances.
    */
  var TrafficPolicyInstanceTypeMarker: js.UndefOr[RRType] = js.native
  /**
    * A list that contains one TrafficPolicyInstance element for each traffic policy instance that matches the elements in the request. 
    */
  var TrafficPolicyInstances: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstances = js.native
}

object ListTrafficPolicyInstancesByHostedZoneResponse {
  @scala.inline
  def apply(IsTruncated: PageTruncated, MaxItems: PageMaxItems, TrafficPolicyInstances: TrafficPolicyInstances): ListTrafficPolicyInstancesByHostedZoneResponse = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any], TrafficPolicyInstances = TrafficPolicyInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyInstancesByHostedZoneResponse]
  }
  @scala.inline
  implicit class ListTrafficPolicyInstancesByHostedZoneResponseOps[Self <: ListTrafficPolicyInstancesByHostedZoneResponse] (val x: Self) extends AnyVal {
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

