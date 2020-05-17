package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timestamp extends js.Object {
  var coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate = js.native
  var timestamp: js.Date = js.native
}

object Timestamp {
  @scala.inline
  def apply(coordinate: typingsSlinky.appleMapkitJs.mapkit.Coordinate, timestamp: js.Date): Timestamp = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  @scala.inline
  implicit class TimestampOps[Self <: Timestamp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinate(value: typingsSlinky.appleMapkitJs.mapkit.Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

