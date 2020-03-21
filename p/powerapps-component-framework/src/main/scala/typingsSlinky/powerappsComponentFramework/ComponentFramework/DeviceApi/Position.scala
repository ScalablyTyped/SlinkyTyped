package typingsSlinky.powerappsComponentFramework.ComponentFramework.DeviceApi

import typingsSlinky.powerappsComponentFramework.AnonAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface of return geological information in context.device.getCurrentPosition
		 */
trait Position extends js.Object {
  /**
  			 * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
  			 */
  var coords: AnonAccuracy
  /**
  			 * Represents the time when the object was acquired and is represented as DOMTimeStamp.
  			 */
  var timestamp: js.Date
}

object Position {
  @scala.inline
  def apply(coords: AnonAccuracy, timestamp: js.Date): Position = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Position]
  }
}

