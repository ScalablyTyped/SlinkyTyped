package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.pathMod.Path
import typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRepoInfo extends js.Object {
  var path: Path = js.native
  var repoInfo: RepoInfo = js.native
}

object AnonRepoInfo {
  @scala.inline
  def apply(path: Path, repoInfo: RepoInfo): AnonRepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRepoInfo]
  }
  @scala.inline
  implicit class AnonRepoInfoOps[Self <: AnonRepoInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepoInfo(value: RepoInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

