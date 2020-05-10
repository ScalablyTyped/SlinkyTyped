package typingsSlinky.blueprintjsTable.headerCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInternalHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the cell is selected.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
}

object IInternalHeaderCellProps {
  @scala.inline
  def apply(): IInternalHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInternalHeaderCellProps]
  }
  @scala.inline
  implicit class IInternalHeaderCellPropsOps[Self <: IInternalHeaderCellProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
  }
  
}

