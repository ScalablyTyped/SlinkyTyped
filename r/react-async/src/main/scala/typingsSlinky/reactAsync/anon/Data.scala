package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.reactAsyncBooleans.`false`
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.fulfilled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[T] extends StObject {
  
  var data: T = js.native
  
  var error: js.UndefOr[scala.Nothing] = js.native
  
  var finishedAt: js.Date = js.native
  
  var isFulfilled: `true` = js.native
  
  var isInitial: `false` = js.native
  
  var isLoading: `false` = js.native
  
  var isPending: `false` = js.native
  
  var isRejected: `false` = js.native
  
  var isResolved: `true` = js.native
  
  var isSettled: `true` = js.native
  
  var startedAt: js.Date = js.native
  
  var status: fulfilled = js.native
  
  var value: T = js.native
}
object Data {
  
  @scala.inline
  def apply[T](
    data: T,
    finishedAt: js.Date,
    isFulfilled: `true`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `false`,
    isResolved: `true`,
    isSettled: `true`,
    startedAt: js.Date,
    status: fulfilled,
    value: T
  ): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[_], T] (val x: Self with Data[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAt(value: js.Date): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFulfilled(value: `true`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInitial(value: `false`): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPending(value: `false`): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRejected(value: `false`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResolved(value: `true`): Self = StObject.set(x, "isResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSettled(value: `true`): Self = StObject.set(x, "isSettled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
