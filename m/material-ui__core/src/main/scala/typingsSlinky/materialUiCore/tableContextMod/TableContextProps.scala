package typingsSlinky.materialUiCore.tableContextMod

import typingsSlinky.materialUiCore.tableTableMod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableContextProps extends js.Object {
  var padding: Padding = js.native
}

object TableContextProps {
  @scala.inline
  def apply(padding: Padding): TableContextProps = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableContextProps]
  }
  @scala.inline
  implicit class TableContextPropsOps[Self <: TableContextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

