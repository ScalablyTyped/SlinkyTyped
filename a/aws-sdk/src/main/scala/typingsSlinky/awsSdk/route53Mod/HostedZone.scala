package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedZone extends js.Object {
  /**
    * The value that you specified for CallerReference when you created the hosted zone.
    */
  var CallerReference: Nonce = js.native
  /**
    * A complex type that includes the Comment and PrivateZone elements. If you omitted the HostedZoneConfig and Comment elements from the request, the Config and Comment elements don't appear in the response.
    */
  var Config: js.UndefOr[HostedZoneConfig] = js.native
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var Id: ResourceId = js.native
  /**
    * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone is created by another service, you can't edit or delete it using Route 53. 
    */
  var LinkedService: js.UndefOr[typingsSlinky.awsSdk.route53Mod.LinkedService] = js.native
  /**
    * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS registrar. For information about how to specify characters other than a-z, 0-9, and - (hyphen) and how to specify internationalized domain names, see CreateHostedZone.
    */
  var Name: DNSName = js.native
  /**
    * The number of resource record sets in the hosted zone.
    */
  var ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.native
}

object HostedZone {
  @scala.inline
  def apply(CallerReference: Nonce, Id: ResourceId, Name: DNSName): HostedZone = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedZone]
  }
  @scala.inline
  implicit class HostedZoneOps[Self <: HostedZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: Nonce): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: DNSName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: HostedZoneConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Config")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedService(value: LinkedService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkedService")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRecordSetCount(value: HostedZoneRRSetCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRecordSetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecordSetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceRecordSetCount")(js.undefined)
        ret
    }
  }
  
}

