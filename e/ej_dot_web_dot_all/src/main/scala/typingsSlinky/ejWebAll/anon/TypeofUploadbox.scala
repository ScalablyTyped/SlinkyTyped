package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.Uploadbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUploadbox extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Uploadbox = js.native
}
object TypeofUploadbox {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Uploadbox): TypeofUploadbox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUploadbox]
  }
  
  @scala.inline
  implicit class TypeofUploadboxMutableBuilder[Self <: TypeofUploadbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Uploadbox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
