package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCommitsError extends js.Object {
  /**
    * A commit ID that either could not be found or was not in a valid format.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * An error code that specifies whether the commit ID was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * An error message that provides detail about why the commit ID either was not found or was not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
}

object BatchGetCommitsError {
  @scala.inline
  def apply(): BatchGetCommitsError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCommitsError]
  }
  @scala.inline
  implicit class BatchGetCommitsErrorOps[Self <: BatchGetCommitsError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
  }
  
}

