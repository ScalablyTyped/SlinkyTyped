package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.dataviz.ui.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofChart extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Chart = js.native
  
  /* static member */
  var fn: Chart = js.native
}
object TypeofChart {
  
  @scala.inline
  def apply(extend: js.Object => Chart, fn: Chart): TypeofChart = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofChart]
  }
  
  @scala.inline
  implicit class TypeofChartMutableBuilder[Self <: TypeofChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Chart): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Chart): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
