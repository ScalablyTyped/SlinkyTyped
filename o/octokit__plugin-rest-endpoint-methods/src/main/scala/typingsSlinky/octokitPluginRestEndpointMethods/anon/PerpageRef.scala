package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageRef extends js.Object {
  var owner: Required
  var page: Type
  var per_page: Type
  var ref: Required
  var repo: Required
}

object PerpageRef {
  @scala.inline
  def apply(owner: Required, page: Type, per_page: Type, ref: Required, repo: Required): PerpageRef = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageRef]
  }
}

