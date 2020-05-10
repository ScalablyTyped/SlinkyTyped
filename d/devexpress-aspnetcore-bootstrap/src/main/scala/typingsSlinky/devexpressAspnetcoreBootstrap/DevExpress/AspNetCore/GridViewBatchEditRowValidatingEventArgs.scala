package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewBatchEditRowValidatingEventArgs extends EventArgs {
  val validationInfo: js.Any = js.native
  val visibleIndex: Double = js.native
}

object GridViewBatchEditRowValidatingEventArgs {
  @scala.inline
  def apply(sender: Control, validationInfo: js.Any, visibleIndex: Double): GridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditRowValidatingEventArgs]
  }
  @scala.inline
  implicit class GridViewBatchEditRowValidatingEventArgsOps[Self <: GridViewBatchEditRowValidatingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

