package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDragOver extends js.Object {
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.native
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ AnonItem, Unit]] = js.native
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ AnonItem, Unit]] = js.native
  var dragOver: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ AnonItem, Unit]] = js.native
  var drop: js.UndefOr[js.Function2[/* param0 */ Event_, /* param1 */ ItemsDropContext, Unit]] = js.native
}

object AnonDragOver {
  @scala.inline
  def apply(): AnonDragOver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDragOver]
  }
  @scala.inline
  implicit class AnonDragOverOps[Self <: AnonDragOver] (val x: Self) extends AnyVal {
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
    def withoutDataTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnter(value: (/* param0 */ Event_, /* param1 */ AnonItem) => Unit): Self = {
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
    def withDragLeave(value: (/* param0 */ Event_, /* param1 */ AnonItem) => Unit): Self = {
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
    def withDragOver(value: (/* param0 */ Event_, /* param1 */ AnonItem) => Unit): Self = {
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
    @scala.inline
    def withDrop(value: (/* param0 */ Event_, /* param1 */ ItemsDropContext) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
  }
  
}

