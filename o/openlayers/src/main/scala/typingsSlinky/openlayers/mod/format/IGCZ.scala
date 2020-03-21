package typingsSlinky.openlayers.mod.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGC altitude/z. One of 'barometric', 'gps', 'none'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openlayers.openlayersStrings.barometric
  - typingsSlinky.openlayers.openlayersStrings.gps
  - typingsSlinky.openlayers.openlayersStrings.none
*/
trait IGCZ extends js.Object

object IGCZ {
  @scala.inline
  def barometric: typingsSlinky.openlayers.openlayersStrings.barometric = this.cast("barometric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gps: typingsSlinky.openlayers.openlayersStrings.gps = this.cast("gps")
  @scala.inline
  def none: typingsSlinky.openlayers.openlayersStrings.none = this.cast("none")
}

