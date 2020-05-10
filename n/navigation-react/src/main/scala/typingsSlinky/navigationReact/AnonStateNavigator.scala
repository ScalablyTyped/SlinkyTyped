package typingsSlinky.navigationReact

import typingsSlinky.navigation.mod.StateNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStateNavigator extends js.Object {
  var stateNavigator: StateNavigator = js.native
}

object AnonStateNavigator {
  @scala.inline
  def apply(stateNavigator: StateNavigator): AnonStateNavigator = {
    val __obj = js.Dynamic.literal(stateNavigator = stateNavigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStateNavigator]
  }
  @scala.inline
  implicit class AnonStateNavigatorOps[Self <: AnonStateNavigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateNavigator(value: StateNavigator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateNavigator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

