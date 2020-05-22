package typingsSlinky.rxjs

import typingsSlinky.rxjs.connectableObservableMod.ConnectableObservable
import typingsSlinky.rxjs.internalObservableMod.Observable
import typingsSlinky.rxjs.operatorMod.Operator
import typingsSlinky.rxjs.subjectMod.Subject
import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.typesMod.ObservableInput
import typingsSlinky.rxjs.typesMod.ObservedValueOf
import typingsSlinky.rxjs.typesMod.OperatorFunction
import typingsSlinky.rxjs.typesMod.TeardownLogic
import typingsSlinky.rxjs.typesMod.UnaryFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/multicast", JSImport.Namespace)
@js.native
object multicastMod extends js.Object {
  @js.native
  class MulticastOperator[T, R] protected () extends Operator[T, R] {
    def this(
      subjectFactory: js.Function0[Subject[T]],
      selector: js.Function1[/* source */ Observable[T], Observable[R]]
    ) = this()
    var selector: js.Any = js.native
    var subjectFactory: js.Any = js.native
    /* CompleteClass */
    override def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic = js.native
  }
  
  def multicast[T](subjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]]): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  def multicast[T](subject: Subject[T]): UnaryFunction[Observable[T], ConnectableObservable[T]] = js.native
  def multicast[T, O /* <: ObservableInput[_] */](
    SubjectFactory: js.ThisFunction0[/* this */ Observable[T], Subject[T]],
    selector: js.Function1[/* shared */ Observable[T], O]
  ): OperatorFunction[T, ObservedValueOf[O]] = js.native
  def multicast[T, O /* <: ObservableInput[_] */](subject: Subject[T], selector: js.Function1[/* shared */ Observable[T], O]): UnaryFunction[Observable[T], ConnectableObservable[ObservedValueOf[O]]] = js.native
}

