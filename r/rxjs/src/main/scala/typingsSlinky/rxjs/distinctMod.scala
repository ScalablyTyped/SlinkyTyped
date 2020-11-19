package typingsSlinky.rxjs

import typingsSlinky.rxjs.innerSubscribeMod.SimpleOuterSubscriber
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/distinct", JSImport.Namespace)
@js.native
object distinctMod extends js.Object {
  
  def distinct[T, K](): MonoTypeOperatorFunction[T] = js.native
  def distinct[T, K](keySelector: js.UndefOr[scala.Nothing], flushes: Observable[_]): MonoTypeOperatorFunction[T] = js.native
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K]): MonoTypeOperatorFunction[T] = js.native
  def distinct[T, K](keySelector: js.Function1[/* value */ T, K], flushes: Observable[_]): MonoTypeOperatorFunction[T] = js.native
  
  @js.native
  class DistinctSubscriber[T, K] protected () extends SimpleOuterSubscriber[T, T] {
    def this(destination: Subscriber[T]) = this()
    def this(destination: Subscriber[T], keySelector: js.Function1[/* value */ T, K]) = this()
    def this(destination: Subscriber[T], keySelector: js.UndefOr[scala.Nothing], flushes: Observable[_]) = this()
    def this(destination: Subscriber[T], keySelector: js.Function1[/* value */ T, K], flushes: Observable[_]) = this()
    
    var _finalizeNext: js.Any = js.native
    
    var _useKeySelector: js.Any = js.native
    
    var keySelector: js.Any = js.native
    
    def notifyNext(): Unit = js.native
    
    var values: js.Any = js.native
  }
}
