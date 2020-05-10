package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientServicemanagement.AnonBearertoken
import typingsSlinky.gapiClientServicemanagement.AnonCallback
import typingsSlinky.gapiClientServicemanagement.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigsResource extends js.Object {
  /**
    * Creates a new service configuration (version) for a managed service.
    * This method only stores the service configuration. To roll out the service
    * configuration to backend systems please call
    * CreateServiceRollout.
    */
  def create(request: AnonBearertoken): Request_[Service] = js.native
  /** Gets a service configuration (version) for a managed service. */
  def get(request: AnonCallback): Request_[Service] = js.native
  /**
    * Lists the history of the service configuration for a managed service,
    * from the newest to the oldest.
    */
  def list(request: AnonFields): Request_[ListServiceConfigsResponse] = js.native
  /**
    * Creates a new service configuration (version) for a managed service based
    * on
    * user-supplied configuration source files (for example: OpenAPI
    * Specification). This method stores the source configurations as well as the
    * generated service configuration. To rollout the service configuration to
    * other services,
    * please call CreateServiceRollout.
    *
    * Operation<response: SubmitConfigSourceResponse>
    */
  def submit(request: AnonBearertoken): Request_[Operation] = js.native
}

object ConfigsResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[Service],
    get: AnonCallback => Request_[Service],
    list: AnonFields => Request_[ListServiceConfigsResponse],
    submit: AnonBearertoken => Request_[Operation]
  ): ConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[ConfigsResource]
  }
  @scala.inline
  implicit class ConfigsResourceOps[Self <: ConfigsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonBearertoken => Request_[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCallback => Request_[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[ListServiceConfigsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

