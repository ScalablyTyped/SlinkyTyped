package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectData<Custom> */
/* Inlined parent pubnub.pubnub.Nullable<pubnub.pubnub.UUIDMetadataFields> */
@js.native
trait UUIDMetadataObject[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom | Null] = js.native
  
  var eTag: String = js.native
  
  var email: js.UndefOr[String | Null] = js.native
  
  var externalId: js.UndefOr[String | Null] = js.native
  
  var id: String = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var profileUrl: js.UndefOr[String | Null] = js.native
  
  var updated: String = js.native
}
object UUIDMetadataObject {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](eTag: String, id: String, updated: String): UUIDMetadataObject[Custom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDMetadataObject[Custom]]
  }
  
  @scala.inline
  implicit class UUIDMetadataObjectMutableBuilder[Self <: UUIDMetadataObject[_], Custom /* <: ObjectCustom */] (val x: Self with UUIDMetadataObject[Custom]) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomNull: Self = StObject.set(x, "custom", null)
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUrlNull: Self = StObject.set(x, "profileUrl", null)
    
    @scala.inline
    def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
