package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.leaflet.leafletStrings.right
  - typingsSlinky.leaflet.leafletStrings.left
  - typingsSlinky.leaflet.leafletStrings.top
  - typingsSlinky.leaflet.leafletStrings.bottom
  - typingsSlinky.leaflet.leafletStrings.center
  - typingsSlinky.leaflet.leafletStrings.auto
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def auto: typingsSlinky.leaflet.leafletStrings.auto = this.cast("auto")
  @scala.inline
  def bottom: typingsSlinky.leaflet.leafletStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsSlinky.leaflet.leafletStrings.center = this.cast("center")
  @scala.inline
  def left: typingsSlinky.leaflet.leafletStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.leaflet.leafletStrings.right = this.cast("right")
  @scala.inline
  def top: typingsSlinky.leaflet.leafletStrings.top = this.cast("top")
}

