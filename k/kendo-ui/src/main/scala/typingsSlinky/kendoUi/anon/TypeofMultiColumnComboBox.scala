package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.MultiColumnComboBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMultiColumnComboBox extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MultiColumnComboBox = js.native
  
  /* static member */
  var fn: MultiColumnComboBox = js.native
}
object TypeofMultiColumnComboBox {
  
  @scala.inline
  def apply(extend: js.Object => MultiColumnComboBox, fn: MultiColumnComboBox): TypeofMultiColumnComboBox = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMultiColumnComboBox]
  }
  
  @scala.inline
  implicit class TypeofMultiColumnComboBoxMutableBuilder[Self <: TypeofMultiColumnComboBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => MultiColumnComboBox): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: MultiColumnComboBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
