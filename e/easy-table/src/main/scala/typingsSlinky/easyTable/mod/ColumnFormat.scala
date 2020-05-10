package typingsSlinky.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnFormat[T] extends js.Object {
  var name: js.UndefOr[String] = js.native
  var printer: js.UndefOr[CellPrinter[T]] = js.native
}

object ColumnFormat {
  @scala.inline
  def apply[T](): ColumnFormat[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFormat[T]]
  }
  @scala.inline
  implicit class ColumnFormatOps[Self[t] <: ColumnFormat[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrinter(value: (T, /* width */ Double) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrinter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer")(js.undefined)
        ret
    }
  }
  
}

