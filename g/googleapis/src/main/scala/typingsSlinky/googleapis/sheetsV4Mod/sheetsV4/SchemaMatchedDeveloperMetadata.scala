package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A developer metadata entry and the data filters specified in the original
  * request that matched it.
  */
@js.native
trait SchemaMatchedDeveloperMetadata extends StObject {
  
  /**
    * All filters matching the returned developer metadata.
    */
  var dataFilters: js.UndefOr[js.Array[SchemaDataFilter]] = js.native
  
  /**
    * The developer metadata matching the specified filters.
    */
  var developerMetadata: js.UndefOr[SchemaDeveloperMetadata] = js.native
}
object SchemaMatchedDeveloperMetadata {
  
  @scala.inline
  def apply(): SchemaMatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMatchedDeveloperMetadata]
  }
  
  @scala.inline
  implicit class SchemaMatchedDeveloperMetadataMutableBuilder[Self <: SchemaMatchedDeveloperMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[SchemaDataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: SchemaDataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperMetadata(value: SchemaDeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
