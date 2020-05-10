package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.officeUiFabricReact.AnonDropLocation
import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnReorderHeaderProps extends IColumnReorderOptions {
  /** Callback to notify the column dragEnd event to List
    * Need this to check whether the dragEnd has happened on
    * corresponding list or outside of the list
    */
  var onColumnDragEnd: js.UndefOr[js.Function2[/* props */ AnonDropLocation, /* event */ MouseEvent, Unit]] = js.native
}

object IColumnReorderHeaderProps {
  @scala.inline
  def apply(): IColumnReorderHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnReorderHeaderProps]
  }
  @scala.inline
  implicit class IColumnReorderHeaderPropsOps[Self <: IColumnReorderHeaderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnColumnDragEnd(value: (/* props */ AnonDropLocation, /* event */ MouseEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnDragEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnColumnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColumnDragEnd")(js.undefined)
        ret
    }
  }
  
}

