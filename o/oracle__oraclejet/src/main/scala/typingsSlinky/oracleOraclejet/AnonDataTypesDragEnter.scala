package typingsSlinky.oracleOraclejet

import org.scalajs.dom.raw.DragEvent
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.DropColumnContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataTypesDragEnter extends js.Object {
  var dataTypes: String | js.Array[String] = js.native
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.native
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.native
  var dragOver: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropColumnContext, Unit]] = js.native
  def drop(param0: DragEvent, param1: DropColumnContext): Unit = js.native
}

object AnonDataTypesDragEnter {
  @scala.inline
  def apply(dataTypes: String | js.Array[String], drop: (DragEvent, DropColumnContext) => Unit): AnonDataTypesDragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[AnonDataTypesDragEnter]
  }
  @scala.inline
  implicit class AnonDataTypesDragEnterOps[Self <: AnonDataTypesDragEnter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataTypes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrop(value: (DragEvent, DropColumnContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragEnter(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withDragLeave(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withDragOver(value: (/* param0 */ DragEvent, /* param1 */ DropColumnContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.undefined)
        ret
    }
  }
  
}

