package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.Gantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGantt extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Gantt = js.native
  
  /* static member */
  var fn: Gantt = js.native
}
object TypeofGantt {
  
  @scala.inline
  def apply(extend: js.Object => Gantt, fn: Gantt): TypeofGantt = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGantt]
  }
  
  @scala.inline
  implicit class TypeofGanttMutableBuilder[Self <: TypeofGantt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Gantt): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Gantt): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
