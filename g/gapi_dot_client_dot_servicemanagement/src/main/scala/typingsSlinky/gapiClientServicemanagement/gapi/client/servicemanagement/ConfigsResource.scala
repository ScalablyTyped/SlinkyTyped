package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientServicemanagement.anon.Bearertoken
import typingsSlinky.gapiClientServicemanagement.anon.Callback
import typingsSlinky.gapiClientServicemanagement.anon.Fields
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
  def create(request: Bearertoken): Request[Service] = js.native
  /** Gets a service configuration (version) for a managed service. */
  def get(request: Callback): Request[Service] = js.native
  /**
    * Lists the history of the service configuration for a managed service,
    * from the newest to the oldest.
    */
  def list(request: Fields): Request[ListServiceConfigsResponse] = js.native
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
  def submit(request: Bearertoken): Request[Operation] = js.native
}

object ConfigsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[Service],
    get: Callback => Request[Service],
    list: Fields => Request[ListServiceConfigsResponse],
    submit: Bearertoken => Request[Operation]
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
    def withCreate(value: Bearertoken => Request[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Callback => Request[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[ListServiceConfigsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: Bearertoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

