package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedS3Resource extends js.Object {
  /**
    * The status code of a failed item.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The error message of a failed item.
    */
  var errorMessage: js.UndefOr[ExceptionMessage] = js.native
  /**
    * The failed S3 resources.
    */
  var failedItem: js.UndefOr[S3Resource] = js.native
}

object FailedS3Resource {
  @scala.inline
  def apply(): FailedS3Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedS3Resource]
  }
  @scala.inline
  implicit class FailedS3ResourceOps[Self <: FailedS3Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withErrorMessage(value: ExceptionMessage): Self = {
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
    @scala.inline
    def withFailedItem(value: S3Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedItem")(js.undefined)
        ret
    }
  }
  
}

