package typingsSlinky.appBuilderLib.configurationMod

import typingsSlinky.appBuilderLib.appXOptionsMod.AppXOptions
import typingsSlinky.appBuilderLib.coreMod.BeforeBuildContext
import typingsSlinky.appBuilderLib.electronFrameworkMod.ElectronDownloadOptions
import typingsSlinky.appBuilderLib.linuxOptionsMod.AppImageOptions
import typingsSlinky.appBuilderLib.linuxOptionsMod.DebOptions
import typingsSlinky.appBuilderLib.linuxOptionsMod.LinuxConfiguration
import typingsSlinky.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typingsSlinky.appBuilderLib.macOptionsMod.DmgOptions
import typingsSlinky.appBuilderLib.macOptionsMod.MacConfiguration
import typingsSlinky.appBuilderLib.macOptionsMod.MasConfiguration
import typingsSlinky.appBuilderLib.msiOptionsMod.MsiOptions
import typingsSlinky.appBuilderLib.nsisOptionsMod.NsisOptions
import typingsSlinky.appBuilderLib.nsisOptionsMod.NsisWebOptions
import typingsSlinky.appBuilderLib.nsisOptionsMod.PortableOptions
import typingsSlinky.appBuilderLib.packagerApiMod.ArtifactBuildStarted
import typingsSlinky.appBuilderLib.packagerApiMod.ArtifactCreated
import typingsSlinky.appBuilderLib.packagerMod.BuildResult
import typingsSlinky.appBuilderLib.pkgOptionsMod.PkgOptions
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsSlinky.appBuilderLib.snapOptionsMod.SnapOptions
import typingsSlinky.appBuilderLib.squirrelWindowsOptionsMod.SquirrelWindowsOptions
import typingsSlinky.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends PlatformSpecificBuildOptions {
  /**
    * The function (or path to file or module id) to be [run after all artifacts are build](#afterAllArtifactBuild).
    */
  val afterAllArtifactBuild: js.UndefOr[
    (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String | Null
  ] = js.native
  /**
    * The function (or path to file or module id) to be [run after pack](#afterpack) (but before pack into distributable format and sign).
    */
  val afterPack: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String | Null
  ] = js.native
  /**
    * The function (or path to file or module id) to be [run after pack and sign](#aftersign) (but before pack into distributable format).
    */
  val afterSign: js.UndefOr[
    (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String | Null
  ] = js.native
  val apk: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * AppImage options.
    */
  val appImage: js.UndefOr[AppImageOptions | Null] = js.native
  val appx: js.UndefOr[AppXOptions | Null] = js.native
  /**
    * The function (or path to file or module id) to be run on artifact build completed.
    */
  val artifactBuildCompleted: js.UndefOr[(js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String | Null] = js.native
  /**
    * The function (or path to file or module id) to be run on artifact build start.
    */
  val artifactBuildStarted: js.UndefOr[
    (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String | Null
  ] = js.native
  /**
    * The function (or path to file or module id) to be run before dependencies are installed or rebuilt. Works when `npmRebuild` is set to `true`. Resolving to `false` will skip dependencies install or rebuild.
    *
    * If provided and `node_modules` are missing, it will not invoke production dependencies check.
    */
  val beforeBuild: js.UndefOr[(js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String | Null] = js.native
  /**
    * Whether to build the application native dependencies from source.
    * @default false
    */
  var buildDependenciesFromSource: js.UndefOr[Boolean] = js.native
  /**
    * The build version. Maps to the `CFBundleVersion` on macOS, and `FileVersion` metadata property on Windows. Defaults to the `version`.
    * If `TRAVIS_BUILD_NUMBER` or `APPVEYOR_BUILD_NUMBER` or `CIRCLE_BUILD_NUM` or `BUILD_NUMBER` or `bamboo.buildNumber` or `CI_PIPELINE_IID` env defined, it will be used as a build version (`version.build_number`).
    */
  val buildVersion: js.UndefOr[String | Null] = js.native
  /**
    * The human-readable copyright line for the app.
    * @default Copyright © year ${author}
    */
  val copyright: js.UndefOr[String | Null] = js.native
  /**
    * Debian package options.
    */
  val deb: js.UndefOr[DebOptions | Null] = js.native
  val directories: js.UndefOr[MetadataDirectories | Null] = js.native
  /**
    * macOS DMG options.
    */
  val dmg: js.UndefOr[DmgOptions | Null] = js.native
  /**
    * Whether to use [electron-compile](http://github.com/electron/electron-compile) to compile app. Defaults to `true` if `electron-compile` in the dependencies. And `false` if in the `devDependencies` or doesn't specified.
    */
  val electronCompile: js.UndefOr[Boolean] = js.native
  /**
    * The path to custom Electron build (e.g. `~/electron/out/R`).
    */
  val electronDist: js.UndefOr[String] = js.native
  /**
    * The [electron-download](https://github.com/electron-userland/electron-download#usage) options.
    */
  val electronDownload: js.UndefOr[ElectronDownloadOptions] = js.native
  /**
    * The version of electron you are packaging for. Defaults to version of `electron`, `electron-prebuilt` or `electron-prebuilt-compile` dependency.
    */
  var electronVersion: js.UndefOr[String | Null] = js.native
  /**
    * The name of a built-in configuration preset or path to config file (relative to project dir). Currently, only `react-cra` is supported.
    *
    * If `react-scripts` in the app dependencies, `react-cra` will be set automatically. Set to `null` to disable automatic detection.
    */
  var `extends`: js.UndefOr[String | Null] = js.native
  /**
    * Inject properties to `package.json`.
    */
  val extraMetadata: js.UndefOr[js.Any] = js.native
  /**
    * The framework name. One of `electron`, `proton`, `libui`. Defaults to `electron`.
    */
  val framework: js.UndefOr[String | Null] = js.native
  val freebsd: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * Whether to include PDB files.
    * @default false
    */
  val includePdb: js.UndefOr[Boolean] = js.native
  /**
    * *libui-based frameworks only* The version of LaunchUI you are packaging for. Applicable for Windows only. Defaults to version suitable for used framework version.
    */
  val launchUiVersion: js.UndefOr[Boolean | String | Null] = js.native
  /**
    * Options related to how build Linux targets.
    */
  val linux: js.UndefOr[LinuxConfiguration | Null] = js.native
  /**
    * Options related to how build macOS targets.
    */
  val mac: js.UndefOr[MacConfiguration | Null] = js.native
  /**
    * MAS (Mac Application Store) options.
    */
  val mas: js.UndefOr[MasConfiguration | Null] = js.native
  /**
    * MAS (Mac Application Store) development options (`mas-dev` target).
    */
  val masDev: js.UndefOr[MasConfiguration | Null] = js.native
  /** @private */
  val msi: js.UndefOr[MsiOptions | Null] = js.native
  /**
    * Whether to execute `node-gyp rebuild` before starting to package the app.
    *
    * Don't [use](https://github.com/electron-userland/electron-builder/issues/683#issuecomment-241214075) [npm](http://electron.atom.io/docs/tutorial/using-native-node-modules/#using-npm) (neither `.npmrc`) for configuring electron headers. Use `electron-builder node-gyp-rebuild` instead.
    * @default false
    */
  val nodeGypRebuild: js.UndefOr[Boolean] = js.native
  /**
    * *libui-based frameworks only* The version of NodeJS you are packaging for.
    * You can set it to `current` to set the Node.js version that you use to run.
    */
  val nodeVersion: js.UndefOr[String | Null] = js.native
  /**
    * Additional command line arguments to use when installing app native deps.
    */
  val npmArgs: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * Whether to [rebuild](https://docs.npmjs.com/cli/rebuild) native dependencies before starting to package the app.
    * @default true
    */
  val npmRebuild: js.UndefOr[Boolean] = js.native
  val nsis: js.UndefOr[NsisOptions | Null] = js.native
  val nsisWeb: js.UndefOr[NsisWebOptions | Null] = js.native
  /**
    * The function (or path to file or module id) to be [run on each node module](#onnodemodulefile) file.
    */
  val onNodeModuleFile: js.UndefOr[(js.Function1[/* file */ String, Unit]) | String | Null] = js.native
  val p5p: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  val pacman: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * macOS PKG options.
    */
  val pkg: js.UndefOr[PkgOptions | Null] = js.native
  val portable: js.UndefOr[PortableOptions | Null] = js.native
  /**
    * As [name](#Metadata-name), but allows you to specify a product name for your executable which contains spaces and other special characters not allowed in the [name property](https://docs.npmjs.com/files/package.json#name).
    */
  val productName: js.UndefOr[String | Null] = js.native
  /**
    * Whether to fail if the application is not signed (to prevent unsigned app if code signing configuration is not correct).
    * @default false
    */
  var readonly: js.UndefOr[Boolean] = js.native
  /**
    * Whether to build using Electron Build Service if target not supported on current OS.
    * @default true
    */
  val remoteBuild: js.UndefOr[Boolean] = js.native
  /**
    * Whether to remove `scripts` field from `package.json` files.
    *
    * @default true
    */
  val removePackageScripts: js.UndefOr[Boolean] = js.native
  val rpm: js.UndefOr[LinuxTargetSpecificOptions | Null] = js.native
  /**
    * Snap options.
    */
  val snap: js.UndefOr[SnapOptions | Null] = js.native
  val squirrelWindows: js.UndefOr[SquirrelWindowsOptions | Null] = js.native
  /**
    * Options related to how build Windows targets.
    */
  val win: js.UndefOr[WindowsConfiguration | Null] = js.native
}

object Configuration {
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterAllArtifactBuildFunction1(value: /* context */ BuildResult => js.Promise[js.Array[String]] | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllArtifactBuild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterAllArtifactBuild(
      value: (js.Function1[/* context */ BuildResult, js.Promise[js.Array[String]] | js.Array[String]]) | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllArtifactBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterAllArtifactBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllArtifactBuild")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterAllArtifactBuildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAllArtifactBuild")(null)
        ret
    }
    @scala.inline
    def withAfterPackFunction1(value: /* context */ AfterPackContext => js.Promise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterPack(value: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPack")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterPackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPack")(null)
        ret
    }
    @scala.inline
    def withAfterSignFunction1(value: /* context */ AfterPackContext => js.Promise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterSign(value: (js.Function1[/* context */ AfterPackContext, js.Promise[_] | _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSign")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSignNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSign")(null)
        ret
    }
    @scala.inline
    def withApk(value: LinuxTargetSpecificOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apk")(js.undefined)
        ret
    }
    @scala.inline
    def withApkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apk")(null)
        ret
    }
    @scala.inline
    def withAppImage(value: AppImageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appImage")(js.undefined)
        ret
    }
    @scala.inline
    def withAppImageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appImage")(null)
        ret
    }
    @scala.inline
    def withAppx(value: AppXOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appx")(js.undefined)
        ret
    }
    @scala.inline
    def withAppxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appx")(null)
        ret
    }
    @scala.inline
    def withArtifactBuildCompletedFunction1(value: /* context */ ArtifactCreated => js.Promise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildCompleted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArtifactBuildCompleted(value: (js.Function1[/* context */ ArtifactCreated, js.Promise[_] | _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactBuildCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactBuildCompletedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildCompleted")(null)
        ret
    }
    @scala.inline
    def withArtifactBuildStartedFunction1(value: /* context */ ArtifactBuildStarted => js.Promise[_] | _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArtifactBuildStarted(value: (js.Function1[/* context */ ArtifactBuildStarted, js.Promise[_] | _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtifactBuildStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withArtifactBuildStartedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactBuildStarted")(null)
        ret
    }
    @scala.inline
    def withBeforeBuildFunction1(value: /* context */ BeforeBuildContext => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBuild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeBuild(value: (js.Function1[/* context */ BeforeBuildContext, js.Promise[_]]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBuild")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBuildNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBuild")(null)
        ret
    }
    @scala.inline
    def withBuildDependenciesFromSource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDependenciesFromSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildDependenciesFromSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildDependenciesFromSource")(js.undefined)
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
    def withBuildVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildVersion")(null)
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
    def withCopyrightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(null)
        ret
    }
    @scala.inline
    def withDeb(value: DebOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deb")(js.undefined)
        ret
    }
    @scala.inline
    def withDebNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deb")(null)
        ret
    }
    @scala.inline
    def withDirectories(value: MetadataDirectories): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoriesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directories")(null)
        ret
    }
    @scala.inline
    def withDmg(value: DmgOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDmg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmg")(js.undefined)
        ret
    }
    @scala.inline
    def withDmgNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmg")(null)
        ret
    }
    @scala.inline
    def withElectronCompile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronCompile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronCompile")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronDist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronDist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronDist")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronDownload(value: ElectronDownloadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronDownload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronDownload")(js.undefined)
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
    def withElectronVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronVersion")(null)
        ret
    }
    @scala.inline
    def withExtends(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(null)
        ret
    }
    @scala.inline
    def withExtraMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramework: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(null)
        ret
    }
    @scala.inline
    def withFreebsd(value: LinuxTargetSpecificOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freebsd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreebsd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freebsd")(js.undefined)
        ret
    }
    @scala.inline
    def withFreebsdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freebsd")(null)
        ret
    }
    @scala.inline
    def withIncludePdb(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePdb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePdb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePdb")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchUiVersion(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchUiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchUiVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchUiVersion")(null)
        ret
    }
    @scala.inline
    def withLinux(value: LinuxConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinux: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(js.undefined)
        ret
    }
    @scala.inline
    def withLinuxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linux")(null)
        ret
    }
    @scala.inline
    def withMac(value: MacConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(js.undefined)
        ret
    }
    @scala.inline
    def withMacNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(null)
        ret
    }
    @scala.inline
    def withMas(value: MasConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mas")(js.undefined)
        ret
    }
    @scala.inline
    def withMasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mas")(null)
        ret
    }
    @scala.inline
    def withMasDev(value: MasConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masDev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masDev")(js.undefined)
        ret
    }
    @scala.inline
    def withMasDevNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masDev")(null)
        ret
    }
    @scala.inline
    def withMsi(value: MsiOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msi")(js.undefined)
        ret
    }
    @scala.inline
    def withMsiNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msi")(null)
        ret
    }
    @scala.inline
    def withNodeGypRebuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGypRebuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGypRebuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGypRebuild")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(null)
        ret
    }
    @scala.inline
    def withNpmArgs(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpmArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withNpmArgsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmArgs")(null)
        ret
    }
    @scala.inline
    def withNpmRebuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmRebuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpmRebuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npmRebuild")(js.undefined)
        ret
    }
    @scala.inline
    def withNsis(value: NsisOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsis")(js.undefined)
        ret
    }
    @scala.inline
    def withNsisNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsis")(null)
        ret
    }
    @scala.inline
    def withNsisWeb(value: NsisWebOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsisWeb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsisWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsisWeb")(js.undefined)
        ret
    }
    @scala.inline
    def withNsisWebNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsisWeb")(null)
        ret
    }
    @scala.inline
    def withOnNodeModuleFileFunction1(value: /* file */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeModuleFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNodeModuleFile(value: (js.Function1[/* file */ String, Unit]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeModuleFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnNodeModuleFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeModuleFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeModuleFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeModuleFile")(null)
        ret
    }
    @scala.inline
    def withP5p(value: LinuxTargetSpecificOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p5p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP5p: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p5p")(js.undefined)
        ret
    }
    @scala.inline
    def withP5pNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p5p")(null)
        ret
    }
    @scala.inline
    def withPacman(value: LinuxTargetSpecificOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacman")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacman: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacman")(js.undefined)
        ret
    }
    @scala.inline
    def withPacmanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacman")(null)
        ret
    }
    @scala.inline
    def withPkg(value: PkgOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPkg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(js.undefined)
        ret
    }
    @scala.inline
    def withPkgNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pkg")(null)
        ret
    }
    @scala.inline
    def withPortable(value: PortableOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portable")(js.undefined)
        ret
    }
    @scala.inline
    def withPortableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portable")(null)
        ret
    }
    @scala.inline
    def withProductName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(js.undefined)
        ret
    }
    @scala.inline
    def withProductNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productName")(null)
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteBuild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteBuild")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovePackageScripts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePackageScripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovePackageScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePackageScripts")(js.undefined)
        ret
    }
    @scala.inline
    def withRpm(value: LinuxTargetSpecificOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpm")(js.undefined)
        ret
    }
    @scala.inline
    def withRpmNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpm")(null)
        ret
    }
    @scala.inline
    def withSnap(value: SnapOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(null)
        ret
    }
    @scala.inline
    def withSquirrelWindows(value: SquirrelWindowsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squirrelWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSquirrelWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squirrelWindows")(js.undefined)
        ret
    }
    @scala.inline
    def withSquirrelWindowsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squirrelWindows")(null)
        ret
    }
    @scala.inline
    def withWin(value: WindowsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(js.undefined)
        ret
    }
    @scala.inline
    def withWinNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("win")(null)
        ret
    }
  }
  
}

