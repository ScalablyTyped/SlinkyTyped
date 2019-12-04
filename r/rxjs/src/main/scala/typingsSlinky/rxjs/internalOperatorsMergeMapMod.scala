package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalOperatorMod.Operator
import typingsSlinky.rxjs.internalOuterSubscriberMod.OuterSubscriber
import typingsSlinky.rxjs.internalSubscriberMod.Subscriber
import typingsSlinky.rxjs.internalSubscriptionMod.Subscription
import typingsSlinky.rxjs.internalTypesMod.ObservableInput
import typingsSlinky.rxjs.internalTypesMod.ObservedValueOf
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import typingsSlinky.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/mergeMap", JSImport.Namespace)
@js.native
object internalOperatorsMergeMapMod extends js.Object {
  @js.native
  class MergeMapOperator[T, R] protected () extends Operator[T, R] {
    def this(project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]) = this()
    def this(project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double) = this()
    var concurrent: js.Any = js.native
    var project: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  }
  
  @js.native
  class MergeMapSubscriber[T, R] protected () extends OuterSubscriber[T, R] {
    def this(
      destination: Subscriber[R],
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]
    ) = this()
    def this(
      destination: Subscriber[R],
      project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]],
      concurrent: Double
    ) = this()
    var _innerSub: js.Any = js.native
    var active: js.Any = js.native
    var buffer: js.Any = js.native
    var concurrent: js.Any = js.native
    var hasCompleted: js.Any = js.native
    var index: Double = js.native
    var project: js.Any = js.native
    /* protected */ def _tryNext(value: T): Unit = js.native
    def notifyComplete(innerSub: Subscription): Unit = js.native
  }
  
  def mergeMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O]): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def mergeMap[T, O /* <: ObservableInput[_] */](project: js.Function2[/* value */ T, /* index */ Double, O], concurrent: Double): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def mergeMap[T, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.UndefOr[scala.Nothing],
    concurrent: Double
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def mergeMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ]
  ): OperatorFunction[T, R] = js.native
  def mergeMap[T, R, O /* <: ObservableInput[_] */](
    project: js.Function2[/* value */ T, /* index */ Double, O],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ ObservedValueOf[O], 
      /* outerIndex */ Double, 
      /* innerIndex */ Double, 
      R
    ],
    concurrent: Double
  ): OperatorFunction[T, R] = js.native
}

