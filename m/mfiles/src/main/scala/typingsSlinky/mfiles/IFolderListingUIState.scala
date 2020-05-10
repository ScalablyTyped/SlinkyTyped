package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFolderListingItemGroupingMode
import typingsSlinky.mfiles.MFiles.MFFolderListingViewMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderListingUIState extends js.Object {
  var ColumnSortings: IFolderListingColumnSortings = js.native
  var Columns: IFolderListingColumns = js.native
  var GroupingMode: MFFolderListingItemGroupingMode = js.native
  var IconSize: Double = js.native
  var ViewMode: MFFolderListingViewMode = js.native
}

object IFolderListingUIState {
  @scala.inline
  def apply(
    ColumnSortings: IFolderListingColumnSortings,
    Columns: IFolderListingColumns,
    GroupingMode: MFFolderListingItemGroupingMode,
    IconSize: Double,
    ViewMode: MFFolderListingViewMode
  ): IFolderListingUIState = {
    val __obj = js.Dynamic.literal(ColumnSortings = ColumnSortings.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], GroupingMode = GroupingMode.asInstanceOf[js.Any], IconSize = IconSize.asInstanceOf[js.Any], ViewMode = ViewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingUIState]
  }
  @scala.inline
  implicit class IFolderListingUIStateOps[Self <: IFolderListingUIState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnSortings(value: IFolderListingColumnSortings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnSortings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: IFolderListingColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupingMode(value: MFFolderListingItemGroupingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewMode(value: MFFolderListingViewMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

