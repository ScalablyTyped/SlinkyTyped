package typingsSlinky.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GalleryReference extends StObject {
  
  /** The name of the host for the community gallery template. */
  var host: js.UndefOr[String] = js.native
  
  /** If a user has manually edited the community gallery template. */
  var isModified: js.UndefOr[Boolean] = js.native
  
  /** The name of the owner for the community gallery template. */
  var owner: js.UndefOr[String] = js.native
  
  /** The name of the repository for the community gallery template. */
  var repository: js.UndefOr[String] = js.native
  
  /** The signature of the community gallery template as computed at import time. This value is recomputed whenever the template is updated from the gallery. */
  var signature: js.UndefOr[String] = js.native
  
  /** The version of the community gallery template. */
  var version: js.UndefOr[String] = js.native
}
object GalleryReference {
  
  @scala.inline
  def apply(): GalleryReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GalleryReference]
  }
  
  @scala.inline
  implicit class GalleryReferenceMutableBuilder[Self <: GalleryReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
