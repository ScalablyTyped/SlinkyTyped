package typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeploymentUpdate extends js.Object {
  /**
    * Output only. An optional user-provided description of the deployment
    * after the current update has been applied.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. Map of labels; provided by the client when the resource is
    * created or updated. Specifically: Label keys must be between 1 and 63
    * characters long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[SchemaDeploymentUpdateLabelEntry]] = js.native
  /**
    * Output only. URL of the manifest representing the update configuration of
    * this deployment.
    */
  var manifest: js.UndefOr[String] = js.native
}

object SchemaDeploymentUpdate {
  @scala.inline
  def apply(): SchemaDeploymentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentUpdate]
  }
  @scala.inline
  implicit class SchemaDeploymentUpdateOps[Self <: SchemaDeploymentUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLabels(value: js.Array[SchemaDeploymentUpdateLabelEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
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
  }
  
}

