package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.dataviz.ui.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMap extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Map = js.native
  
  /* static member */
  var fn: Map = js.native
}
object TypeofMap {
  
  @scala.inline
  def apply(extend: js.Object => Map, fn: Map): TypeofMap = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMap]
  }
  
  @scala.inline
  implicit class TypeofMapMutableBuilder[Self <: TypeofMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Map): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Map): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
