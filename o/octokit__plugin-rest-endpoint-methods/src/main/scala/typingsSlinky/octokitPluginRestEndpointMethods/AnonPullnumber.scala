package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPullnumber extends js.Object {
  var number: AnonAlias
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
}

object AnonPullnumber {
  @scala.inline
  def apply(number: AnonAlias, owner: AnonRequired, pull_number: AnonRequired, repo: AnonRequired): AnonPullnumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPullnumber]
  }
}

