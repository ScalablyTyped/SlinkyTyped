package typingsSlinky.navigationReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateNavigator extends js.Object {
  var stateNavigator: typingsSlinky.navigation.mod.StateNavigator = js.native
}

object StateNavigator {
  @scala.inline
  def apply(stateNavigator: typingsSlinky.navigation.mod.StateNavigator): StateNavigator = {
    val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNavigator]
  }
  @scala.inline
  implicit class StateNavigatorOps[Self <: StateNavigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateNavigator(value: typingsSlinky.navigation.mod.StateNavigator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateNavigator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

