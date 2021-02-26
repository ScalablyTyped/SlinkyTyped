package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from creating developer metadata.
  */
@js.native
trait SchemaCreateDeveloperMetadataResponse extends StObject {
  
  /**
    * The developer metadata that was created.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
}
object SchemaCreateDeveloperMetadataResponse {
  
  @scala.inline
  def apply(): SchemaCreateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateDeveloperMetadataResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateDeveloperMetadataResponseMutableBuilder[Self <: SchemaCreateDeveloperMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperMetadata(value: SchemaDeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
