package typingsSlinky.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRepoRequest extends js.Object {
  
  /** The new configuration for the repository. */
  var repo: js.UndefOr[Repo] = js.native
  
  /** A FieldMask specifying which fields of the repo to modify. Only the fields in the mask will be modified. If no mask is provided, this request is no-op. */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateRepoRequest {
  
  @scala.inline
  def apply(): UpdateRepoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRepoRequest]
  }
  
  @scala.inline
  implicit class UpdateRepoRequestOps[Self <: UpdateRepoRequest] (val x: Self) extends AnyVal {
    
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
    def setRepo(value: Repo): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepo: Self = this.set("repo", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
