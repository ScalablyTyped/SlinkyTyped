package typingsSlinky.firebaseFirestore.persistencePromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
/ * reason * / typingsSlinky.std.Error, 
R | typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise[R]]
  - scala.Null
*/
trait RejectedHandler[R] extends js.Object

object RejectedHandler {
  @scala.inline
  implicit def apply[R](value: js.Function1[/* reason */ js.Error, R | PersistencePromise[R]]): RejectedHandler[R] = value.asInstanceOf[RejectedHandler[R]]
  @scala.inline
  implicit def apply[R](value: Null): RejectedHandler[R] = value.asInstanceOf[RejectedHandler[R]]
}

