package typingsSlinky.reactFilepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePondLabelProps extends js.Object {
  /** Label used for abort load button */
  var labelButtonAbortItemLoad: js.UndefOr[String] = js.native
  /** Label used for abort upload button */
  var labelButtonAbortItemProcessing: js.UndefOr[String] = js.native
  /** Label used for upload button */
  var labelButtonProcessItem: js.UndefOr[String] = js.native
  /** Label used for remove button */
  var labelButtonRemoveItem: js.UndefOr[String] = js.native
  /** Label used for retry load button */
  var labelButtonRetryItemLoad: js.UndefOr[String] = js.native
  /** Label used for retry upload button */
  var labelButtonRetryItemProcessing: js.UndefOr[String] = js.native
  /** Label used for undo upload button */
  var labelButtonUndoItemProcessing: js.UndefOr[String] = js.native
  /**
    * The decimal separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelDecimalSeparator: js.UndefOr[String] = js.native
  /** Label used when file load failed */
  var labelFileLoadError: js.UndefOr[String] = js.native
  /** Label used while loading a file */
  var labelFileLoading: js.UndefOr[String] = js.native
  /** Label used when uploading a file */
  var labelFileProcessing: js.UndefOr[String] = js.native
  /** Label used when upload was cancelled */
  var labelFileProcessingAborted: js.UndefOr[String] = js.native
  /** Label used when file upload has completed */
  var labelFileProcessingComplete: js.UndefOr[String] = js.native
  /** Label used when something went wrong during file upload */
  var labelFileProcessingError: js.UndefOr[String] = js.native
  /** Label used when no file size information was received */
  var labelFileSizeNotAvailable: js.UndefOr[String] = js.native
  /** Label used while waiting for file size information */
  var labelFileWaitingForSize: js.UndefOr[String] = js.native
  /**
    * Default label shown to indicate this is a drop area.
    * FilePond will automatically bind browse file events to
    * the element with CSS class .filepond--label-action
    */
  var labelIdle: js.UndefOr[String] = js.native
  /** Label used to indicate to the user that an action can be cancelled. */
  var labelTapToCancel: js.UndefOr[String] = js.native
  /** Label used to indicate to the user that an action can be retried. */
  var labelTapToRetry: js.UndefOr[String] = js.native
  /** Label used to indicate to the user that an action can be undone. */
  var labelTapToUndo: js.UndefOr[String] = js.native
  /**
    * The thousands separator used to render numbers.
    * By default this is determined automatically.
    */
  var labelThousandsSeparator: js.UndefOr[String] = js.native
}

object FilePondLabelProps {
  @scala.inline
  def apply(): FilePondLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondLabelProps]
  }
  @scala.inline
  implicit class FilePondLabelPropsOps[Self <: FilePondLabelProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelButtonAbortItemLoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonAbortItemLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelButtonAbortItemLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonAbortItemLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelButtonAbortItemProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonAbortItemProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelButtonAbortItemProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonAbortItemProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelButtonProcessItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonProcessItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelButtonProcessItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonProcessItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelButtonRemoveItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonRemoveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelButtonRemoveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonRemoveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelButtonRetryItemLoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonRetryItemLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelButtonRetryItemLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonRetryItemLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelButtonRetryItemProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonRetryItemProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelButtonRetryItemProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonRetryItemProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelButtonUndoItemProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonUndoItemProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelButtonUndoItemProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelButtonUndoItemProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDecimalSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDecimalSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDecimalSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDecimalSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileLoadError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileLoadError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileLoadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileLoadError")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileProcessing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessing")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileProcessingAborted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessingAborted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileProcessingAborted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessingAborted")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileProcessingComplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessingComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileProcessingComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessingComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileProcessingError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessingError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileProcessingError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileProcessingError")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileSizeNotAvailable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileSizeNotAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileSizeNotAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileSizeNotAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFileWaitingForSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileWaitingForSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFileWaitingForSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFileWaitingForSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelIdle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIdle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIdle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTapToCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTapToCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTapToCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTapToCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTapToRetry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTapToRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTapToRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTapToRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTapToUndo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTapToUndo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTapToUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTapToUndo")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelThousandsSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelThousandsSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelThousandsSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelThousandsSeparator")(js.undefined)
        ret
    }
  }
  
}

