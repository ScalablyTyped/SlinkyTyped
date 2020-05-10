package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 45. */
@js.native
trait ExecuteActionRequestedOptions extends js.Object {
  /** The identifier of the action to be executed. */
  var actionId: String = js.native
  /** The path of the entry to be used for the action. */
  var entryPath: String = js.native
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String = js.native
  /** The unique identifier of this request. */
  var requestId: integer = js.native
}

object ExecuteActionRequestedOptions {
  @scala.inline
  def apply(actionId: String, entryPath: String, fileSystemId: String, requestId: integer): ExecuteActionRequestedOptions = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteActionRequestedOptions]
  }
  @scala.inline
  implicit class ExecuteActionRequestedOptionsOps[Self <: ExecuteActionRequestedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

