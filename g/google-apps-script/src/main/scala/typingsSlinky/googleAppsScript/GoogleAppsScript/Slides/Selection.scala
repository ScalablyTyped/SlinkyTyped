package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user's selection in the active presentation.
  *
  *     var selection = SlidesApp.getActivePresentation().getSelection();
  *     var currentPage = selection.getCurrentPage();
  *     var selectionType = selection.getSelectionType();
  *     }
  */
@js.native
trait Selection extends js.Object {
  def getCurrentPage(): Page = js.native
  def getPageElementRange(): PageElementRange = js.native
  def getPageRange(): PageRange = js.native
  def getSelectionType(): SelectionType = js.native
  def getTableCellRange(): TableCellRange = js.native
  def getTextRange(): TextRange = js.native
}

object Selection {
  @scala.inline
  def apply(
    getCurrentPage: () => Page,
    getPageElementRange: () => PageElementRange,
    getPageRange: () => PageRange,
    getSelectionType: () => SelectionType,
    getTableCellRange: () => TableCellRange,
    getTextRange: () => TextRange
  ): Selection = {
    val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage), getPageElementRange = js.Any.fromFunction0(getPageElementRange), getPageRange = js.Any.fromFunction0(getPageRange), getSelectionType = js.Any.fromFunction0(getSelectionType), getTableCellRange = js.Any.fromFunction0(getTableCellRange), getTextRange = js.Any.fromFunction0(getTextRange))
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCurrentPage(value: () => Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPageElementRange(value: () => PageElementRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageElementRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPageRange(value: () => PageRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectionType(value: () => SelectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTableCellRange(value: () => TableCellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTableCellRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextRange(value: () => TextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextRange")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

