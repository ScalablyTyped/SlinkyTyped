package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUselfs extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var use_lfs: AnonEnumRequired
}

object AnonUselfs {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, use_lfs: AnonEnumRequired): AnonUselfs = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUselfs]
  }
}

