package typingsSlinky.navigation

import typingsSlinky.navigation.mod.Crumb
import typingsSlinky.navigation.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCrumbs extends js.Object {
  var crumbs: js.Array[Crumb] = js.native
  var data: js.Any = js.native
  var state: State = js.native
}

object AnonCrumbs {
  @scala.inline
  def apply(crumbs: js.Array[Crumb], data: js.Any, state: State): AnonCrumbs = {
    val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrumbs]
  }
  @scala.inline
  implicit class AnonCrumbsOps[Self <: AnonCrumbs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrumbs(value: js.Array[Crumb]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

