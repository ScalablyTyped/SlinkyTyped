package typingsSlinky.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message describing inputs to Provision and Update Service instance
  * requests.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance extends js.Object {
  /**
    * Platform specific contextual information under which the service instance
    * is to be provisioned. This replaces organization_guid and space_guid. But
    * can also contain anything. Currently only used for logging context
    * information.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. Timestamp for when the instance was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Name of the Deployment Manager deployment used for
    * provisioning of this service instance.
    */
  var deploymentName: js.UndefOr[String] = js.native
  /**
    * The id of the service instance. Must be unique within GCP project.
    * Maximum length is 64, GUID recommended. Required.
    */
  var instance_id: js.UndefOr[String] = js.native
  /**
    * The platform GUID for the organization under which the service is to be
    * provisioned. Required.
    */
  var organization_guid: js.UndefOr[String] = js.native
  /**
    * Configuration options for the service instance. Parameters is JSON object
    * serialized to string.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.native
  /**
    * Used only in UpdateServiceInstance request to optionally specify previous
    * fields.
    */
  var previous_values: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The resource name of the instance, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.native
  /**
    * The identifier for the project space within the platform organization.
    * Required.
    */
  var space_guid: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1ServiceInstanceOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1ServiceInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_id")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization_guid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization_guid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_guid")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_id")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious_values(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious_values: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous_values")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withService_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace_guid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace_guid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space_guid")(js.undefined)
        ret
    }
  }
  
}

