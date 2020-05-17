package typingsSlinky.baseui.dataTableMod

import typingsSlinky.baseui.anon.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowActionT extends js.Object {
  var label: String = js.native
  var renderIcon: js.Any = js.native
  def onClick(params: Event): js.Any = js.native
}

object RowActionT {
  @scala.inline
  def apply(label: String, onClick: Event => js.Any, renderIcon: js.Any): RowActionT = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), renderIcon = renderIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowActionT]
  }
  @scala.inline
  implicit class RowActionTOps[Self <: RowActionT] (val x: Self) extends AnyVal {
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
    def withOnClick(value: Event => js.Any): Self = {
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
  }
  
}

