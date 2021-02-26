package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.ListBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofListBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ListBox = js.native
  
  /* static member */
  var fn: ListBox = js.native
}
object TypeofListBox {
  
  @scala.inline
  def apply(extend: js.Object => ListBox, fn: ListBox): TypeofListBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListBox]
  }
  
  @scala.inline
  implicit class TypeofListBoxMutableBuilder[Self <: TypeofListBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ListBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ListBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
