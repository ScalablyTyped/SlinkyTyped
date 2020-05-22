package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyid extends js.Object {
  var key_id: Required
  var owner: Required
  var repo: Required
}

object Keyid {
  @scala.inline
  def apply(key_id: Required, owner: Required, repo: Required): Keyid = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyid]
  }
}

