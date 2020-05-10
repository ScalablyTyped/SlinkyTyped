package typingsSlinky.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectParamsAndroid extends js.Object {
  var assetsPath: js.UndefOr[String] = js.native
  var buildGradlePath: js.UndefOr[String] = js.native
  var mainFilePath: js.UndefOr[String] = js.native
  var manifestPath: js.UndefOr[String] = js.native
  var packageFolder: js.UndefOr[String] = js.native
  var packageName: js.UndefOr[String] = js.native
  var settingsGradlePath: js.UndefOr[String] = js.native
  var sourceDir: js.UndefOr[String] = js.native
  var stringsPath: js.UndefOr[String] = js.native
}

object ProjectParamsAndroid {
  @scala.inline
  def apply(): ProjectParamsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectParamsAndroid]
  }
  @scala.inline
  implicit class ProjectParamsAndroidOps[Self <: ProjectParamsAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildGradlePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildGradlePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildGradlePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildGradlePath")(js.undefined)
        ret
    }
    @scala.inline
    def withMainFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFilePath")(js.undefined)
        ret
    }
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
    def withPackageFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsGradlePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsGradlePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsGradlePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsGradlePath")(js.undefined)
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
    @scala.inline
    def withStringsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringsPath")(js.undefined)
        ret
    }
  }
  
}

