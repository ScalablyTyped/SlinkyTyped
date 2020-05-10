package typingsSlinky.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileActionSettings extends js.Object {
  /**
    * an indicator (HTML markup) for error in upload displayed in each file thumbnail.
    */
  var indicatorError: String = js.native
  /**
    * title to display on hover of indicator for error in upload in each file thumbnail.
    */
  var indicatorErrorTitle: String = js.native
  /**
    * an indicator (HTML markup) for ongoing upload displayed in each file thumbnail.
    */
  var indicatorLoading: String = js.native
  /**
    * title to display on hover of indicator for ongoing upload in each file thumbnail.
    */
  var indicatorLoadingTitle: String = js.native
  /**
    * an indicator (HTML markup) for new pending upload displayed in each file thumbnail.
    */
  var indicatorNew: String = js.native
  /**
    * title to display on hover of indicator for new pending upload in each file thumbnail.
    */
  var indicatorNewTitle: String = js.native
  /**
    * an indicator (HTML markup) for successful upload displayed in each file thumbnail.
    */
  var indicatorSuccess: String = js.native
  /**
    * title to display on hover of indicator for successful in each file thumbnail.
    */
  var indicatorSuccessTitle: String = js.native
  /**
    * CSS class for the remove button in each file thumbnail.
    */
  var removeClass: String = js.native
  /**
    * icon for remove button to be displayed in each file thumbnail.
    */
  var removeIcon: String = js.native
  /**
    * title for remove button in each file thumbnail.
    */
  var removeTitle: String = js.native
  /**
    * CSS class for the remove button in each file thumbnail.
    */
  var uploadClass: String = js.native
  /**
    * icon for upload button to be displayed in each file thumbnail.
    */
  var uploadIcon: String = js.native
  /**
    * title for remove button in each file thumbnail.
    */
  var uploadTitle: String = js.native
}

object FileActionSettings {
  @scala.inline
  def apply(
    indicatorError: String,
    indicatorErrorTitle: String,
    indicatorLoading: String,
    indicatorLoadingTitle: String,
    indicatorNew: String,
    indicatorNewTitle: String,
    indicatorSuccess: String,
    indicatorSuccessTitle: String,
    removeClass: String,
    removeIcon: String,
    removeTitle: String,
    uploadClass: String,
    uploadIcon: String,
    uploadTitle: String
  ): FileActionSettings = {
    val __obj = js.Dynamic.literal(indicatorError = indicatorError.asInstanceOf[js.Any], indicatorErrorTitle = indicatorErrorTitle.asInstanceOf[js.Any], indicatorLoading = indicatorLoading.asInstanceOf[js.Any], indicatorLoadingTitle = indicatorLoadingTitle.asInstanceOf[js.Any], indicatorNew = indicatorNew.asInstanceOf[js.Any], indicatorNewTitle = indicatorNewTitle.asInstanceOf[js.Any], indicatorSuccess = indicatorSuccess.asInstanceOf[js.Any], indicatorSuccessTitle = indicatorSuccessTitle.asInstanceOf[js.Any], removeClass = removeClass.asInstanceOf[js.Any], removeIcon = removeIcon.asInstanceOf[js.Any], removeTitle = removeTitle.asInstanceOf[js.Any], uploadClass = uploadClass.asInstanceOf[js.Any], uploadIcon = uploadIcon.asInstanceOf[js.Any], uploadTitle = uploadTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileActionSettings]
  }
  @scala.inline
  implicit class FileActionSettingsOps[Self <: FileActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndicatorError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorErrorTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorErrorTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorLoadingTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorLoadingTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorNew(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorNewTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorNewTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorSuccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorSuccessTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSuccessTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

