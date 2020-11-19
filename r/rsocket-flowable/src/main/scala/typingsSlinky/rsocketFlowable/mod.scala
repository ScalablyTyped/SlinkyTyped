package typingsSlinky.rsocketFlowable

import typingsSlinky.rsocketFlowable.flowableMod.Source
import typingsSlinky.rsocketFlowable.flowableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-flowable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def every(ms: Double): default[Double] = js.native
  
  @js.native
  class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  /* static members */
  @js.native
  object Flowable extends js.Object {
    
    def error(error: js.Error): typingsSlinky.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = js.native
    
    def just[U](values: U*): typingsSlinky.rsocketFlowable.flowableMod.Flowable[U] = js.native
    
    def never(): typingsSlinky.rsocketFlowable.flowableMod.Flowable[scala.Nothing] = js.native
  }
  
  @js.native
  class FlowableProcessor[T, R] protected ()
    extends typingsSlinky.rsocketFlowable.flowableProcessorMod.default[T, R] {
    def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
    def this(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
      fn: js.Function1[/* a */ T, R]
    ) = this()
  }
  
  @js.native
  class Single[T] protected ()
    extends typingsSlinky.rsocketFlowable.singleMod.default[T] {
    def this(source: typingsSlinky.rsocketFlowable.singleMod.Source[T]) = this()
  }
  /* static members */
  @js.native
  object Single extends js.Object {
    
    def error(error: js.Error): typingsSlinky.rsocketFlowable.singleMod.Single[scala.Nothing] = js.native
    
    def never(): typingsSlinky.rsocketFlowable.singleMod.Single[scala.Nothing] = js.native
    
    def of[U](value: U): typingsSlinky.rsocketFlowable.singleMod.Single[U] = js.native
  }
}
