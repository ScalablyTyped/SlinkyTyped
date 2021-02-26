package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTokenPagination extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var previousPageToken: js.UndefOr[String] = js.native
}
object SchemaTokenPagination {
  
  @scala.inline
  def apply(): SchemaTokenPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTokenPagination]
  }
  
  @scala.inline
  implicit class SchemaTokenPaginationMutableBuilder[Self <: SchemaTokenPagination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPreviousPageToken(value: String): Self = StObject.set(x, "previousPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousPageTokenUndefined: Self = StObject.set(x, "previousPageToken", js.undefined)
  }
}
