package typingsSlinky.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregators extends js.Object {
  /**
    * Average reduction
    */
  var avg: js.Any = js.native
  /**
    * Sum reduction
    */
  var sum: js.Any = js.native
  /**
    * Create a printer which formats the value with `printer`,
    * adds the `prefix` to it and right aligns the whole thing
    *
    * @param {String} prefix
    * @param {Function} printer
    * @returns {printer}
    */
  def printer[T](prefix: String, printer: CellPrinter[T]): CellPrinter[T] = js.native
}

object Aggregators {
  @scala.inline
  def apply(avg: js.Any, printer: (String, CellPrinter[js.Any]) => CellPrinter[js.Any], sum: js.Any): Aggregators = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], printer = js.Any.fromFunction2(printer), sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregators]
  }
  @scala.inline
  implicit class AggregatorsOps[Self <: Aggregators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvg(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrinter(value: (String, CellPrinter[js.Any]) => CellPrinter[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

