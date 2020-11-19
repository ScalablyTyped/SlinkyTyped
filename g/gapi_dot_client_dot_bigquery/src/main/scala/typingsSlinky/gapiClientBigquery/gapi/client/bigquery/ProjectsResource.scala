package typingsSlinky.gapiClientBigquery.gapi.client.bigquery

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBigquery.anon.Fields
import typingsSlinky.gapiClientBigquery.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  /** Returns the email address of the service account for your project used for interactions with Google Cloud KMS. */
  def getServiceAccount(request: Fields): Request[GetServiceAccountResponse] = js.native
  
  /** Lists all projects to which you have been granted any project role. */
  def list(request: MaxResults): Request[ProjectList] = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    getServiceAccount: Fields => Request[GetServiceAccountResponse],
    list: MaxResults => Request[ProjectList]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(getServiceAccount = js.Any.fromFunction1(getServiceAccount), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
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
    def setGetServiceAccount(value: Fields => Request[GetServiceAccountResponse]): Self = this.set("getServiceAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: MaxResults => Request[ProjectList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
