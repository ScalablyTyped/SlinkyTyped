package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHostedZonesByNameResponse extends js.Object {
  /**
    * For the second and subsequent calls to ListHostedZonesByName, DNSName is the value that you specified for the dnsname parameter in the request that produced the current response.
    */
  var DNSName: js.UndefOr[typingsSlinky.awsSdk.route53Mod.DNSName] = js.native
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.native
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZones: typingsSlinky.awsSdk.route53Mod.HostedZones = js.native
  /**
    * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can get the next group of maxitems hosted zones by calling ListHostedZonesByName again and specifying the values of NextDNSName and NextHostedZoneId elements in the dnsname and hostedzoneid parameters.
    */
  var IsTruncated: PageTruncated = js.native
  /**
    * The value that you specified for the maxitems parameter in the call to ListHostedZonesByName that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  /**
    * If IsTruncated is true, the value of NextDNSName is the name of the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextDNSName: js.UndefOr[DNSName] = js.native
  /**
    * If IsTruncated is true, the value of NextHostedZoneId identifies the first hosted zone in the next group of maxitems hosted zones. Call ListHostedZonesByName again and specify the value of NextDNSName and NextHostedZoneId in the dnsname and hostedzoneid parameters, respectively. This element is present only if IsTruncated is true.
    */
  var NextHostedZoneId: js.UndefOr[ResourceId] = js.native
}

object ListHostedZonesByNameResponse {
  @scala.inline
  def apply(HostedZones: HostedZones, IsTruncated: PageTruncated, MaxItems: PageMaxItems): ListHostedZonesByNameResponse = {
    val __obj = js.Dynamic.literal(HostedZones = HostedZones.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHostedZonesByNameResponse]
  }
  @scala.inline
  implicit class ListHostedZonesByNameResponseOps[Self <: ListHostedZonesByNameResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostedZones(value: HostedZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZones")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDNSName(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DNSName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDNSName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DNSName")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withNextDNSName(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextDNSName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextDNSName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextDNSName")(js.undefined)
        ret
    }
    @scala.inline
    def withNextHostedZoneId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextHostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextHostedZoneId")(js.undefined)
        ret
    }
  }
  
}

