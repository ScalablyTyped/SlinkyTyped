package typingsSlinky.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyParamsAndroid extends js.Object {
  var manifestPath: js.UndefOr[String] = js.native
  var packageImportPath: js.UndefOr[String] = js.native
  var packageInstance: js.UndefOr[String] = js.native
  var sourceDir: js.UndefOr[String] = js.native
}

object DependencyParamsAndroid {
  @scala.inline
  def apply(): DependencyParamsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyParamsAndroid]
  }
  @scala.inline
  implicit class DependencyParamsAndroidOps[Self <: DependencyParamsAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifestPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageImportPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageImportPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageImportPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageImportPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(js.undefined)
        ret
    }
  }
  
}

