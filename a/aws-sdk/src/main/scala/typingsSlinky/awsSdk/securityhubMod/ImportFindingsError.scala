package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportFindingsError extends js.Object {
  /**
    * The code of the error made during the BatchImportFindings operation.
    */
  var ErrorCode: NonEmptyString = js.native
  /**
    * The message of the error made during the BatchImportFindings operation.
    */
  var ErrorMessage: NonEmptyString = js.native
  /**
    * The ID of the error made during the BatchImportFindings operation.
    */
  var Id: NonEmptyString = js.native
}

object ImportFindingsError {
  @scala.inline
  def apply(ErrorCode: NonEmptyString, ErrorMessage: NonEmptyString, Id: NonEmptyString): ImportFindingsError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportFindingsError]
  }
  @scala.inline
  implicit class ImportFindingsErrorOps[Self <: ImportFindingsError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

