package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerpageState extends js.Object {
  var page: Type
  var per_page: Type
  var state: Enum
}

object PerpageState {
  @scala.inline
  def apply(page: Type, per_page: Type, state: Enum): PerpageState = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerpageState]
  }
}

