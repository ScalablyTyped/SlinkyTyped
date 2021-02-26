package typingsSlinky.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to import resources. The FHIR resources to be imported must have
  * client supplied IDs. The server will retain the resource IDs. The import
  * operation is idempotent. Retry will overwrite existing data identified by
  * client supplied IDs. The import operation is not transactional. The server
  * will not roll back any committed changes upon partial failures.
  */
@js.native
trait SchemaImportResourcesRequest extends StObject {
  
  /**
    * The content structure in the source location. The default is BUNDLE.
    */
  var contentStructure: js.UndefOr[String] = js.native
  
  /**
    * The Cloud Storage bucket/folder path to write files that contain error
    * details.
    */
  var gcsErrorLocation: js.UndefOr[SchemaGcsDataLocation] = js.native
  
  /**
    * Cloud Storage source data locations. Each Cloud Storage object should be
    * a text file that contains newline delimited JSON structures conforming to
    * FHIR standard.
    */
  var gcsSourceLocation: js.UndefOr[SchemaGcsDataLocation] = js.native
}
object SchemaImportResourcesRequest {
  
  @scala.inline
  def apply(): SchemaImportResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportResourcesRequest]
  }
  
  @scala.inline
  implicit class SchemaImportResourcesRequestMutableBuilder[Self <: SchemaImportResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentStructure(value: String): Self = StObject.set(x, "contentStructure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStructureUndefined: Self = StObject.set(x, "contentStructure", js.undefined)
    
    @scala.inline
    def setGcsErrorLocation(value: SchemaGcsDataLocation): Self = StObject.set(x, "gcsErrorLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsErrorLocationUndefined: Self = StObject.set(x, "gcsErrorLocation", js.undefined)
    
    @scala.inline
    def setGcsSourceLocation(value: SchemaGcsDataLocation): Self = StObject.set(x, "gcsSourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceLocationUndefined: Self = StObject.set(x, "gcsSourceLocation", js.undefined)
  }
}
