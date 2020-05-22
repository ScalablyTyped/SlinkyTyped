package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timestamp extends js.Object {
  var coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate
  var timestamp: js.Date
}

object Timestamp {
  @scala.inline
  def apply(coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate, timestamp: js.Date): Timestamp = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
}

