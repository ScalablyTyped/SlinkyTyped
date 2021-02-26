package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.Dialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDialog extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Dialog = js.native
}
object TypeofDialog {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Dialog): TypeofDialog = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDialog]
  }
  
  @scala.inline
  implicit class TypeofDialogMutableBuilder[Self <: TypeofDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Dialog): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
