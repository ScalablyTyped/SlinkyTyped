package typingsSlinky.googleMaps.mod

import typingsSlinky.googleMaps.googleMapsStrings.bus_
import typingsSlinky.googleMaps.googleMapsStrings.rail_
import typingsSlinky.googleMaps.googleMapsStrings.subway_
import typingsSlinky.googleMaps.googleMapsStrings.tram_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.bus_
  - typingsSlinky.googleMaps.googleMapsStrings.subway_
  - typingsSlinky.googleMaps.googleMapsStrings.train
  - typingsSlinky.googleMaps.googleMapsStrings.tram_
  - typingsSlinky.googleMaps.googleMapsStrings.rail_
*/
trait TransitMode extends js.Object

object TransitMode {
  @scala.inline
  def bus: bus_ = this.cast("bus")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rail: rail_ = this.cast("rail")
  @scala.inline
  def subway: subway_ = this.cast("subway")
  @scala.inline
  def train: typingsSlinky.googleMaps.googleMapsStrings.train = this.cast("train")
  @scala.inline
  def tram: tram_ = this.cast("tram")
}

