package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientChartDesignerSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  var handled: Boolean = js.native
}

object ASPxClientChartDesignerSaveCommandExecuteEventArgs {
  @scala.inline
  def apply(handled: Boolean): ASPxClientChartDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientChartDesignerSaveCommandExecuteEventArgs]
  }
  @scala.inline
  implicit class ASPxClientChartDesignerSaveCommandExecuteEventArgsOps[Self <: ASPxClientChartDesignerSaveCommandExecuteEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

