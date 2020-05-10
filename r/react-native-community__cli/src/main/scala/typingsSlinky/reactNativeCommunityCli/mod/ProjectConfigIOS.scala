package typingsSlinky.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectConfigIOS extends js.Object {
  var folder: String = js.native
  var libraryFolder: String = js.native
  var pbxprojPath: String = js.native
  var plist: js.Array[_] = js.native
  var podfile: Null = js.native
  var podspecPath: Null | String = js.native
  var projectName: String = js.native
  var projectPath: String = js.native
  var sharedLibraries: js.Array[_] = js.native
  var sourceDir: String = js.native
}

object ProjectConfigIOS {
  @scala.inline
  def apply(
    folder: String,
    libraryFolder: String,
    pbxprojPath: String,
    plist: js.Array[_],
    podfile: Null,
    projectName: String,
    projectPath: String,
    sharedLibraries: js.Array[_],
    sourceDir: String
  ): ProjectConfigIOS = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], libraryFolder = libraryFolder.asInstanceOf[js.Any], pbxprojPath = pbxprojPath.asInstanceOf[js.Any], plist = plist.asInstanceOf[js.Any], podfile = podfile.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], sharedLibraries = sharedLibraries.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigIOS]
  }
  @scala.inline
  implicit class ProjectConfigIOSOps[Self <: ProjectConfigIOS] (val x: Self) extends AnyVal {
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
    def withLibraryFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPbxprojPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pbxprojPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlist(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPodfile(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedLibraries(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedLibraries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPodspecPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podspecPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPodspecPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podspecPath")(null)
        ret
    }
  }
  
}

