package typingsSlinky.reactabularTable.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactabularTable.mod.ColumnFormatter
import typingsSlinky.reactabularTable.mod.ColumnTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draggable extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.native
  var formatters: js.UndefOr[js.Array[ColumnFormatter]] = js.native
  var label: String | ReactElement = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var transforms: js.UndefOr[js.Array[ColumnTransform]] = js.native
}

object Draggable {
  @scala.inline
  def apply(label: String | ReactElement): Draggable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draggable]
  }
  @scala.inline
  implicit class DraggableOps[Self <: Draggable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatters(value: js.Array[ColumnFormatter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[ColumnTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(js.undefined)
        ret
    }
  }
  
}

