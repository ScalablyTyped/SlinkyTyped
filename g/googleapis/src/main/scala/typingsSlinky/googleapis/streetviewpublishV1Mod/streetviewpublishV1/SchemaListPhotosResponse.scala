package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to list all photos that belong to a user.
  */
@js.native
trait SchemaListPhotosResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * List of photos. The pageSize field in the request determines the number
    * of items returned.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
}
object SchemaListPhotosResponse {
  
  @scala.inline
  def apply(): SchemaListPhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPhotosResponse]
  }
  
  @scala.inline
  implicit class SchemaListPhotosResponseMutableBuilder[Self <: SchemaListPhotosResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPhotos(value: js.Array[SchemaPhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: SchemaPhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
  }
}
