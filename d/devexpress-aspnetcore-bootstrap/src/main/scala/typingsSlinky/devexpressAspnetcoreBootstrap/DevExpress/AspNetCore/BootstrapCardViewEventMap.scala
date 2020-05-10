package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapCardViewEventMap extends BootstrapGridBaseEventMap {
  var batchEditCardDeleting: CardViewBatchEditCardDeletingEventArgs = js.native
  var batchEditCardInserting: CardViewBatchEditCardInsertingEventArgs = js.native
  var batchEditCardValidating: CardViewBatchEditCardValidatingEventArgs = js.native
  var batchEditChangesCanceling: CardViewBatchEditChangesCancelingEventArgs = js.native
  var batchEditChangesSaving: CardViewBatchEditChangesSavingEventArgs = js.native
  var batchEditConfirmShowing: CardViewBatchEditConfirmShowingEventArgs = js.native
  var batchEditEndEditing: CardViewBatchEditEndEditingEventArgs = js.native
  var batchEditStartEditing: CardViewBatchEditStartEditingEventArgs = js.native
  var batchEditTemplateCellFocused: CardViewBatchEditTemplateCellFocusedEventArgs = js.native
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var cardClick: CardViewCardClickEventArgs = js.native
  var cardDblClick: CardViewCardClickEventArgs = js.native
  var cardFocusing: CardViewCardFocusingEventArgs = js.native
  var columnSorting: CardViewColumnCancelEventArgs = js.native
  var customButtonClick: CardViewCustomButtonEventArgs = js.native
  var customizationWindowCloseUp: EventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var focusedCardChanged: CardViewFocusEventArgs = js.native
  var focusedCellChanging: CardViewFocusedCellChangingEventArgs = js.native
  var selectionChanged: CardViewSelectionEventArgs = js.native
}

object BootstrapCardViewEventMap {
  @scala.inline
  def apply(
    batchEditCardDeleting: CardViewBatchEditCardDeletingEventArgs,
    batchEditCardInserting: CardViewBatchEditCardInsertingEventArgs,
    batchEditCardValidating: CardViewBatchEditCardValidatingEventArgs,
    batchEditChangesCanceling: CardViewBatchEditChangesCancelingEventArgs,
    batchEditChangesSaving: CardViewBatchEditChangesSavingEventArgs,
    batchEditConfirmShowing: CardViewBatchEditConfirmShowingEventArgs,
    batchEditEndEditing: CardViewBatchEditEndEditingEventArgs,
    batchEditStartEditing: CardViewBatchEditStartEditingEventArgs,
    batchEditTemplateCellFocused: CardViewBatchEditTemplateCellFocusedEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    cardClick: CardViewCardClickEventArgs,
    cardDblClick: CardViewCardClickEventArgs,
    cardFocusing: CardViewCardFocusingEventArgs,
    columnSorting: CardViewColumnCancelEventArgs,
    customButtonClick: CardViewCustomButtonEventArgs,
    customizationWindowCloseUp: EventArgs,
    endCallback: EndCallbackEventArgs,
    focusedCardChanged: CardViewFocusEventArgs,
    focusedCellChanging: CardViewFocusedCellChangingEventArgs,
    init: EventArgs,
    selectionChanged: CardViewSelectionEventArgs,
    toolbarItemClick: GridToolbarItemClickEventArgs
  ): BootstrapCardViewEventMap = {
    val __obj = js.Dynamic.literal(batchEditCardDeleting = batchEditCardDeleting.asInstanceOf[js.Any], batchEditCardInserting = batchEditCardInserting.asInstanceOf[js.Any], batchEditCardValidating = batchEditCardValidating.asInstanceOf[js.Any], batchEditChangesCanceling = batchEditChangesCanceling.asInstanceOf[js.Any], batchEditChangesSaving = batchEditChangesSaving.asInstanceOf[js.Any], batchEditConfirmShowing = batchEditConfirmShowing.asInstanceOf[js.Any], batchEditEndEditing = batchEditEndEditing.asInstanceOf[js.Any], batchEditStartEditing = batchEditStartEditing.asInstanceOf[js.Any], batchEditTemplateCellFocused = batchEditTemplateCellFocused.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], cardClick = cardClick.asInstanceOf[js.Any], cardDblClick = cardDblClick.asInstanceOf[js.Any], cardFocusing = cardFocusing.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], customButtonClick = customButtonClick.asInstanceOf[js.Any], customizationWindowCloseUp = customizationWindowCloseUp.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], focusedCardChanged = focusedCardChanged.asInstanceOf[js.Any], focusedCellChanging = focusedCellChanging.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], selectionChanged = selectionChanged.asInstanceOf[js.Any], toolbarItemClick = toolbarItemClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapCardViewEventMap]
  }
  @scala.inline
  implicit class BootstrapCardViewEventMapOps[Self <: BootstrapCardViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchEditCardDeleting(value: CardViewBatchEditCardDeletingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditCardDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditCardInserting(value: CardViewBatchEditCardInsertingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditCardInserting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditCardValidating(value: CardViewBatchEditCardValidatingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditCardValidating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditChangesCanceling(value: CardViewBatchEditChangesCancelingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditChangesCanceling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditChangesSaving(value: CardViewBatchEditChangesSavingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditChangesSaving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditConfirmShowing(value: CardViewBatchEditConfirmShowingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditConfirmShowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditEndEditing(value: CardViewBatchEditEndEditingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditEndEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditStartEditing(value: CardViewBatchEditStartEditingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditStartEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchEditTemplateCellFocused(value: CardViewBatchEditTemplateCellFocusedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEditTemplateCellFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeginCallback(value: BeginCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: CallbackErrorEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardClick(value: CardViewCardClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardDblClick(value: CardViewCardClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardDblClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardFocusing(value: CardViewCardFocusingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardFocusing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnSorting(value: CardViewColumnCancelEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomButtonClick(value: CardViewCustomButtonEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customButtonClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomizationWindowCloseUp(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizationWindowCloseUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: EndCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedCardChanged(value: CardViewFocusEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCardChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedCellChanging(value: CardViewFocusedCellChangingEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedCellChanging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionChanged(value: CardViewSelectionEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

