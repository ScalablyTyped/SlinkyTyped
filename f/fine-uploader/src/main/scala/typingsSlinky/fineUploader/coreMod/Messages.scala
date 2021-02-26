package typingsSlinky.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messages extends StObject {
  
  /**
    * Text passed to the error event handler if a submitted item is zero bits
    *
    * @default `'{file} is empty, please select files again without it.'`
    */
  var emptyError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is too tall
    *
    * @default `'Image is too tall.'`
    */
  var maxHeightImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is too wide
    *
    * @default `'Image is too wide.'`
    */
  var maxWidthImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is not tall enough
    *
    * @default `'Image is not tall enough.'`
    */
  var minHeightImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if the item is too small
    *
    * @default `'{file} is too small, minimum file size is {minSizeLimit}.'`
    */
  var minSizeError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is not wide enough
    *
    * @default `'Image is not wide enough.'`
    */
  var minWidthImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if any empty array of items is submitted
    *
    * @default `'No files to upload.'`
    */
  var noFilesError: js.UndefOr[String] = js.native
  
  /**
    * Text displayed to the user when they attempt to leave the page while uploads are still in progress
    *
    * @default `'The files are being uploaded, if you leave now the upload will be canceled.'`
    */
  var onLeave: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if a retry attempt is declared a failed due to a violation of the `validation.itemLimit` rule
    *
    * @default `'Retry failed - you have reached your file limit.'`
    */
  var retryFailTooManyItemsError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if a submitted item is too large.
    *
    * @default `'{file} is too large, maximum file size is {sizeLimit}.'`
    */
  var sizeError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if a submit is ignored due to a violation of the `validation.itemLimit` rules
    *
    * @default `'Too many items ({netItems}) would be uploaded. Item limit is {itemLimit}.'`
    */
  var tooManyItemsError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an invalid file type is detected
    *
    * @default `'{file} has an invalid extension. Valid extension(s): {extensions}.'`
    */
  var typeError: js.UndefOr[String] = js.native
  
  /**
    * Message displayed if the browser is iOS8 Safari and the corresponding workarounds option is not disabled
    *
    * @default `'Unrecoverable error - this browser does not permit file uploading of any kind due to serious bugs in iOS8 Safari. Please use iOS8 Chrome until Apple fixes these issues.'`
    */
  var unsupportedBrowserIos8Safari: js.UndefOr[String] = js.native
}
object Messages {
  
  @scala.inline
  def apply(): Messages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Messages]
  }
  
  @scala.inline
  implicit class MessagesMutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmptyError(value: String): Self = StObject.set(x, "emptyError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyErrorUndefined: Self = StObject.set(x, "emptyError", js.undefined)
    
    @scala.inline
    def setMaxHeightImageError(value: String): Self = StObject.set(x, "maxHeightImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightImageErrorUndefined: Self = StObject.set(x, "maxHeightImageError", js.undefined)
    
    @scala.inline
    def setMaxWidthImageError(value: String): Self = StObject.set(x, "maxWidthImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthImageErrorUndefined: Self = StObject.set(x, "maxWidthImageError", js.undefined)
    
    @scala.inline
    def setMinHeightImageError(value: String): Self = StObject.set(x, "minHeightImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightImageErrorUndefined: Self = StObject.set(x, "minHeightImageError", js.undefined)
    
    @scala.inline
    def setMinSizeError(value: String): Self = StObject.set(x, "minSizeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeErrorUndefined: Self = StObject.set(x, "minSizeError", js.undefined)
    
    @scala.inline
    def setMinWidthImageError(value: String): Self = StObject.set(x, "minWidthImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthImageErrorUndefined: Self = StObject.set(x, "minWidthImageError", js.undefined)
    
    @scala.inline
    def setNoFilesError(value: String): Self = StObject.set(x, "noFilesError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFilesErrorUndefined: Self = StObject.set(x, "noFilesError", js.undefined)
    
    @scala.inline
    def setOnLeave(value: String): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
    
    @scala.inline
    def setRetryFailTooManyItemsError(value: String): Self = StObject.set(x, "retryFailTooManyItemsError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryFailTooManyItemsErrorUndefined: Self = StObject.set(x, "retryFailTooManyItemsError", js.undefined)
    
    @scala.inline
    def setSizeError(value: String): Self = StObject.set(x, "sizeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeErrorUndefined: Self = StObject.set(x, "sizeError", js.undefined)
    
    @scala.inline
    def setTooManyItemsError(value: String): Self = StObject.set(x, "tooManyItemsError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooManyItemsErrorUndefined: Self = StObject.set(x, "tooManyItemsError", js.undefined)
    
    @scala.inline
    def setTypeError(value: String): Self = StObject.set(x, "typeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeErrorUndefined: Self = StObject.set(x, "typeError", js.undefined)
    
    @scala.inline
    def setUnsupportedBrowserIos8Safari(value: String): Self = StObject.set(x, "unsupportedBrowserIos8Safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsupportedBrowserIos8SafariUndefined: Self = StObject.set(x, "unsupportedBrowserIos8Safari", js.undefined)
  }
}
