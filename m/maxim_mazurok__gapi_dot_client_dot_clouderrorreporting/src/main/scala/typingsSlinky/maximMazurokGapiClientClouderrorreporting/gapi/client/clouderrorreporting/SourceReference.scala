package typingsSlinky.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceReference extends StObject {
  
  /** Optional. A URI string identifying the repository. Example: "https://github.com/GoogleCloudPlatform/kubernetes.git" */
  var repository: js.UndefOr[String] = js.native
  
  /** The canonical and persistent identifier of the deployed revision. Example (git): "0035781c50ec7aa23385dc841529ce8a4b70db1b" */
  var revisionId: js.UndefOr[String] = js.native
}
object SourceReference {
  
  @scala.inline
  def apply(): SourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceReference]
  }
  
  @scala.inline
  implicit class SourceReferenceMutableBuilder[Self <: SourceReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
