package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter on a specific property.
  */
@js.native
trait SchemaPropertyFilter extends StObject {
  
  /**
    * The operator to filter by.
    */
  var op: js.UndefOr[String] = js.native
  
  /**
    * The property to filter by.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.native
  
  /**
    * The value to compare the property to.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}
object SchemaPropertyFilter {
  
  @scala.inline
  def apply(): SchemaPropertyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyFilter]
  }
  
  @scala.inline
  implicit class SchemaPropertyFilterMutableBuilder[Self <: SchemaPropertyFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaPropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setValue(value: SchemaValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
