package typingsSlinky.oracleOraclejet

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDragLeave extends js.Object {
  var dataTypes: String | js.Array[String] = js.native
  var selector: String = js.native
  def dragEnter(param0: Event_, param1: js.Object): Unit = js.native
  def dragLeave(param0: Event_, param1: js.Object): Unit = js.native
  def dragOver(param0: Event_, param1: js.Object): Unit = js.native
  def drop(param0: Event_, param1: js.Object): Unit = js.native
}

object AnonDragLeave {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (Event_, js.Object) => Unit,
    dragLeave: (Event_, js.Object) => Unit,
    dragOver: (Event_, js.Object) => Unit,
    drop: (Event_, js.Object) => Unit,
    selector: String
  ): AnonDragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2(dragEnter), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), drop = js.Any.fromFunction2(drop), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragLeave]
  }
  @scala.inline
  implicit class AnonDragLeaveOps[Self <: AnonDragLeave] (val x: Self) extends AnyVal {
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
    def withDragEnter(value: (Event_, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragLeave(value: (Event_, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDragOver(value: (Event_, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrop(value: (Event_, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

