package typingsSlinky.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentUpdate extends js.Object {
  
  /** Output only. An optional user-provided description of the deployment after the current update has been applied. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the
    * following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression
    * `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
    */
  var labels: js.UndefOr[js.Array[DeploymentUpdateLabelEntry]] = js.native
  
  /** Output only. URL of the manifest representing the update configuration of this deployment. */
  var manifest: js.UndefOr[String] = js.native
}
object DeploymentUpdate {
  
  @scala.inline
  def apply(): DeploymentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentUpdate]
  }
  
  @scala.inline
  implicit class DeploymentUpdateOps[Self <: DeploymentUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: DeploymentUpdateLabelEntry*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[DeploymentUpdateLabelEntry]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
  }
}
