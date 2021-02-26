package typingsSlinky.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondLabelProps extends StObject {
  
  /**
    * Label used for abort load button.
    * @default 'Abort'
    */
  var labelButtonAbortItemLoad: js.UndefOr[String] = js.native
  
  /**
    * Label used for abort upload button.
    * @default 'Cancel'
    */
  var labelButtonAbortItemProcessing: js.UndefOr[String] = js.native
  
  /**
    * Label used for upload button.
    * @default 'Upload'
    */
  var labelButtonProcessItem: js.UndefOr[String] = js.native
  
  /**
    * Label used for remove button.
    * @default 'Remove'
    */
  var labelButtonRemoveItem: js.UndefOr[String] = js.native
  
  /**
    * Label used for retry load.
    * @default 'Retry'
    */
  var labelButtonRetryItemLoad: js.UndefOr[String] = js.native
  
  /**
    * Label used for retry upload button.
    * @default 'Retry'
    */
  var labelButtonRetryItemProcessing: js.UndefOr[String] = js.native
  
  /**
    * Label used for undo upload button.
    * @default 'Undo'
    */
  var labelButtonUndoItemProcessing: js.UndefOr[String] = js.native
  
  /**
    * The decimal separator used to render numbers.
    * By default this is determined automatically.
    * @default 'auto'
    */
  var labelDecimalSeparator: js.UndefOr[String] = js.native
  
  /**
    * Label used when file is added (assistive only).
    * @default 'Added'
    */
  var labelFileAdded: js.UndefOr[String] = js.native
  
  /**
    * Label used when showing the number of files and there is more than one.
    * @default 'files in list'
    */
  var labelFileCountPlural: js.UndefOr[String] = js.native
  
  /**
    * Label used when showing the number of files and there is only one.
    * @default 'file in list'
    */
  var labelFileCountSingular: js.UndefOr[String] = js.native
  
  /**
    * Label used when file load failed.
    * @default 'Error during load'
    */
  var labelFileLoadError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used while loading a file.
    * @default 'Loading'
    */
  var labelFileLoading: js.UndefOr[String] = js.native
  
  /**
    * Label used when uploading a file.
    * @default 'Uploading'
    */
  var labelFileProcessing: js.UndefOr[String] = js.native
  
  /**
    * Label used when upload was cancelled.
    * @default 'Upload cancelled'
    */
  var labelFileProcessingAborted: js.UndefOr[String] = js.native
  
  /**
    * Label used when file upload has completed.
    * @default 'Upload complete'
    */
  var labelFileProcessingComplete: js.UndefOr[String] = js.native
  
  /**
    * Label used when something went wrong during file upload.
    * @default 'Error during upload'
    */
  var labelFileProcessingError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used when something went wrong during reverting the file upload.
    * @default 'Error during revert'
    */
  var labelFileProcessingRevertError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used when something went during during removing the file upload.
    * @default 'Error during remove'
    */
  var labelFileRemoveError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used when file is removed (assistive only).
    * @default 'Removed'
    */
  var labelFileRemoved: js.UndefOr[String] = js.native
  
  /**
    * Label used when no file size information was received.
    * @default 'Size not available'
    */
  var labelFileSizeNotAvailable: js.UndefOr[String] = js.native
  
  /**
    * Label used while waiting for file size information.
    * @default 'Waiting for size'
    */
  var labelFileWaitingForSize: js.UndefOr[String] = js.native
  
  /**
    * Default label shown to indicate this is a drop area.
    * FilePond will automatically bind browse file events to
    * the element with CSS class .filepond--label-action.
    * @default 'Drag & Drop your files or <span class="filepond--label-action"> Browse </span>'
    */
  var labelIdle: js.UndefOr[String] = js.native
  
  /**
    * Label shown when the field contains invalid files and is validated by the parent form.
    * @default 'Field contains invalid files'
    */
  var labelInvalidField: js.UndefOr[String] = js.native
  
  /**
    * Label used to indicate to the user that an action can be cancelled.
    * @default 'tap to cancel'
    */
  var labelTapToCancel: js.UndefOr[String] = js.native
  
  /**
    * Label used to indicate to the user that an action can be retried.
    * @default 'tap to retry'
    */
  var labelTapToRetry: js.UndefOr[String] = js.native
  
  /**
    * Label used to indicate to the user that an action can be undone.
    * @default 'tap to undo'
    */
  var labelTapToUndo: js.UndefOr[String] = js.native
  
  /**
    * The thousands separator used to render numbers.
    * By default this is determined automatically.
    * @default 'auto'
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
  implicit class FilePondLabelPropsMutableBuilder[Self <: FilePondLabelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelButtonAbortItemLoad(value: String): Self = StObject.set(x, "labelButtonAbortItemLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelButtonAbortItemLoadUndefined: Self = StObject.set(x, "labelButtonAbortItemLoad", js.undefined)
    
    @scala.inline
    def setLabelButtonAbortItemProcessing(value: String): Self = StObject.set(x, "labelButtonAbortItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelButtonAbortItemProcessingUndefined: Self = StObject.set(x, "labelButtonAbortItemProcessing", js.undefined)
    
    @scala.inline
    def setLabelButtonProcessItem(value: String): Self = StObject.set(x, "labelButtonProcessItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelButtonProcessItemUndefined: Self = StObject.set(x, "labelButtonProcessItem", js.undefined)
    
    @scala.inline
    def setLabelButtonRemoveItem(value: String): Self = StObject.set(x, "labelButtonRemoveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelButtonRemoveItemUndefined: Self = StObject.set(x, "labelButtonRemoveItem", js.undefined)
    
    @scala.inline
    def setLabelButtonRetryItemLoad(value: String): Self = StObject.set(x, "labelButtonRetryItemLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelButtonRetryItemLoadUndefined: Self = StObject.set(x, "labelButtonRetryItemLoad", js.undefined)
    
    @scala.inline
    def setLabelButtonRetryItemProcessing(value: String): Self = StObject.set(x, "labelButtonRetryItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelButtonRetryItemProcessingUndefined: Self = StObject.set(x, "labelButtonRetryItemProcessing", js.undefined)
    
    @scala.inline
    def setLabelButtonUndoItemProcessing(value: String): Self = StObject.set(x, "labelButtonUndoItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelButtonUndoItemProcessingUndefined: Self = StObject.set(x, "labelButtonUndoItemProcessing", js.undefined)
    
    @scala.inline
    def setLabelDecimalSeparator(value: String): Self = StObject.set(x, "labelDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDecimalSeparatorUndefined: Self = StObject.set(x, "labelDecimalSeparator", js.undefined)
    
    @scala.inline
    def setLabelFileAdded(value: String): Self = StObject.set(x, "labelFileAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileAddedUndefined: Self = StObject.set(x, "labelFileAdded", js.undefined)
    
    @scala.inline
    def setLabelFileCountPlural(value: String): Self = StObject.set(x, "labelFileCountPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileCountPluralUndefined: Self = StObject.set(x, "labelFileCountPlural", js.undefined)
    
    @scala.inline
    def setLabelFileCountSingular(value: String): Self = StObject.set(x, "labelFileCountSingular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileCountSingularUndefined: Self = StObject.set(x, "labelFileCountSingular", js.undefined)
    
    @scala.inline
    def setLabelFileLoadError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = StObject.set(x, "labelFileLoadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileLoadErrorFunction1(value: /* error */ js.Any => String): Self = StObject.set(x, "labelFileLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileLoadErrorUndefined: Self = StObject.set(x, "labelFileLoadError", js.undefined)
    
    @scala.inline
    def setLabelFileLoading(value: String): Self = StObject.set(x, "labelFileLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileLoadingUndefined: Self = StObject.set(x, "labelFileLoading", js.undefined)
    
    @scala.inline
    def setLabelFileProcessing(value: String): Self = StObject.set(x, "labelFileProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileProcessingAborted(value: String): Self = StObject.set(x, "labelFileProcessingAborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileProcessingAbortedUndefined: Self = StObject.set(x, "labelFileProcessingAborted", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingComplete(value: String): Self = StObject.set(x, "labelFileProcessingComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileProcessingCompleteUndefined: Self = StObject.set(x, "labelFileProcessingComplete", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = StObject.set(x, "labelFileProcessingError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileProcessingErrorFunction1(value: /* error */ js.Any => String): Self = StObject.set(x, "labelFileProcessingError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileProcessingErrorUndefined: Self = StObject.set(x, "labelFileProcessingError", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingRevertError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = StObject.set(x, "labelFileProcessingRevertError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileProcessingRevertErrorFunction1(value: /* error */ js.Any => String): Self = StObject.set(x, "labelFileProcessingRevertError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileProcessingRevertErrorUndefined: Self = StObject.set(x, "labelFileProcessingRevertError", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingUndefined: Self = StObject.set(x, "labelFileProcessing", js.undefined)
    
    @scala.inline
    def setLabelFileRemoveError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = StObject.set(x, "labelFileRemoveError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileRemoveErrorFunction1(value: /* error */ js.Any => String): Self = StObject.set(x, "labelFileRemoveError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileRemoveErrorUndefined: Self = StObject.set(x, "labelFileRemoveError", js.undefined)
    
    @scala.inline
    def setLabelFileRemoved(value: String): Self = StObject.set(x, "labelFileRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileRemovedUndefined: Self = StObject.set(x, "labelFileRemoved", js.undefined)
    
    @scala.inline
    def setLabelFileSizeNotAvailable(value: String): Self = StObject.set(x, "labelFileSizeNotAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileSizeNotAvailableUndefined: Self = StObject.set(x, "labelFileSizeNotAvailable", js.undefined)
    
    @scala.inline
    def setLabelFileWaitingForSize(value: String): Self = StObject.set(x, "labelFileWaitingForSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFileWaitingForSizeUndefined: Self = StObject.set(x, "labelFileWaitingForSize", js.undefined)
    
    @scala.inline
    def setLabelIdle(value: String): Self = StObject.set(x, "labelIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdleUndefined: Self = StObject.set(x, "labelIdle", js.undefined)
    
    @scala.inline
    def setLabelInvalidField(value: String): Self = StObject.set(x, "labelInvalidField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInvalidFieldUndefined: Self = StObject.set(x, "labelInvalidField", js.undefined)
    
    @scala.inline
    def setLabelTapToCancel(value: String): Self = StObject.set(x, "labelTapToCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTapToCancelUndefined: Self = StObject.set(x, "labelTapToCancel", js.undefined)
    
    @scala.inline
    def setLabelTapToRetry(value: String): Self = StObject.set(x, "labelTapToRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTapToRetryUndefined: Self = StObject.set(x, "labelTapToRetry", js.undefined)
    
    @scala.inline
    def setLabelTapToUndo(value: String): Self = StObject.set(x, "labelTapToUndo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTapToUndoUndefined: Self = StObject.set(x, "labelTapToUndo", js.undefined)
    
    @scala.inline
    def setLabelThousandsSeparator(value: String): Self = StObject.set(x, "labelThousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelThousandsSeparatorUndefined: Self = StObject.set(x, "labelThousandsSeparator", js.undefined)
  }
}
