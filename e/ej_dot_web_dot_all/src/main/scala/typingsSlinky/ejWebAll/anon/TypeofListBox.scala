package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.ListBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofListBox extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: ListBox = js.native
}
object TypeofListBox {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ListBox): TypeofListBox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListBox]
  }
  
  @scala.inline
  implicit class TypeofListBoxMutableBuilder[Self <: TypeofListBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ListBox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
