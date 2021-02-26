package typingsSlinky.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-async.react-async.AbstractState<T>, 'run' | 'reload' | 'cancel' | 'setData' | 'setError'> */
@js.native
trait ReducerBaseState[T] extends StObject {
  
  var counter: Double = js.native
  
  var initialValue: js.UndefOr[T | js.Error] = js.native
  
  var promise: js.Promise[T] = js.native
}
object ReducerBaseState {
  
  @scala.inline
  def apply[T](counter: Double, promise: js.Promise[T]): ReducerBaseState[T] = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerBaseState[T]]
  }
  
  @scala.inline
  implicit class ReducerBaseStateMutableBuilder[Self <: ReducerBaseState[_], T] (val x: Self with ReducerBaseState[T]) extends AnyVal {
    
    @scala.inline
    def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValue(value: T | js.Error): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueError(value: js.Error): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
