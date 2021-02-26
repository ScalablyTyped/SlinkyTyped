package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.mobile.ui.Collapsible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCollapsible extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Collapsible = js.native
  
  /* static member */
  var fn: Collapsible = js.native
}
object TypeofCollapsible {
  
  @scala.inline
  def apply(extend: js.Object => Collapsible, fn: Collapsible): TypeofCollapsible = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCollapsible]
  }
  
  @scala.inline
  implicit class TypeofCollapsibleMutableBuilder[Self <: TypeofCollapsible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Collapsible): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Collapsible): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
