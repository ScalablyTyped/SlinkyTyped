package typingsSlinky.intlFormatCache.mod

import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Intl.NumberFormat
  - typingsSlinky.std.Intl.DateTimeFormat
  - typingsSlinky.std.Intl.PluralRules
  - js.Any
*/
trait CacheValue extends js.Object

object CacheValue {
  @scala.inline
  implicit def apply(value: js.Any): CacheValue = value.asInstanceOf[CacheValue]
  @scala.inline
  implicit def apply(value: DateTimeFormat): CacheValue = value.asInstanceOf[CacheValue]
  @scala.inline
  implicit def apply(value: NumberFormat): CacheValue = value.asInstanceOf[CacheValue]
  @scala.inline
  implicit def apply(value: PluralRules): CacheValue = value.asInstanceOf[CacheValue]
}

