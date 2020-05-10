package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows10EndpointProtectionConfiguration extends DeviceConfiguration {
  /**
    * Enables the Admin to choose what types of app to allow on devices. Possible values are: notConfigured,
    * enforceComponentsAndStoreApps, auditComponentsAndStoreApps, enforceComponentsStoreAppsAndSmartlocker,
    * auditComponentsStoreAppsAndSmartlocker.
    */
  var appLockerApplicationControl: js.UndefOr[AppLockerApplicationControlType] = js.native
  // Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
  var applicationGuardAllowPersistence: js.UndefOr[Boolean] = js.native
  // Allow printing to Local Printers from Container
  var applicationGuardAllowPrintToLocalPrinters: js.UndefOr[Boolean] = js.native
  // Allow printing to Network Printers from Container
  var applicationGuardAllowPrintToNetworkPrinters: js.UndefOr[Boolean] = js.native
  // Allow printing to PDF from Container
  var applicationGuardAllowPrintToPDF: js.UndefOr[Boolean] = js.native
  // Allow printing to XPS from Container
  var applicationGuardAllowPrintToXPS: js.UndefOr[Boolean] = js.native
  /**
    * Block clipboard to share data from Host to Container, or from Container to Host, or both ways, or neither ways.
    * Possible values are: notConfigured, blockBoth, blockHostToContainer, blockContainerToHost, blockNone.
    */
  var applicationGuardBlockClipboardSharing: js.UndefOr[ApplicationGuardBlockClipboardSharingType] = js.native
  /**
    * Block clipboard to transfer image file, text file or neither of them. Possible values are: notConfigured,
    * blockImageAndTextFile, blockImageFile, blockNone, blockTextFile.
    */
  var applicationGuardBlockFileTransfer: js.UndefOr[ApplicationGuardBlockFileTransferType] = js.native
  // Block enterprise sites to load non-enterprise content, such as third party plug-ins
  var applicationGuardBlockNonEnterpriseContent: js.UndefOr[Boolean] = js.native
  // Enable Windows Defender Application Guard
  var applicationGuardEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user
    * login-logoff, use of privilege rights, software installation, system changes, etc.)
    */
  var applicationGuardForceAuditing: js.UndefOr[Boolean] = js.native
  // Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
  var bitLockerDisableWarningForOtherDiskEncryption: js.UndefOr[Boolean] = js.native
  // Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
  var bitLockerEnableStorageCardEncryptionOnMobile: js.UndefOr[Boolean] = js.native
  // Allows the admin to require encryption to be turned on using BitLocker.
  var bitLockerEncryptDevice: js.UndefOr[Boolean] = js.native
  // BitLocker Removable Drive Policy.
  var bitLockerRemovableDrivePolicy: js.UndefOr[BitLockerRemovableDrivePolicy] = js.native
  // List of folder paths to be added to the list of protected folders
  var defenderAdditionalGuardedFolders: js.UndefOr[js.Array[String]] = js.native
  // List of exe files and folders to be excluded from attack surface reduction rules
  var defenderAttackSurfaceReductionExcludedPaths: js.UndefOr[js.Array[String]] = js.native
  // Xml content containing information regarding exploit protection details.
  var defenderExploitProtectionXml: js.UndefOr[Double] = js.native
  // Name of the file from which DefenderExploitProtectionXml was obtained.
  var defenderExploitProtectionXmlFileName: js.UndefOr[String] = js.native
  // List of paths to exe that are allowed to access protected folders
  var defenderGuardedFoldersAllowedAppPaths: js.UndefOr[js.Array[String]] = js.native
  // Indicates whether or not to block user from overriding Exploit Protection settings.
  var defenderSecurityCenterBlockExploitProtectionOverride: js.UndefOr[Boolean] = js.native
  // Blocks stateful FTP connections to the device
  var firewallBlockStatefulFTP: js.UndefOr[Boolean] = js.native
  /**
    * Specify how the certificate revocation list is to be enforced. Possible values are: deviceDefault, none, attempt,
    * require.
    */
  var firewallCertificateRevocationListCheckMethod: js.UndefOr[FirewallCertificateRevocationListCheckMethodType] = js.native
  // Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
  var firewallIPSecExemptionsAllowDHCP: js.UndefOr[Boolean] = js.native
  // Configures IPSec exemptions to allow ICMP
  var firewallIPSecExemptionsAllowICMP: js.UndefOr[Boolean] = js.native
  // Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
  var firewallIPSecExemptionsAllowNeighborDiscovery: js.UndefOr[Boolean] = js.native
  // Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
  var firewallIPSecExemptionsAllowRouterDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after
    * which security associations will expire and be deleted. Valid values 300 to 3600
    */
  var firewallIdleTimeoutForSecurityAssociationInSeconds: js.UndefOr[Double] = js.native
  /**
    * If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported
    * authentication suites rather than the entire set
    */
  var firewallMergeKeyingModuleSettings: js.UndefOr[Boolean] = js.native
  /**
    * Configures how packet queueing should be applied in the tunnel gateway scenario. Possible values are: deviceDefault,
    * disabled, queueInbound, queueOutbound, queueBoth.
    */
  var firewallPacketQueueingMethod: js.UndefOr[FirewallPacketQueueingMethodType] = js.native
  // Select the preshared key encoding to be used. Possible values are: deviceDefault, none, utF8.
  var firewallPreSharedKeyEncodingMethod: js.UndefOr[FirewallPreSharedKeyEncodingMethodType] = js.native
  // Configures the firewall profile settings for domain networks
  var firewallProfileDomain: js.UndefOr[WindowsFirewallNetworkProfile] = js.native
  // Configures the firewall profile settings for private networks
  var firewallProfilePrivate: js.UndefOr[WindowsFirewallNetworkProfile] = js.native
  // Configures the firewall profile settings for public networks
  var firewallProfilePublic: js.UndefOr[WindowsFirewallNetworkProfile] = js.native
  // Allows IT Admins to control whether users can ignore SmartScreen warnings and run malicious files.
  var smartScreenBlockOverrideForFiles: js.UndefOr[Boolean] = js.native
  // Allows IT Admins to configure SmartScreen for Windows.
  var smartScreenEnableInShell: js.UndefOr[Boolean] = js.native
}

object Windows10EndpointProtectionConfiguration {
  @scala.inline
  def apply(): Windows10EndpointProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Windows10EndpointProtectionConfiguration]
  }
  @scala.inline
  implicit class Windows10EndpointProtectionConfigurationOps[Self <: Windows10EndpointProtectionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppLockerApplicationControl(value: AppLockerApplicationControlType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLockerApplicationControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppLockerApplicationControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appLockerApplicationControl")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardAllowPersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardAllowPersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardAllowPrintToLocalPrinters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToLocalPrinters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardAllowPrintToLocalPrinters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToLocalPrinters")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardAllowPrintToNetworkPrinters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToNetworkPrinters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardAllowPrintToNetworkPrinters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToNetworkPrinters")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardAllowPrintToPDF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToPDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardAllowPrintToPDF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToPDF")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardAllowPrintToXPS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToXPS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardAllowPrintToXPS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardAllowPrintToXPS")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardBlockClipboardSharing(value: ApplicationGuardBlockClipboardSharingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardBlockClipboardSharing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardBlockClipboardSharing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardBlockClipboardSharing")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardBlockFileTransfer(value: ApplicationGuardBlockFileTransferType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardBlockFileTransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardBlockFileTransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardBlockFileTransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardBlockNonEnterpriseContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardBlockNonEnterpriseContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardBlockNonEnterpriseContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardBlockNonEnterpriseContent")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationGuardForceAuditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardForceAuditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationGuardForceAuditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationGuardForceAuditing")(js.undefined)
        ret
    }
    @scala.inline
    def withBitLockerDisableWarningForOtherDiskEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerDisableWarningForOtherDiskEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitLockerDisableWarningForOtherDiskEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerDisableWarningForOtherDiskEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withBitLockerEnableStorageCardEncryptionOnMobile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerEnableStorageCardEncryptionOnMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitLockerEnableStorageCardEncryptionOnMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerEnableStorageCardEncryptionOnMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withBitLockerEncryptDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerEncryptDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitLockerEncryptDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerEncryptDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withBitLockerRemovableDrivePolicy(value: BitLockerRemovableDrivePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerRemovableDrivePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitLockerRemovableDrivePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitLockerRemovableDrivePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderAdditionalGuardedFolders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderAdditionalGuardedFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderAdditionalGuardedFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderAdditionalGuardedFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderAttackSurfaceReductionExcludedPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderAttackSurfaceReductionExcludedPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderAttackSurfaceReductionExcludedPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderAttackSurfaceReductionExcludedPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderExploitProtectionXml(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderExploitProtectionXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderExploitProtectionXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderExploitProtectionXml")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderExploitProtectionXmlFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderExploitProtectionXmlFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderExploitProtectionXmlFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderExploitProtectionXmlFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderGuardedFoldersAllowedAppPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderGuardedFoldersAllowedAppPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderGuardedFoldersAllowedAppPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderGuardedFoldersAllowedAppPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withDefenderSecurityCenterBlockExploitProtectionOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderSecurityCenterBlockExploitProtectionOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefenderSecurityCenterBlockExploitProtectionOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defenderSecurityCenterBlockExploitProtectionOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallBlockStatefulFTP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallBlockStatefulFTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallBlockStatefulFTP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallBlockStatefulFTP")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallCertificateRevocationListCheckMethod(value: FirewallCertificateRevocationListCheckMethodType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallCertificateRevocationListCheckMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallCertificateRevocationListCheckMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallCertificateRevocationListCheckMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallIPSecExemptionsAllowDHCP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowDHCP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallIPSecExemptionsAllowDHCP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowDHCP")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallIPSecExemptionsAllowICMP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowICMP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallIPSecExemptionsAllowICMP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowICMP")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallIPSecExemptionsAllowNeighborDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowNeighborDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallIPSecExemptionsAllowNeighborDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowNeighborDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallIPSecExemptionsAllowRouterDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowRouterDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallIPSecExemptionsAllowRouterDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIPSecExemptionsAllowRouterDiscovery")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallIdleTimeoutForSecurityAssociationInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIdleTimeoutForSecurityAssociationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallIdleTimeoutForSecurityAssociationInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallIdleTimeoutForSecurityAssociationInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallMergeKeyingModuleSettings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallMergeKeyingModuleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallMergeKeyingModuleSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallMergeKeyingModuleSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallPacketQueueingMethod(value: FirewallPacketQueueingMethodType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallPacketQueueingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallPacketQueueingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallPacketQueueingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallPreSharedKeyEncodingMethod(value: FirewallPreSharedKeyEncodingMethodType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallPreSharedKeyEncodingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallPreSharedKeyEncodingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallPreSharedKeyEncodingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallProfileDomain(value: WindowsFirewallNetworkProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallProfileDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallProfileDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallProfileDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallProfilePrivate(value: WindowsFirewallNetworkProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallProfilePrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallProfilePrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallProfilePrivate")(js.undefined)
        ret
    }
    @scala.inline
    def withFirewallProfilePublic(value: WindowsFirewallNetworkProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallProfilePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirewallProfilePublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firewallProfilePublic")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartScreenBlockOverrideForFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenBlockOverrideForFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartScreenBlockOverrideForFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenBlockOverrideForFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartScreenEnableInShell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenEnableInShell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartScreenEnableInShell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartScreenEnableInShell")(js.undefined)
        ret
    }
  }
  
}

