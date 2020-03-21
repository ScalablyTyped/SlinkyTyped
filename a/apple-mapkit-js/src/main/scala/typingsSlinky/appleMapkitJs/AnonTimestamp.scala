package typingsSlinky.appleMapkitJs

import typingsSlinky.appleMapkitJs.mapkit.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimestamp extends js.Object {
  var coordinate: Coordinate
  var timestamp: js.Date
}

object AnonTimestamp {
  @scala.inline
  def apply(coordinate: Coordinate, timestamp: js.Date): AnonTimestamp = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTimestamp]
  }
}

