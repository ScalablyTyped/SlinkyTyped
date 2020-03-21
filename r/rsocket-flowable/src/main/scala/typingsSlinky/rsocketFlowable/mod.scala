package typingsSlinky.rsocketFlowable

import typingsSlinky.rsocketFlowable.flowableMod.Source
import typingsSlinky.rsocketFlowable.flowableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
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
  
  def every(ms: Double): default[Double] = js.native
  /* static members */
  @js.native
  object Flowable extends js.Object {
    def error(error: js.Error): typingsSlinky.rsocketFlowable.flowableMod.Flowable[js.Object] = js.native
    def just[U](values: U*): typingsSlinky.rsocketFlowable.flowableMod.Flowable[U] = js.native
    def never(): typingsSlinky.rsocketFlowable.flowableMod.Flowable[js.Object] = js.native
  }
  
  /* static members */
  @js.native
  object Single extends js.Object {
    def error(error: js.Error): typingsSlinky.rsocketFlowable.singleMod.Single[scala.Nothing] = js.native
    def of[U](value: U): typingsSlinky.rsocketFlowable.singleMod.Single[U] = js.native
  }
  
}

