package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.MaskEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMaskEdit extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: MaskEdit = js.native
}
object TypeofMaskEdit {
  
  @scala.inline
  def apply(Locale: js.Any, fn: MaskEdit): TypeofMaskEdit = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMaskEdit]
  }
  
  @scala.inline
  implicit class TypeofMaskEditMutableBuilder[Self <: TypeofMaskEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: MaskEdit): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
