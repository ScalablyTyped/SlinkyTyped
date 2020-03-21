package typingsSlinky.navermaps.naver.maps.Service

import typingsSlinky.navermaps.AnonItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeResponse extends js.Object {
  var result: AnonItems
}

object GeocodeResponse {
  @scala.inline
  def apply(result: AnonItems): GeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeocodeResponse]
  }
}

