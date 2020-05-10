package typingsSlinky.reactNativeCommunityCli.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectParamsIOS extends js.Object {
  var libraryFolder: js.UndefOr[String] = js.native
  var plist: js.Array[_] = js.native
  var podspecPath: js.UndefOr[String] = js.native
  var project: js.UndefOr[String] = js.native
  var scriptPhases: Record[String, String] = js.native
  var sharedLibraries: js.UndefOr[js.Array[String]] = js.native
}

object ProjectParamsIOS {
  @scala.inline
  def apply(plist: js.Array[_], scriptPhases: Record[String, String]): ProjectParamsIOS = {
    val __obj = js.Dynamic.literal(plist = plist.asInstanceOf[js.Any], scriptPhases = scriptPhases.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectParamsIOS]
  }
  @scala.inline
  implicit class ProjectParamsIOSOps[Self <: ProjectParamsIOS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlist(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptPhases(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptPhases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibraryFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraryFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPodspecPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podspecPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodspecPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podspecPath")(js.undefined)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedLibraries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedLibraries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedLibraries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedLibraries")(js.undefined)
        ret
    }
  }
  
}

