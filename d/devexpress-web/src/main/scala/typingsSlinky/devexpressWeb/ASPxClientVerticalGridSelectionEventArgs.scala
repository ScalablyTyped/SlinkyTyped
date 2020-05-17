package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.SelectionChanged event.
  */
@js.native
trait ASPxClientVerticalGridSelectionEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets whether all records displayed within a page have been selected or unselected.
    */
  var isAllRecordsOnPage: Boolean = js.native
  /**
    * Gets whether a selection has been changed on the server.
    */
  var isChangedOnServer: Boolean = js.native
  /**
    * Gets whether the record has been selected.
    */
  var isSelected: Boolean = js.native
  /**
    * Gets the visible index of the record whose selected state has been changed.
    */
  var visibleIndex: Double = js.native
}

object ASPxClientVerticalGridSelectionEventArgs {
  @scala.inline
  def apply(
    isAllRecordsOnPage: Boolean,
    isChangedOnServer: Boolean,
    isSelected: Boolean,
    processOnServer: Boolean,
    visibleIndex: Double
  ): ASPxClientVerticalGridSelectionEventArgs = {
    val __obj = js.Dynamic.literal(isAllRecordsOnPage = isAllRecordsOnPage.asInstanceOf[js.Any], isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridSelectionEventArgs]
  }
  @scala.inline
  implicit class ASPxClientVerticalGridSelectionEventArgsOps[Self <: ASPxClientVerticalGridSelectionEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAllRecordsOnPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllRecordsOnPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsChangedOnServer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChangedOnServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

