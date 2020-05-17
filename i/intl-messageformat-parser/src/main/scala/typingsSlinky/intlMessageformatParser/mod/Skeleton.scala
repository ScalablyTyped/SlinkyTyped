package typingsSlinky.intlMessageformatParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformatParser.mod.NumberSkeleton
  - typingsSlinky.intlMessageformatParser.mod.DateTimeSkeleton
*/
trait Skeleton extends js.Object

object Skeleton {
  @scala.inline
  implicit def apply(value: DateTimeSkeleton): Skeleton = value.asInstanceOf[Skeleton]
  @scala.inline
  implicit def apply(value: NumberSkeleton): Skeleton = value.asInstanceOf[Skeleton]
}

