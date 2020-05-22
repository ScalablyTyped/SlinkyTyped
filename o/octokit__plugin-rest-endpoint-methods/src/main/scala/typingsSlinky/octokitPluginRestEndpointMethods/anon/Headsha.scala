package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headsha extends js.Object {
  var head_sha: Required
  var owner: Required
  var repo: Required
}

object Headsha {
  @scala.inline
  def apply(head_sha: Required, owner: Required, repo: Required): Headsha = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headsha]
  }
}

