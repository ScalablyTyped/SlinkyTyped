package typingsSlinky.dropzone.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.FormData
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.dropzone.dropzoneStrings.contain
import typingsSlinky.dropzone.dropzoneStrings.crop
import typingsSlinky.dropzone.mod.global.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneOptions extends js.Object {
  var accept: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
      Unit
    ]
  ] = js.native
  var acceptedFiles: js.UndefOr[String] = js.native
  var addRemoveLinks: js.UndefOr[Boolean] = js.native
  var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
  var autoProcessQueue: js.UndefOr[Boolean] = js.native
  var autoQueue: js.UndefOr[Boolean] = js.native
  var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.native
  var capture: js.UndefOr[String] = js.native
  var chunkSize: js.UndefOr[Double] = js.native
  var chunking: js.UndefOr[Boolean] = js.native
  var chunksUploaded: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit], 
      Unit
    ]
  ] = js.native
  var clickable: js.UndefOr[Boolean | String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
  var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], Unit]] = js.native
  var createImageThumbnails: js.UndefOr[Boolean] = js.native
  var dictCancelUpload: js.UndefOr[String] = js.native
  var dictCancelUploadConfirmation: js.UndefOr[String] = js.native
  var dictDefaultMessage: js.UndefOr[String] = js.native
  var dictFallbackMessage: js.UndefOr[String] = js.native
  var dictFallbackText: js.UndefOr[String] = js.native
  var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.native
  var dictFileTooBig: js.UndefOr[String] = js.native
  var dictInvalidFileType: js.UndefOr[String] = js.native
  var dictMaxFilesExceeded: js.UndefOr[String] = js.native
  var dictRemoveFile: js.UndefOr[String] = js.native
  var dictRemoveFileConfirmation: js.UndefOr[String] = js.native
  var dictResponseError: js.UndefOr[String] = js.native
  var dictUploadCanceled: js.UndefOr[String] = js.native
  var dragend: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  var dragenter: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  var dragleave: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  var dragover: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  var error: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* message */ String | js.Error, 
      /* xhr */ XMLHttpRequest, 
      Unit
    ]
  ] = js.native
  var errormultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* message */ String | js.Error, 
      /* xhr */ XMLHttpRequest, 
      Unit
    ]
  ] = js.native
  var fallback: js.UndefOr[js.Function0[Unit]] = js.native
  var filesizeBase: js.UndefOr[Double] = js.native
  var forceChunking: js.UndefOr[Boolean] = js.native
  var forceFallback: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var hiddenInputContainer: js.UndefOr[HTMLElement] = js.native
  var ignoreHiddenFiles: js.UndefOr[Boolean] = js.native
  var init: js.UndefOr[js.ThisFunction0[/* this */ Dropzone, Unit]] = js.native
  var maxFiles: js.UndefOr[Double] = js.native
  var maxFilesize: js.UndefOr[Double] = js.native
  var maxThumbnailFilesize: js.UndefOr[Double] = js.native
  var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
  var method: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.native
  var parallelChunkUploads: js.UndefOr[Boolean] = js.native
  var parallelUploads: js.UndefOr[Double] = js.native
  var paramName: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Object] = js.native
  var paste: js.UndefOr[js.Function1[/* e */ DragEvent, Unit]] = js.native
  var previewTemplate: js.UndefOr[String] = js.native
  var previewsContainer: js.UndefOr[Boolean | String | HTMLElement] = js.native
  var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], Unit]] = js.native
  var queuecomplete: js.UndefOr[js.Function0[Unit]] = js.native
  var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  var renameFilename: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
  var reset: js.UndefOr[js.Function0[Unit]] = js.native
  var resize: js.UndefOr[
    js.Function4[
      /* file */ DropzoneFile, 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      /* resizeMethod */ js.UndefOr[String], 
      DropzoneResizeInfo
    ]
  ] = js.native
  var resizeHeight: js.UndefOr[Double] = js.native
  var resizeMethod: js.UndefOr[contain | crop] = js.native
  var resizeMimeType: js.UndefOr[String] = js.native
  var resizeQuality: js.UndefOr[Double] = js.native
  var resizeWidth: js.UndefOr[Double] = js.native
  var retryChunks: js.UndefOr[Boolean] = js.native
  var retryChunksLimit: js.UndefOr[Double] = js.native
  var sending: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData, Unit]
  ] = js.native
  var sendingmultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ XMLHttpRequest, 
      /* formData */ FormData, 
      Unit
    ]
  ] = js.native
  var success: js.UndefOr[js.Function1[/* file */ DropzoneFile, Unit]] = js.native
  var successmultiple: js.UndefOr[
    js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ String, Unit]
  ] = js.native
  var thumbnail: js.UndefOr[js.Function2[/* file */ DropzoneFile, /* dataUrl */ String, Unit]] = js.native
  var thumbnailHeight: js.UndefOr[Double] = js.native
  var thumbnailMethod: js.UndefOr[contain | crop] = js.native
  var thumbnailWidth: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var totaluploadprogress: js.UndefOr[
    js.Function3[/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double, Unit]
  ] = js.native
  var transformFile: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* file */ String | Blob, Unit], 
      Unit
    ]
  ] = js.native
  var uploadMultiple: js.UndefOr[Boolean] = js.native
  var uploadprogress: js.UndefOr[
    js.Function3[/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double, Unit]
  ] = js.native
  var url: js.UndefOr[(js.Function1[/* files */ js.Array[DropzoneFile], String]) | String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object DropzoneOptions {
  @scala.inline
  def apply(): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneOptions]
  }
  @scala.inline
  implicit class DropzoneOptionsOps[Self <: DropzoneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(
      value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptedFiles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withAddRemoveLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRemoveLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddRemoveLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRemoveLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withAddedfile(value: /* file */ DropzoneFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedfile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddedfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedfile")(js.undefined)
        ret
    }
    @scala.inline
    def withAddedfiles(value: /* files */ js.Array[DropzoneFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedfiles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddedfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedfiles")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoProcessQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoProcessQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoProcessQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoProcessQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoQueue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoQueue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoQueue")(js.undefined)
        ret
    }
    @scala.inline
    def withCanceled(value: /* file */ DropzoneFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceled")(js.undefined)
        ret
    }
    @scala.inline
    def withCanceledmultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledmultiple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCanceledmultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canceledmultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withChunking(value: Boolean): Self = {
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
    def withChunksUploaded(
      value: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[String | js.Error], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksUploaded")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChunksUploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksUploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean | String | HTMLElement | (js.Array[String | HTMLElement])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* file */ DropzoneFile => Unit): Self = {
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
    def withCompletemultiple(value: /* file */ js.Array[DropzoneFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completemultiple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompletemultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completemultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateImageThumbnails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImageThumbnails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateImageThumbnails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImageThumbnails")(js.undefined)
        ret
    }
    @scala.inline
    def withDictCancelUpload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictCancelUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictCancelUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictCancelUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withDictCancelUploadConfirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictCancelUploadConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictCancelUploadConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictCancelUploadConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withDictDefaultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictDefaultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictDefaultMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictDefaultMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDictFallbackMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFallbackMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictFallbackMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFallbackMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDictFallbackText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFallbackText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictFallbackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFallbackText")(js.undefined)
        ret
    }
    @scala.inline
    def withDictFileSizeUnits(value: DropzoneDictFileSizeUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFileSizeUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictFileSizeUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFileSizeUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withDictFileTooBig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFileTooBig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictFileTooBig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictFileTooBig")(js.undefined)
        ret
    }
    @scala.inline
    def withDictInvalidFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictInvalidFileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictInvalidFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictInvalidFileType")(js.undefined)
        ret
    }
    @scala.inline
    def withDictMaxFilesExceeded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictMaxFilesExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictMaxFilesExceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictMaxFilesExceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withDictRemoveFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictRemoveFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictRemoveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictRemoveFile")(js.undefined)
        ret
    }
    @scala.inline
    def withDictRemoveFileConfirmation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictRemoveFileConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictRemoveFileConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictRemoveFileConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withDictResponseError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictResponseError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictResponseError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictResponseError")(js.undefined)
        ret
    }
    @scala.inline
    def withDictUploadCanceled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictUploadCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictUploadCanceled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictUploadCanceled")(js.undefined)
        ret
    }
    @scala.inline
    def withDragend(value: /* e */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.undefined)
        ret
    }
    @scala.inline
    def withDragenter(value: /* e */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(js.undefined)
        ret
    }
    @scala.inline
    def withDragleave(value: /* e */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(js.undefined)
        ret
    }
    @scala.inline
    def withDragover(value: /* e */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(js.undefined)
        ret
    }
    @scala.inline
    def withDragstart(value: /* e */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* e */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withError(
      value: (/* file */ DropzoneFile, /* message */ String | js.Error, /* xhr */ XMLHttpRequest) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withErrormultiple(
      value: (/* files */ js.Array[DropzoneFile], /* message */ String | js.Error, /* xhr */ XMLHttpRequest) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errormultiple")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutErrormultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errormultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withFallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFilesizeBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesizeBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilesizeBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesizeBase")(js.undefined)
        ret
    }
    @scala.inline
    def withForceChunking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChunking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceChunking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChunking")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFallback")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenInputContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenInputContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenInputContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenInputContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreHiddenFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHiddenFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHiddenFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHiddenFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: js.ThisFunction0[/* this */ Dropzone, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFilesize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFilesize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilesize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxThumbnailFilesize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxThumbnailFilesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxThumbnailFilesize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxThumbnailFilesize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxfilesexceeded(value: /* file */ DropzoneFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxfilesexceeded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaxfilesexceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxfilesexceeded")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxfilesreached(value: /* files */ js.Array[DropzoneFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxfilesreached")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaxfilesreached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxfilesreached")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMethod(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelChunkUploads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChunkUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelChunkUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChunkUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withParamName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramName")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: /* e */ DragEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewsContainer(value: Boolean | String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: /* file */ DropzoneFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingmultiple(value: /* files */ js.Array[DropzoneFile] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingmultiple")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessingmultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingmultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withQueuecomplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuecomplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutQueuecomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queuecomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovedfile(value: /* file */ DropzoneFile => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedfile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemovedfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedfile")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameFilename(value: /* name */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameFilename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenameFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(
      value: (/* file */ DropzoneFile, /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], /* resizeMethod */ js.UndefOr[String]) => DropzoneResizeInfo
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeMethod(value: contain | crop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryChunksLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryChunksLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryChunksLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryChunksLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSending(value: (/* file */ DropzoneFile, /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sending")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sending")(js.undefined)
        ret
    }
    @scala.inline
    def withSendingmultiple(
      value: (/* files */ js.Array[DropzoneFile], /* xhr */ XMLHttpRequest, /* formData */ FormData) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendingmultiple")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSendingmultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendingmultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* file */ DropzoneFile => Unit): Self = {
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
    def withSuccessmultiple(value: (/* files */ js.Array[DropzoneFile], /* responseText */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successmultiple")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSuccessmultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successmultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: (/* file */ DropzoneFile, /* dataUrl */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailMethod(value: contain | crop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTotaluploadprogress(value: (/* totalProgress */ Double, /* totalBytes */ Double, /* totalBytesSent */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totaluploadprogress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTotaluploadprogress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totaluploadprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformFile(value: (/* file */ DropzoneFile, /* done */ js.Function1[/* file */ String | Blob, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransformFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFile")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadprogress(value: (/* file */ DropzoneFile, /* progress */ Double, /* bytesSent */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadprogress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUploadprogress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlFunction1(value: /* files */ js.Array[DropzoneFile] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUrl(value: (js.Function1[/* files */ js.Array[DropzoneFile], String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

