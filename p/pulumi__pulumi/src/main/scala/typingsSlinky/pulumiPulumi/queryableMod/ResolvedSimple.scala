package typingsSlinky.pulumiPulumi.queryableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiPulumi.queryableMod.ResolvedObject[T]
  - typingsSlinky.pulumiPulumi.queryableMod.ResolvedArray[js.Any]
  - T
*/
trait ResolvedSimple[T] extends js.Object

object ResolvedSimple {
  @scala.inline
  implicit def apply[T](value: ResolvedArray[js.Any]): ResolvedSimple[T] = value.asInstanceOf[ResolvedSimple[T]]
  @scala.inline
  implicit def apply[T](value: ResolvedObject[T]): ResolvedSimple[T] = value.asInstanceOf[ResolvedSimple[T]]
  @scala.inline
  implicit def apply[T](value: T): ResolvedSimple[T] = value.asInstanceOf[ResolvedSimple[T]]
}

