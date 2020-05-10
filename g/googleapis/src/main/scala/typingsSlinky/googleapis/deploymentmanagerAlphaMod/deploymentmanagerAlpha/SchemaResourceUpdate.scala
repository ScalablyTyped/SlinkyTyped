package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typingsSlinky.googleapis.AnonCode
import typingsSlinky.googleapis.AnonErrorsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaResourceUpdate extends js.Object {
  /**
    * The Access Control Policy to set on this resource after updating the
    * resource itself.
    */
  var accessControl: js.UndefOr[SchemaResourceAccessControl] = js.native
  /**
    * Output only. The credential that will be used creating/updating this
    * resource.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  /**
    * Output only. If errors are generated during update of the resource, this
    * field will be populated.
    */
  var error: js.UndefOr[AnonErrorsArray] = js.native
  /**
    * Output only. The expanded properties of the resource with reference
    * values expanded. Returned as serialized YAML.
    */
  var finalProperties: js.UndefOr[String] = js.native
  /**
    * Output only. The intent of the resource: PREVIEW, UPDATE, or CANCEL.
    */
  var intent: js.UndefOr[String] = js.native
  /**
    * Output only. URL of the manifest representing the update configuration of
    * this resource.
    */
  var manifest: js.UndefOr[String] = js.native
  /**
    * Output only. The set of updated properties for this resource, before
    * references are expanded. Returned as serialized YAML.
    */
  var properties: js.UndefOr[String] = js.native
  /**
    * Output only. In case this is an action, it will show the runtimePolicies
    * that this action will have after updating the deployment.
    */
  var runtimePolicies: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The state of the resource.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. If warning messages are generated during processing of this
    * resource, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object SchemaResourceUpdate {
  @scala.inline
  def apply(): SchemaResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUpdate]
  }
  @scala.inline
  implicit class SchemaResourceUpdateOps[Self <: SchemaResourceUpdate] (val x: Self) extends AnyVal {
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
    def withCredential(value: SchemaCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: AnonErrorsArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
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
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
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
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

