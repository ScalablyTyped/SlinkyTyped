package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A classification of the Folder Operation error.
  */
@js.native
trait SchemaFolderOperationError extends js.Object {
  /**
    * The type of operation error experienced.
    */
  var errorMessageId: js.UndefOr[String] = js.native
}

object SchemaFolderOperationError {
  @scala.inline
  def apply(): SchemaFolderOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolderOperationError]
  }
  @scala.inline
  implicit class SchemaFolderOperationErrorOps[Self <: SchemaFolderOperationError] (val x: Self) extends AnyVal {
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

