package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadata extends StObject {
  
  /** The location where the metadata is associated. */
  var location: js.UndefOr[DeveloperMetadataLocation] = js.native
  
  /**
    * The spreadsheet-scoped unique ID that identifies the metadata. IDs may be specified when metadata is created, otherwise one will be randomly generated and assigned. Must be
    * positive.
    */
  var metadataId: js.UndefOr[Double] = js.native
  
  /** The metadata key. There may be multiple metadata in a spreadsheet with the same key. Developer metadata must always have a key specified. */
  var metadataKey: js.UndefOr[String] = js.native
  
  /** Data associated with the metadata's key. */
  var metadataValue: js.UndefOr[String] = js.native
  
  /** The metadata visibility. Developer metadata must always have a visibility specified. */
  var visibility: js.UndefOr[String] = js.native
}
object DeveloperMetadata {
  
  @scala.inline
  def apply(): DeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMetadata]
  }
  
  @scala.inline
  implicit class DeveloperMetadataMutableBuilder[Self <: DeveloperMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: DeveloperMetadataLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMetadataId(value: Double): Self = StObject.set(x, "metadataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataIdUndefined: Self = StObject.set(x, "metadataId", js.undefined)
    
    @scala.inline
    def setMetadataKey(value: String): Self = StObject.set(x, "metadataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataKeyUndefined: Self = StObject.set(x, "metadataKey", js.undefined)
    
    @scala.inline
    def setMetadataValue(value: String): Self = StObject.set(x, "metadataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataValueUndefined: Self = StObject.set(x, "metadataValue", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
