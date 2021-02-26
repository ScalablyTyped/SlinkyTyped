package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for SessionEntityTypes.ListSessionEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of session entity types. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType]] = js.native
}
object SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSessionEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    @scala.inline
    def setSessionEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
  }
}
