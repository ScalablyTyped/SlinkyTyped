package typingsSlinky.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends StObject {
  
  /** Use a container image to start the notebook instance. */
  var containerImage: js.UndefOr[ContainerImage] = js.native
  
  /** Output only. The time at which this environment was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** A brief description of this environment. */
  var description: js.UndefOr[String] = js.native
  
  /** Display name of this environment for the UI. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Name of this environment. Format: `projects/{project_id}/locations/{location}/environments/{environment_id}` */
  var name: js.UndefOr[String] = js.native
  
  /** Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `"gs://path-to-file/file-name"` */
  var postStartupScript: js.UndefOr[String] = js.native
  
  /** Use a Compute Engine VM image to start the notebook instance. */
  var vmImage: js.UndefOr[VmImage] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerImage(value: ContainerImage): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPostStartupScript(value: String): Self = StObject.set(x, "postStartupScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostStartupScriptUndefined: Self = StObject.set(x, "postStartupScript", js.undefined)
    
    @scala.inline
    def setVmImage(value: VmImage): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}
