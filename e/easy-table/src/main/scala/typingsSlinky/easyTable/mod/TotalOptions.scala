package typingsSlinky.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalOptions[T] extends js.Object {
  /**
    * Initial value for reduction
    */
  var init: js.UndefOr[T] = js.native
  /**
    * Printer to format the total cell
    */
  var printer: js.UndefOr[CellPrinter[T]] = js.native
  /**
    * reduce(acc, val, idx, length) function to compute the total value
    */
  var reduce: js.UndefOr[ReduceFunction[T]] = js.native
}

object TotalOptions {
  @scala.inline
  def apply[T](): TotalOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalOptions[T]]
  }
  @scala.inline
  implicit class TotalOptionsOps[Self[t] <: TotalOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInit(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
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
    @scala.inline
    def withReduce(value: (T, T, /* idx */ Double, /* length */ Double) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutReduce: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.undefined)
        ret
    }
  }
  
}

