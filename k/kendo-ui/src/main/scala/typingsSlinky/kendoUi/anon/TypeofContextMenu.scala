package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.ContextMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofContextMenu extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ContextMenu = js.native
  
  /* static member */
  var fn: ContextMenu = js.native
}
object TypeofContextMenu {
  
  @scala.inline
  def apply(extend: js.Object => ContextMenu, fn: ContextMenu): TypeofContextMenu = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofContextMenu]
  }
  
  @scala.inline
  implicit class TypeofContextMenuMutableBuilder[Self <: TypeofContextMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ContextMenu): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ContextMenu): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
