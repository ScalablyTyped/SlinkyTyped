package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site List Response
  */
@js.native
trait SchemaDirectorySitesListResponse extends StObject {
  
  /**
    * Directory site collection.
    */
  var directorySites: js.UndefOr[js.Array[SchemaDirectorySite]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaDirectorySitesListResponse {
  
  @scala.inline
  def apply(): SchemaDirectorySitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySitesListResponse]
  }
  
  @scala.inline
  implicit class SchemaDirectorySitesListResponseMutableBuilder[Self <: SchemaDirectorySitesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectorySites(value: js.Array[SchemaDirectorySite]): Self = StObject.set(x, "directorySites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectorySitesUndefined: Self = StObject.set(x, "directorySites", js.undefined)
    
    @scala.inline
    def setDirectorySitesVarargs(value: SchemaDirectorySite*): Self = StObject.set(x, "directorySites", js.Array(value :_*))
    
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
