package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalOperatorMod.Operator
import typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typingsSlinky.rxjs.internalSubscriberMod.Subscriber
import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import typingsSlinky.rxjs.internalTypesMod.SchedulerLike
import typingsSlinky.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/expand", JSImport.Namespace)
@js.native
object internalOperatorsExpandMod extends js.Object {
  @js.native
  class ExpandOperator[T, R] protected () extends Operator[T, R] {
    def this(
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ) = this()
    var concurrent: js.Any = js.native
    var project: js.Any = js.native
    var scheduler: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  }
  
  @js.native
  class ExpandSubscriber[T, R] protected () extends OuterSubscriber[T, R] {
    def this(
      destination: Subscriber[R],
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double,
      scheduler: SchedulerLike
    ) = this()
    var active: js.Any = js.native
    var buffer: js.Any = js.native
    var concurrent: js.Any = js.native
    var hasCompleted: js.Any = js.native
    var index: js.Any = js.native
    var project: js.Any = js.native
    var scheduler: js.Any = js.native
    var subscribeToProjection: js.Any = js.native
    /* protected */ def _next(value: js.Any): Unit = js.native
    def notifyComplete(innerSub: Subscription): Unit = js.native
  }
  
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): MonoTypeOperatorFunction[T] = js.native
  def expand[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): MonoTypeOperatorFunction[T] = js.native
  def expand[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSName("expand")
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): OperatorFunction[T, R] = js.native
  @JSName("expand")
  def expand_TR_OperatorFunction[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): OperatorFunction[T, R] = js.native
  @JSName("expand")
  def expand_TR_OperatorFunction[T, R](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, R] = js.native
  /* static members */
  @js.native
  object ExpandSubscriber extends js.Object {
    var dispatch: js.Any = js.native
  }
  
}

