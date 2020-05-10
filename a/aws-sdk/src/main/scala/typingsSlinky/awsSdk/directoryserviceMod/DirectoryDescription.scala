package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryDescription extends js.Object {
  /**
    * The access URL for the directory, such as http://&lt;alias&gt;.awsapps.com. If no alias has been created for the directory, &lt;alias&gt; is the directory identifier, such as d-XXXXXXXXXX.
    */
  var AccessUrl: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.AccessUrl] = js.native
  /**
    * The alias for the directory. If no alias has been created for the directory, the alias is the directory identifier, such as d-XXXXXXXXXX.
    */
  var Alias: js.UndefOr[AliasName] = js.native
  /**
    * A DirectoryConnectSettingsDescription object that contains additional information about an AD Connector directory. This member is only present if the directory is an AD Connector directory.
    */
  var ConnectSettings: js.UndefOr[DirectoryConnectSettingsDescription] = js.native
  /**
    * The description for the directory.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The desired number of domain controllers in the directory if the directory is Microsoft AD.
    */
  var DesiredNumberOfDomainControllers: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DesiredNumberOfDomainControllers] = js.native
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The IP addresses of the DNS servers for the directory. For a Simple AD or Microsoft AD directory, these are the IP addresses of the Simple AD or Microsoft AD directory servers. For an AD Connector directory, these are the IP addresses of the DNS servers or domain controllers in the on-premises directory to which the AD Connector is connected.
    */
  var DnsIpAddrs: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DnsIpAddrs] = js.native
  /**
    * The edition associated with this directory.
    */
  var Edition: js.UndefOr[DirectoryEdition] = js.native
  /**
    * Specifies when the directory was created.
    */
  var LaunchTime: js.UndefOr[js.Date] = js.native
  /**
    * The fully qualified name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.native
  /**
    * Describes the AWS Managed Microsoft AD directory in the directory owner account.
    */
  var OwnerDirectoryDescription: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.OwnerDirectoryDescription] = js.native
  /**
    * A RadiusSettings object that contains information about the RADIUS server configured for this directory.
    */
  var RadiusSettings: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusSettings] = js.native
  /**
    * The status of the RADIUS MFA server connection.
    */
  var RadiusStatus: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.RadiusStatus] = js.native
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a shared directory request (HANDSHAKE).
    */
  var ShareMethod: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ShareMethod] = js.native
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  /**
    * Current directory status of the shared AWS Managed Microsoft AD directory.
    */
  var ShareStatus: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ShareStatus] = js.native
  /**
    * The short name of the directory.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.native
  /**
    * The directory size.
    */
  var Size: js.UndefOr[DirectorySize] = js.native
  /**
    * Indicates if single sign-on is enabled for the directory. For more information, see EnableSso and DisableSso.
    */
  var SsoEnabled: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SsoEnabled] = js.native
  /**
    * The current stage of the directory.
    */
  var Stage: js.UndefOr[DirectoryStage] = js.native
  /**
    * The date and time that the stage was last updated.
    */
  var StageLastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Additional information about the directory stage.
    */
  var StageReason: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.StageReason] = js.native
  /**
    * The directory size.
    */
  var Type: js.UndefOr[DirectoryType] = js.native
  /**
    * A DirectoryVpcSettingsDescription object that contains additional information about a directory. This member is only present if the directory is a Simple AD or Managed AD directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.native
}

object DirectoryDescription {
  @scala.inline
  def apply(): DirectoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryDescription]
  }
  @scala.inline
  implicit class DirectoryDescriptionOps[Self <: DirectoryDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessUrl(value: AccessUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withAlias(value: AliasName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectSettings(value: DirectoryConnectSettingsDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withDesiredNumberOfDomainControllers(value: DesiredNumberOfDomainControllers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredNumberOfDomainControllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredNumberOfDomainControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredNumberOfDomainControllers")(js.undefined)
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
    def withEdition(value: DirectoryEdition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edition")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DirectoryName): Self = {
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
    @scala.inline
    def withOwnerDirectoryDescription(value: OwnerDirectoryDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerDirectoryDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerDirectoryDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerDirectoryDescription")(js.undefined)
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
    def withShareMethod(value: ShareMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withShareNotes(value: Notes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withShareStatus(value: ShareStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShareStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withShortName(value: DirectoryShortName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShortName")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: DirectorySize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Size")(js.undefined)
        ret
    }
    @scala.inline
    def withSsoEnabled(value: SsoEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SsoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsoEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SsoEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStage(value: DirectoryStage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Stage")(js.undefined)
        ret
    }
    @scala.inline
    def withStageLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageLastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageLastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStageReason(value: StageReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageReason")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DirectoryType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
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

