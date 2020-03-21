package typingsSlinky.ngmap.angular.map

import typingsSlinky.ngmap.AnonAnchorPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgMapOptions extends js.Object {
  var marker: AnonAnchorPoint
}

object INgMapOptions {
  @scala.inline
  def apply(marker: AnonAnchorPoint): INgMapOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INgMapOptions]
  }
}

