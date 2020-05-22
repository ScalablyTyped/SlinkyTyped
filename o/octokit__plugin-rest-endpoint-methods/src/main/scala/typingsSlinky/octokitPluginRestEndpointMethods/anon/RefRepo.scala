package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefRepo extends js.Object {
  var owner: Required
  var ref: Type
  var repo: Required
}

object RefRepo {
  @scala.inline
  def apply(owner: Required, ref: Type, repo: Required): RefRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefRepo]
  }
}

