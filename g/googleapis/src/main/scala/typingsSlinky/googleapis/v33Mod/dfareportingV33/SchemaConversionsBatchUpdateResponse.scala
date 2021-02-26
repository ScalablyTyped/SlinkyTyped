package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Update Conversions Response.
  */
@js.native
trait SchemaConversionsBatchUpdateResponse extends StObject {
  
  /**
    * Indicates that some or all conversions failed to update.
    */
  var hasFailures: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchUpdateResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The update status of each conversion. Statuses are returned in the same
    * order that conversions are updated.
    */
  var status: js.UndefOr[js.Array[SchemaConversionStatus]] = js.native
}
object SchemaConversionsBatchUpdateResponse {
  
  @scala.inline
  def apply(): SchemaConversionsBatchUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchUpdateResponse]
  }
  
  @scala.inline
  implicit class SchemaConversionsBatchUpdateResponseMutableBuilder[Self <: SchemaConversionsBatchUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasFailures(value: Boolean): Self = StObject.set(x, "hasFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFailuresUndefined: Self = StObject.set(x, "hasFailures", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStatus(value: js.Array[SchemaConversionStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: SchemaConversionStatus*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
