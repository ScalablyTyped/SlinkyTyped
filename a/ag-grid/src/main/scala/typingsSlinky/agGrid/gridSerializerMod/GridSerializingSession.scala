package typingsSlinky.agGrid.gridSerializerMod

import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridSerializingSession[T] extends js.Object {
  def addCustomFooter(customFooter: T): Unit = js.native
  /**
    * ROW METHODS
    */
  def addCustomHeader(customHeader: T): Unit = js.native
  def onNewBodyRow(): RowAccumulator = js.native
  def onNewHeaderGroupingRow(): RowSpanningAccumulator = js.native
  def onNewHeaderRow(): RowAccumulator = js.native
  /**
    * FINAL RESULT
    */
  def parse(): String = js.native
  /**
    * INITIAL METHOD
    */
  def prepare(columnsToExport: js.Array[Column]): Unit = js.native
}

object GridSerializingSession {
  @scala.inline
  def apply[T](
    addCustomFooter: T => Unit,
    addCustomHeader: T => Unit,
    onNewBodyRow: () => RowAccumulator,
    onNewHeaderGroupingRow: () => RowSpanningAccumulator,
    onNewHeaderRow: () => RowAccumulator,
    parse: () => String,
    prepare: js.Array[Column] => Unit
  ): GridSerializingSession[T] = {
    val __obj = js.Dynamic.literal(addCustomFooter = js.Any.fromFunction1(addCustomFooter), addCustomHeader = js.Any.fromFunction1(addCustomHeader), onNewBodyRow = js.Any.fromFunction0(onNewBodyRow), onNewHeaderGroupingRow = js.Any.fromFunction0(onNewHeaderGroupingRow), onNewHeaderRow = js.Any.fromFunction0(onNewHeaderRow), parse = js.Any.fromFunction0(parse), prepare = js.Any.fromFunction1(prepare))
    __obj.asInstanceOf[GridSerializingSession[T]]
  }
  @scala.inline
  implicit class GridSerializingSessionOps[Self[t] <: GridSerializingSession[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddCustomFooter(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddCustomHeader(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCustomHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNewBodyRow(value: () => RowAccumulator): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewBodyRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNewHeaderGroupingRow(value: () => RowSpanningAccumulator): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewHeaderGroupingRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNewHeaderRow(value: () => RowAccumulator): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewHeaderRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParse(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrepare(value: js.Array[Column] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepare")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

