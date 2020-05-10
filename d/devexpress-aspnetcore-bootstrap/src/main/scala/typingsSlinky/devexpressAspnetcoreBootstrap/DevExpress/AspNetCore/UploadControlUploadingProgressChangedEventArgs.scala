package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadControlUploadingProgressChangedEventArgs extends EventArgs {
  val currentFileContentLength: Double = js.native
  val currentFileName: String = js.native
  val currentFileProgress: Double = js.native
  val currentFileUploadedContentLength: Double = js.native
  val fileCount: Double = js.native
  val progress: Double = js.native
  val totalContentLength: Double = js.native
  val uploadedContentLength: Double = js.native
}

object UploadControlUploadingProgressChangedEventArgs {
  @scala.inline
  def apply(
    currentFileContentLength: Double,
    currentFileName: String,
    currentFileProgress: Double,
    currentFileUploadedContentLength: Double,
    fileCount: Double,
    progress: Double,
    sender: Control,
    totalContentLength: Double,
    uploadedContentLength: Double
  ): UploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength.asInstanceOf[js.Any], currentFileName = currentFileName.asInstanceOf[js.Any], currentFileProgress = currentFileProgress.asInstanceOf[js.Any], currentFileUploadedContentLength = currentFileUploadedContentLength.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], totalContentLength = totalContentLength.asInstanceOf[js.Any], uploadedContentLength = uploadedContentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlUploadingProgressChangedEventArgs]
  }
  @scala.inline
  implicit class UploadControlUploadingProgressChangedEventArgsOps[Self <: UploadControlUploadingProgressChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentFileContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFileProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentFileUploadedContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentFileUploadedContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalContentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadedContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadedContentLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

