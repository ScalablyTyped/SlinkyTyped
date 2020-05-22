package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buildid extends js.Object {
  var build_id: Required
  var owner: Required
  var repo: Required
}

object Buildid {
  @scala.inline
  def apply(build_id: Required, owner: Required, repo: Required): Buildid = {
    val __obj = js.Dynamic.literal(build_id = build_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildid]
  }
}

