package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a resource associated with this operation.
  */
@js.native
trait SchemaResourceInfo extends js.Object {
  /**
    * The identifier of the parent of this resource instance. Must be in one of
    * the following formats:     - “projects/&lt;project-id or
    * project-number&gt;”     - “folders/&lt;folder-id&gt;”     -
    * “organizations/&lt;organization-id&gt;”
    */
  var resourceContainer: js.UndefOr[String] = js.native
  /**
    * The location of the resource. If not empty, the resource will be checked
    * against location policy. The value must be a valid zone, region or
    * multiregion. For example: &quot;europe-west4&quot; or
    * &quot;northamerica-northeast1-a&quot;
    */
  var resourceLocation: js.UndefOr[String] = js.native
  /**
    * Name of the resource. This is used for auditing purposes.
    */
  var resourceName: js.UndefOr[String] = js.native
}

object SchemaResourceInfo {
  @scala.inline
  def apply(): SchemaResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceInfo]
  }
  @scala.inline
  implicit class SchemaResourceInfoOps[Self <: SchemaResourceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLocation")(js.undefined)
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
  }
  
}

