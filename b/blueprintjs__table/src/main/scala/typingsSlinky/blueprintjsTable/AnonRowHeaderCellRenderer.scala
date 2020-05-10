package typingsSlinky.blueprintjsTable

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRowHeaderCellRenderer extends js.Object {
  var rowHeaderCellRenderer: js.Function1[/* rowIndex */ Double, ReactElement] = js.native
}

object AnonRowHeaderCellRenderer {
  @scala.inline
  def apply(rowHeaderCellRenderer: /* rowIndex */ Double => ReactElement): AnonRowHeaderCellRenderer = {
    val __obj = js.Dynamic.literal(rowHeaderCellRenderer = js.Any.fromFunction1(rowHeaderCellRenderer))
    __obj.asInstanceOf[AnonRowHeaderCellRenderer]
  }
  @scala.inline
  implicit class AnonRowHeaderCellRendererOps[Self <: AnonRowHeaderCellRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowHeaderCellRenderer(value: /* rowIndex */ Double => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderCellRenderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

