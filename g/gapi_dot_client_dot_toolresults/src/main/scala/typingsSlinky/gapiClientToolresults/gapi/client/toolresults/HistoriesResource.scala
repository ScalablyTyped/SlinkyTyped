package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientToolresults.anon.FilterByName
import typingsSlinky.gapiClientToolresults.anon.RequestId
import typingsSlinky.gapiClientToolresults.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoriesResource extends js.Object {
  
  /**
    * Creates a History.
    *
    * The returned History will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing project does not exist
    */
  def create(request: RequestId): Request[History] = js.native
  
  var executions: ExecutionsResource = js.native
  
  /**
    * Gets a History.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def get(request: UserIp): Request[History] = js.native
  
  /**
    * Lists Histories for a given Project.
    *
    * The histories are sorted by modification time in descending order. The history_id key will be used to order the history with the same modification
    * time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the History does
    * not exist
    */
  def list(request: FilterByName): Request[ListHistoriesResponse] = js.native
}
object HistoriesResource {
  
  @scala.inline
  def apply(
    create: RequestId => Request[History],
    executions: ExecutionsResource,
    get: UserIp => Request[History],
    list: FilterByName => Request[ListHistoriesResponse]
  ): HistoriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), executions = executions.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[HistoriesResource]
  }
  
  @scala.inline
  implicit class HistoriesResourceOps[Self <: HistoriesResource] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: RequestId => Request[History]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecutions(value: ExecutionsResource): Self = this.set("executions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: UserIp => Request[History]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: FilterByName => Request[ListHistoriesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
