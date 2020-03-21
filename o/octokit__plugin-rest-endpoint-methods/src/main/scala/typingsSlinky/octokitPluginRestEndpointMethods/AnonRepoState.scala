package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRepoState extends js.Object {
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
  var state: AnonEnum
}

object AnonRepoState {
  @scala.inline
  def apply(owner: AnonRequired, page: AnonType, per_page: AnonType, repo: AnonRequired, state: AnonEnum): AnonRepoState = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRepoState]
  }
}

