package typingsSlinky.rsocketDashFlowable

import typingsSlinky.rsocketDashFlowable.flowableMod.Source
import typingsSlinky.rsocketDashFlowable.flowableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable", JSImport.Namespace)
@js.native
object rsocketDashFlowableMod extends js.Object {
  @js.native
  class Flowable[T] protected () extends default[T] {
    def this(source: Source[T]) = this()
    def this(source: Source[T], max: Double) = this()
  }
  
  @js.native
  class FlowableProcessor[T, R] protected ()
    extends typingsSlinky.rsocketDashFlowable.flowableProcessorMod.default[T, R] {
    def this(source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any) = this()
    def this(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPublisher<T> */ js.Any,
      fn: js.Function1[/* a */ T, R]
    ) = this()
  }
  
  @js.native
  class Single[T] protected ()
    extends typingsSlinky.rsocketDashFlowable.singleMod.default[T] {
    def this(source: typingsSlinky.rsocketDashFlowable.singleMod.Source[T]) = this()
  }
  
  def every(ms: Double): default[Double] = js.native
  /* static members */
  @js.native
  object Flowable extends js.Object {
    def error(error: js.Error): typingsSlinky.rsocketDashFlowable.flowableMod.Flowable[js.Object] = js.native
    def just[U](values: U*): typingsSlinky.rsocketDashFlowable.flowableMod.Flowable[U] = js.native
    def never(): typingsSlinky.rsocketDashFlowable.flowableMod.Flowable[js.Object] = js.native
  }
  
  /* static members */
  @js.native
  object Single extends js.Object {
    def error(error: js.Error): typingsSlinky.rsocketDashFlowable.singleMod.Single[js.Object] = js.native
    def of[U](value: U): typingsSlinky.rsocketDashFlowable.singleMod.Single[U] = js.native
  }
  
}

