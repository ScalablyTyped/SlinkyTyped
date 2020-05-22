package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runnerid extends js.Object {
  var owner: Required
  var repo: Required
  var runner_id: Required
}

object Runnerid {
  @scala.inline
  def apply(owner: Required, repo: Required, runner_id: Required): Runnerid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runnerid]
  }
}

