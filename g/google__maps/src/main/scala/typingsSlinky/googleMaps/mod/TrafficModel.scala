package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleMaps.googleMapsStrings.best_guess
  - typingsSlinky.googleMaps.googleMapsStrings.pessimistic
  - typingsSlinky.googleMaps.googleMapsStrings.optimistic
*/
trait TrafficModel extends js.Object

object TrafficModel {
  @scala.inline
  def best_guess: typingsSlinky.googleMaps.googleMapsStrings.best_guess = this.cast("best_guess")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optimistic: typingsSlinky.googleMaps.googleMapsStrings.optimistic = this.cast("optimistic")
  @scala.inline
  def pessimistic: typingsSlinky.googleMaps.googleMapsStrings.pessimistic = this.cast("pessimistic")
}

