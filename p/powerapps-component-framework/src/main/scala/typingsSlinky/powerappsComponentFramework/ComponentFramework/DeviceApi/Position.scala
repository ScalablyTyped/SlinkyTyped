package typingsSlinky.powerappsComponentFramework.ComponentFramework.DeviceApi

import typingsSlinky.powerappsComponentFramework.AnonAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface of return geological information in context.device.getCurrentPosition
		 */
@js.native
trait Position extends js.Object {
  /**
  			 * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
  			 */
  var coords: AnonAccuracy = js.native
  /**
  			 * Represents the time when the object was acquired and is represented as DOMTimeStamp.
  			 */
  var timestamp: js.Date = js.native
}

object Position {
  @scala.inline
  def apply(coords: AnonAccuracy, timestamp: js.Date): Position = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoords(value: AnonAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
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

