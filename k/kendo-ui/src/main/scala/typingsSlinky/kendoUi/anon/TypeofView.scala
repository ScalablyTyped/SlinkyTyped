package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.mobile.ui.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): View = js.native
  
  /* static member */
  var fn: View = js.native
}
object TypeofView {
  
  @scala.inline
  def apply(extend: js.Object => View, fn: View): TypeofView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofView]
  }
  
  @scala.inline
  implicit class TypeofViewMutableBuilder[Self <: TypeofView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => View): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: View): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
