package typingsSlinky.rxjs.internalOperatorMod

import typingsSlinky.rxjs.internalSubscriberMod.Subscriber
import typingsSlinky.rxjs.internalTypesMod.TeardownLogic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator[T, R] extends js.Object {
  def call(subscriber: Subscriber[R], source: js.Any): TeardownLogic
}

object Operator {
  @scala.inline
  def apply[T, R](call: (Subscriber[R], js.Any) => TeardownLogic): Operator[T, R] = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
  
    __obj.asInstanceOf[Operator[T, R]]
  }
}

