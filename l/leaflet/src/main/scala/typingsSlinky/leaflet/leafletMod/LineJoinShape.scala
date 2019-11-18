package typingsSlinky.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.leaflet.leafletStrings.miter
  - typings.leaflet.leafletStrings.round
  - typings.leaflet.leafletStrings.bevel
  - typings.leaflet.leafletStrings.inherit
*/
trait LineJoinShape extends js.Object

object LineJoinShape {
  @scala.inline
  def bevel: typingsSlinky.leaflet.leafletStrings.bevel = this.cast("bevel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inherit: typingsSlinky.leaflet.leafletStrings.inherit = this.cast("inherit")
  @scala.inline
  def miter: typingsSlinky.leaflet.leafletStrings.miter = this.cast("miter")
  @scala.inline
  def round: typingsSlinky.leaflet.leafletStrings.round = this.cast("round")
}

