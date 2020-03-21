package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPerpageState extends js.Object {
  var page: AnonType
  var per_page: AnonType
  var state: AnonEnum
}

object AnonPerpageState {
  @scala.inline
  def apply(page: AnonType, per_page: AnonType, state: AnonEnum): AnonPerpageState = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPerpageState]
  }
}

