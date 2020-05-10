package typingsSlinky.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectConfigAndroid extends js.Object {
  var assetsPath: String = js.native
  var buildGradlePath: String = js.native
  var folder: String = js.native
  var isFlat: Boolean = js.native
  var mainFilePath: String = js.native
  var manifestPath: String = js.native
  var packageName: String = js.native
  var settingsGradlePath: String = js.native
  var sourceDir: String = js.native
  var stringsPath: String = js.native
}

object ProjectConfigAndroid {
  @scala.inline
  def apply(
    assetsPath: String,
    buildGradlePath: String,
    folder: String,
    isFlat: Boolean,
    mainFilePath: String,
    manifestPath: String,
    packageName: String,
    settingsGradlePath: String,
    sourceDir: String,
    stringsPath: String
  ): ProjectConfigAndroid = {
    val __obj = js.Dynamic.literal(assetsPath = assetsPath.asInstanceOf[js.Any], buildGradlePath = buildGradlePath.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], isFlat = isFlat.asInstanceOf[js.Any], mainFilePath = mainFilePath.asInstanceOf[js.Any], manifestPath = manifestPath.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], settingsGradlePath = settingsGradlePath.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any], stringsPath = stringsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigAndroid]
  }
  @scala.inline
  implicit class ProjectConfigAndroidOps[Self <: ProjectConfigAndroid] (val x: Self) extends AnyVal {
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
    def withBuildGradlePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildGradlePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFlat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsGradlePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsGradlePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringsPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

