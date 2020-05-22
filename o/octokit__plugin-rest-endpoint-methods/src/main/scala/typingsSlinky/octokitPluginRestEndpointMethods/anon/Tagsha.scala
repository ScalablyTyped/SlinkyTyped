package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tagsha extends js.Object {
  var owner: Required
  var repo: Required
  var tag_sha: Required
}

object Tagsha {
  @scala.inline
  def apply(owner: Required, repo: Required, tag_sha: Required): Tagsha = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_sha = tag_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagsha]
  }
}

