package typingsSlinky.rsocketFlowable

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-flowable/FlowableProcessor", JSImport.Namespace)
@js.native
object flowableProcessorMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<R> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<T> * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription * / any */ @js.native
  trait FlowableProcessor[T, R] extends js.Object {
    
    def cancel(): Unit = js.native
    
    def map[S](fn: js.Function1[/* a */ R, S]): js.Any = js.native
    
    def onComplete(): Unit = js.native
    
    def onError(error: js.Error): Unit = js.native
    
    def onNext(t: T): Unit = js.native
    
    def onSubscribe(
      subscription: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscription */ js.Any
    ): Unit = js.native
    
    def request(n: Double): Unit = js.native
    
    def subscribe(): Unit = js.native
    def subscribe(
      subscriber: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISubscriber<R> */ _
        ]
    ): Unit = js.native
  }
  
  @js.native
  class default[T, R] protected () extends FlowableProcessor[T, R] {
    def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
    def this(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
      fn: js.Function1[/* a */ T, R]
    ) = this()
  }
}
