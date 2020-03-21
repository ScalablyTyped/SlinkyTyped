package typingsSlinky.rrule.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rrule.rruleStrings.before
  - typingsSlinky.rrule.rruleStrings.after
  - typingsSlinky.rrule.rruleStrings.between
*/
trait CacheKeys extends js.Object

object CacheKeys {
  @scala.inline
  def after: typingsSlinky.rrule.rruleStrings.after = this.cast("after")
  @scala.inline
  def before: typingsSlinky.rrule.rruleStrings.before = this.cast("before")
  @scala.inline
  def between: typingsSlinky.rrule.rruleStrings.between = this.cast("between")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

