package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.datavisualization.HeatMapLegend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHeatMapLegend extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: HeatMapLegend = js.native
}
object TypeofHeatMapLegend {
  
  @scala.inline
  def apply(Locale: js.Any, fn: HeatMapLegend): TypeofHeatMapLegend = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofHeatMapLegend]
  }
  
  @scala.inline
  implicit class TypeofHeatMapLegendMutableBuilder[Self <: TypeofHeatMapLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: HeatMapLegend): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
