package typingsSlinky.appBuilderLib.linuxOptionsMod

import typingsSlinky.appBuilderLib.coreMod.TargetConfigType
import typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxConfiguration
  extends PlatformSpecificBuildOptions
     with CommonLinuxOptions {
  /**
    * The executable name. Defaults to `productName`.
    * Cannot be specified per target, allowed only in the `linux`.
    */
  val executableName: js.UndefOr[String | Null] = js.native
  /**
    * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
    * By default will be generated automatically based on the macOS icns file.
    */
  @JSName("icon")
  val icon_LinuxConfiguration: js.UndefOr[String] = js.native
  /**
    * The maintainer. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val maintainer: js.UndefOr[String | Null] = js.native
  /**
    * backward compatibility + to allow specify fpm-only category for all possible fpm targets in one place
    * @private
    */
  val packageCategory: js.UndefOr[String | Null] = js.native
  /**
    * Target package type: list of `AppImage`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    *
    * electron-builder [docker image](/multi-platform-build#docker) can be used to build Linux targets on any platform.
    *
    * Please [do not put an AppImage into another archive](https://github.com/probonopd/AppImageKit/wiki/Creating-AppImages#common-mistake) like a .zip or .tar.gz.
    * @default AppImage
    */
  @JSName("target")
  val target_LinuxConfiguration: js.UndefOr[TargetConfigType] = js.native
  /**
    * The vendor. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val vendor: js.UndefOr[String | Null] = js.native
}

object LinuxConfiguration {
  @scala.inline
  def apply(): LinuxConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxConfiguration]
  }
  @scala.inline
  implicit class LinuxConfigurationOps[Self <: LinuxConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withExecutableNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableName")(null)
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
    def withMaintainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainer")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainer")(null)
        ret
    }
    @scala.inline
    def withPackageCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageCategoryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageCategory")(null)
        ret
    }
    @scala.inline
    def withTarget(value: TargetConfigType): Self = {
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
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(null)
        ret
    }
  }
  
}

