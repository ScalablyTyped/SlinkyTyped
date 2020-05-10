package typingsSlinky.elasticsearch

import typingsSlinky.elasticsearch.mod.IndicesUpdateAliasesParamsAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActions extends js.Object {
  var actions: js.Array[IndicesUpdateAliasesParamsAction] = js.native
}

object AnonActions {
  @scala.inline
  def apply(actions: js.Array[IndicesUpdateAliasesParamsAction]): AnonActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
  @scala.inline
  implicit class AnonActionsOps[Self <: AnonActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[IndicesUpdateAliasesParamsAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

