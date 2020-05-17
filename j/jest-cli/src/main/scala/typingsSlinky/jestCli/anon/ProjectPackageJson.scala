package typingsSlinky.jestCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectPackageJson extends js.Object {
  var projectPackageJson: typingsSlinky.jestCli.typesMod.ProjectPackageJson = js.native
  var shouldModifyScripts: Boolean = js.native
}

object ProjectPackageJson {
  @scala.inline
  def apply(
    projectPackageJson: typingsSlinky.jestCli.typesMod.ProjectPackageJson,
    shouldModifyScripts: Boolean
  ): ProjectPackageJson = {
    val __obj = js.Dynamic.literal(projectPackageJson = projectPackageJson.asInstanceOf[js.Any], shouldModifyScripts = shouldModifyScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPackageJson]
  }
  @scala.inline
  implicit class ProjectPackageJsonOps[Self <: ProjectPackageJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectPackageJson(value: typingsSlinky.jestCli.typesMod.ProjectPackageJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectPackageJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldModifyScripts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldModifyScripts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

