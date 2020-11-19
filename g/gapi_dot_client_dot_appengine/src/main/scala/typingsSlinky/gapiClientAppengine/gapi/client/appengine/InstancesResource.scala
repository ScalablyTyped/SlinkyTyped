package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAppengine.anon.InstancesId
import typingsSlinky.gapiClientAppengine.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends js.Object {
  
  /**
    * Enables debugging on a VM instance. This allows you to use the SSH command to connect to the virtual machine where the instance lives. While in "debug
    * mode", the instance continues to serve live traffic. You should delete the instance when you are done debugging and then allow the system to take over
    * and determine if another instance should be started.Only applicable for instances in App Engine flexible environment.
    */
  def debug(request: InstancesId): Request[Operation] = js.native
  
  /** Stops a running instance. */
  def delete(request: InstancesId): Request[Operation] = js.native
  
  /** Gets instance information. */
  def get(request: InstancesId): Request[Instance] = js.native
  
  /**
    * Lists the instances of a version.Tip: To aggregate details about instances over time, see the Stackdriver Monitoring API
    * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list).
    */
  def list(request: PageSize): Request[ListInstancesResponse] = js.native
}
object InstancesResource {
  
  @scala.inline
  def apply(
    debug: InstancesId => Request[Operation],
    delete: InstancesId => Request[Operation],
    get: InstancesId => Request[Instance],
    list: PageSize => Request[ListInstancesResponse]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InstancesResource]
  }
  
  @scala.inline
  implicit class InstancesResourceOps[Self <: InstancesResource] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: InstancesId => Request[Operation]): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: InstancesId => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: InstancesId => Request[Instance]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: PageSize => Request[ListInstancesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
