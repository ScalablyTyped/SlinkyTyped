package typingsSlinky.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetActionsRequestedOptions extends js.Object {
  
  /** The path of the entry to return the list of actions for. */
  var entryPath: String = js.native
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String = js.native
  
  /** The unique identifier of this request. */
  var requestId: Double = js.native
}
object GetActionsRequestedOptions {
  
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, requestId: Double): GetActionsRequestedOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActionsRequestedOptions]
  }
  
  @scala.inline
  implicit class GetActionsRequestedOptionsOps[Self <: GetActionsRequestedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryPath(value: String): Self = this.set("entryPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: String): Self = this.set("fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
}
