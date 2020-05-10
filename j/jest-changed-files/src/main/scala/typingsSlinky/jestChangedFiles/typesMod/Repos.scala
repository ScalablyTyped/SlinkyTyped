package typingsSlinky.jestChangedFiles.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repos extends js.Object {
  var git: Paths = js.native
  var hg: Paths = js.native
}

object Repos {
  @scala.inline
  def apply(git: Paths, hg: Paths): Repos = {
    val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], hg = hg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repos]
  }
  @scala.inline
  implicit class ReposOps[Self <: Repos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGit(value: Paths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHg(value: Paths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

