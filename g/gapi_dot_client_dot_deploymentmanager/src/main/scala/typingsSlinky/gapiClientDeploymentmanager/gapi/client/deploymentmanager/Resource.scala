package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsSlinky.gapiClientDeploymentmanager.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /** The Access Control Policy set on this resource. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.native
  /** Output only. The evaluated properties of the resource with references expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[String] = js.native
  /** Output only. Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** Output only. Timestamp when the resource was created or acquired, in RFC3339 text format . */
  var insertTime: js.UndefOr[String] = js.native
  /** Output only. URL of the manifest representing the current configuration of this resource. */
  var manifest: js.UndefOr[String] = js.native
  /** Output only. The name of the resource as it appears in the YAML config. */
  var name: js.UndefOr[String] = js.native
  /** Output only. The current properties of the resource before any references have been filled in. Returned as serialized YAML. */
  var properties: js.UndefOr[String] = js.native
  /** Output only. The type of the resource, for example compute.v1.instance, or cloudfunctions.v1beta1.function. */
  var `type`: js.UndefOr[String] = js.native
  /** Output only. If Deployment Manager is currently updating or previewing an update to this resource, the updated configuration appears here. */
  var update: js.UndefOr[ResourceUpdate] = js.native
  /** Output only. Timestamp when the resource was updated, in RFC3339 text format . */
  var updateTime: js.UndefOr[String] = js.native
  /** Output only. The URL of the actual resource. */
  var url: js.UndefOr[String] = js.native
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[Data]] = js.native
}

object Resource {
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControl(value: ResourceAccessControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessControl")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalProperties")(js.undefined)
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
    def withInsertTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertTime")(js.undefined)
        ret
    }
    @scala.inline
    def withManifest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(js.undefined)
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
    def withProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: ResourceUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[Data]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

