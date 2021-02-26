package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.mobile.ui.NavBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNavBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): NavBar = js.native
  
  /* static member */
  var fn: NavBar = js.native
}
object TypeofNavBar {
  
  @scala.inline
  def apply(extend: js.Object => NavBar, fn: NavBar): TypeofNavBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNavBar]
  }
  
  @scala.inline
  implicit class TypeofNavBarMutableBuilder[Self <: TypeofNavBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => NavBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: NavBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
