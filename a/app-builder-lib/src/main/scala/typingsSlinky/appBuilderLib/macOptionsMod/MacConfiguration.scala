package typingsSlinky.appBuilderLib.macOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.development
import typingsSlinky.appBuilderLib.appBuilderLibStrings.distribution
import typingsSlinky.appBuilderLib.coreMod.TargetConfiguration
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacConfiguration extends PlatformSpecificBuildOptions {
  /**
    * Paths of any extra binaries that need to be signed.
    */
  val binaries: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * The `CFBundleShortVersionString`. Do not use it unless you need to.
    */
  val bundleShortVersion: js.UndefOr[String | Null] = js.native
  /**
    * The `CFBundleVersion`. Do not use it unless [you need to](https://github.com/electron-userland/electron-builder/issues/565#issuecomment-230678643).
    */
  val bundleVersion: js.UndefOr[String | Null] = js.native
  /**
    * The application category type, as shown in the Finder via *View -> Arrange by Application Category* when viewing the Applications directory.
    *
    * For example, `"category": "public.app-category.developer-tools"` will set the application category to *Developer Tools*.
    *
    * Valid values are listed in [Apple's documentation](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/LaunchServicesKeys.html#//apple_ref/doc/uid/TP40009250-SW8).
    */
  val category: js.UndefOr[String | Null] = js.native
  /** @private */
  val cscInstallerKeyPassword: js.UndefOr[String | Null] = js.native
  /** @private */
  val cscInstallerLink: js.UndefOr[String | Null] = js.native
  /**
    * Whether a dark mode is supported. If your app does have a dark mode, you can make your app follow the system-wide dark mode setting.
    * @default false
    */
  val darkModeSupport: js.UndefOr[Boolean] = js.native
  /**
    * The electron locales. By default Electron locales used as is.
    */
  val electronLanguages: js.UndefOr[js.Array[String] | String] = js.native
  /**
    * The path to entitlements file for signing the app. `build/entitlements.mac.plist` will be used if exists (it is a recommended way to set).
    * MAS entitlements is specified in the [mas](/configuration/mas).
    */
  val entitlements: js.UndefOr[String | Null] = js.native
  /**
    * The path to child entitlements which inherit the security settings for signing frameworks and bundles of a distribution. `build/entitlements.mac.inherit.plist` will be used if exists (it is a recommended way to set).
    * Otherwise [default](https://github.com/electron-userland/electron-osx-sign/blob/master/default.entitlements.darwin.inherit.plist).
    *
    * This option only applies when signing with `entitlements` provided.
    */
  val entitlementsInherit: js.UndefOr[String | Null] = js.native
  /**
    * The extra entries for `Info.plist`.
    */
  val extendInfo: js.UndefOr[js.Any] = js.native
  /**
    * Extra files to put in archive. Not applicable for `tar.*`.
    */
  val extraDistFiles: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * Whether to let electron-osx-sign validate the signing or not.
    * @default false
    */
  val gatekeeperAssess: js.UndefOr[Boolean] = js.native
  /**
    * Whether your app has to be signed with hardened runtime.
    * @default true
    */
  val hardenedRuntime: js.UndefOr[Boolean] = js.native
  /**
    * The bundle identifier to use in the application helper's plist.
    * @default ${appBundleIdentifier}.helper
    */
  val helperBundleId: js.UndefOr[String | Null] = js.native
  /**
    * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
    * MAS installer identity is specified in the [mas](/configuration/mas).
    */
  val identity: js.UndefOr[String | Null] = js.native
  /**
    * The minimum version of macOS required for the app to run. Corresponds to `LSMinimumSystemVersion`.
    */
  val minimumSystemVersion: js.UndefOr[String | Null] = js.native
  /**
    * The path to the provisioning profile to use when signing, absolute or relative to the app root.
    */
  val provisioningProfile: js.UndefOr[String | Null] = js.native
  /**
    * Path of [requirements file](https://developer.apple.com/library/mac/documentation/Security/Conceptual/CodeSigningGuide/RequirementLang/RequirementLang.html) used in signing. Not applicable for MAS.
    */
  val requirements: js.UndefOr[String | Null] = js.native
  /**
    * The target package type: list of `default`, `dmg`, `mas`, `mas-dev`, `pkg`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`. Defaults to `default` (dmg and zip for Squirrel.Mac).
    */
  @JSName("target")
  val target_MacConfiguration: js.UndefOr[
    (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration | Null
  ] = js.native
  /**
    * Whether to sign app for development or for distribution.
    * @default distribution
    */
  val `type`: js.UndefOr[distribution | development | Null] = js.native
}

object MacConfiguration {
  @scala.inline
  def apply(): MacConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacConfiguration]
  }
  @scala.inline
  implicit class MacConfigurationOps[Self <: MacConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinaries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaries")(js.undefined)
        ret
    }
    @scala.inline
    def withBinariesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binaries")(null)
        ret
    }
    @scala.inline
    def withBundleShortVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleShortVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleShortVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleShortVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleShortVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleShortVersion")(null)
        ret
    }
    @scala.inline
    def withBundleVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleVersion")(null)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCategoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(null)
        ret
    }
    @scala.inline
    def withCscInstallerKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscInstallerKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscInstallerKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscInstallerKeyPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withCscInstallerKeyPasswordNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscInstallerKeyPassword")(null)
        ret
    }
    @scala.inline
    def withCscInstallerLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscInstallerLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscInstallerLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscInstallerLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCscInstallerLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscInstallerLink")(null)
        ret
    }
    @scala.inline
    def withDarkModeSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkModeSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarkModeSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darkModeSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronLanguages(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronLanguages")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlementsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlements")(null)
        ret
    }
    @scala.inline
    def withEntitlementsInherit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlementsInherit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitlementsInherit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlementsInherit")(js.undefined)
        ret
    }
    @scala.inline
    def withEntitlementsInheritNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entitlementsInherit")(null)
        ret
    }
    @scala.inline
    def withExtendInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraDistFiles(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDistFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraDistFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDistFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraDistFilesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDistFiles")(null)
        ret
    }
    @scala.inline
    def withGatekeeperAssess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatekeeperAssess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatekeeperAssess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatekeeperAssess")(js.undefined)
        ret
    }
    @scala.inline
    def withHardenedRuntime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardenedRuntime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardenedRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardenedRuntime")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperBundleIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperBundleId")(null)
        ret
    }
    @scala.inline
    def withIdentity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(null)
        ret
    }
    @scala.inline
    def withMinimumSystemVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSystemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSystemVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSystemVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSystemVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSystemVersion")(null)
        ret
    }
    @scala.inline
    def withProvisioningProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningProfileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisioningProfile")(null)
        ret
    }
    @scala.inline
    def withRequirements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(js.undefined)
        ret
    }
    @scala.inline
    def withRequirementsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirements")(null)
        ret
    }
    @scala.inline
    def withTarget(value: (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(null)
        ret
    }
    @scala.inline
    def withType(value: distribution | development): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

