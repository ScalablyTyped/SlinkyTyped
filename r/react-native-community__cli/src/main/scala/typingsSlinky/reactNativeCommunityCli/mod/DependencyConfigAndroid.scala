package typingsSlinky.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyConfigAndroid extends js.Object {
  var folder: String = js.native
  var packageImportPath: String = js.native
  var packageInstance: String = js.native
  var sourceDir: String = js.native
}

object DependencyConfigAndroid {
  @scala.inline
  def apply(folder: String, packageImportPath: String, packageInstance: String, sourceDir: String): DependencyConfigAndroid = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], packageImportPath = packageImportPath.asInstanceOf[js.Any], packageInstance = packageInstance.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyConfigAndroid]
  }
  @scala.inline
  implicit class DependencyConfigAndroidOps[Self <: DependencyConfigAndroid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageImportPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageImportPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPackageInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

