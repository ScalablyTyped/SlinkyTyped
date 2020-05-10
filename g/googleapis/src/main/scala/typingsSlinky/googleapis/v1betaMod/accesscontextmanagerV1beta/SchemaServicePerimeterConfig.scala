package typingsSlinky.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `ServicePerimeterConfig` specifies a set of GCP resources that describe
  * specific Service Perimeter configuration.
  */
@js.native
trait SchemaServicePerimeterConfig extends js.Object {
  /**
    * A list of `AccessLevel` resource names that allow resources within the
    * `ServicePerimeter` to be accessed from the internet. `AccessLevels`
    * listed must be in the same policy as this `ServicePerimeter`. Referencing
    * a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names
    * are listed, resources within the perimeter can only be accessed via GCP
    * calls with request origins within the perimeter. Example:
    * `&quot;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&quot;`. For Service
    * Perimeter Bridge, must be empty.
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of GCP resources that are inside of the service perimeter.
    * Currently only projects are allowed. Format: `projects/{project_number}`
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /**
    * GCP services that are subject to the Service Perimeter restrictions. Must
    * contain a list of services. For example, if `storage.googleapis.com` is
    * specified, access to the storage buckets inside the perimeter must meet
    * the perimeter&#39;s access restrictions.
    */
  var restrictedServices: js.UndefOr[js.Array[String]] = js.native
  /**
    * GCP services that are not subject to the Service Perimeter restrictions.
    * Deprecated. Must be set to a single wildcard &quot;*&quot;.  The wildcard
    * means that unless explicitly specified by &quot;restricted_services&quot;
    * list, any service is treated as unrestricted.
    */
  var unrestrictedServices: js.UndefOr[js.Array[String]] = js.native
}

object SchemaServicePerimeterConfig {
  @scala.inline
  def apply(): SchemaServicePerimeterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServicePerimeterConfig]
  }
  @scala.inline
  implicit class SchemaServicePerimeterConfigOps[Self <: SchemaServicePerimeterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLevels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictedServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictedServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedServices")(js.undefined)
        ret
    }
    @scala.inline
    def withUnrestrictedServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unrestrictedServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnrestrictedServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unrestrictedServices")(js.undefined)
        ret
    }
  }
  
}

