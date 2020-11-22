package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeInitializationAction extends js.Object {
  
  /** Required. Cloud Storage URI of executable file. */
  var executableFile: js.UndefOr[String] = js.native
  
  /**
    * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration
    * (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the
    * exceeded timeout period) if the executable is not completed at end of the timeout period.
    */
  var executionTimeout: js.UndefOr[String] = js.native
}
object NodeInitializationAction {
  
  @scala.inline
  def apply(): NodeInitializationAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeInitializationAction]
  }
  
  @scala.inline
  implicit class NodeInitializationActionOps[Self <: NodeInitializationAction] (val x: Self) extends AnyVal {
    
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
    def setExecutableFile(value: String): Self = this.set("executableFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableFile: Self = this.set("executableFile", js.undefined)
    
    @scala.inline
    def setExecutionTimeout(value: String): Self = this.set("executionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionTimeout: Self = this.set("executionTimeout", js.undefined)
  }
}
