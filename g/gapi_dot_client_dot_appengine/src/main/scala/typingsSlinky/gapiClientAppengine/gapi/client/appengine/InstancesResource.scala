package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAppengine.AnonInstancesId
import typingsSlinky.gapiClientAppengine.AnonPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesResource extends js.Object {
  /**
    * Enables debugging on a VM instance. This allows you to use the SSH command to connect to the virtual machine where the instance lives. While in "debug
    * mode", the instance continues to serve live traffic. You should delete the instance when you are done debugging and then allow the system to take over
    * and determine if another instance should be started.Only applicable for instances in App Engine flexible environment.
    */
  def debug(request: AnonInstancesId): Request_[Operation] = js.native
  /** Stops a running instance. */
  def delete(request: AnonInstancesId): Request_[Operation] = js.native
  /** Gets instance information. */
  def get(request: AnonInstancesId): Request_[Instance] = js.native
  /**
    * Lists the instances of a version.Tip: To aggregate details about instances over time, see the Stackdriver Monitoring API
    * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list).
    */
  def list(request: AnonPageSize): Request_[ListInstancesResponse] = js.native
}

object InstancesResource {
  @scala.inline
  def apply(
    debug: AnonInstancesId => Request_[Operation],
    delete: AnonInstancesId => Request_[Operation],
    get: AnonInstancesId => Request_[Instance],
    list: AnonPageSize => Request_[ListInstancesResponse]
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
    def withDebug(value: AnonInstancesId => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonInstancesId => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonInstancesId => Request_[Instance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageSize => Request_[ListInstancesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

