package typingsSlinky.miniprogramWxs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes the 'this' parameter from a function type.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - js.Function1[/ * args * / js.Any, js.Any]
*/
trait OmitThisParameter[T] extends js.Object

object OmitThisParameter {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* args */ js.Any, js.Any]): OmitThisParameter[T] = value.asInstanceOf[OmitThisParameter[T]]
  @scala.inline
  implicit def apply[T](value: T): OmitThisParameter[T] = value.asInstanceOf[OmitThisParameter[T]]
}

