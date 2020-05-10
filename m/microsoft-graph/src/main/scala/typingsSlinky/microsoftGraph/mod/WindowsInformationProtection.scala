package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtection extends ManagedAppPolicy {
  // Navigation property to list of security groups targeted for policy.
  var assignments: js.UndefOr[js.Array[TargetedManagedAppPolicyAssignment]] = js.native
  // Specifies whether to allow Azure RMS encryption for WIP
  var azureRightsManagementServicesAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a recovery certificate that can be used for data recovery of encrypted files. This is the same as the data
    * recovery agent(DRA) certificate for encrypting file system(EFS)
    */
  var dataRecoveryCertificate: js.UndefOr[WindowsInformationProtectionDataRecoveryCertificate] = js.native
  /**
    * WIP enforcement level.See the Enum definition for supported values. Possible values are: noProtection,
    * encryptAndAuditOnly, encryptAuditAndPrompt, encryptAuditAndBlock.
    */
  var enforcementLevel: js.UndefOr[WindowsInformationProtectionEnforcementLevel] = js.native
  // Primary enterprise domain
  var enterpriseDomain: js.UndefOr[String] = js.native
  /**
    * Sets the enterprise IP ranges that define the computers in the enterprise network. Data that comes from those computers
    * will be considered part of the enterprise and protected. These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseIPRanges: js.UndefOr[js.Array[WindowsInformationProtectionIPRangeCollection]] = js.native
  /**
    * Boolean value that tells the client to accept the configured list and not to use heuristics to attempt to find other
    * subnets. Default is false
    */
  var enterpriseIPRangesAreAuthoritative: js.UndefOr[Boolean] = js.native
  /**
    * This is the comma-separated list of internal proxy servers. For example, '157.54.14.28, 157.54.11.118, 10.202.14.167,
    * 157.53.14.163, 157.69.210.59'. These proxies have been configured by the admin to connect to specific resources on the
    * Internet. They are considered to be enterprise network locations. The proxies are only leveraged in configuring the
    * EnterpriseProxiedDomains policy to force traffic to the matched domains through these proxies
    */
  var enterpriseInternalProxyServers: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.native
  /**
    * This is the list of domains that comprise the boundaries of the enterprise. Data from one of these domains that is sent
    * to a device will be considered enterprise data and protected These locations will be considered a safe destination for
    * enterprise data to be shared to
    */
  var enterpriseNetworkDomainNames: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.native
  // List of enterprise domains to be protected
  var enterpriseProtectedDomainNames: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.native
  /**
    * Contains a list of Enterprise resource domains hosted in the cloud that need to be protected. Connections to these
    * resources are considered enterprise data. If a proxy is paired with a cloud resource, traffic to the cloud resource
    * will be routed through the enterprise network via the denoted proxy server (on Port 80). A proxy server used for this
    * purpose must also be configured using the EnterpriseInternalProxyServers policy
    */
  var enterpriseProxiedDomains: js.UndefOr[js.Array[WindowsInformationProtectionProxiedDomainCollection]] = js.native
  // This is a list of proxy servers. Any server not on this list is considered non-enterprise
  var enterpriseProxyServers: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.native
  /**
    * Boolean value that tells the client to accept the configured list of proxies and not try to detect other work proxies.
    * Default is false
    */
  var enterpriseProxyServersAreAuthoritative: js.UndefOr[Boolean] = js.native
  // Another way to input exempt apps through xml files
  var exemptAppLockerFiles: js.UndefOr[js.Array[WindowsInformationProtectionAppLockerFile]] = js.native
  /**
    * Exempt applications can also access enterprise data, but the data handled by those applications are not protected. This
    * is because some critical enterprise applications may have compatibility problems with encrypted data.
    */
  var exemptApps: js.UndefOr[js.Array[WindowsInformationProtectionApp]] = js.native
  /**
    * Determines whether overlays are added to icons for WIP protected files in Explorer and enterprise only app tiles in the
    * Start menu. Starting in Windows 10, version 1703 this setting also configures the visibility of the WIP icon in the
    * title bar of a WIP-protected app
    */
  var iconsVisible: js.UndefOr[Boolean] = js.native
  // This switch is for the Windows Search Indexer, to allow or disallow indexing of items
  var indexingEncryptedStoresOrItemsBlocked: js.UndefOr[Boolean] = js.native
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.native
  // List of domain names that can used for work or personal resource
  var neutralDomainResources: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.native
  // Another way to input protected apps through xml files
  var protectedAppLockerFiles: js.UndefOr[js.Array[WindowsInformationProtectionAppLockerFile]] = js.native
  /**
    * Protected applications can access enterprise data and the data handled by those applications are protected with
    * encryption
    */
  var protectedApps: js.UndefOr[js.Array[WindowsInformationProtectionApp]] = js.native
  // Specifies whether the protection under lock feature (also known as encrypt under pin) should be configured
  var protectionUnderLockConfigRequired: js.UndefOr[Boolean] = js.native
  /**
    * This policy controls whether to revoke the WIP keys when a device unenrolls from the management service. If set to 1
    * (Don't revoke keys), the keys will not be revoked and the user will continue to have access to protected files after
    * unenrollment. If the keys are not revoked, there will be no revoked file cleanup subsequently.
    */
  var revokeOnUnenrollDisabled: js.UndefOr[Boolean] = js.native
  /**
    * TemplateID GUID to use for RMS encryption. The RMS template allows the IT admin to configure the details about who has
    * access to RMS-protected file and how long they have access
    */
  var rightsManagementServicesTemplateId: js.UndefOr[String] = js.native
  /**
    * Specifies a list of file extensions, so that files with these extensions are encrypted when copying from an SMB share
    * within the corporate boundary
    */
  var smbAutoEncryptedFileExtensions: js.UndefOr[js.Array[WindowsInformationProtectionResourceCollection]] = js.native
}

object WindowsInformationProtection {
  @scala.inline
  def apply(): WindowsInformationProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtection]
  }
  @scala.inline
  implicit class WindowsInformationProtectionOps[Self <: WindowsInformationProtection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: js.Array[TargetedManagedAppPolicyAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
        ret
    }
    @scala.inline
    def withAzureRightsManagementServicesAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureRightsManagementServicesAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzureRightsManagementServicesAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azureRightsManagementServicesAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRecoveryCertificate(value: WindowsInformationProtectionDataRecoveryCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRecoveryCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRecoveryCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRecoveryCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcementLevel(value: WindowsInformationProtectionEnforcementLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcementLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcementLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcementLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseIPRanges(value: js.Array[WindowsInformationProtectionIPRangeCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseIPRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseIPRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseIPRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseIPRangesAreAuthoritative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseIPRangesAreAuthoritative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseIPRangesAreAuthoritative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseIPRangesAreAuthoritative")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseInternalProxyServers(value: js.Array[WindowsInformationProtectionResourceCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseInternalProxyServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseInternalProxyServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseInternalProxyServers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseNetworkDomainNames(value: js.Array[WindowsInformationProtectionResourceCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseNetworkDomainNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseNetworkDomainNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseNetworkDomainNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseProtectedDomainNames(value: js.Array[WindowsInformationProtectionResourceCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProtectedDomainNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseProtectedDomainNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProtectedDomainNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseProxiedDomains(value: js.Array[WindowsInformationProtectionProxiedDomainCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProxiedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseProxiedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProxiedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseProxyServers(value: js.Array[WindowsInformationProtectionResourceCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProxyServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseProxyServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProxyServers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterpriseProxyServersAreAuthoritative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProxyServersAreAuthoritative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterpriseProxyServersAreAuthoritative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterpriseProxyServersAreAuthoritative")(js.undefined)
        ret
    }
    @scala.inline
    def withExemptAppLockerFiles(value: js.Array[WindowsInformationProtectionAppLockerFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptAppLockerFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExemptAppLockerFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptAppLockerFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withExemptApps(value: js.Array[WindowsInformationProtectionApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExemptApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exemptApps")(js.undefined)
        ret
    }
    @scala.inline
    def withIconsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexingEncryptedStoresOrItemsBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingEncryptedStoresOrItemsBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexingEncryptedStoresOrItemsBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingEncryptedStoresOrItemsBlocked")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAssigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAssigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssigned")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralDomainResources(value: js.Array[WindowsInformationProtectionResourceCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralDomainResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralDomainResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralDomainResources")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedAppLockerFiles(value: js.Array[WindowsInformationProtectionAppLockerFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedAppLockerFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedAppLockerFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedAppLockerFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedApps(value: js.Array[WindowsInformationProtectionApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedApps")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectionUnderLockConfigRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionUnderLockConfigRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectionUnderLockConfigRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionUnderLockConfigRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokeOnUnenrollDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeOnUnenrollDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokeOnUnenrollDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeOnUnenrollDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRightsManagementServicesTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightsManagementServicesTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightsManagementServicesTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightsManagementServicesTemplateId")(js.undefined)
        ret
    }
    @scala.inline
    def withSmbAutoEncryptedFileExtensions(value: js.Array[WindowsInformationProtectionResourceCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbAutoEncryptedFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmbAutoEncryptedFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbAutoEncryptedFileExtensions")(js.undefined)
        ret
    }
  }
  
}

