package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnerRef extends js.Object {
  var owner: Required
  var ref: Required
  var repo: Required
}

object OwnerRef {
  @scala.inline
  def apply(owner: Required, ref: Required, repo: Required): OwnerRef = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerRef]
  }
}

