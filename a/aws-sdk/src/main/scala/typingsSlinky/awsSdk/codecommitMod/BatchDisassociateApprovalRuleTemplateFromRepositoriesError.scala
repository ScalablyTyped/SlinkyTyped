package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisassociateApprovalRuleTemplateFromRepositoriesError extends js.Object {
  /**
    * An error code that specifies whether the repository name was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * An error message that provides details about why the repository name was either not found or not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * The name of the repository where the association with the template was not able to be removed.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object BatchDisassociateApprovalRuleTemplateFromRepositoriesError {
  @scala.inline
  def apply(): BatchDisassociateApprovalRuleTemplateFromRepositoriesError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesError]
  }
  @scala.inline
  implicit class BatchDisassociateApprovalRuleTemplateFromRepositoriesErrorOps[Self <: BatchDisassociateApprovalRuleTemplateFromRepositoriesError] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(js.undefined)
        ret
    }
  }
  
}

