package typingsSlinky.officeUiFabricReact.detailsFooterTypesMod

import typingsSlinky.officeUiFabricReact.detailsListTypesMod.IColumn
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsItemProps
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsFooterProps extends IDetailsItemProps {
  /**
    * Column metadata
    */
  @JSName("columns")
  var columns_IDetailsFooterProps: js.Array[IColumn] = js.native
  /**
    * Selection mode
    */
  @JSName("selectionMode")
  var selectionMode_IDetailsFooterProps: SelectionMode = js.native
  /**
    * Selection from utilities
    */
  @JSName("selection")
  var selection_IDetailsFooterProps: ISelection[IObjectWithKey] = js.native
}

object IDetailsFooterProps {
  @scala.inline
  def apply(columns: js.Array[IColumn], selection: ISelection[IObjectWithKey], selectionMode: SelectionMode): IDetailsFooterProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsFooterProps]
  }
  @scala.inline
  implicit class IDetailsFooterPropsOps[Self <: IDetailsFooterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[IColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: ISelection[IObjectWithKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

