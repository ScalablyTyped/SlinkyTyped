package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacKeysMetadata extends StObject {
  
  /** The list of items. */
  var items: js.UndefOr[js.Array[HmacKeyMetadata]] = js.native
  
  /** The kind of item this is. For lists of hmacKeys, this is always storage#hmacKeysMetadata. */
  var kind: js.UndefOr[String] = js.native
  
  /** The continuation token, used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object HmacKeysMetadata {
  
  @scala.inline
  def apply(): HmacKeysMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacKeysMetadata]
  }
  
  @scala.inline
  implicit class HmacKeysMetadataMutableBuilder[Self <: HmacKeysMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[HmacKeyMetadata]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: HmacKeyMetadata*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
