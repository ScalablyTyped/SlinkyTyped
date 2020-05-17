package typingsSlinky.immutabilityHelper.mod

import typingsSlinky.immutabilityHelper.anon.AddArray
import typingsSlinky.immutabilityHelper.anon.RemoveArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.immutabilityHelper.anon.AddArray[T]
  - typingsSlinky.immutabilityHelper.anon.RemoveArray[T]
*/
trait SetSpec[T]
  extends Spec[js.Any, js.Any]

object SetSpec {
  @scala.inline
  implicit def apply[T](value: AddArray[T]): SetSpec[T] = value.asInstanceOf[SetSpec[T]]
  @scala.inline
  implicit def apply[T](value: RemoveArray[T]): SetSpec[T] = value.asInstanceOf[SetSpec[T]]
}

