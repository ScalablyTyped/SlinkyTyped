package typingsSlinky.electronPackager.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.electronPackager.AnonName
import typingsSlinky.electronPackager.electronPackagerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Electron-packager Options. */
@js.native
trait Options extends js.Object {
  /**
    * Optional list of methods to call on completion of each process
    */
  var afterCopy: js.UndefOr[js.Array[onCompleteFn]] = js.native
  var afterExtract: js.UndefOr[js.Array[onCompleteFn]] = js.native
  var afterPrune: js.UndefOr[js.Array[onCompleteFn]] = js.native
  /** Shortcut for `--arch=all --platform=all`. */
  var all: js.UndefOr[Boolean] = js.native
  /**
    * OS X/Mac App Store targets only
    */
  /**
    * The bundle identifier to use in the application's plist.
    */
  var appBundleId: js.UndefOr[String] = js.native
  /**
    * The application category type, as shown in the Finder via View → Arrange by Application Category when viewing the Applications directory.
    */
  var appCategoryType: js.UndefOr[String] = js.native
  /**
    * The human-readable copyright line for the app. Maps to the LegalCopyright metadata property on Windows, and NSHumanReadableCopyright on OS X.
    */
  var appCopyright: js.UndefOr[String] = js.native
  /**
    * The release version of the application. By default the version property in the package.json is used but it can be overridden with this argument.
    * If neither are provided, the version of Electron will be used. Maps to the ProductVersion metadata property on Windows, and CFBundleShortVersionString on OS X.
    */
  var appVersion: js.UndefOr[String] = js.native
  /**
    * The target system architecture(s) to build for. Not required if the all option is set.
    * If arch is set to all, all supported architectures for the target platforms specified by platform will be built.
    * Arbitrary combinations of individual architectures are also supported via a comma-delimited string or array of strings.
    * The non-all values correspond to the architecture names used by Electron releases. This value is not restricted to the official set if download.mirror is set.
    */
  var arch: js.UndefOr[
    typingsSlinky.electronPackager.mod.arch | js.Array[typingsSlinky.electronPackager.mod.arch]
  ] = js.native
  /**
    * Whether to package the application's source code into an archive, using Electron's archive format
    */
  var asar: js.UndefOr[Boolean | AsarOptions] = js.native
  /**
    * The build version of the application. Defaults to the value of appVersion.
    * Maps to the FileVersion metadata property on Windows, and CFBundleVersion on OS X.
    */
  var buildVersion: js.UndefOr[String] = js.native
  /**
    * Forces support for Mojave (macOS 10.14) dark mode in the packaged app.
    */
  var darwinDarkModeSupport: js.UndefOr[Boolean] = js.native
  /**
    * Whether symlinks should be dereferenced during the copying of the application source.
    */
  var derefSymlinks: js.UndefOr[Boolean] = js.native
  /** The source directory. */
  var dir: String = js.native
  /**
    * If present, passes custom options to `@electron/get`
    */
  var download: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any
  ] = js.native
  /**
    * The Electron version with which the app is built (without the leading 'v') - for example, 1.4.13
    */
  var electronVersion: js.UndefOr[String] = js.native
  /**
    * The name of the executable file, sans file extension. Defaults to the value for the name parameter
    */
  var executableName: js.UndefOr[String] = js.native
  /**
    * When the value is a String, the filename of a plist file. Its contents are added to the app's plist.
    * When the value is an Object, an already-parsed plist data structure that is merged into the app's plist.
    */
  var extendInfo: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  /**
    * One or more files to be copied directly into the app's Contents/Resources directory for OS X target platforms, and the resources directory for other target platforms.
    */
  var extraResource: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The bundle identifier to use in the application helper's plist.
    */
  var helperBundleId: js.UndefOr[String] = js.native
  /**
    * The local path to the icon file, if the target platform supports setting embedding an icon.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * One or more additional regular expression patterns which specify which files to ignore when copying files to create the app bundle(s).
    * The regular expressions are matched against the absolute path of a given file/directory to be copied.
    */
  var ignore: js.UndefOr[js.RegExp | js.Array[js.RegExp] | ignoreFunction] = js.native
  /**
    * The application name. If omitted, it will use the productName or name value from the nearest package.json
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If present, notarizes OS X target apps when the host platform is OS X and XCode is installed.
    */
  var osxNotarize: js.UndefOr[ElectronNotarizeOptions] = js.native
  /**
    * If present, signs OS X target apps when the host platform is OS X and XCode is installed.
    */
  var osxSign: js.UndefOr[Boolean | ElectronOsXSignOptions] = js.native
  /** The output directory. */
  var out: js.UndefOr[String] = js.native
  /**
    * Whether to replace an already existing output directory for a given platform (true) or skip recreating it (false).
    */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * The target platform(s) to build for. Not required if the all option is set.
    */
  var platform: js.UndefOr[typingsSlinky.electronPackager.mod.platform] = js.native
  /**
    * The path to a prebuilt ASAR file.
    */
  var prebuiltAsar: js.UndefOr[String] = js.native
  /** The URL protocol schemes the app supports. */
  var protocols: js.UndefOr[js.Array[AnonName]] = js.native
  /**
    * Runs the package manager command to remove all of the packages specified in the devDependencies section of package.json from the outputted Electron app.
    */
  var prune: js.UndefOr[Boolean] = js.native
  /**
    * If true, disables printing informational and warning messages to the console when packaging the application. This does not disable errors.
    */
  var quiet: js.UndefOr[Boolean] = js.native
  /**
    * The base directory to use as a temp directory. Set to false to disable use of a temporary directory.
    */
  var tmpdir: js.UndefOr[String | `false`] = js.native
  /**
    * Windows targets only
    */
  var win32metadata: js.UndefOr[Win32Metadata] = js.native
}

object Options {
  @scala.inline
  def apply(dir: String): Options = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCopy(value: js.Array[onCompleteFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterExtract(value: js.Array[onCompleteFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExtract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterExtract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExtract")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPrune(value: js.Array[onCompleteFn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterPrune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPrune")(js.undefined)
        ret
    }
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
    @scala.inline
    def withAppBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withAppCategoryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCategoryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppCategoryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCategoryType")(js.undefined)
        ret
    }
    @scala.inline
    def withAppCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCopyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appCopyright")(js.undefined)
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withArch(value: arch | js.Array[arch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(js.undefined)
        ret
    }
    @scala.inline
    def withAsar(value: Boolean | AsarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asar")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDarwinDarkModeSupport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darwinDarkModeSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDarwinDarkModeSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("darwinDarkModeSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withDerefSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derefSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDerefSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("derefSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableName")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendInfo(value: String | StringDictionary[js.Any]): Self = {
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
    def withExtraResource(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraResource")(js.undefined)
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
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFunction1(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIgnoreRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: js.RegExp | js.Array[js.RegExp] | ignoreFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
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
    def withOsxNotarize(value: ElectronNotarizeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osxNotarize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsxNotarize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osxNotarize")(js.undefined)
        ret
    }
    @scala.inline
    def withOsxSign(value: Boolean | ElectronOsXSignOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osxSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsxSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osxSign")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPrebuiltAsar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prebuiltAsar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrebuiltAsar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prebuiltAsar")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withPrune(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(js.undefined)
        ret
    }
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuiet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpdir(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(js.undefined)
        ret
    }
    @scala.inline
    def withWin32metadata(value: Win32Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win32metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWin32metadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win32metadata")(js.undefined)
        ret
    }
  }
  
}

