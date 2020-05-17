package typingsSlinky.reactBootstrapTableNext.anon

import typingsSlinky.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCaret extends js.Object {
  var dataField: js.UndefOr[js.Any] = js.native
  var order: SortOrder = js.native
  var sortCaret: js.UndefOr[js.Any] = js.native
  var sortFunc: js.UndefOr[js.Any] = js.native
}

object SortCaret {
  @scala.inline
  def apply(order: SortOrder): SortCaret = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCaret]
  }
  @scala.inline
  implicit class SortCaretOps[Self <: SortCaret] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: SortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(js.undefined)
        ret
    }
    @scala.inline
    def withSortCaret(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCaret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortCaret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortCaret")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunc")(js.undefined)
        ret
    }
  }
  
}

