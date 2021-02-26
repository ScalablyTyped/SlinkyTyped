package typingsSlinky.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message from a request to startImport. This is returned in the
  * response field of the Operation.
  */
@js.native
trait SchemaStartAssetImportResponse extends StObject {
  
  /**
    * The id of newly created asset. If this is empty when the operation is
    * complete it means the import failed. Please refer to the
    * assetImportMessages field to understand what went wrong.
    */
  var assetId: js.UndefOr[String] = js.native
  
  /**
    * The id of the asset import.
    */
  var assetImportId: js.UndefOr[String] = js.native
  
  /**
    * The message from the asset import. This will contain any warnings (or -
    * in the case of failure - errors) that occurred during import.
    */
  var assetImportMessages: js.UndefOr[js.Array[SchemaAssetImportMessage]] = js.native
  
  /**
    * The publish URL for the asset.
    */
  var publishUrl: js.UndefOr[String] = js.native
}
object SchemaStartAssetImportResponse {
  
  @scala.inline
  def apply(): SchemaStartAssetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartAssetImportResponse]
  }
  
  @scala.inline
  implicit class SchemaStartAssetImportResponseMutableBuilder[Self <: SchemaStartAssetImportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: String): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    @scala.inline
    def setAssetImportId(value: String): Self = StObject.set(x, "assetImportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetImportIdUndefined: Self = StObject.set(x, "assetImportId", js.undefined)
    
    @scala.inline
    def setAssetImportMessages(value: js.Array[SchemaAssetImportMessage]): Self = StObject.set(x, "assetImportMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetImportMessagesUndefined: Self = StObject.set(x, "assetImportMessages", js.undefined)
    
    @scala.inline
    def setAssetImportMessagesVarargs(value: SchemaAssetImportMessage*): Self = StObject.set(x, "assetImportMessages", js.Array(value :_*))
    
    @scala.inline
    def setPublishUrl(value: String): Self = StObject.set(x, "publishUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishUrlUndefined: Self = StObject.set(x, "publishUrl", js.undefined)
  }
}
