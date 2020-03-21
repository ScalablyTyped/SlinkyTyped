package typingsSlinky.openfin.frameFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openfin.openfinStrings.window
  - typingsSlinky.openfin.openfinStrings.iframe
  - typingsSlinky.openfin.openfinStrings.`external connection`
  - typingsSlinky.openfin.openfinStrings.view
  - typingsSlinky.openfin.openfinStrings.unknown
*/
trait EntityType extends js.Object

object EntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `external connection`: typingsSlinky.openfin.openfinStrings.`external connection` = this.cast("external connection")
  @scala.inline
  def iframe: typingsSlinky.openfin.openfinStrings.iframe = this.cast("iframe")
  @scala.inline
  def unknown: typingsSlinky.openfin.openfinStrings.unknown = this.cast("unknown")
  @scala.inline
  def view: typingsSlinky.openfin.openfinStrings.view = this.cast("view")
  @scala.inline
  def window: typingsSlinky.openfin.openfinStrings.window = this.cast("window")
}

