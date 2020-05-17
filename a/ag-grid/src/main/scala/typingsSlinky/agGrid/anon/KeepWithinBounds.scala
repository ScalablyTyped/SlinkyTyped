package typingsSlinky.agGrid.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeepWithinBounds extends js.Object {
  var column: typingsSlinky.agGrid.columnMod.Column = js.native
  var ePopup: HTMLElement = js.native
  var eventSource: HTMLElement = js.native
  var keepWithinBounds: js.UndefOr[Boolean] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var nudgeX: js.UndefOr[Double] = js.native
  var nudgeY: js.UndefOr[Double] = js.native
  var rowNode: RowNode = js.native
  var `type`: String = js.native
}

object KeepWithinBounds {
  @scala.inline
  def apply(
    column: typingsSlinky.agGrid.columnMod.Column,
    ePopup: HTMLElement,
    eventSource: HTMLElement,
    rowNode: RowNode,
    `type`: String
  ): KeepWithinBounds = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], rowNode = rowNode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepWithinBounds]
  }
  @scala.inline
  implicit class KeepWithinBoundsOps[Self <: KeepWithinBounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: typingsSlinky.agGrid.columnMod.Column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEPopup(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ePopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSource(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowNode(value: RowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepWithinBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithinBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWithinBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWithinBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNudgeX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNudgeX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeX")(js.undefined)
        ret
    }
    @scala.inline
    def withNudgeY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNudgeY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nudgeY")(js.undefined)
        ret
    }
  }
  
}

