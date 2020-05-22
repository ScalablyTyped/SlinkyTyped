package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha extends js.Object {
  var gist_id: Required
  var sha: Required
}

object Sha {
  @scala.inline
  def apply(gist_id: Required, sha: Required): Sha = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha]
  }
}

