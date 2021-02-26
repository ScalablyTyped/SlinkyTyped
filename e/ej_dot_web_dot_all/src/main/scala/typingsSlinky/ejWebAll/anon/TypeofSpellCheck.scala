package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.SpellCheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSpellCheck extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: SpellCheck = js.native
}
object TypeofSpellCheck {
  
  @scala.inline
  def apply(Locale: js.Any, fn: SpellCheck): TypeofSpellCheck = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSpellCheck]
  }
  
  @scala.inline
  implicit class TypeofSpellCheckMutableBuilder[Self <: TypeofSpellCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: SpellCheck): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
