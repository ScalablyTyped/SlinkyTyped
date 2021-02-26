package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSolidFill
  extends CIMSymbolLayerBase
     with CIMSymbolLayerType {
  
  /**
    * The color that is applied to the fill.
    */
  var color: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMSolidFill: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMSolidFill = js.native
}
object CIMSolidFill {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMSolidFill): CIMSolidFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMSolidFill]
  }
  
  @scala.inline
  implicit class CIMSolidFillMutableBuilder[Self <: CIMSolidFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMSolidFill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
