package typingsSlinky.reactabularTable.mod

import typingsSlinky.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.anon.RowIndexNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var onRow: js.UndefOr[js.Function2[/* row */ js.Any, /* props */ RowIndexNumber, _]] = js.native
  var rowKey: String = js.native
  var rows: js.Array[_] = js.native
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}

object BodyProps {
  @scala.inline
  def apply(rowKey: String, rows: js.Array[_]): BodyProps = {
    val __obj = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProps]
  }
  @scala.inline
  implicit class BodyPropsOps[Self <: BodyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRow(value: (/* row */ js.Any, /* props */ RowIndexNumber) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

