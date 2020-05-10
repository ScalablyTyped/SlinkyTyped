package typingsSlinky.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslationsOptions extends js.Object {
  /** About */
  var about: js.UndefOr[js.Any] = js.native
  /** Add comments */
  var addComments: js.UndefOr[js.Any] = js.native
  /** Are you sure to delete the selected columns? */
  var areYouSureToDeleteTheSelectedColumns: js.UndefOr[js.Any] = js.native
  /** Are you sure to delete the selected rows? */
  var areYouSureToDeleteTheSelectedRows: js.UndefOr[js.Any] = js.native
  /** Cell already merged */
  var cellAlreadyMerged: js.UndefOr[js.Any] = js.native
  /** Clear comments */
  var clearComments: js.UndefOr[js.Any] = js.native
  /** Comments */
  var comments: js.UndefOr[js.Any] = js.native
  /** Copy... */
  var copy: js.UndefOr[js.Any] = js.native
  /** Delete selected columns */
  var deleteSelectedColumns: js.UndefOr[js.Any] = js.native
  /** Delete selected rows */
  var deleteSelectedRows: js.UndefOr[js.Any] = js.native
  /** Edit comments */
  var editComments: js.UndefOr[js.Any] = js.native
  /** entries */
  var entries: js.UndefOr[js.Any] = js.native
  /** Insert a new column after */
  var insertANewColumnAfter: js.UndefOr[js.Any] = js.native
  /** Insert a new column before */
  var insertANewColumnBefore: js.UndefOr[js.Any] = js.native
  /** Insert a new row after */
  var insertANewRowAfter: js.UndefOr[js.Any] = js.native
  /** Insert a new row before */
  var insertANewRowBefore: js.UndefOr[js.Any] = js.native
  /** Invalid merged properties */
  var invalidMergeProperties: js.UndefOr[js.Any] = js.native
  /** No cells selected */
  var noCellsSelected: js.UndefOr[js.Any] = js.native
  /** No records found */
  var noRecordsFound: js.UndefOr[js.Any] = js.native
  /** Order ascending */
  var orderAscending: js.UndefOr[js.Any] = js.native
  /** Order descending */
  var orderDescending: js.UndefOr[js.Any] = js.native
  /** Paste... */
  var paste: js.UndefOr[js.Any] = js.native
  /** Rename this column */
  var renameThisColumn: js.UndefOr[js.Any] = js.native
  /** Save as... */
  var saveAs: js.UndefOr[js.Any] = js.native
  /** Show */
  var show: js.UndefOr[js.Any] = js.native
  /** Showing page {0} of {1} entries */
  var showingPage: js.UndefOr[js.Any] = js.native
  /** There is a conflict with another merged cell */
  var thereIsAConflictWithAnotherMergedCell: js.UndefOr[js.Any] = js.native
  /** This action will clear your search results. Are you sure? */
  var thisActionWillClearYourSearchResultsAreYouSure: js.UndefOr[js.Any] = js.native
  /** This action will destroy any existing merged cells. Are you sure? */
  var thisActionWillDestroyAnyExistingMergedCellsAreYouSure: js.UndefOr[js.Any] = js.native
}

object TranslationsOptions {
  @scala.inline
  def apply(): TranslationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationsOptions]
  }
  @scala.inline
  implicit class TranslationsOptionsOps[Self <: TranslationsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("about")(js.undefined)
        ret
    }
    @scala.inline
    def withAddComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addComments")(js.undefined)
        ret
    }
    @scala.inline
    def withAreYouSureToDeleteTheSelectedColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areYouSureToDeleteTheSelectedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreYouSureToDeleteTheSelectedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areYouSureToDeleteTheSelectedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withAreYouSureToDeleteTheSelectedRows(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areYouSureToDeleteTheSelectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreYouSureToDeleteTheSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areYouSureToDeleteTheSelectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withCellAlreadyMerged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlreadyMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellAlreadyMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlreadyMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withClearComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearComments")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteSelectedColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSelectedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteSelectedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSelectedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteSelectedRows(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSelectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSelectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withEditComments(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editComments")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertANewColumnAfter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewColumnAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertANewColumnAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewColumnAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertANewColumnBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewColumnBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertANewColumnBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewColumnBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertANewRowAfter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewRowAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertANewRowAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewRowAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertANewRowBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewRowBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertANewRowBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertANewRowBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMergeProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMergeProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMergeProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMergeProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCellsSelected(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCellsSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCellsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCellsSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRecordsFound(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecordsFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRecordsFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRecordsFound")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderAscending(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderAscending")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderDescending(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderDescending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderDescending")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameThisColumn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameThisColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameThisColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameThisColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAs")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withShowingPage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showingPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowingPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showingPage")(js.undefined)
        ret
    }
    @scala.inline
    def withThereIsAConflictWithAnotherMergedCell(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thereIsAConflictWithAnotherMergedCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThereIsAConflictWithAnotherMergedCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thereIsAConflictWithAnotherMergedCell")(js.undefined)
        ret
    }
    @scala.inline
    def withThisActionWillClearYourSearchResultsAreYouSure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisActionWillClearYourSearchResultsAreYouSure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThisActionWillClearYourSearchResultsAreYouSure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisActionWillClearYourSearchResultsAreYouSure")(js.undefined)
        ret
    }
    @scala.inline
    def withThisActionWillDestroyAnyExistingMergedCellsAreYouSure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisActionWillDestroyAnyExistingMergedCellsAreYouSure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThisActionWillDestroyAnyExistingMergedCellsAreYouSure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisActionWillDestroyAnyExistingMergedCellsAreYouSure")(js.undefined)
        ret
    }
  }
  
}

