package typingsSlinky.reactAsync.anon

import typingsSlinky.reactAsync.reactAsyncBooleans.`false`
import typingsSlinky.reactAsync.reactAsyncBooleans.`true`
import typingsSlinky.reactAsync.reactAsyncStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsFulfilled[T] extends StObject {
  
  var data: js.UndefOr[T] = js.native
  
  var error: js.Error = js.native
  
  var finishedAt: js.Date = js.native
  
  var isFulfilled: `false` = js.native
  
  var isInitial: `false` = js.native
  
  var isLoading: `false` = js.native
  
  var isPending: `false` = js.native
  
  var isRejected: `true` = js.native
  
  var isResolved: `false` = js.native
  
  var isSettled: `true` = js.native
  
  var startedAt: js.Date = js.native
  
  var status: rejected = js.native
  
  var value: js.Error = js.native
}
object IsFulfilled {
  
  @scala.inline
  def apply[T](
    error: js.Error,
    finishedAt: js.Date,
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `true`,
    isResolved: `false`,
    isSettled: `true`,
    startedAt: js.Date,
    status: rejected,
    value: js.Error
  ): IsFulfilled[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFulfilled[T]]
  }
  
  @scala.inline
  implicit class IsFulfilledMutableBuilder[Self <: IsFulfilled[_], T] (val x: Self with IsFulfilled[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAt(value: js.Date): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFulfilled(value: `false`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInitial(value: `false`): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPending(value: `false`): Self = StObject.set(x, "isPending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRejected(value: `true`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResolved(value: `false`): Self = StObject.set(x, "isResolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSettled(value: `true`): Self = StObject.set(x, "isSettled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Error): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
