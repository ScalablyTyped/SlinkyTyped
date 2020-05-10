package typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod

import typingsSlinky.appBuilderLib.coreMod.CompressionLevel
import typingsSlinky.appBuilderLib.coreMod.TargetConfiguration
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import typingsSlinky.appBuilderLib.fileAssociationMod.FileAssociation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformSpecificBuildOptions extends TargetSpecificOptions {
  /**
    * The application id. Used as [CFBundleIdentifier](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/CoreFoundationKeys.html#//apple_ref/doc/uid/20001431-102070) for MacOS and as
    * [Application User Model ID](https://msdn.microsoft.com/en-us/library/windows/desktop/dd378459(v=vs.85).aspx) for Windows (NSIS target only, Squirrel.Windows not supported). It is strongly recommended that an explicit ID is set.
    * @default com.electron.${name}
    */
  val appId: js.UndefOr[String | Null] = js.native
  /**
    * Whether to package the application's source code into an archive, using [Electron's archive format](http://electron.atom.io/docs/tutorial/application-packaging/).
    *
    * Node modules, that must be unpacked, will be detected automatically, you don't need to explicitly set [asarUnpack](#configuration-asarUnpack) - please file an issue if this doesn't work.
    * @default true
    */
  val asar: js.UndefOr[AsarOptions | Boolean | Null] = js.native
  /**
    * A [glob patterns](/file-patterns) relative to the [app directory](#MetadataDirectories-app), which specifies which files to unpack when creating the [asar](http://electron.atom.io/docs/tutorial/application-packaging/) archive.
    */
  val asarUnpack: js.UndefOr[js.Array[String] | String | Null] = js.native
  /**
    * The compression level. If you want to rapidly test build, `store` can reduce build time significantly. `maximum` doesn't lead to noticeable size difference, but increase build time.
    * @default normal
    */
  val compression: js.UndefOr[CompressionLevel | Null] = js.native
  /** @private */
  var cscKeyPassword: js.UndefOr[String | Null] = js.native
  /** @private */
  var cscLink: js.UndefOr[String | Null] = js.native
  /**
    * Whether to infer update channel from application version pre-release components. e.g. if version `0.12.1-alpha.1`, channel will be set to `alpha`. Otherwise to `latest`.
    * @default true
    */
  val detectUpdateChannel: js.UndefOr[Boolean] = js.native
  /**
    * The [electron-updater compatibility](/auto-update#compatibility) semver range.
    */
  val electronUpdaterCompatibility: js.UndefOr[String | Null] = js.native
  var extraFiles: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.native
  var extraResources: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.native
  /**
    * The file associations.
    */
  val fileAssociations: js.UndefOr[js.Array[FileAssociation] | FileAssociation] = js.native
  var files: js.UndefOr[(js.Array[FileSet | String]) | FileSet | String | Null] = js.native
  /**
    * Whether to fail if app will be not code signed.
    */
  val forceCodeSigning: js.UndefOr[Boolean] = js.native
  /**
    * Please see [Building and Releasing using Channels](https://github.com/electron-userland/electron-builder/issues/1182#issuecomment-324947139).
    * @default false
    */
  val generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.native
  /** @private */
  val icon: js.UndefOr[String | Null] = js.native
  /**
    * The URL protocol schemes.
    */
  val protocols: js.UndefOr[js.Array[Protocol] | Protocol] = js.native
  /**
    * The release info. Intended for command line usage:
    *
    * ```
    * -c.releaseInfo.releaseNotes="new features"
    * ```
    */
  val releaseInfo: js.UndefOr[ReleaseInfo] = js.native
  val target: js.UndefOr[(js.Array[String | TargetConfiguration]) | String | TargetConfiguration | Null] = js.native
}

object PlatformSpecificBuildOptions {
  @scala.inline
  def apply(): PlatformSpecificBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformSpecificBuildOptions]
  }
  @scala.inline
  implicit class PlatformSpecificBuildOptionsOps[Self <: PlatformSpecificBuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withAppIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(null)
        ret
    }
    @scala.inline
    def withAsar(value: AsarOptions | Boolean): Self = {
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
    def withAsarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asar")(null)
        ret
    }
    @scala.inline
    def withAsarUnpack(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asarUnpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsarUnpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asarUnpack")(js.undefined)
        ret
    }
    @scala.inline
    def withAsarUnpackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asarUnpack")(null)
        ret
    }
    @scala.inline
    def withCompression(value: CompressionLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withCompressionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(null)
        ret
    }
    @scala.inline
    def withCscKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscKeyPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withCscKeyPasswordNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscKeyPassword")(null)
        ret
    }
    @scala.inline
    def withCscLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCscLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCscLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cscLink")(null)
        ret
    }
    @scala.inline
    def withDetectUpdateChannel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectUpdateChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectUpdateChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectUpdateChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronUpdaterCompatibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronUpdaterCompatibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElectronUpdaterCompatibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronUpdaterCompatibility")(js.undefined)
        ret
    }
    @scala.inline
    def withElectronUpdaterCompatibilityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("electronUpdaterCompatibility")(null)
        ret
    }
    @scala.inline
    def withExtraFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraFilesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraFiles")(null)
        ret
    }
    @scala.inline
    def withExtraResources(value: (js.Array[FileSet | String]) | FileSet | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraResources")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraResourcesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraResources")(null)
        ret
    }
    @scala.inline
    def withFileAssociations(value: js.Array[FileAssociation] | FileAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileAssociations")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: (js.Array[FileSet | String]) | FileSet | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(null)
        ret
    }
    @scala.inline
    def withForceCodeSigning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCodeSigning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceCodeSigning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceCodeSigning")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateUpdatesFilesForAllChannels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateUpdatesFilesForAllChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateUpdatesFilesForAllChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateUpdatesFilesForAllChannels")(js.undefined)
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
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[Protocol] | Protocol): Self = {
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
    def withReleaseInfo(value: ReleaseInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: (js.Array[String | TargetConfiguration]) | String | TargetConfiguration): Self = {
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
  }
  
}

