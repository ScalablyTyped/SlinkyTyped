package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checksuiteid extends js.Object {
  var check_suite_id: Required
  var owner: Required
  var repo: Required
}

object Checksuiteid {
  @scala.inline
  def apply(check_suite_id: Required, owner: Required, repo: Required): Checksuiteid = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksuiteid]
  }
}

