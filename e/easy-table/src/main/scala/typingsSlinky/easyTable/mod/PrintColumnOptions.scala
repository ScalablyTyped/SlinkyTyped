package typingsSlinky.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintColumnOptions[T] extends js.Object {
  /**
    * Printer to format column names
    */
  var namePrinter: js.UndefOr[CellPrinter[T]] = js.native
  /**
    * Column separation string
    */
  var separator: js.UndefOr[String] = js.native
}

object PrintColumnOptions {
  @scala.inline
  def apply[T](): PrintColumnOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintColumnOptions[T]]
  }
  @scala.inline
  implicit class PrintColumnOptionsOps[Self[t] <: PrintColumnOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNamePrinter(value: (T, /* width */ Double) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrinter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNamePrinter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namePrinter")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

