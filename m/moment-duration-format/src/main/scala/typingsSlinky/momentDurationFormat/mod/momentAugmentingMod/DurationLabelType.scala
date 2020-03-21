package typingsSlinky.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.momentDurationFormat.momentDurationFormatStrings.long
  - typingsSlinky.momentDurationFormat.momentDurationFormatStrings.standard
  - typingsSlinky.momentDurationFormat.momentDurationFormatStrings.short
*/
trait DurationLabelType extends js.Object

object DurationLabelType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typingsSlinky.momentDurationFormat.momentDurationFormatStrings.long = this.cast("long")
  @scala.inline
  def short: typingsSlinky.momentDurationFormat.momentDurationFormatStrings.short = this.cast("short")
  @scala.inline
  def standard: typingsSlinky.momentDurationFormat.momentDurationFormatStrings.standard = this.cast("standard")
}

