package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.RecurrenceEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRecurrenceEditor extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: RecurrenceEditor = js.native
}
object TypeofRecurrenceEditor {
  
  @scala.inline
  def apply(Locale: js.Any, fn: RecurrenceEditor): TypeofRecurrenceEditor = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRecurrenceEditor]
  }
  
  @scala.inline
  implicit class TypeofRecurrenceEditorMutableBuilder[Self <: TypeofRecurrenceEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: RecurrenceEditor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
