package typingsSlinky.knockoutRx

import typingsSlinky.knockoutRx.Rx.Observable
import typingsSlinky.rx.Rx.ISubject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableFunctions[T] extends StObject {
  
  def toObservableWithReplyLatest(): Observable[T] = js.native
  
  def toSubject(): ISubject[T] = js.native
}
object KnockoutObservableFunctions {
  
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T], toSubject: () => ISubject[T]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest), toSubject = js.Any.fromFunction0(toSubject))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutObservableFunctionsMutableBuilder[Self <: KnockoutObservableFunctions[_], T] (val x: Self with KnockoutObservableFunctions[T]) extends AnyVal {
    
    @scala.inline
    def setToObservableWithReplyLatest(value: () => Observable[T]): Self = StObject.set(x, "toObservableWithReplyLatest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSubject(value: () => ISubject[T]): Self = StObject.set(x, "toSubject", js.Any.fromFunction0(value))
  }
}
