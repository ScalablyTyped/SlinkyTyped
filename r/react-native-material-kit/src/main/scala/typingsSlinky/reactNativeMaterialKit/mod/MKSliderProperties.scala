package typingsSlinky.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MKSliderProperties extends BaseSlider {
  
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onConfirm: js.UndefOr[js.Function0[Unit]] = js.native
}
object MKSliderProperties {
  
  @scala.inline
  def apply(): MKSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKSliderProperties]
  }
  
  @scala.inline
  implicit class MKSliderPropertiesMutableBuilder[Self <: MKSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnConfirm(value: () => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
  }
}
