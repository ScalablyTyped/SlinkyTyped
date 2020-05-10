package typingsSlinky.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiProjectConfig extends ProjectFile {
  var defaultProject: js.UndefOr[String] = js.native
  var projects: StringDictionary[js.UndefOr[IProjectConfig]] = js.native
}

object IMultiProjectConfig {
  @scala.inline
  def apply(projects: StringDictionary[js.UndefOr[IProjectConfig]]): IMultiProjectConfig = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiProjectConfig]
  }
  @scala.inline
  implicit class IMultiProjectConfigOps[Self <: IMultiProjectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjects(value: StringDictionary[js.UndefOr[IProjectConfig]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProject")(js.undefined)
        ret
    }
  }
  
}

