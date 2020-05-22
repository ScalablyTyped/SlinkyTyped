package typingsSlinky.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoInfo extends js.Object {
  var path: typingsSlinky.firebaseDatabase.pathMod.Path
  var repoInfo: typingsSlinky.firebaseDatabase.repoInfoMod.RepoInfo
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
}

