package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.appleMapkitJs.appleMapkitJsStrings.select
  - typingsSlinky.appleMapkitJs.appleMapkitJsStrings.deselect
*/
trait OverlayEventType extends js.Object

object OverlayEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deselect: typingsSlinky.appleMapkitJs.appleMapkitJsStrings.deselect = this.cast("deselect")
  @scala.inline
  def select: typingsSlinky.appleMapkitJs.appleMapkitJsStrings.select = this.cast("select")
}

