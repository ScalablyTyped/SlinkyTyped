package typingsSlinky.knockoutMapping.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knockoutMapping.mod.global.KnockoutMappingSpecificOptions[T]
  - typingsSlinky.knockoutMapping.mod.global.KnockoutMappingStandardOptions
*/
trait KnockoutMappingOptions[T] extends js.Object

object KnockoutMappingOptions {
  @scala.inline
  implicit def apply[T](value: KnockoutMappingSpecificOptions[T]): KnockoutMappingOptions[T] = value.asInstanceOf[KnockoutMappingOptions[T]]
  @scala.inline
  implicit def apply[T](value: KnockoutMappingStandardOptions): KnockoutMappingOptions[T] = value.asInstanceOf[KnockoutMappingOptions[T]]
}

