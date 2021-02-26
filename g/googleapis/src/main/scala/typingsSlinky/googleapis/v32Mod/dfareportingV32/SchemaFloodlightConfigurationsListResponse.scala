package typingsSlinky.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Floodlight Configuration List Response
  */
@js.native
trait SchemaFloodlightConfigurationsListResponse extends StObject {
  
  /**
    * Floodlight configuration collection.
    */
  var floodlightConfigurations: js.UndefOr[js.Array[SchemaFloodlightConfiguration]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightConfigurationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaFloodlightConfigurationsListResponse {
  
  @scala.inline
  def apply(): SchemaFloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightConfigurationsListResponse]
  }
  
  @scala.inline
  implicit class SchemaFloodlightConfigurationsListResponseMutableBuilder[Self <: SchemaFloodlightConfigurationsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightConfigurations(value: js.Array[SchemaFloodlightConfiguration]): Self = StObject.set(x, "floodlightConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigurationsUndefined: Self = StObject.set(x, "floodlightConfigurations", js.undefined)
    
    @scala.inline
    def setFloodlightConfigurationsVarargs(value: SchemaFloodlightConfiguration*): Self = StObject.set(x, "floodlightConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
