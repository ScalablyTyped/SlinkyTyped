package typingsSlinky.jestCli.typesMod

import typingsSlinky.jestCli.PartialInitialOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectPackageJson extends js.Object {
  var jest: js.UndefOr[PartialInitialOptions] = js.native
  var scripts: js.UndefOr[Record[String, String]] = js.native
}

object ProjectPackageJson {
  @scala.inline
  def apply(): ProjectPackageJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectPackageJson]
  }
  @scala.inline
  implicit class ProjectPackageJsonOps[Self <: ProjectPackageJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJest(value: PartialInitialOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jest")(js.undefined)
        ret
    }
    @scala.inline
    def withScripts(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScripts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripts")(js.undefined)
        ret
    }
  }
  
}

