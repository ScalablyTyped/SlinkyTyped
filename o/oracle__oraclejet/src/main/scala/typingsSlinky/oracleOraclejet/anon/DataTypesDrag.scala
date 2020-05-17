package typingsSlinky.oracleOraclejet.anon

import org.scalajs.dom.raw.DragEvent
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.DragRowContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypesDrag[K, D] extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.native
  var drag: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.native
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.native
  var dragStart: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D], Unit]] = js.native
}

object DataTypesDrag {
  @scala.inline
  def apply[K, D](): DataTypesDrag[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTypesDrag[K, D]]
  }
  @scala.inline
  implicit class DataTypesDragOps[Self[k, d] <: DataTypesDrag[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withDataTypes(value: String | js.Array[String]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTypes: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* param0 */ DragEvent => Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnd(value: /* param0 */ DragEvent => Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragEnd: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: (/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D]) => Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
  }
  
}

