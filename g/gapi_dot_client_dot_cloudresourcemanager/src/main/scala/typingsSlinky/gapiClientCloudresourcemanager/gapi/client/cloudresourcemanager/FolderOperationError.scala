package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderOperationError extends js.Object {
  /** The type of operation error experienced. */
  var errorMessageId: js.UndefOr[String] = js.native
}

object FolderOperationError {
  @scala.inline
  def apply(): FolderOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderOperationError]
  }
  @scala.inline
  implicit class FolderOperationErrorOps[Self <: FolderOperationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageId")(js.undefined)
        ret
    }
  }
  
}

