package typingsSlinky.envToObject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.envToObject.mod.IntegerMapping
  - typingsSlinky.envToObject.mod.BooleanMapping
  - typingsSlinky.envToObject.mod.GenericMapping
*/
trait Mapping extends js.Object

object Mapping {
  @scala.inline
  implicit def apply(value: BooleanMapping): Mapping = value.asInstanceOf[Mapping]
  @scala.inline
  implicit def apply(value: GenericMapping): Mapping = value.asInstanceOf[Mapping]
  @scala.inline
  implicit def apply(value: IntegerMapping): Mapping = value.asInstanceOf[Mapping]
}

