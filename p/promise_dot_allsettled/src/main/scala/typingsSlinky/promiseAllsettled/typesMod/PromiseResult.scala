package typingsSlinky.promiseAllsettled.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.promiseAllsettled.typesMod.PromiseResolution[T]
  - typingsSlinky.promiseAllsettled.typesMod.PromiseRejection[E]
*/
trait PromiseResult[T, E] extends js.Object

object PromiseResult {
  @scala.inline
  implicit def apply[T, E](value: PromiseRejection[E]): PromiseResult[T, E] = value.asInstanceOf[PromiseResult[T, E]]
  @scala.inline
  implicit def apply[T, E](value: PromiseResolution[T]): PromiseResult[T, E] = value.asInstanceOf[PromiseResult[T, E]]
}

