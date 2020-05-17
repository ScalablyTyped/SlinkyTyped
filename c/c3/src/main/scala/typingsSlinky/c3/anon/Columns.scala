package typingsSlinky.c3.anon

import typingsSlinky.c3.mod.Primitive
import typingsSlinky.c3.mod.PrimitiveArray
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `json` or `rows` are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.native
  /** Will be called when the flow ends. */
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  /** If given, the duration of the transition will be specified value. If not given, `transition.duration` will be used as default. */
  var duration: js.UndefOr[Double] = js.native
  /** An object to convert to data to load. Can be in the column form `{key1: [val1, val2, ...]; ...}` or in the row form `[{key1: val1; key2: val2}, ...]`. */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.native
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[Value] = js.native
  /** If given, the lower x edge will move by the number of this argument. */
  var length: js.UndefOr[Double] = js.native
  /** A list of rows, where the first row is the column names and the remaining rows are data. If this is provided and `json` is provided, this is ignored. */
  var rows: js.UndefOr[Array[js.Array[String] | PrimitiveArray]] = js.native
  /** If given, the lower x edge will move to that point. If not given, the lower x edge will move by the number of given data points. */
  var to: js.UndefOr[String | Double] = js.native
}

object Columns {
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Array[String | Primitive]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Array[js.Array[String] | PrimitiveArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

