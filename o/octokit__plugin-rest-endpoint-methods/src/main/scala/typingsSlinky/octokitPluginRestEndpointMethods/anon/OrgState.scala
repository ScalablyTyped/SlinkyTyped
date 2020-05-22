package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgState extends js.Object {
  @JSName("org")
  var org_ : Required
  var state: EnumRequired
}

object OrgState {
  @scala.inline
  def apply(org_ : Required, state: EnumRequired): OrgState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgState]
  }
}

