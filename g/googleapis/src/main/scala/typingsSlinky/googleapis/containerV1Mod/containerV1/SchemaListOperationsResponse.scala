package typingsSlinky.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListOperationsResponse is the result of ListOperationsRequest.
  */
@js.native
trait SchemaListOperationsResponse extends StObject {
  
  /**
    * If any zones are listed here, the list of operations returned may be
    * missing the operations from those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of operations in the project in the specified zone.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
}
object SchemaListOperationsResponse {
  
  @scala.inline
  def apply(): SchemaListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListOperationsResponse]
  }
  
  @scala.inline
  implicit class SchemaListOperationsResponseMutableBuilder[Self <: SchemaListOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissingZones(value: js.Array[String]): Self = StObject.set(x, "missingZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingZonesUndefined: Self = StObject.set(x, "missingZones", js.undefined)
    
    @scala.inline
    def setMissingZonesVarargs(value: String*): Self = StObject.set(x, "missingZones", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
