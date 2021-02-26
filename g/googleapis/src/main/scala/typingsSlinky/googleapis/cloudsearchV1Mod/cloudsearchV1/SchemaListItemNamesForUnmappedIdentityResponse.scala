package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaListItemNamesForUnmappedIdentityResponse extends StObject {
  
  var itemNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListItemNamesForUnmappedIdentityResponse {
  
  @scala.inline
  def apply(): SchemaListItemNamesForUnmappedIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListItemNamesForUnmappedIdentityResponse]
  }
  
  @scala.inline
  implicit class SchemaListItemNamesForUnmappedIdentityResponseMutableBuilder[Self <: SchemaListItemNamesForUnmappedIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemNames(value: js.Array[String]): Self = StObject.set(x, "itemNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemNamesUndefined: Self = StObject.set(x, "itemNames", js.undefined)
    
    @scala.inline
    def setItemNamesVarargs(value: String*): Self = StObject.set(x, "itemNames", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
