package typingsSlinky.ionic.libProjectMod

import typingsSlinky.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDetailsDeps extends js.Object {
  val args: js.UndefOr[ParsedArgs] = js.native
  val e: ProjectDeps = js.native
  val rootDirectory: String = js.native
}

object ProjectDetailsDeps {
  @scala.inline
  def apply(e: ProjectDeps, rootDirectory: String): ProjectDetailsDeps = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsDeps]
  }
  @scala.inline
  implicit class ProjectDetailsDepsOps[Self <: ProjectDetailsDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: ProjectDeps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: ParsedArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
  }
  
}

