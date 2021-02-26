package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Artifact extends StObject {
  
  /** Container image path set for flex Template. */
  var containerSpec: js.UndefOr[ContainerSpec] = js.native
  
  /** job_graph_gcs_path set for legacy Template. */
  var jobGraphGcsPath: js.UndefOr[String] = js.native
  
  /** Metadata set for legacy Template. */
  var metadata: js.UndefOr[TemplateMetadata] = js.native
}
object Artifact {
  
  @scala.inline
  def apply(): Artifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Artifact]
  }
  
  @scala.inline
  implicit class ArtifactMutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerSpec(value: ContainerSpec): Self = StObject.set(x, "containerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerSpecUndefined: Self = StObject.set(x, "containerSpec", js.undefined)
    
    @scala.inline
    def setJobGraphGcsPath(value: String): Self = StObject.set(x, "jobGraphGcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobGraphGcsPathUndefined: Self = StObject.set(x, "jobGraphGcsPath", js.undefined)
    
    @scala.inline
    def setMetadata(value: TemplateMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
