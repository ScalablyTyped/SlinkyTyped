package typingsSlinky.fineUploader.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.fineUploader.coreMod.CoreOptions
import typingsSlinky.fineUploader.coreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIOptions extends CoreOptions {
  /**
    * UIDeleteFileOptions
    */
  @JSName("deleteFile")
  var deleteFile_UIOptions: js.UndefOr[UIDeleteFileOptions] = js.native
  /**
    * display options
    */
  var display: js.UndefOr[UIDisplayOptions] = js.native
  /**
    * dragAndDrop options
    */
  var dragAndDrop: js.UndefOr[UIDragAndDropOptions] = js.native
  /**
    * Container element for the default drop zone
    *
    * @default `null`
    */
  var element: js.UndefOr[HTMLElement] = js.native
  /**
    * failedUploadTextDisplay options
    */
  var failedUploadTextDisplay: js.UndefOr[UIFailedUploadTextDisplay] = js.native
  /**
    * Container element for the item list
    *
    * @default `null`
    */
  var listElement: js.UndefOr[HTMLElement] = js.native
  /**
    * messages
    */
  @JSName("messages")
  var messages_UIOptions: js.UndefOr[UIMessages] = js.native
  /**
    * paste UI options
    */
  @JSName("paste")
  var paste_UIOptions: js.UndefOr[UIPasteOptions] = js.native
  /**
    * retry options
    */
  var retry: js.UndefOr[UIRetryOptions] = js.native
  /**
    * UI scaling options
    */
  @JSName("scaling")
  var scaling_UIOptions: js.UndefOr[UIScalingOptions] = js.native
  /**
    * Provide a function here to prompt the user to confirm deletion of a file.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.confirm(message); }`
    */
  var showConfirm: js.UndefOr[ShowConfirmFunction] = js.native
  /**
    * Provide a function here to display a message to the user when the uploader receives an error or the user attempts to leave the page.
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message) { window.alert(message); }`
    */
  var showMessage: js.UndefOr[ShowMessageFunction] = js.native
  /**
    * Provide a function here to prompt the user for a filename when pasting file(s).
    *
    * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
    *
    * @default `function(message, defaultValue) { window.prompt(message, defaultValue); }`
    */
  var showPrompt: js.UndefOr[ShowPromptFunction] = js.native
  /**
    * This points to the container element that contains the template to use for one or more Fine Uploader UI instances.
    *
    * You can either specify a string, which is the element ID (the ID of the container element on the page) or an `Element` that points to the container element
    *
    * @default `'qq-template'`
    */
  var template: js.UndefOr[String | HTMLElement] = js.native
  /**
    * UI text options
    */
  @JSName("text")
  var text_UIOptions: js.UndefOr[UITextOptions] = js.native
  /**
    * thumbnail options
    */
  var thumbnails: js.UndefOr[UIThumbnailsOptions] = js.native
}

object UIOptions {
  @scala.inline
  def apply(): UIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIOptions]
  }
  @scala.inline
  implicit class UIOptionsOps[Self <: UIOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteFile(value: UIDeleteFileOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFile")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: UIDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withDragAndDrop(value: UIDragAndDropOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedUploadTextDisplay(value: UIFailedUploadTextDisplay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedUploadTextDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedUploadTextDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedUploadTextDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withListElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listElement")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: UIMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: UIPasteOptions): Self = {
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
    def withRetry(value: UIRetryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling(value: UIScalingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(js.undefined)
        ret
    }
    @scala.inline
    def withShowConfirm(value: /* message */ String => PromiseOptions | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShowConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMessage(value: /* message */ String => PromiseOptions | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShowMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPrompt(value: (/* message */ String, /* defaultValue */ String) => PromiseOptions | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrompt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShowPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: UITextOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnails(value: UIThumbnailsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnails")(js.undefined)
        ret
    }
  }
  
}

