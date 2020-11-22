package typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends js.Object {
  
  /** The list of worker pools in a given instance. */
  var workerPools: js.UndefOr[js.Array[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]] = js.native
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponseOps[Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] (val x: Self) extends AnyVal {
    
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
    def setWorkerPoolsVarargs(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool*): Self = this.set("workerPools", js.Array(value :_*))
    
    @scala.inline
    def setWorkerPools(value: js.Array[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]): Self = this.set("workerPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerPools: Self = this.set("workerPools", js.undefined)
  }
}
