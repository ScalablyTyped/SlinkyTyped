package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OwnerDirectoryDescription extends js.Object {
  /**
    * Identifier of the directory owner account.
    */
  var AccountId: js.UndefOr[CustomerId] = js.native
  /**
    * Identifier of the AWS Managed Microsoft AD directory in the directory owner account.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * IP address of the directory’s domain controllers.
    */
  var DnsIpAddrs: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DnsIpAddrs] = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusSettings] = js.native
  /**
    * Information about the status of the RADIUS server.
    */
  var RadiusStatus: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusStatus] = js.native
  /**
    * Information about the VPC settings for the directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.native
}

object OwnerDirectoryDescription {
  @scala.inline
  def apply(): OwnerDirectoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerDirectoryDescription]
  }
  @scala.inline
  implicit class OwnerDirectoryDescriptionOps[Self <: OwnerDirectoryDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsIpAddrs(value: DnsIpAddrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsIpAddrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddrs")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusSettings(value: RadiusSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusStatus(value: RadiusStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadiusStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSettings(value: DirectoryVpcSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSettings")(js.undefined)
        ret
    }
  }
  
}

