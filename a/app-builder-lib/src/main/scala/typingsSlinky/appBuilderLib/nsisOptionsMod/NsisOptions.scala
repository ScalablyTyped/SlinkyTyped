package typingsSlinky.appBuilderLib.nsisOptionsMod

import typingsSlinky.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NsisOptions
  extends CommonNsisOptions
     with CommonWindowsInstallerConfiguration
     with TargetSpecificOptions {
  /**
    * *assisted installer only.* Allow requesting for elevation. If false, user will have to restart installer with elevated permissions.
    * @default true
    */
  val allowElevation: js.UndefOr[Boolean] = js.native
  /**
    * *assisted installer only.* Whether to allow user to change installation directory.
    * @default false
    */
  val allowToChangeInstallationDirectory: js.UndefOr[Boolean] = js.native
  /**
    * *one-click installer only.* Whether to delete app data on uninstall.
    * @default false
    */
  val deleteAppDataOnUninstall: js.UndefOr[Boolean] = js.native
  /**
    * @private
    */
  var differentialPackage: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display a language selection dialog. Not recommended (by default will be detected using OS language).
    * @default false
    */
  val displayLanguageSelector: js.UndefOr[Boolean] = js.native
  /**
    * The path to NSIS include script to customize installer. Defaults to `build/installer.nsh`. See [Custom NSIS script](#custom-nsis-script).
    */
  val include: js.UndefOr[String | Null] = js.native
  /**
    * *assisted installer only.* `MUI_HEADERIMAGE`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * @default build/installerHeader.bmp
    */
  val installerHeader: js.UndefOr[String | Null] = js.native
  /**
    * *one-click installer only.* The path to header icon (above the progress bar), relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerHeaderIcon.ico` or application icon.
    */
  val installerHeaderIcon: js.UndefOr[String | Null] = js.native
  /**
    * The path to installer icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerIcon.ico` or application icon.
    */
  val installerIcon: js.UndefOr[String | Null] = js.native
  /**
    * The installer languages (e.g. `en_US`, `de_DE`). Change only if you understand what do you do and for what.
    */
  val installerLanguages: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * *assisted installer only.* `MUI_WELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`. Image size 164 × 314 pixels.
    */
  val installerSidebar: js.UndefOr[String | Null] = js.native
  /**
    * [LCID Dec](https://msdn.microsoft.com/en-au/goglobal/bb964664.aspx), defaults to `1033`(`English - United States`).
    */
  val language: js.UndefOr[String | Null] = js.native
  /**
    * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
    *
    * Multiple license files in different languages are supported — use lang postfix (e.g. `_de`, `_ru`)). For example, create files `license_de.txt` and `license_en.txt` in the build resources.
    * If OS language is german, `license_de.txt` will be displayed. See map of [language code to name](https://github.com/meikidd/iso-639-1/blob/master/src/data.js).
    *
    * Appropriate license file will be selected by user OS language.
    */
  val license: js.UndefOr[String | Null] = js.native
  /**
    * Whether to create multi-language installer. Defaults to `unicode` option value.
    */
  val multiLanguageInstaller: js.UndefOr[Boolean] = js.native
  /**
    * Whether to pack the elevate executable (required for electron-updater if per-machine installer used or can be used in the future). Ignored if `perMachine` is set to `true`.
    * @default true
    */
  val packElevateHelper: js.UndefOr[Boolean] = js.native
  /**
    * The file extension of files that will be not compressed. Applicable only for `extraResources` and `extraFiles` files.
    * @default [".avi", ".mov", ".m4v", ".mp4", ".m4p", ".qt", ".mkv", ".webm", ".vmdk"]
    */
  val preCompressedFileExtensions: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * The path to NSIS script to customize installer. Defaults to `build/installer.nsi`. See [Custom NSIS script](#custom-nsis-script).
    */
  val script: js.UndefOr[String | Null] = js.native
  /**
    * The uninstaller display name in the control panel.
    * @default ${productName} ${version}
    */
  val uninstallDisplayName: js.UndefOr[String] = js.native
  /**
    * The path to uninstaller icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `build/uninstallerIcon.ico` or application icon.
    */
  val uninstallerIcon: js.UndefOr[String | Null] = js.native
  /**
    * *assisted installer only.* `MUI_UNWELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
    * Defaults to `installerSidebar` option or `build/uninstallerSidebar.bmp` or `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`
    */
  val uninstallerSidebar: js.UndefOr[String | Null] = js.native
}

object NsisOptions {
  @scala.inline
  def apply(): NsisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NsisOptions]
  }
  @scala.inline
  implicit class NsisOptionsOps[Self <: NsisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowElevation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowElevation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowElevation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowElevation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowToChangeInstallationDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToChangeInstallationDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowToChangeInstallationDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowToChangeInstallationDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAppDataOnUninstall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAppDataOnUninstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAppDataOnUninstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAppDataOnUninstall")(js.undefined)
        ret
    }
    @scala.inline
    def withDifferentialPackage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("differentialPackage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDifferentialPackage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("differentialPackage")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLanguageSelector(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLanguageSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLanguageSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLanguageSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(null)
        ret
    }
    @scala.inline
    def withInstallerHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallerHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallerHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerHeader")(null)
        ret
    }
    @scala.inline
    def withInstallerHeaderIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerHeaderIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallerHeaderIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerHeaderIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallerHeaderIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerHeaderIcon")(null)
        ret
    }
    @scala.inline
    def withInstallerIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallerIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallerIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerIcon")(null)
        ret
    }
    @scala.inline
    def withInstallerLanguages(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerLanguages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallerLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerLanguages")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallerLanguagesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerLanguages")(null)
        ret
    }
    @scala.inline
    def withInstallerSidebar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerSidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallerSidebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerSidebar")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallerSidebarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installerSidebar")(null)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(null)
        ret
    }
    @scala.inline
    def withLicense(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license")(null)
        ret
    }
    @scala.inline
    def withMultiLanguageInstaller(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLanguageInstaller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiLanguageInstaller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLanguageInstaller")(js.undefined)
        ret
    }
    @scala.inline
    def withPackElevateHelper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packElevateHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackElevateHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packElevateHelper")(js.undefined)
        ret
    }
    @scala.inline
    def withPreCompressedFileExtensions(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCompressedFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreCompressedFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCompressedFileExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreCompressedFileExtensionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCompressedFileExtensions")(null)
        ret
    }
    @scala.inline
    def withScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(null)
        ret
    }
    @scala.inline
    def withUninstallDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstallDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withUninstallerIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallerIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstallerIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallerIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withUninstallerIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallerIcon")(null)
        ret
    }
    @scala.inline
    def withUninstallerSidebar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallerSidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUninstallerSidebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallerSidebar")(js.undefined)
        ret
    }
    @scala.inline
    def withUninstallerSidebarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uninstallerSidebar")(null)
        ret
    }
  }
  
}

