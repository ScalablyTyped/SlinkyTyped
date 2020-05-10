package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientServicemanagement.AnonBearertoken
import typingsSlinky.gapiClientServicemanagement.AnonConfigId
import typingsSlinky.gapiClientServicemanagement.AnonConsumerId
import typingsSlinky.gapiClientServicemanagement.AnonKey
import typingsSlinky.gapiClientServicemanagement.AnonPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesResource extends js.Object {
  var configs: ConfigsResource = js.native
  var consumers: ConsumersResource = js.native
  var rollouts: RolloutsResource = js.native
  /**
    * Creates a new managed service.
    * Please note one producer project can own no more than 20 services.
    *
    * Operation<response: ManagedService>
    */
  def create(request: AnonPp): Request_[Operation] = js.native
  /**
    * Deletes a managed service. This method will change the service to the
    * `Soft-Delete` state for 30 days. Within this period, service producers may
    * call UndeleteService to restore the service.
    * After 30 days, the service will be permanently deleted.
    *
    * Operation<response: google.protobuf.Empty>
    */
  def delete(request: AnonBearertoken): Request_[Operation] = js.native
  /**
    * Disables a service for a project, so it can no longer be
    * be used for the project. It prevents accidental usage that may cause
    * unexpected billing charges or security leaks.
    *
    * Operation<response: DisableServiceResponse>
    */
  def disable(request: AnonBearertoken): Request_[Operation] = js.native
  /**
    * Enables a service for a project, so it can be used
    * for the project. See
    * [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for
    * more information.
    *
    * Operation<response: EnableServiceResponse>
    */
  def enable(request: AnonBearertoken): Request_[Operation] = js.native
  /**
    * Generates and returns a report (errors, warnings and changes from
    * existing configurations) associated with
    * GenerateConfigReportRequest.new_value
    *
    * If GenerateConfigReportRequest.old_value is specified,
    * GenerateConfigReportRequest will contain a single ChangeReport based on the
    * comparison between GenerateConfigReportRequest.new_value and
    * GenerateConfigReportRequest.old_value.
    * If GenerateConfigReportRequest.old_value is not specified, this method
    * will compare GenerateConfigReportRequest.new_value with the last pushed
    * service configuration.
    */
  def generateConfigReport(request: AnonPp): Request_[GenerateConfigReportResponse] = js.native
  /**
    * Gets a managed service. Authentication is required unless the service is
    * public.
    */
  def get(request: AnonBearertoken): Request_[ManagedService] = js.native
  /** Gets a service configuration (version) for a managed service. */
  def getConfig(request: AnonConfigId): Request_[Service] = js.native
  /**
    * Gets the access control policy for a resource.
    * Returns an empty policy if the resource exists and does not have a policy
    * set.
    */
  def getIamPolicy(request: AnonKey): Request_[Policy] = js.native
  /**
    * Lists managed services.
    *
    * Returns all public services. For authenticated users, also returns all
    * services the calling user has "servicemanagement.services.get" permission
    * for.
    *
    * &#42;&#42;BETA:&#42;&#42; If the caller specifies the `consumer_id`, it returns only the
    * services enabled on the consumer. The `consumer_id` must have the format
    * of "project:{PROJECT-ID}".
    */
  def list(request: AnonConsumerId): Request_[ListServicesResponse] = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any
    * existing policy.
    */
  def setIamPolicy(request: AnonKey): Request_[Policy] = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * If the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.
    *
    * Note: This operation is designed to be used for building permission-aware
    * UIs and command-line tools, not for authorization checking. This operation
    * may "fail open" without warning.
    */
  def testIamPermissions(request: AnonKey): Request_[TestIamPermissionsResponse] = js.native
  /**
    * Revives a previously deleted managed service. The method restores the
    * service using the configuration at the time the service was deleted.
    * The target service must exist and must have been deleted within the
    * last 30 days.
    *
    * Operation<response: UndeleteServiceResponse>
    */
  def undelete(request: AnonBearertoken): Request_[Operation] = js.native
}

object ServicesResource {
  @scala.inline
  def apply(
    configs: ConfigsResource,
    consumers: ConsumersResource,
    create: AnonPp => Request_[Operation],
    delete: AnonBearertoken => Request_[Operation],
    disable: AnonBearertoken => Request_[Operation],
    enable: AnonBearertoken => Request_[Operation],
    generateConfigReport: AnonPp => Request_[GenerateConfigReportResponse],
    get: AnonBearertoken => Request_[ManagedService],
    getConfig: AnonConfigId => Request_[Service],
    getIamPolicy: AnonKey => Request_[Policy],
    list: AnonConsumerId => Request_[ListServicesResponse],
    rollouts: RolloutsResource,
    setIamPolicy: AnonKey => Request_[Policy],
    testIamPermissions: AnonKey => Request_[TestIamPermissionsResponse],
    undelete: AnonBearertoken => Request_[Operation]
  ): ServicesResource = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], consumers = consumers.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), generateConfigReport = js.Any.fromFunction1(generateConfigReport), get = js.Any.fromFunction1(get), getConfig = js.Any.fromFunction1(getConfig), getIamPolicy = js.Any.fromFunction1(getIamPolicy), list = js.Any.fromFunction1(list), rollouts = rollouts.asInstanceOf[js.Any], setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions), undelete = js.Any.fromFunction1(undelete))
    __obj.asInstanceOf[ServicesResource]
  }
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigs(value: ConfigsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumers(value: ConsumersResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: AnonPp => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisable(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnable(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateConfigReport(value: AnonPp => Request_[GenerateConfigReportResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateConfigReport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonBearertoken => Request_[ManagedService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConfig(value: AnonConfigId => Request_[Service]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIamPolicy(value: AnonKey => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonConsumerId => Request_[ListServicesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollouts(value: RolloutsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetIamPolicy(value: AnonKey => Request_[Policy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIamPolicy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestIamPermissions(value: AnonKey => Request_[TestIamPermissionsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIamPermissions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUndelete(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

