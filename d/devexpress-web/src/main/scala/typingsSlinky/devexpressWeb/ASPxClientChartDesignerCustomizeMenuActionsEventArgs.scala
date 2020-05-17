package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientChartDesignerCustomizeMenuActionsEventArgs extends ASPxClientEventArgs {
  var actions: js.Array[ASPxClientChartDesignerMenuAction] = js.native
}

object ASPxClientChartDesignerCustomizeMenuActionsEventArgs {
  @scala.inline
  def apply(actions: js.Array[ASPxClientChartDesignerMenuAction]): ASPxClientChartDesignerCustomizeMenuActionsEventArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerCustomizeMenuActionsEventArgs]
  }
  @scala.inline
  implicit class ASPxClientChartDesignerCustomizeMenuActionsEventArgsOps[Self <: ASPxClientChartDesignerCustomizeMenuActionsEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[ASPxClientChartDesignerMenuAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

