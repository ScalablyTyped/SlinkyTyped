package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filesha extends js.Object {
  var file_sha: Required
  var owner: Required
  var repo: Required
}

object Filesha {
  @scala.inline
  def apply(file_sha: Required, owner: Required, repo: Required): Filesha = {
    val __obj = js.Dynamic.literal(file_sha = file_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filesha]
  }
}

