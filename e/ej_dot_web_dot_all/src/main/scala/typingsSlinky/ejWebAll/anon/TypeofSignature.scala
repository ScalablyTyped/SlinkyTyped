package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSignature extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Signature = js.native
}
object TypeofSignature {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Signature): TypeofSignature = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSignature]
  }
  
  @scala.inline
  implicit class TypeofSignatureMutableBuilder[Self <: TypeofSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Signature): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
