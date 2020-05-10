package typingsSlinky.oracleOraclejet

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataTypes extends js.Object {
  var dataTypes: String | js.Array[String] = js.native
  def drag(param0: Event_): Unit = js.native
  def dragEnd(param0: Event_): Unit = js.native
  def dragStart(param0: Event_, param1: js.Object): Unit = js.native
}

object AnonDataTypes {
  @scala.inline
  def apply(
    dataTypes: String | js.Array[String],
    drag: Event_ => Unit,
    dragEnd: Event_ => Unit,
    dragStart: (Event_, js.Object) => Unit
  ): AnonDataTypes = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drag = js.Any.fromFunction1(drag), dragEnd = js.Any.fromFunction1(dragEnd), dragStart = js.Any.fromFunction2(dragStart))
    __obj.asInstanceOf[AnonDataTypes]
  }
  @scala.inline
  implicit class AnonDataTypesOps[Self <: AnonDataTypes] (val x: Self) extends AnyVal {
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
    def withDrag(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDragEnd(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDragStart(value: (Event_, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

