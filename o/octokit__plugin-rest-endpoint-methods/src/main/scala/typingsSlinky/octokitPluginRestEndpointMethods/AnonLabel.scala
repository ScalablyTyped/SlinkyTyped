package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var asset_id: AnonRequired
  var label: AnonType
  var name: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonLabel {
  @scala.inline
  def apply(asset_id: AnonRequired, label: AnonType, name: AnonType, owner: AnonRequired, repo: AnonRequired): AnonLabel = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabel]
  }
}

