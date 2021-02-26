package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MCloseBluetoothAdapterOptions(res: js.Any): Unit = js.native
}
object CloseBluetoothAdapterOptions {
  
  @scala.inline
  def apply(success: js.Any => Unit): CloseBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseBluetoothAdapterOptions]
  }
  
  @scala.inline
  implicit class CloseBluetoothAdapterOptionsMutableBuilder[Self <: CloseBluetoothAdapterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
