package typingsSlinky.jestCli.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectPackageJson extends js.Object {
  var projectPackageJson: typingsSlinky.jestCli.typesMod.ProjectPackageJson
  var shouldModifyScripts: Boolean
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
}

