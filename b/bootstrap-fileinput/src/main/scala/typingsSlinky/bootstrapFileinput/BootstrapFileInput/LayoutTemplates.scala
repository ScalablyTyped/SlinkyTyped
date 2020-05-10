package typingsSlinky.bootstrapFileinput.BootstrapFileInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutTemplates extends js.Object {
  /**
    * the template for the file delete action button within the thumbnail footer.
    * The following tags will be parsed and replaced automatically:
    *     {removeClass}: the css class for the remove button. Will be replaced with the removeClass set within fileActionSettings.
    *     {removeIcon}: the icon for the remove button. Will be replaced with the removeIcon set within fileActionSettings.
    *     {removeTitle}: the title to display on hover for the remove button. Will be replaced with the removeTitle set within fileActionSettings.
    *     {dataUrl}: the URL for deleting the file thumbnail for initialPreview content only. Will be replaced with the url set within initialPreviewConfig.
    *     {dataKey}: the key (additional data) that will be passed to the URL above via POST to the AJAX call. Will be replaced with the key set within initialPreviewConfig.
    */
  var actionDelete: js.UndefOr[String] = js.native
  /**
    * the template for the file upload action button within the thumbnail footer.
    * The following tags will be parsed and replaced automatically:
    *     {uploadClass}: the css class for the upload button. Will be replaced with the uploadClass set within fileActionSettings.
    *     {uploadIcon}: the icon for the upload button. Will be replaced with the uploadIcon set within fileActionSettings.
    *     {uploadTitle}: the title to display on hover for the upload button. Will be replaced with the uploadTitle set within fileActionSettings.
    */
  var actionUpload: js.UndefOr[String] = js.native
  /**
    * the template for the file action buttons to be displayed within the thumbnail footer.
    * The following tags will be parsed and replaced automatically:
    *     {upload}: will be replaced with the output of the actionUpload template.
    *     {delete}: will be replaced with the output of the actionDelete template.
    */
  var actions: js.UndefOr[String] = js.native
  /**
    * The template for the browse button.
    *     {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
    *     {title}: the title to display on button hover.
    *     {css}: the CSS class for the button. This is derived from settings for browseClass.
    *     {status}: the disabled status for the button if available (else will be blank).
    *     {icon}: the button icon as identified by browseIcon.
    *     {label}: the button label as identified by browseLabel.
    */
  var btnBrowse: js.UndefOr[String] = js.native
  /**
    * The template for upload, remove, and cancel buttons.
    * The following tags will be parsed and replaced automatically:
    *     {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
    *     {title}: the title to display on button hover.
    *     {css}: the CSS class for the button. This is derived from settings for uploadClass or removeClass or cancelClass.
    *     {status}: the disabled status for the button if available (else will be blank).
    *     {icon}: the button icon as identified by uploadIcon or removeIcon or cancelIcon.
    *     {label}: the button label as identified by uploadLabel or removeLabel or cancelLabel.
    */
  var btnDefault: js.UndefOr[String] = js.native
  /**
    * The template for upload button when used with ajax (i.e. when uploadUrl is set).
    * The following tags will be parsed and replaced automatically:
    *     {type}: the HTML button type, defaults to button for most buttons and submit for form based uploads.
    *     {title}: the title to display on button hover.
    *     {css}: the CSS class for the button. This is derived from settings for uploadClass.
    *     {status}: the disabled status for the button if available (else will be blank).
    *     {icon}: the button icon as identified by uploadIcon.
    *     {label}: the button label as identified by uploadLabel.
    *     {href}: applicable only for Upload button for ajax uploads and will be replaced with the uploadUrl property.
    */
  var btnLink: js.UndefOr[String] = js.native
  /**
    * the template for rendering the caption.
    * The following tags will be parsed and replaced automatically:
    *     {class}: the CSS class as set in the captionClass property.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * the template for the footer section of each file preview thumbnail.
    * The following tags will be parsed and replaced automatically:
    *     {actions}: will be replaced with the output of the actions template.
    *     {class}: the CSS class as set in the progressClass or progressCompleteClass property (depending on the progress percentage).
    */
  var footer: js.UndefOr[String] = js.native
  /**
    * the icon to render before the caption text.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * the template for rendering the widget with caption.
    * The following tags will be parsed and replaced automatically:
    *     {class}: the CSS class as set in the mainClass property.
    *     {close}: will be replaced with the close (cross) icon (by default on top right of the preview window). The layout template to control this markup is layoutTemplates.close.
    *     {preview}: the content parsed by the previewTemplate and will be displayed only if showPreview is true.
    *     {caption}: the content parsed by the captionTemplate and will be displayed only if showCaption is true.
    *     {remove}: the file remove/clear button and will be displayed only if showRemove is true.
    *     {upload}: the file upload button and will be displayed only if showUpload is true.
    *     {cancel}: the file upload cancel button that will be displayed when AJAX upload is in process to abort the AJAX upload.
    *     {browse}: the main file browse button to select your files for input.
    */
  var main1: js.UndefOr[String] = js.native
  /**
    * the template for rendering the widget without caption.
    * The following tags will be parsed and replaced automatically:
    *     {class}: the CSS class as set in the mainClass property.
    *     {close}: will be replaced with the close (cross) icon (by default on top right of the preview window). The layout template to control this markup is layoutTemplates.close.
    *     {preview}: the content parsed by the previewTemplate and will be displayed only if showPreview is true.
    *     {caption}: the content parsed by the captionTemplate and will be displayed only if showCaption is true.
    *     {remove}: the file remove/clear button and will be displayed only if showRemove is true.
    *     {upload}: the file upload button and will be displayed only if showUpload is true.
    *     {cancel}: the file upload cancel button that will be displayed when AJAX upload is in process to abort the AJAX upload.
    *     {browse}: the main file browse button to select your files for input.
    */
  var main2: js.UndefOr[String] = js.native
  /**
    * the template for rendering the modal (for text file preview zooming).
    */
  var modal: js.UndefOr[String] = js.native
  /**
    * the template for rendering the preview.
    * The following tags will be parsed and replaced automatically:
    *     {class}: the CSS class as set in the previewClass property.
    */
  var preview: js.UndefOr[String] = js.native
  /**
    * the template for the progress bar when upload is in progress (for batch/mass uploads and within each preview thumbnail for async/single uploads).
    * The upload progress bar when displayed within each thumbnail will be wrapped inside a container having a CSS class of `file-thumb-progress`.
    * The following tags will be parsed and replaced automatically:
    *     {percent}: will be replaced with the upload progress percentage.
    */
  var progress: js.UndefOr[String] = js.native
}

object LayoutTemplates {
  @scala.inline
  def apply(): LayoutTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutTemplates]
  }
  @scala.inline
  implicit class LayoutTemplatesOps[Self <: LayoutTemplates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withActionUpload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withActions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnBrowse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnBrowse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnBrowse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnBrowse")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withBtnLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBtnLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withMain1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main1")(js.undefined)
        ret
    }
    @scala.inline
    def withMain2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMain2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main2")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
  }
  
}

