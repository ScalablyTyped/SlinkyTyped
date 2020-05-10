package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCreateWorkspaceRequest extends js.Object {
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.native
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * Information about the WorkSpace.
    */
  var WorkspaceRequest: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceRequest] = js.native
}

object FailedCreateWorkspaceRequest {
  @scala.inline
  def apply(): FailedCreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateWorkspaceRequest]
  }
  @scala.inline
  implicit class FailedCreateWorkspaceRequestOps[Self <: FailedCreateWorkspaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceRequest(value: WorkspaceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceRequest")(js.undefined)
        ret
    }
  }
  
}

