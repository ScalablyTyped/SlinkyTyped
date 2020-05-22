package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  var owner: Required
  var ref: Required
  var repo: Required
  var sha: Required
}

object Ref {
  @scala.inline
  def apply(owner: Required, ref: Required, repo: Required, sha: Required): Ref = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

