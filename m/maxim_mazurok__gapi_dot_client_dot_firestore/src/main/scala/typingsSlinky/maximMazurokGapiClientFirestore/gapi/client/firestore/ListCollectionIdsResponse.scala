package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCollectionIdsResponse extends StObject {
  
  /** The collection ids. */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** A page token that may be used to continue the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCollectionIdsResponse {
  
  @scala.inline
  def apply(): ListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionIdsResponse]
  }
  
  @scala.inline
  implicit class ListCollectionIdsResponseMutableBuilder[Self <: ListCollectionIdsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = StObject.set(x, "collectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdsUndefined: Self = StObject.set(x, "collectionIds", js.undefined)
    
    @scala.inline
    def setCollectionIdsVarargs(value: String*): Self = StObject.set(x, "collectionIds", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
