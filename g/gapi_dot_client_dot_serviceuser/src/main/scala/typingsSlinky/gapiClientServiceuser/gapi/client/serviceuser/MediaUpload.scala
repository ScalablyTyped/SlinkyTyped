package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaUpload extends js.Object {
  /**
    * A boolean that determines whether a notification for the completion of an
    * upload should be sent to the backend. These notifications will not be seen
    * by the client and will not consume quota.
    */
  var completeNotification: js.UndefOr[Boolean] = js.native
  /** Name of the Scotty dropzone to use for the current API. */
  var dropzone: js.UndefOr[String] = js.native
  /** Whether upload is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional maximum acceptable size for an upload.
    * The size is specified in bytes.
    */
  var maxSize: js.UndefOr[String] = js.native
  /**
    * An array of mimetype patterns. Esf will only accept uploads that match one
    * of the given patterns.
    */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
  /** Whether to receive a notification for progress changes of media upload. */
  var progressNotification: js.UndefOr[Boolean] = js.native
  /** Whether to receive a notification on the start of media upload. */
  var startNotification: js.UndefOr[Boolean] = js.native
  /**
    * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
    *
    * Specify name of the upload service if one is used for upload.
    */
  var uploadService: js.UndefOr[String] = js.native
}

object MediaUpload {
  @scala.inline
  def apply(): MediaUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaUpload]
  }
  @scala.inline
  implicit class MediaUploadOps[Self <: MediaUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleteNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withDropzone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropzone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropzone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropzone")(js.undefined)
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
    def withMaxSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withStartNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadService")(js.undefined)
        ret
    }
  }
  
}

