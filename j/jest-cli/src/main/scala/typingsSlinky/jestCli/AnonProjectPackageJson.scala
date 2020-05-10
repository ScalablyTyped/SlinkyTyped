package typingsSlinky.jestCli

import typingsSlinky.jestCli.typesMod.ProjectPackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProjectPackageJson extends js.Object {
  var projectPackageJson: ProjectPackageJson = js.native
  var shouldModifyScripts: Boolean = js.native
}

object AnonProjectPackageJson {
  @scala.inline
  def apply(projectPackageJson: ProjectPackageJson, shouldModifyScripts: Boolean): AnonProjectPackageJson = {
    val __obj = js.Dynamic.literal(projectPackageJson = projectPackageJson.asInstanceOf[js.Any], shouldModifyScripts = shouldModifyScripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjectPackageJson]
  }
  @scala.inline
  implicit class AnonProjectPackageJsonOps[Self <: AnonProjectPackageJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectPackageJson(value: ProjectPackageJson): Self = {
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

