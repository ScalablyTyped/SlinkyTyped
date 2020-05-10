package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeMergeConflictsError extends js.Object {
  /**
    * The name of the exception.
    */
  var exceptionName: ExceptionName = js.native
  /**
    * The path to the file.
    */
  var filePath: Path = js.native
  /**
    * The message provided by the exception.
    */
  var message: Message = js.native
}

object BatchDescribeMergeConflictsError {
  @scala.inline
  def apply(exceptionName: ExceptionName, filePath: Path, message: Message): BatchDescribeMergeConflictsError = {
    val __obj = js.Dynamic.literal(exceptionName = exceptionName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsError]
  }
  @scala.inline
  implicit class BatchDescribeMergeConflictsErrorOps[Self <: BatchDescribeMergeConflictsError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExceptionName(value: ExceptionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

