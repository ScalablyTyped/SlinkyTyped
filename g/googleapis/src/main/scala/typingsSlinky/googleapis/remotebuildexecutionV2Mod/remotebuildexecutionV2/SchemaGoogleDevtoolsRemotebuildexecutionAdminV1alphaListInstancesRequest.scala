package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest extends js.Object {
  
  /**
    * Resource name of the project. Format: `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequestOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest] (val x: Self) extends AnyVal {
    
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
