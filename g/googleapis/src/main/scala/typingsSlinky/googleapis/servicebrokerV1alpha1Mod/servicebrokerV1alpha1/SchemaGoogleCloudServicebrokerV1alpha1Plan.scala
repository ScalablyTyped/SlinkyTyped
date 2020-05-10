package typingsSlinky.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plan message describes a Service Plan.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1Plan extends js.Object {
  /**
    * Specifies whether instances of the service can be bound to applications.
    * If not specified, `Service.bindable` will be presumed.
    */
  var bindable: js.UndefOr[Boolean] = js.native
  /**
    * Textual description of the plan. Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether the service is free.
    */
  var free: js.UndefOr[Boolean] = js.native
  /**
    * ID is a globally unique identifier used to uniquely identify the plan.
    * User must make no presumption about the format of this field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A list of metadata for a service offering. Metadata is an arbitrary JSON
    * object.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * User friendly name of the plan. The name must be globally unique within
    * GCP project. Note, which is different from (&quot;This must be globally
    * unique within a platform marketplace&quot;).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Schema definitions for service instances and bindings for the plan.
    */
  var schemas: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1Plan {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1Plan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1Plan]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1PlanOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1Plan] (val x: Self) extends AnyVal {
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
    def withFree(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free")(js.undefined)
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
    def withSchemas(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
  }
  
}

