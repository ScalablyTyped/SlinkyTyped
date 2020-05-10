package typingsSlinky.prosemirrorTables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEditingOptions extends js.Object {
  var allowTableNodeSelection: js.UndefOr[Boolean] = js.native
}

object TableEditingOptions {
  @scala.inline
  def apply(): TableEditingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableEditingOptions]
  }
  @scala.inline
  implicit class TableEditingOptionsOps[Self <: TableEditingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTableNodeSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTableNodeSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTableNodeSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTableNodeSelection")(js.undefined)
        ret
    }
  }
  
}

