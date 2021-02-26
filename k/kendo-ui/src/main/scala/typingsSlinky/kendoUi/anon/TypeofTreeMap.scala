package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.dataviz.ui.TreeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTreeMap extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TreeMap = js.native
  
  /* static member */
  var fn: TreeMap = js.native
}
object TypeofTreeMap {
  
  @scala.inline
  def apply(extend: js.Object => TreeMap, fn: TreeMap): TypeofTreeMap = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreeMap]
  }
  
  @scala.inline
  implicit class TypeofTreeMapMutableBuilder[Self <: TypeofTreeMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => TreeMap): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: TreeMap): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
