package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResource extends js.Object {
  /**
    * The Access Control Policy set on this resource.
    */
  var accessControl: js.UndefOr[SchemaResourceAccessControl] = js.native
  /**
    * Output only. The evaluated properties of the resource with references
    * expanded. Returned as serialized YAML.
    */
  var finalProperties: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Output only. The last used credential that successfully created/updated
    * the resource.
    */
  var lastUsedCredential: js.UndefOr[SchemaCredential] = js.native
  /**
    * Output only. URL of the manifest representing the current configuration
    * of this resource.
    */
  var manifest: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the resource as it appears in the YAML config.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The current properties of the resource before any references
    * have been filled in. Returned as serialized YAML.
    */
  var properties: js.UndefOr[String] = js.native
  /**
    * Output only. In case this is an action, it will show the runtimePolicies
    * on which this action will run in the deployment
    */
  var runtimePolicies: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The type of the resource, for example compute.v1.instance,
    * or cloudfunctions.v1beta1.function.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Output only. If Deployment Manager is currently updating or previewing an
    * update to this resource, the updated configuration appears here.
    */
  var update: js.UndefOr[SchemaResourceUpdate] = js.native
  /**
    * Output only. Update timestamp in RFC3339 text format.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. The URL of the actual resource.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Output only. If warning messages are generated during processing of this
    * resource, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object SchemaResource {
  @scala.inline
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  @scala.inline
  implicit class SchemaResourceOps[Self <: SchemaResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControl(value: SchemaResourceAccessControl): Self = {
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
    def withLastUsedCredential(value: SchemaCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUsedCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUsedCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUsedCredential")(js.undefined)
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
    def withRuntimePolicies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimePolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimePolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimePolicies")(js.undefined)
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
    def withUpdate(value: SchemaResourceUpdate): Self = {
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
    def withWarnings(value: js.Array[AnonCode]): Self = {
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

