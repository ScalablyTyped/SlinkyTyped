package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchedDeveloperMetadata extends StObject {
  
  /** All filters matching the returned developer metadata. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  
  /** The developer metadata matching the specified filters. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
}
object MatchedDeveloperMetadata {
  
  @scala.inline
  def apply(): MatchedDeveloperMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedDeveloperMetadata]
  }
  
  @scala.inline
  implicit class MatchedDeveloperMetadataMutableBuilder[Self <: MatchedDeveloperMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
  }
}
