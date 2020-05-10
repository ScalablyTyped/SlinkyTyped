package typingsSlinky.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The resource model mostly follows the Open Service Broker API, as described
  * here:
  * https://github.com/openservicebrokerapi/servicebroker/blob/master/_spec.md
  * Though due to Google Specifics it has additional optional fields.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1Service extends js.Object {
  /**
    * Specifies whether instances of the service can be bound to applications.
    * Required.
    */
  var bindable: js.UndefOr[Boolean] = js.native
  /**
    * Whether the service provides an endpoint to get service bindings.
    */
  var binding_retrievable: js.UndefOr[Boolean] = js.native
  /**
    * Information to activate Dashboard SSO feature.
    */
  var dashboard_client: js.UndefOr[SchemaGoogleCloudServicebrokerV1alpha1DashboardClient] = js.native
  /**
    * Textual description of the service. Required.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ID is a globally unique identifier used to uniquely identify the service.
    * ID is an opaque string.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether the service provides an endpoint to get service instances.
    */
  var instance_retrievable: js.UndefOr[Boolean] = js.native
  /**
    * A list of metadata for a service offering. Metadata is an arbitrary JSON
    * object.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * User friendly service name. Name must match [a-z0-9]+ regexp. The name
    * must be globally unique within GCP project. Note, which is different from
    * (&quot;This must be globally unique within a platform marketplace&quot;).
    * Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the service supports upgrade/downgrade for some plans.
    */
  var plan_updateable: js.UndefOr[Boolean] = js.native
  /**
    * A list of plans for this service. At least one plan is required.
    */
  var plans: js.UndefOr[js.Array[SchemaGoogleCloudServicebrokerV1alpha1Plan]] = js.native
  /**
    * Tags provide a flexible mechanism to expose a classification, attribute,
    * or base technology of a service.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1Service {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1Service]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1ServiceOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindable")(js.undefined)
        ret
    }
    @scala.inline
    def withBinding_retrievable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding_retrievable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinding_retrievable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding_retrievable")(js.undefined)
        ret
    }
    @scala.inline
    def withDashboard_client(value: SchemaGoogleCloudServicebrokerV1alpha1DashboardClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboard_client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashboard_client: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboard_client")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance_retrievable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_retrievable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance_retrievable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_retrievable")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan_updateable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_updateable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan_updateable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_updateable")(js.undefined)
        ret
    }
    @scala.inline
    def withPlans(value: js.Array[SchemaGoogleCloudServicebrokerV1alpha1Plan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

