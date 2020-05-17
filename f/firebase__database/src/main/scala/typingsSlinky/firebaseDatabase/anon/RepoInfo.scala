package typingsSlinky.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepoInfo extends js.Object {
  var path: typingsSlinky.firebaseDatabase.pathMod.Path = js.native
  var repoInfo: typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo = js.native
}

object RepoInfo {
  @scala.inline
  def apply(
    path: typingsSlinky.firebaseDatabase.pathMod.Path,
    repoInfo: typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
  ): RepoInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], repoInfo = repoInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoInfo]
  }
  @scala.inline
  implicit class RepoInfoOps[Self <: RepoInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPath(value: typingsSlinky.firebaseDatabase.pathMod.Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepoInfo(value: typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

