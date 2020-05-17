package typingsSlinky.agGrid.anon

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.Touch
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  var column: js.UndefOr[typingsSlinky.agGrid.columnMod.Column] = js.native
  var ePopup: HTMLElement = js.native
  var mouseEvent: MouseEvent | Touch = js.native
  var rowNode: js.UndefOr[RowNode] = js.native
  var `type`: String = js.native
}

object Column {
  @scala.inline
  def apply(ePopup: HTMLElement, mouseEvent: MouseEvent | Touch, `type`: String): Column = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], mouseEvent = mouseEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEPopup(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ePopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEventTouch(value: Touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEventMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseEvent(value: MouseEvent | Touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: typingsSlinky.agGrid.columnMod.Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNode")(js.undefined)
        ret
    }
  }
  
}

