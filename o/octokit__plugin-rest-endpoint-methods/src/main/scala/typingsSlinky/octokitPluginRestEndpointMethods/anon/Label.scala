package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var asset_id: Required
  var label: Type
  var name: Type
  var owner: Required
  var repo: Required
}

object Label {
  @scala.inline
  def apply(asset_id: Required, label: Type, name: Type, owner: Required, repo: Required): Label = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

