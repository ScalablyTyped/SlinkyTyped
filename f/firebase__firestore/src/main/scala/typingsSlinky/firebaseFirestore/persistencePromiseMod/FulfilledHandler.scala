package typingsSlinky.firebaseFirestore.persistencePromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * result * / T, 
R | typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise[R]]
  - scala.Null
*/
trait FulfilledHandler[T, R] extends js.Object

object FulfilledHandler {
  @scala.inline
  implicit def apply[T, R](value: js.Function1[/* result */ T, R | PersistencePromise[R]]): FulfilledHandler[T, R] = value.asInstanceOf[FulfilledHandler[T, R]]
  @scala.inline
  implicit def apply[T, R](value: Null): FulfilledHandler[T, R] = value.asInstanceOf[FulfilledHandler[T, R]]
}

