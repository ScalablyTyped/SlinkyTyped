package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to delete developer metadata.
  */
@js.native
trait SchemaDeleteDeveloperMetadataRequest extends StObject {
  
  /**
    * The data filter describing the criteria used to select which developer
    * metadata entry to delete.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
}
object SchemaDeleteDeveloperMetadataRequest {
  
  @scala.inline
  def apply(): SchemaDeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDeveloperMetadataRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteDeveloperMetadataRequestMutableBuilder[Self <: SchemaDeleteDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilter(value: SchemaDataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
  }
}
