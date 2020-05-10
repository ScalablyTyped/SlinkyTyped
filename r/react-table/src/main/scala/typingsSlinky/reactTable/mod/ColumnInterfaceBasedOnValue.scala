package typingsSlinky.reactTable.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnInterfaceBasedOnValue[D /* <: js.Object */, V] extends js.Object {
  var Cell: js.UndefOr[Renderer[CellProps[D, V]]] = js.native
}

object ColumnInterfaceBasedOnValue {
  @scala.inline
  def apply[D, V](): ColumnInterfaceBasedOnValue[D, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnInterfaceBasedOnValue[D, V]]
  }
  @scala.inline
  implicit class ColumnInterfaceBasedOnValueOps[Self[d, v] <: ColumnInterfaceBasedOnValue[d, v], D, V] (val x: Self[D, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, V]) with Other]
    @scala.inline
    def withCellReactElement(value: ReactElement): Self[D, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellFunctionComponent(value: ReactComponentClass[CellProps[D, V]]): Self[D, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellComponentClass(value: ReactComponentClass[CellProps[D, V]]): Self[D, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCell(value: Renderer[CellProps[D, V]]): Self[D, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self[D, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cell")(js.undefined)
        ret
    }
  }
  
}

