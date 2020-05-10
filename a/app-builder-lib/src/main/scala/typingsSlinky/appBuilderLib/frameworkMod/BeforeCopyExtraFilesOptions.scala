package typingsSlinky.appBuilderLib.frameworkMod

import typingsSlinky.appBuilderLib.integrityMod.AsarIntegrity
import typingsSlinky.appBuilderLib.mod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeCopyExtraFilesOptions extends js.Object {
  var appOutDir: String = js.native
  var asarIntegrity: AsarIntegrity | Null = js.native
  var packager: PlatformPackager[_] = js.native
  var platformName: String = js.native
}

object BeforeCopyExtraFilesOptions {
  @scala.inline
  def apply(appOutDir: String, packager: PlatformPackager[_], platformName: String): BeforeCopyExtraFilesOptions = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCopyExtraFilesOptions]
  }
  @scala.inline
  implicit class BeforeCopyExtraFilesOptionsOps[Self <: BeforeCopyExtraFilesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppOutDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appOutDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackager(value: PlatformPackager[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsarIntegrity(value: AsarIntegrity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asarIntegrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsarIntegrityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asarIntegrity")(null)
        ret
    }
  }
  
}

