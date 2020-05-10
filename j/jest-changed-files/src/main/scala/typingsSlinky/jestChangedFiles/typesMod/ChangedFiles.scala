package typingsSlinky.jestChangedFiles.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangedFiles extends js.Object {
  var changedFiles: Paths = js.native
  var repos: Repos = js.native
}

object ChangedFiles {
  @scala.inline
  def apply(changedFiles: Paths, repos: Repos): ChangedFiles = {
    val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedFiles]
  }
  @scala.inline
  implicit class ChangedFilesOps[Self <: ChangedFiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangedFiles(value: Paths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos(value: Repos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

