package typingsSlinky.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoPosition extends js.Object {
  var coords: IGeoCoordinates
  var timestamp: js.Date
}

object IGeoPosition {
  @scala.inline
  def apply(coords: IGeoCoordinates, timestamp: js.Date): IGeoPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGeoPosition]
  }
}

