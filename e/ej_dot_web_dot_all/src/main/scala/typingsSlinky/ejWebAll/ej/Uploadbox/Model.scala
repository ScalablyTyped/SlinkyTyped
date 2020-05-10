package typingsSlinky.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Enables the file drag and drop support to the Uploadbox control.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Uploadbox supports both synchronous and asynchronous upload. This can be achieved by using the asyncUpload property.
    * @Default {true}
    */
  var asyncUpload: js.UndefOr[Boolean] = js.native
  /** Uploadbox supports auto uploading of files after the file selection is done.
    * @Default {false}
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /** Fires when the upload progress beforeSend.
    */
  var beforeSend: js.UndefOr[js.Function1[/* e */ BeforeSendEventArgs, Unit]] = js.native
  /** Fires when the upload progress begins.
    */
  var begin: js.UndefOr[js.Function1[/* e */ BeginEventArgs, Unit]] = js.native
  /** Sets the text for each action button.
    * @Default {{browse: Browse, upload: Upload, cancel: Cancel, close: Close}}
    */
  var buttonText: js.UndefOr[ButtonText] = js.native
  /** Fires when the upload progress is cancelled.
    */
  var cancel: js.UndefOr[js.Function1[/* e */ CancelEventArgs, Unit]] = js.native
  /** Fires when the file upload progress is completed.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.native
  /** Fires when the Uploadbox control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root class for the Uploadbox control theme. This cssClass API helps to use custom skinning option for the Uploadbox button and dialog content.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Specifies the custom file details in the dialog popup on initialization.
    * @Default {{ title:true, name:true, size:true, status:true, action:true}}
    */
  var customFileDetails: js.UndefOr[CustomFileDetails] = js.native
  /** Fires when the Uploadbox control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the actions for dialog popup while initialization.
    * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true}}
    */
  var dialogAction: js.UndefOr[DialogAction] = js.native
  /** Displays the Uploadbox dialog at the given X and Y positions. X: Dialog sets the left position value. Y: Dialog sets the top position value.
    * @Default {null}
    */
  var dialogPosition: js.UndefOr[js.Any] = js.native
  /** Property for applying the text to the Dialog title and content headers.
    * @Default {{ title: Upload Box, name: Name, size: Size, status: Status}}
    */
  var dialogText: js.UndefOr[DialogText] = js.native
  /** Specifies the dropAreaHeight when the drag and drop support is enabled in the Uploadbox control.
    * @Default {100%}
    */
  var dropAreaHeight: js.UndefOr[Double | String] = js.native
  /** The dropAreaText is displayed when the drag and drop support is enabled in the Uploadbox control.
    * @Default {Drop files or click to upload}
    */
  var dropAreaText: js.UndefOr[String] = js.native
  /** Specifies the dropAreaWidth when the drag and drop support is enabled in the Uploadbox control.
    * @Default {100%}
    */
  var dropAreaWidth: js.UndefOr[Double | String] = js.native
  /** Sets the right-to-left direction property for the Uploadbox control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Based on the property value, Uploadbox is enabled or disabled.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Fires when the Upload process ends in Error.
    */
  var error: js.UndefOr[js.Function1[/* e */ ErrorEventArgs, Unit]] = js.native
  /** Only the files with the specified extension is allowed to upload. This is mentioned in the string format.
    */
  var extensionsAllow: js.UndefOr[String] = js.native
  /** Only the files with the specified extension is denied for upload. This is mentioned in the string format.
    */
  var extensionsDeny: js.UndefOr[String] = js.native
  /** Fires when the file is selected for upload successfully.
    */
  var fileSelect: js.UndefOr[js.Function1[/* e */ FileSelectEventArgs, Unit]] = js.native
  /** Sets the maximum size limit for uploading the file. This is mentioned in the number format.
    * @Default {31457280}
    */
  var fileSize: js.UndefOr[Double] = js.native
  /** Sets the height of the browse button.
    * @Default {35px}
    */
  var height: js.UndefOr[String] = js.native
  /** Specifies the list of HTML attributes to be added to uploadbox control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Fires when the file is uploading.
    */
  var inProgress: js.UndefOr[js.Function1[/* e */ InProgressEventArgs, Unit]] = js.native
  /** Configures the culture data and sets the culture to the Uploadbox.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Enables multiple file selection for upload.
    * @Default {true}
    */
  var multipleFilesSelection: js.UndefOr[Boolean] = js.native
  /** You can push the file to the Uploadbox in the client-side of the XHR supported browsers alone.
    * @Default {null}
    */
  var pushFile: js.UndefOr[js.Any] = js.native
  /** Fires when the uploaded file is removed successfully.
    */
  var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, Unit]] = js.native
  /** Specifies the remove action to be performed after the file uploading is completed. Here, mention the server address for removal.
    */
  var removeUrl: js.UndefOr[String] = js.native
  /** Specifies the save action to be performed after the file is pushed for uploading. Here, mention the server address to be saved.
    */
  var saveUrl: js.UndefOr[String] = js.native
  /** Enables the browse button support to the Uploadbox control.
    * @Default {true}
    */
  var showBrowseButton: js.UndefOr[Boolean] = js.native
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showFileDetails: js.UndefOr[Boolean] = js.native
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Fires when the file upload progress is succeeded.
    */
  var success: js.UndefOr[js.Function1[/* e */ SuccessEventArgs, Unit]] = js.native
  /** Sets the name for the Uploadbox control. This API helps to Map the action in code behind to retrieve the files.
    */
  var uploadName: js.UndefOr[String] = js.native
  /** Sets the width of the browse button.
    * @Default {100px}
    */
  var width: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSend(value: /* e */ BeforeSendEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withBegin(value: /* e */ BeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: ButtonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: /* e */ CancelEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* e */ CompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFileDetails(value: CustomFileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFileDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFileDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFileDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogAction(value: DialogAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogAction")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogText(value: DialogText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropAreaHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAreaHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAreaHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAreaHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDropAreaText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAreaText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAreaText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAreaText")(js.undefined)
        ret
    }
    @scala.inline
    def withDropAreaWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAreaWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAreaWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAreaWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* e */ ErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsAllow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsAllow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionsAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsAllow")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionsDeny(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsDeny")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionsDeny: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionsDeny")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSelect(value: /* e */ FileSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFileSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInProgress(value: /* e */ InProgressEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleFilesSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFilesSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleFilesSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFilesSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withPushFile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushFile")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* e */ RemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBrowseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBrowseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBrowseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBrowseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFileDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFileDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFileDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* e */ SuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadName")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

