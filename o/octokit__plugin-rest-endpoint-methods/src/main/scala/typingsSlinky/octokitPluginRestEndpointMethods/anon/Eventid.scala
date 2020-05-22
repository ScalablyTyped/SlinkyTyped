package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eventid extends js.Object {
  var event_id: Required
  var owner: Required
  var repo: Required
}

object Eventid {
  @scala.inline
  def apply(event_id: Required, owner: Required, repo: Required): Eventid = {
    val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventid]
  }
}

