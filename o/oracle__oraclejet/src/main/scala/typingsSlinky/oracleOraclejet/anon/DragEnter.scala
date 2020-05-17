package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEnter extends js.Object {
  var dataTypes: String | js.Array[String] = js.native
  def dragEnter(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit = js.native
  def dragLeave(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit = js.native
  def dragOver(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit = js.native
  def drop(param0: org.scalajs.dom.raw.Event, param1: js.Object): Unit = js.native
}

object DragEnter {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    dragLeave: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    dragOver: (org.scalajs.dom.raw.Event, js.Object) => Unit,
    drop: (org.scalajs.dom.raw.Event, js.Object) => Unit
  ): DragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop))
    __obj.asInstanceOf[DragEnter]
  }
  @scala.inline
  implicit class DragEnterOps[Self <: DragEnter] (val x: Self) extends AnyVal {
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
    def withDragEnter(value: (org.scalajs.dom.raw.Event, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragLeave(value: (org.scalajs.dom.raw.Event, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragOver(value: (org.scalajs.dom.raw.Event, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrop(value: (org.scalajs.dom.raw.Event, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

