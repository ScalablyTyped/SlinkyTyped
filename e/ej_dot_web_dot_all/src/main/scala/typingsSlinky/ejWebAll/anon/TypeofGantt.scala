package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.Gantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGantt extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Gantt = js.native
}
object TypeofGantt {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Gantt): TypeofGantt = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGantt]
  }
  
  @scala.inline
  implicit class TypeofGanttMutableBuilder[Self <: TypeofGantt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Gantt): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
