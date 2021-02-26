package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.DeviceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnBLECharacteristicValueChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_OnBLECharacteristicValueChangeOptions: js.UndefOr[js.Function1[/* res */ DeviceId, Unit]] = js.native
}
object OnBLECharacteristicValueChangeOptions {
  
  @scala.inline
  def apply(): OnBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLECharacteristicValueChangeOptions]
  }
  
  @scala.inline
  implicit class OnBLECharacteristicValueChangeOptionsMutableBuilder[Self <: OnBLECharacteristicValueChangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ DeviceId => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
