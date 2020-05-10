package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.native
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The IP address that the flow will be listening on for incoming content.
    */
  var IngestIp: js.UndefOr[string] = js.native
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.native
  /**
    * The name of the source.
    */
  var Name: string = js.native
  /**
    * The ARN of the source.
    */
  var SourceArn: string = js.native
  /**
    * Attributes related to the transport stream that are used in the source.
    */
  var Transport: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.Transport] = js.native
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.native
}

object Source {
  @scala.inline
  def apply(Name: string, SourceArn: string): Source = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTransferSubscriberFeePercent(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferSubscriberFeePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransferSubscriberFeePercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferSubscriberFeePercent")(js.undefined)
        ret
    }
    @scala.inline
    def withDecryption(value: Encryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decryption")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlementArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlementArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitlementArn")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestIp(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestIp")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestPort(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IngestPort")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: Transport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transport")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistCidr(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitelistCidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistCidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitelistCidr")(js.undefined)
        ret
    }
  }
  
}

