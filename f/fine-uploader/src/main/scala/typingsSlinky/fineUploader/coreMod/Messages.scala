package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
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
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyError")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeightImageError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeightImageError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeightImageError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeightImageError")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidthImageError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidthImageError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidthImageError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidthImageError")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeightImageError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeightImageError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeightImageError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeightImageError")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSizeError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSizeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeError")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidthImageError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidthImageError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidthImageError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidthImageError")(js.undefined)
        ret
    }
    @scala.inline
    def withNoFilesError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFilesError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoFilesError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFilesError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLeave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryFailTooManyItemsError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryFailTooManyItemsError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryFailTooManyItemsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryFailTooManyItemsError")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeError")(js.undefined)
        ret
    }
    @scala.inline
    def withTooManyItemsError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooManyItemsError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooManyItemsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooManyItemsError")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeError")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsupportedBrowserIos8Safari(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupportedBrowserIos8Safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsupportedBrowserIos8Safari: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupportedBrowserIos8Safari")(js.undefined)
        ret
    }
  }
  
}

