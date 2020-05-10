package typingsSlinky.leafletGeosearch

import typingsSlinky.leafletGeosearch.mod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNortheast extends js.Object {
  var northeast: LatLngLiteral = js.native
  var southwest: LatLngLiteral = js.native
}

object AnonNortheast {
  @scala.inline
  def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): AnonNortheast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNortheast]
  }
  @scala.inline
  implicit class AnonNortheastOps[Self <: AnonNortheast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNortheast(value: LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("northeast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSouthwest(value: LatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("southwest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

