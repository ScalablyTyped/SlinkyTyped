package typingsSlinky.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiveQueueMessageOptions extends StObject {
  
  var isPeekLock: js.UndefOr[Boolean] = js.native
  
  var timeoutIntervalInS: js.UndefOr[Double] = js.native
}
object ReceiveQueueMessageOptions {
  
  @scala.inline
  def apply(): ReceiveQueueMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiveQueueMessageOptions]
  }
  
  @scala.inline
  implicit class ReceiveQueueMessageOptionsMutableBuilder[Self <: ReceiveQueueMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPeekLock(value: Boolean): Self = StObject.set(x, "isPeekLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPeekLockUndefined: Self = StObject.set(x, "isPeekLock", js.undefined)
    
    @scala.inline
    def setTimeoutIntervalInS(value: Double): Self = StObject.set(x, "timeoutIntervalInS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutIntervalInSUndefined: Self = StObject.set(x, "timeoutIntervalInS", js.undefined)
  }
}
