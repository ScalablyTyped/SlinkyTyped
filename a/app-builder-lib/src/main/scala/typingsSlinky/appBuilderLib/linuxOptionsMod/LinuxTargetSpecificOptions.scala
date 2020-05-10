package typingsSlinky.appBuilderLib.linuxOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.bzip2
import typingsSlinky.appBuilderLib.appBuilderLibStrings.gz
import typingsSlinky.appBuilderLib.appBuilderLibStrings.xz
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxTargetSpecificOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  val afterInstall: js.UndefOr[String | Null] = js.native
  val afterRemove: js.UndefOr[String | Null] = js.native
  /**
    * The compression type.
    * @default xz
    */
  val compression: js.UndefOr[gz | bzip2 | xz | Null] = js.native
  /**
    * Package dependencies.
    */
  val depends: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * *Advanced only* The [fpm](https://github.com/jordansissel/fpm/wiki#usage) options.
    *
    * Example: `["--before-install=build/deb-preinstall.sh", "--after-upgrade=build/deb-postinstall.sh"]`
    */
  val fpm: js.UndefOr[js.Array[String] | Null] = js.native
  val icon: js.UndefOr[String] = js.native
  val maintainer: js.UndefOr[String | Null] = js.native
  /**
    * The package category.
    */
  val packageCategory: js.UndefOr[String | Null] = js.native
  val vendor: js.UndefOr[String | Null] = js.native
}

object LinuxTargetSpecificOptions {
  @scala.inline
  def apply(): LinuxTargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxTargetSpecificOptions]
  }
  @scala.inline
  implicit class LinuxTargetSpecificOptionsOps[Self <: LinuxTargetSpecificOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInstall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterInstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInstall")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInstallNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInstall")(null)
        ret
    }
    @scala.inline
    def withAfterRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRemoveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemove")(null)
        ret
    }
    @scala.inline
    def withCompression(value: gz | bzip2 | xz): Self = {
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
    def withDepends(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depends")(js.undefined)
        ret
    }
    @scala.inline
    def withDependsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depends")(null)
        ret
    }
    @scala.inline
    def withFpm(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpm")(js.undefined)
        ret
    }
    @scala.inline
    def withFpmNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fpm")(null)
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

