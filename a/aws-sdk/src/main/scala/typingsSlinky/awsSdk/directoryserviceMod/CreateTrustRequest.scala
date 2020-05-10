package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrustRequest extends js.Object {
  /**
    * The IP addresses of the remote DNS server associated with RemoteDomainName.
    */
  var ConditionalForwarderIpAddrs: js.UndefOr[DnsIpAddrs] = js.native
  /**
    * The Directory ID of the AWS Managed Microsoft AD directory for which to establish the trust relationship.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
    */
  var RemoteDomainName: typingsSlinky.awsSdk.directoryserviceMod.RemoteDomainName = js.native
  /**
    * Optional parameter to enable selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SelectiveAuth] = js.native
  /**
    * The direction of the trust relationship.
    */
  var TrustDirection: typingsSlinky.awsSdk.directoryserviceMod.TrustDirection = js.native
  /**
    * The trust password. The must be the same password that was used when creating the trust relationship on the external domain.
    */
  var TrustPassword: typingsSlinky.awsSdk.directoryserviceMod.TrustPassword = js.native
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.TrustType] = js.native
}

object CreateTrustRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    RemoteDomainName: RemoteDomainName,
    TrustDirection: TrustDirection,
    TrustPassword: TrustPassword
  ): CreateTrustRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], RemoteDomainName = RemoteDomainName.asInstanceOf[js.Any], TrustDirection = TrustDirection.asInstanceOf[js.Any], TrustPassword = TrustPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrustRequest]
  }
  @scala.inline
  implicit class CreateTrustRequestOps[Self <: CreateTrustRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteDomainName(value: RemoteDomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustDirection(value: TrustDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrustPassword(value: TrustPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditionalForwarderIpAddrs(value: DnsIpAddrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalForwarderIpAddrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalForwarderIpAddrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalForwarderIpAddrs")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectiveAuth(value: SelectiveAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectiveAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectiveAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectiveAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustType(value: TrustType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustType")(js.undefined)
        ret
    }
  }
  
}

