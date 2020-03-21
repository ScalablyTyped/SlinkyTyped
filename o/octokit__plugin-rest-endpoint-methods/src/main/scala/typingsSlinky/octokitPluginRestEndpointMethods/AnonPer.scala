package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPer extends js.Object {
  var owner: AnonRequired
  var per: AnonEnum
  var repo: AnonRequired
}

object AnonPer {
  @scala.inline
  def apply(owner: AnonRequired, per: AnonEnum, repo: AnonRequired): AnonPer = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], per = per.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPer]
  }
}

