package typingsSlinky.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsGetArtifactResponseData extends StObject {
  
  var archive_download_url: String = js.native
  
  var created_at: String = js.native
  
  var expired: Boolean = js.native
  
  var expires_at: String = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var node_id: String = js.native
  
  var size_in_bytes: Double = js.native
  
  var url: String = js.native
}
object ActionsGetArtifactResponseData {
  
  @scala.inline
  def apply(
    archive_download_url: String,
    created_at: String,
    expired: Boolean,
    expires_at: String,
    id: Double,
    name: String,
    node_id: String,
    size_in_bytes: Double,
    url: String
  ): ActionsGetArtifactResponseData = {
    val __obj = js.Dynamic.literal(archive_download_url = archive_download_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetArtifactResponseData]
  }
  
  @scala.inline
  implicit class ActionsGetArtifactResponseDataMutableBuilder[Self <: ActionsGetArtifactResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchive_download_url(value: String): Self = StObject.set(x, "archive_download_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_at(value: String): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize_in_bytes(value: Double): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
