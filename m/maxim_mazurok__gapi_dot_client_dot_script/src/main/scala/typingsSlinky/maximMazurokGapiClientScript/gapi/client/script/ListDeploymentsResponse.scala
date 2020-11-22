package typingsSlinky.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentsResponse extends js.Object {
  
  /** The list of deployments. */
  var deployments: js.UndefOr[js.Array[Deployment]] = js.native
  
  /** The token that can be used in the next call to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListDeploymentsResponse {
  
  @scala.inline
  def apply(): ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsResponse]
  }
  
  @scala.inline
  implicit class ListDeploymentsResponseOps[Self <: ListDeploymentsResponse] (val x: Self) extends AnyVal {
    
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
    def setDeploymentsVarargs(value: Deployment*): Self = this.set("deployments", js.Array(value :_*))
    
    @scala.inline
    def setDeployments(value: js.Array[Deployment]): Self = this.set("deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployments: Self = this.set("deployments", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
