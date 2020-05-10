package typingsSlinky.imperium.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleActions extends js.Object {
  var actions: js.Array[Action] = js.native
  var getAcl: js.UndefOr[GetAcl] = js.native
}

object RoleActions {
  @scala.inline
  def apply(actions: js.Array[Action]): RoleActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleActions]
  }
  @scala.inline
  implicit class RoleActionsOps[Self <: RoleActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAcl(
      value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Promise[Boolean | js.Object]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAcl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAcl")(js.undefined)
        ret
    }
  }
  
}

