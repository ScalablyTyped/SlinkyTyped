package typingsSlinky.electronWinstaller.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The folder path of your Electron app
    */
  var appDirectory: String = js.native
  /**
    * The authors value for the nuget package metadata.
    *
    * Defaults to the `author` field from your app's package.json file when unspecified.
    */
  var authors: js.UndefOr[String] = js.native
  /**
    * The path to an Authenticode Code Signing Certificate
    */
  var certificateFile: js.UndefOr[String] = js.native
  /**
    * The password to decrypt the certificate given in `certificateFile`
    */
  var certificatePassword: js.UndefOr[String] = js.native
  /**
    * The copyright value for the nuget package metadata.
    *
    * Defaults to a generated copyright with `authors` or `owners`.
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * The description value for the nuget package metadata.
    *
    * Defaults to the `description` field from your app's package.json file when unspecified.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of your app's main `.exe` file.
    *
    * This uses the `name` field in your app's package.json file with an added `.exe` extension when unspecified.
    */
  var exe: js.UndefOr[String] = js.native
  var fixUpPaths: js.UndefOr[Boolean] = js.native
  var frameworkVersion: js.UndefOr[String] = js.native
  /**
    * A URL to an ICO file to use as the application icon (displayed in Control Panel > Programs and Features).
    *
    * Defaults to the Atom icon.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The local path to a `.gif` file to display during install.
    */
  var loadingGif: js.UndefOr[String] = js.native
  /**
    * Windows Application Model ID (appId).
    *
    * Defaults to the name field in your app's package.json file.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Should Squirrel.Windows delta packages? (disable only if necessary, they are a Good Thing)
    */
  var noDelta: js.UndefOr[Boolean] = js.native
  /**
    * Should Squirrel.Windows create an MSI installer?
    */
  var noMsi: js.UndefOr[Boolean] = js.native
  /**
    * The folder path to create the .exe installer in.
    *
    * Defaults to the installer folder at the project root.
    */
  var outputDirectory: js.UndefOr[String] = js.native
  /**
    * The owners value for the nuget package metadata.
    *
    * Defaults to the `authors` field when unspecified.
    */
  var owners: js.UndefOr[String] = js.native
  /**
    * A URL to your existing updates. If given, these will be downloaded to create delta updates
    */
  var remoteReleases: js.UndefOr[String] = js.native
  /**
    * Authentication token for remote updates
    */
  var remoteToken: js.UndefOr[String] = js.native
  /**
    * The name to use for the generated Setup.exe file
    */
  var setupExe: js.UndefOr[String] = js.native
  /**
    * The ICO file to use as the icon for the generated Setup.exe
    */
  var setupIcon: js.UndefOr[String] = js.native
  /**
    * The name to use for the generated Setup.msi file
    */
  var setupMsi: js.UndefOr[String] = js.native
  /**
    * Params to pass to signtool.
    *
    * Overrides `certificateFile` and `certificatePassword`.
    */
  var signWithParams: js.UndefOr[String] = js.native
  var skipUpdateIcon: js.UndefOr[Boolean] = js.native
  /**
    * The title value for the nuget package metadata.
    *
    * Defaults to the `productName` field and then the `name` field from your app's package.json file when unspecified.
    */
  var title: js.UndefOr[String] = js.native
  var usePackageJson: js.UndefOr[Boolean] = js.native
  /**
    * The version value for the nuget package metadata.
    *
    * Defaults to the `version` field from your app's package.json file when unspecified.
    */
  var version: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(appDirectory: String): Options = {
    val __obj = js.Dynamic.literal(appDirectory = appDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateFile")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificatePassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificatePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exe")(js.undefined)
        ret
    }
    @scala.inline
    def withFixUpPaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixUpPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixUpPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixUpPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingGif(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingGif")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingGif: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingGif")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDelta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMsi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMsi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMsi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMsi")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteReleases(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteReleases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteReleases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteReleases")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupExe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupExe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupExe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupExe")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSetupMsi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupMsi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetupMsi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setupMsi")(js.undefined)
        ret
    }
    @scala.inline
    def withSignWithParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signWithParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignWithParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signWithParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipUpdateIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUpdateIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipUpdateIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipUpdateIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePackageJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePackageJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePackageJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePackageJson")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

