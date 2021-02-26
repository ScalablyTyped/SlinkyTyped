package typingsSlinky.reactAsync.anon

import org.scalajs.dom.experimental.AbortController
import typingsSlinky.reactAsync.mod.AsyncProps
import typingsSlinky.reactAsync.mod.PromiseFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialValue[T] extends StObject {
  
  var initialValue: js.UndefOr[js.Error | T] = js.native
  
  var promise: js.UndefOr[js.Promise[T]] = js.native
  
  var promiseFn: js.UndefOr[PromiseFn[T]] = js.native
}
object InitialValue {
  
  @scala.inline
  def apply[T](): InitialValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialValue[T]]
  }
  
  @scala.inline
  implicit class InitialValueMutableBuilder[Self <: InitialValue[_], T] (val x: Self with InitialValue[T]) extends AnyVal {
    
    @scala.inline
    def setInitialValue(value: js.Error | T): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueError(value: js.Error): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): Self = StObject.set(x, "promiseFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPromiseFnUndefined: Self = StObject.set(x, "promiseFn", js.undefined)
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
