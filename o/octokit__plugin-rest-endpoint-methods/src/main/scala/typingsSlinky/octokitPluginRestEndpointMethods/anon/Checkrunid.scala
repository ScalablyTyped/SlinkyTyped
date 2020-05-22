package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkrunid extends js.Object {
  var check_run_id: Required
  var owner: Required
  var repo: Required
}

object Checkrunid {
  @scala.inline
  def apply(check_run_id: Required, owner: Required, repo: Required): Checkrunid = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkrunid]
  }
}

