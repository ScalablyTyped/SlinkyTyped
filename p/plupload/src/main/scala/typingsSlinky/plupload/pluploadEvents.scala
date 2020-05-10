package typingsSlinky.plupload

import typingsSlinky.plupload.plupload.Uploader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluploadEvents extends js.Object {
  var BeforeUpload: js.UndefOr[pluploadEventFile] = js.native
  var ChunkUploaded: js.UndefOr[pluploadEventChunkUploaded] = js.native
  var Destroy: js.UndefOr[pluploadEvent] = js.native
  var Error: js.UndefOr[pluploadEventError] = js.native
  var FileFiltered: js.UndefOr[pluploadEventFile] = js.native
  var FileUploaded: js.UndefOr[pluploadEventFileUploaded] = js.native
  var FilesAdded: js.UndefOr[pluploadEventFiles] = js.native
  var FilesRemoved: js.UndefOr[pluploadEventFiles] = js.native
  var Init: js.UndefOr[pluploadEvent] = js.native
  var OptionChanged: js.UndefOr[pluploadEventOptionChanged] = js.native
  var PostInit: js.UndefOr[pluploadEvent] = js.native
  var QueueChanged: js.UndefOr[pluploadEvent] = js.native
  var Refresh: js.UndefOr[pluploadEvent] = js.native
  var StateChanged: js.UndefOr[pluploadEvent] = js.native
  var UploadComplete: js.UndefOr[pluploadEventFiles] = js.native
  var UploadFile: js.UndefOr[pluploadEventFile] = js.native
  var UploadProgress: js.UndefOr[pluploadEventFile] = js.native
}

object pluploadEvents {
  @scala.inline
  def apply(): pluploadEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadEvents]
  }
  @scala.inline
  implicit class pluploadEventsOps[Self <: pluploadEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeUpload(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeUpload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkUploaded(
      value: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadChunkResponse) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChunkUploaded")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutChunkUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChunkUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* uploader */ Uploader => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: (/* uploader */ Uploader, /* error */ pluploadError) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Error")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFiltered(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileFiltered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUploaded(value: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadResponse) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileUploaded")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFileUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesAdded(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilesAdded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilesAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilesAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesRemoved(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilesRemoved")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilesRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilesRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: /* uploader */ Uploader => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Init")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionChanged(
      value: (/* uploader */ Uploader, /* name */ String, /* value */ js.Any, /* oldValue */ js.Any) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionChanged")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOptionChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPostInit(value: /* uploader */ Uploader => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostInit")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueChanged(value: /* uploader */ Uploader => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: /* uploader */ Uploader => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChanged(value: /* uploader */ Uploader => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadComplete(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadComplete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUploadComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadFile(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUploadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadFile")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadProgress(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadProgress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUploadProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadProgress")(js.undefined)
        ret
    }
  }
  
}

