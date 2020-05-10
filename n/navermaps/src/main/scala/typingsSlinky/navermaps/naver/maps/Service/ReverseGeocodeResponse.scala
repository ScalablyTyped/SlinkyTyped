package typingsSlinky.navermaps.naver.maps.Service

import typingsSlinky.navermaps.AnonTotal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseGeocodeResponse extends js.Object {
  var result: AnonTotal = js.native
}

object ReverseGeocodeResponse {
  @scala.inline
  def apply(result: AnonTotal): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
  @scala.inline
  implicit class ReverseGeocodeResponseOps[Self <: ReverseGeocodeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: AnonTotal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

