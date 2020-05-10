package typingsSlinky.flowjs.mod

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFlowFile extends js.Object {
  var averageSpeed: Double = js.native
  var chunks: js.Array[_] = js.native
  var currentSpeed: Double = js.native
  var error: Boolean = js.native
  var file: File = js.native
  var flowObj: IFlow = js.native
  var name: String = js.native
  var paused: Boolean = js.native
  var relativePath: String = js.native
  var size: Double = js.native
  var uniqueIdentifier: String = js.native
  def bootstrap(): Unit = js.native
  def cancel(): Unit = js.native
  def getExtension(): String = js.native
  def getType(): String = js.native
  def isComplete(): Boolean = js.native
  def isUploading(): Boolean = js.native
  def pause(): Unit = js.native
  def progress(relative: Boolean): Double = js.native
  def resume(): Unit = js.native
  def retry(): Unit = js.native
  def sizeUploaded(): Double = js.native
  def timeRemaining(): Double = js.native
}

object IFlowFile {
  @scala.inline
  def apply(
    averageSpeed: Double,
    bootstrap: () => Unit,
    cancel: () => Unit,
    chunks: js.Array[_],
    currentSpeed: Double,
    error: Boolean,
    file: File,
    flowObj: IFlow,
    getExtension: () => String,
    getType: () => String,
    isComplete: () => Boolean,
    isUploading: () => Boolean,
    name: String,
    pause: () => Unit,
    paused: Boolean,
    progress: Boolean => Double,
    relativePath: String,
    resume: () => Unit,
    retry: () => Unit,
    size: Double,
    sizeUploaded: () => Double,
    timeRemaining: () => Double,
    uniqueIdentifier: String
  ): IFlowFile = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed.asInstanceOf[js.Any], bootstrap = js.Any.fromFunction0(bootstrap), cancel = js.Any.fromFunction0(cancel), chunks = chunks.asInstanceOf[js.Any], currentSpeed = currentSpeed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], flowObj = flowObj.asInstanceOf[js.Any], getExtension = js.Any.fromFunction0(getExtension), getType = js.Any.fromFunction0(getType), isComplete = js.Any.fromFunction0(isComplete), isUploading = js.Any.fromFunction0(isUploading), name = name.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), relativePath = relativePath.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), retry = js.Any.fromFunction0(retry), size = size.asInstanceOf[js.Any], sizeUploaded = js.Any.fromFunction0(sizeUploaded), timeRemaining = js.Any.fromFunction0(timeRemaining), uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFlowFile]
  }
  @scala.inline
  implicit class IFlowFileOps[Self <: IFlowFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageSpeed")(value.asInstanceOf[js.Any])
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
    def withChunks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowObj(value: IFlow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowObj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetExtension(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExtension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPaused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paused")(value.asInstanceOf[js.Any])
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
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
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
    def withSizeUploaded(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeUploaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimeRemaining(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRemaining")(js.Any.fromFunction0(value))
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

