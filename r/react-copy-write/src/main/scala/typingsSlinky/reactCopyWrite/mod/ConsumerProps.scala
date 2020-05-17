package typingsSlinky.reactCopyWrite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactCopyWrite.mod.ConsumerPropsExplicitRender[T]
  - typingsSlinky.reactCopyWrite.mod.ConsumerPropsImplicitRender[T]
*/
trait ConsumerProps[T] extends js.Object

object ConsumerProps {
  @scala.inline
  implicit def apply[T](value: ConsumerPropsExplicitRender[T]): ConsumerProps[T] = value.asInstanceOf[ConsumerProps[T]]
  @scala.inline
  implicit def apply[T](value: ConsumerPropsImplicitRender[T]): ConsumerProps[T] = value.asInstanceOf[ConsumerProps[T]]
}

