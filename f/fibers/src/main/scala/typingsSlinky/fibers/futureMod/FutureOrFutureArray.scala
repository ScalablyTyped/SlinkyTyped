package typingsSlinky.fibers.futureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fibers.futureMod.Future[js.Any]
  - js.Array[typingsSlinky.fibers.futureMod.Future[js.Any]]
*/
trait FutureOrFutureArray extends js.Object

object FutureOrFutureArray {
  @scala.inline
  implicit def apply(value: js.Array[Future[js.Any]]): FutureOrFutureArray = value.asInstanceOf[FutureOrFutureArray]
  @scala.inline
  implicit def apply(value: Future[js.Any]): FutureOrFutureArray = value.asInstanceOf[FutureOrFutureArray]
}

