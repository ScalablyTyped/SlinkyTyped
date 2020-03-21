package typingsSlinky.rxjs.operatorMod

import typingsSlinky.rxjs.subscriberMod.Subscriber
import typingsSlinky.rxjs.typesMod.TeardownLogic
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

