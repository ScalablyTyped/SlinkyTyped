package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Releaseid extends js.Object {
  var owner: Required
  var release_id: Required
  var repo: Required
}

object Releaseid {
  @scala.inline
  def apply(owner: Required, release_id: Required, repo: Required): Releaseid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Releaseid]
  }
}

