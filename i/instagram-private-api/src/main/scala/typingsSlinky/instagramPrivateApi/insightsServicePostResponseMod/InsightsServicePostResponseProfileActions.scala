package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseProfileActions extends js.Object {
  var actions: InsightsServicePostResponseActions = js.native
}

object InsightsServicePostResponseProfileActions {
  @scala.inline
  def apply(actions: InsightsServicePostResponseActions): InsightsServicePostResponseProfileActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseProfileActions]
  }
  @scala.inline
  implicit class InsightsServicePostResponseProfileActionsOps[Self <: InsightsServicePostResponseProfileActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: InsightsServicePostResponseActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

