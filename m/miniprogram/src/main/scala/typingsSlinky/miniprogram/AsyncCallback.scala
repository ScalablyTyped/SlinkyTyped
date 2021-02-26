package typingsSlinky.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncCallback[T] extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.native
}
object AsyncCallback {
  
  @scala.inline
  def apply[T](): AsyncCallback[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncCallback[T]]
  }
  
  @scala.inline
  implicit class AsyncCallbackMutableBuilder[Self <: AsyncCallback[_], T] (val x: Self with AsyncCallback[T]) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ T => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
