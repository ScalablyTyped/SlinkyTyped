package typingsSlinky.kendoUi.anon

import typingsSlinky.kendoUi.kendo.ui.Wizard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWizard extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Wizard = js.native
  
  /* static member */
  var fn: Wizard = js.native
}
object TypeofWizard {
  
  @scala.inline
  def apply(extend: js.Object => Wizard, fn: Wizard): TypeofWizard = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWizard]
  }
  
  @scala.inline
  implicit class TypeofWizardMutableBuilder[Self <: TypeofWizard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Wizard): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Wizard): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
