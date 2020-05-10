package typingsSlinky.baseui.dataTableMod

import typingsSlinky.baseui.AnonClearSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchActionT extends js.Object {
  var label: String = js.native
  var renderIcon: js.UndefOr[js.Any] = js.native
  def onClick(params: AnonClearSelection): js.Any = js.native
}

object BatchActionT {
  @scala.inline
  def apply(label: String, onClick: AnonClearSelection => js.Any): BatchActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[BatchActionT]
  }
  @scala.inline
  implicit class BatchActionTOps[Self <: BatchActionT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: AnonClearSelection => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderIcon(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIcon")(js.undefined)
        ret
    }
  }
  
}

