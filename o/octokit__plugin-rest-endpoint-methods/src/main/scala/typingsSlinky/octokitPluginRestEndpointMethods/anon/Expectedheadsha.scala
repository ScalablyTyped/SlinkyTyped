package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expectedheadsha extends js.Object {
  var expected_head_sha: Type
  var owner: Required
  var pull_number: Required
  var repo: Required
}

object Expectedheadsha {
  @scala.inline
  def apply(expected_head_sha: Type, owner: Required, pull_number: Required, repo: Required): Expectedheadsha = {
    val __obj = js.Dynamic.literal(expected_head_sha = expected_head_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectedheadsha]
  }
}

