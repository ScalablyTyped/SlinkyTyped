package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientServiceuser.AnonAccesstoken
import typingsSlinky.gapiClientServiceuser.AnonAlt
import typingsSlinky.gapiClientServiceuser.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesResource extends js.Object {
  /**
    * Disable a service so it can no longer be used with a
    * project. This prevents unintended usage that may cause unexpected billing
    * charges or security leaks.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def disable(request: AnonAccesstoken): Request_[Operation] = js.native
  /**
    * Enable a service so it can be used with a project.
    * See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def enable(request: AnonAccesstoken): Request_[Operation] = js.native
  /** List enabled services for the specified consumer. */
  def list(request: AnonAlt): Request_[ListEnabledServicesResponse] = js.native
  /**
    * Search available services.
    *
    * When no filter is specified, returns all accessible services. For
    * authenticated users, also returns all services the calling user has
    * "servicemanagement.services.bind" permission for.
    */
  def search(request: AnonBearertoken): Request_[SearchServicesResponse] = js.native
}

object ServicesResource {
  @scala.inline
  def apply(
    disable: AnonAccesstoken => Request_[Operation],
    enable: AnonAccesstoken => Request_[Operation],
    list: AnonAlt => Request_[ListEnabledServicesResponse],
    search: AnonBearertoken => Request_[SearchServicesResponse]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), list = js.Any.fromFunction1(list), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ServicesResource]
  }
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnable(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListEnabledServicesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: AnonBearertoken => Request_[SearchServicesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

