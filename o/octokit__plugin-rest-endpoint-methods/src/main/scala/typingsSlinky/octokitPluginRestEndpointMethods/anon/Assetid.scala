package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assetid extends js.Object {
  var asset_id: Required
  var owner: Required
  var repo: Required
}

object Assetid {
  @scala.inline
  def apply(asset_id: Required, owner: Required, repo: Required): Assetid = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assetid]
  }
}

