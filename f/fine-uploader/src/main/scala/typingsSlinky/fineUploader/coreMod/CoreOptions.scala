package typingsSlinky.fineUploader.coreMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreOptions extends js.Object {
  /**
    * Set to false if you want to be able to upload queued items later by calling the `uploadStoredFiles()` method
    *
    * @default `true`
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  /**
    * blobs options
    */
  var blobs: js.UndefOr[BlobsOptions] = js.native
  /**
    * Specify an element to use as the 'select files' button. Cannot be a `<button>`
    *
    * @default `null`
    */
  var button: js.UndefOr[HTMLElement] = js.native
  /**
    * Core callback functions
    */
  var callbacks: js.UndefOr[CoreEvents] = js.native
  /**
    * camera options
    */
  var camera: js.UndefOr[CameraOptions] = js.native
  /**
    * ChunkingOptions
    */
  var chunking: js.UndefOr[ChunkingOptions] = js.native
  /**
    * CorsOptions
    */
  var cors: js.UndefOr[CorsOptions] = js.native
  /**
    * This will result in log messages being written to the `window.console` object
    *
    * @default `false`
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * DeleteFileOptions
    */
  var deleteFile: js.UndefOr[DeleteFileOptions] = js.native
  /**
    * When true the cancel link does not appear next to files when the form uploader is used
    *
    * @default `false`
    */
  var disableCancelForFormUploads: js.UndefOr[Boolean] = js.native
  /**
    * ExtraButtonsOptions
    */
  var extraButtons: js.UndefOr[js.Array[ExtraButtonsOptions]] = js.native
  /**
    * FormOptions
    */
  var form: js.UndefOr[FormOptions] = js.native
  /**
    * Provide a function to control the display of file names.
    *
    * The raw file name is passed into the function when it is invoked. Your function may return a modified file name.
    *
    * Note that this does not affect the actual file name, only the displayed file name
    */
  var formatFileName: js.UndefOr[FormatFileNameFuncton] = js.native
  /**
    * Maximum allowable concurrent requests
    *
    * @default `3`
    */
  var maxConnections: js.UndefOr[Double] = js.native
  /**
    * Messages
    */
  var messages: js.UndefOr[Messages] = js.native
  /**
    * When false this will prevent the user from simultaneously selecting or dropping more than one item
    *
    * @default `true`
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * PasteOptions
    */
  var paste: js.UndefOr[PasteOptions] = js.native
  /**
    * RequestOptions
    */
  var request: js.UndefOr[RequestOptions] = js.native
  /**
    * ResumeOptions
    */
  var resume: js.UndefOr[ResumeOptions] = js.native
  /**
    * ScalingOptions
    */
  var scaling: js.UndefOr[ScalingOptions] = js.native
  /**
    * SessionOptions
    */
  var session: js.UndefOr[SessionOptions] = js.native
  /**
    * TextOptions
    */
  var text: js.UndefOr[TextOptions] = js.native
  /**
    * ValidationOptions
    */
  var validation: js.UndefOr[ValidationOptions] = js.native
  /**
    * When true Fine Uploader will ensure a modal confirmation dialog appears whenever a user tries to navigate away from the page with uploads in progress
    *
    * @default `true`
    */
  var warnBeforeUnload: js.UndefOr[Boolean] = js.native
  /**
    * WorkArounds
    */
  var workarounds: js.UndefOr[WorkArounds] = js.native
}

object CoreOptions {
  @scala.inline
  def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  @scala.inline
  implicit class CoreOptionsOps[Self <: CoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBlobs(value: BlobsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobs")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbacks(value: CoreEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(js.undefined)
        ret
    }
    @scala.inline
    def withCamera(value: CameraOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withChunking(value: ChunkingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunking")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: CorsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteFile(value: DeleteFileOptions): Self = {
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
    def withDisableCancelForFormUploads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCancelForFormUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCancelForFormUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCancelForFormUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraButtons(value: js.Array[ExtraButtonsOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: FormOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFileName(value: /* fileOrBlobName */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFileName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: Messages): Self = {
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
    def withMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: PasteOptions): Self = {
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
    def withRequest(value: RequestOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResume(value: ResumeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.undefined)
        ret
    }
    @scala.inline
    def withScaling(value: ScalingOptions): Self = {
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
    def withSession(value: SessionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: TextOptions): Self = {
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
    def withValidation(value: ValidationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnBeforeUnload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnBeforeUnload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnBeforeUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnBeforeUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkarounds(value: WorkArounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workarounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkarounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workarounds")(js.undefined)
        ret
    }
  }
  
}

