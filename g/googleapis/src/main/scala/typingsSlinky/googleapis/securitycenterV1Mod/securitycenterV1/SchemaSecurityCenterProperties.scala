package typingsSlinky.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud SCC managed properties. These properties are managed by Cloud SCC and
  * cannot be modified by the user.
  */
@js.native
trait SchemaSecurityCenterProperties extends js.Object {
  /**
    * The full resource name of the GCP resource this asset represents. This
    * field is immutable after create time. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * Owners of the Google Cloud resource.
    */
  var resourceOwners: js.UndefOr[js.Array[String]] = js.native
  /**
    * The full resource name of the immediate parent of the resource. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceParent: js.UndefOr[String] = js.native
  /**
    * The full resource name of the project the resource belongs to. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceProject: js.UndefOr[String] = js.native
  /**
    * The type of the GCP resource. Examples include: APPLICATION, PROJECT, and
    * ORGANIZATION. This is a case insensitive field defined by Cloud SCC
    * and/or the producer of the resource and is immutable after create time.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object SchemaSecurityCenterProperties {
  @scala.inline
  def apply(): SchemaSecurityCenterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityCenterProperties]
  }
  @scala.inline
  implicit class SchemaSecurityCenterPropertiesOps[Self <: SchemaSecurityCenterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withResourceOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOwners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOwners")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceParent")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceProject")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
  }
  
}

