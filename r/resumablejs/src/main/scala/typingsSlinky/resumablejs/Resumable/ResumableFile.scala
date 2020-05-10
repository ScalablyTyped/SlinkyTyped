package typingsSlinky.resumablejs.Resumable

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumableFile extends js.Object {
  /**
    * An array of ResumableChunk items. You shouldn't need to dig into these.
    **/
  var chunks: js.Array[ResumableChunk] = js.native
  /**
    * The correlating HTML5 File object.
    **/
  var file: File = js.native
  /**
    * The name of the file.
    **/
  var fileName: String = js.native
  /**
    * The relative path to the file (defaults to file name if relative path doesn't exist)
    **/
  var relativePath: String = js.native
  /**
    * A back-reference to the parent Resumable object.
    **/
  var resumableObj: typingsSlinky.resumablejs.Resumable.Resumable = js.native
  /**
    * Size in bytes of the file.
    **/
  var size: Double = js.native
  /**
    * A unique identifier assigned to this file object. This value is included in uploads to the server for reference, but can also be used in CSS classes etc when building your upload UI.
    **/
  var uniqueIdentifier: String = js.native
  /**
    * Abort uploading the file.
    **/
  def abort(): Unit = js.native
  /**
    * Rebuild the state of a ResumableFile object, including reassigning chunks and XMLHttpRequest instances.
    **/
  def bootstrap(): Unit = js.native
  /**
    * Abort uploading the file and delete it from the list of files to upload.
    **/
  def cancel(): Unit = js.native
  /**
    * Returns a boolean indicating whether the file has completed uploading and received a server response.
    **/
  def isComplete(): Boolean = js.native
  /**
    * Returns a boolean indicating whether file chunks is uploading.
    **/
  def isUploading(): Boolean = js.native
  /**
    * Returns a float between 0 and 1 indicating the current upload progress of the file. If relative is true, the value is returned relative to all files in the Resumable.js instance.
    **/
  def progress(relative: Boolean): Double = js.native
  /**
    * Retry uploading the file.
    **/
  def retry(): Unit = js.native
}

object ResumableFile {
  @scala.inline
  def apply(
    abort: () => Unit,
    bootstrap: () => Unit,
    cancel: () => Unit,
    chunks: js.Array[ResumableChunk],
    file: File,
    fileName: String,
    isComplete: () => Boolean,
    isUploading: () => Boolean,
    progress: Boolean => Double,
    relativePath: String,
    resumableObj: typingsSlinky.resumablejs.Resumable.Resumable,
    retry: () => Unit,
    size: Double,
    uniqueIdentifier: String
  ): ResumableFile = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), bootstrap = js.Any.fromFunction0(bootstrap), cancel = js.Any.fromFunction0(cancel), chunks = chunks.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isComplete = js.Any.fromFunction0(isComplete), isUploading = js.Any.fromFunction0(isUploading), progress = js.Any.fromFunction1(progress), relativePath = relativePath.asInstanceOf[js.Any], resumableObj = resumableObj.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry), size = size.asInstanceOf[js.Any], uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumableFile]
  }
  @scala.inline
  implicit class ResumableFileOps[Self <: ResumableFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBootstrap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChunks(value: js.Array[ResumableChunk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComplete(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUploading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUploading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgress(value: Boolean => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResumableObj(value: typingsSlinky.resumablejs.Resumable.Resumable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumableObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

