package typingsSlinky.ejWebAll.anon

import typingsSlinky.ejWebAll.ej.RadialSlider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRadialSlider extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: RadialSlider = js.native
}
object TypeofRadialSlider {
  
  @scala.inline
  def apply(Locale: js.Any, fn: RadialSlider): TypeofRadialSlider = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRadialSlider]
  }
  
  @scala.inline
  implicit class TypeofRadialSliderMutableBuilder[Self <: TypeofRadialSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: RadialSlider): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
