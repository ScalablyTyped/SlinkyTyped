package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientServicemanagement.AnonBearertoken
import typingsSlinky.gapiClientServicemanagement.AnonFilter
import typingsSlinky.gapiClientServicemanagement.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RolloutsResource extends js.Object {
  /**
    * Creates a new service configuration rollout. Based on rollout, the
    * Google Service Management will roll out the service configurations to
    * different backend services. For example, the logging configuration will be
    * pushed to Google Cloud Logging.
    *
    * Please note that any previous pending and running Rollouts and associated
    * Operations will be automatically cancelled so that the latest Rollout will
    * not be blocked by previous Rollouts.
    *
    * Operation<response: Rollout>
    */
  def create(request: AnonBearertoken): Request_[Operation] = js.native
  /** Gets a service configuration rollout. */
  def get(request: AnonOauthtoken): Request_[Rollout] = js.native
  /**
    * Lists the history of the service configuration rollouts for a managed
    * service, from the newest to the oldest.
    */
  def list(request: AnonFilter): Request_[ListServiceRolloutsResponse] = js.native
}

object RolloutsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Operation],
    get: AnonOauthtoken => Request_[Rollout],
    list: AnonFilter => Request_[ListServiceRolloutsResponse]
  ): RolloutsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RolloutsResource]
  }
  @scala.inline
  implicit class RolloutsResourceOps[Self <: RolloutsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonOauthtoken => Request_[Rollout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[ListServiceRolloutsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

