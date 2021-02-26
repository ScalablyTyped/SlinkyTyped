package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.AutoComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAutoComplete extends StObject {
  
  /* static member */
  def extend(proto: js.Object): AutoComplete = js.native
  
  /* static member */
  var fn: AutoComplete = js.native
}
object TypeofAutoComplete {
  
  @scala.inline
  def apply(extend: js.Object => AutoComplete, fn: AutoComplete): TypeofAutoComplete = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAutoComplete]
  }
  
  @scala.inline
  implicit class TypeofAutoCompleteMutableBuilder[Self <: TypeofAutoComplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => AutoComplete): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: AutoComplete): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
