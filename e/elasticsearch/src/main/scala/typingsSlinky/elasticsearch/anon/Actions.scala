package typingsSlinky.elasticsearch.anon

import typingsSlinky.elasticsearch.mod.IndicesUpdateAliasesParamsAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  var actions: js.Array[IndicesUpdateAliasesParamsAction] = js.native
}

object Actions {
  @scala.inline
  def apply(actions: js.Array[IndicesUpdateAliasesParamsAction]): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
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

