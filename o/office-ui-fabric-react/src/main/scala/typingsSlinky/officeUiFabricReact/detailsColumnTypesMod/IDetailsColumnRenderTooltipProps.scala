package typingsSlinky.officeUiFabricReact.detailsColumnTypesMod

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsColumnRenderTooltipProps extends ITooltipHostProps {
  /**
    * Information about the column for which the tooltip is being rendered.
    * Use this to format status information about the column, such as its filter or sort state.
    */
  var column: js.UndefOr[IColumn] = js.native
}

object IDetailsColumnRenderTooltipProps {
  @scala.inline
  def apply(): IDetailsColumnRenderTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsColumnRenderTooltipProps]
  }
  @scala.inline
  implicit class IDetailsColumnRenderTooltipPropsOps[Self <: IDetailsColumnRenderTooltipProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: IColumn): Self = {
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
  }
  
}

