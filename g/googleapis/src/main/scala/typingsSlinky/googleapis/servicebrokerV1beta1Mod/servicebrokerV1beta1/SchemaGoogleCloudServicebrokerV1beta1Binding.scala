package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the binding.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1Binding extends js.Object {
  /**
    * A JSON object that contains data for platform resources associated with
    * the binding to be created.
    */
  var bind_resource: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The id of the binding. Must be unique within GCP project. Maximum length
    * is 64, GUID recommended. Required.
    */
  var binding_id: js.UndefOr[String] = js.native
  /**
    * Output only. Timestamp for when the binding was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. String containing the Deployment Manager deployment name
    * that was created for this binding,
    */
  var deploymentName: js.UndefOr[String] = js.native
  /**
    * Configuration options for the service binding.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The ID of the plan. See `Service` and `Plan` resources for details.
    * Maximum length is 64, GUID recommended. Required.
    */
  var plan_id: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name of the binding, e.g.
    * projects/project_id/brokers/broker_id/service_instances/instance_id/bindings/binding_id.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The id of the service. Must be a valid identifier of a service contained
    * in the list from a `ListServices()` call. Maximum length is 64, GUID
    * recommended. Required.
    */
  var service_id: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1Binding {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Binding]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1BindingOps[Self <: SchemaGoogleCloudServicebrokerV1beta1Binding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind_resource(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind_resource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind_resource")(js.undefined)
        ret
    }
    @scala.inline
    def withBinding_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinding_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding_id")(js.undefined)
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
  }
  
}

