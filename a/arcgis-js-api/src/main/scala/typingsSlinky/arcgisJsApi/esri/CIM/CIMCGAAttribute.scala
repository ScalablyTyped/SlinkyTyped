package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMCGAAttribute extends StObject {
  
  /**
    * The CGA attribute type.
    */
  var CGAAttributeType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CGAAttributeType * / any */ String
  ] = js.native
  
  /**
    * The name.
    */
  var name: js.UndefOr[String] = js.native
  
  var `type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute = js.native
  
  /**
    * The value.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object CIMCGAAttribute {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute): CIMCGAAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMCGAAttribute]
  }
  
  @scala.inline
  implicit class CIMCGAAttributeMutableBuilder[Self <: CIMCGAAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCGAAttributeType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CGAAttributeType * / any */ String
    ): Self = StObject.set(x, "CGAAttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCGAAttributeTypeUndefined: Self = StObject.set(x, "CGAAttributeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMCGAAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
