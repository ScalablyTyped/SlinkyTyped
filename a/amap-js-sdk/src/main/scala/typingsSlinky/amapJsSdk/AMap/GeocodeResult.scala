package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeResult extends js.Object {
  var geocodes: js.Array[LngLat] = js.native
  var info: String = js.native
  var resultNum: Double = js.native
}

object GeocodeResult {
  @scala.inline
  def apply(geocodes: js.Array[LngLat], info: String, resultNum: Double): GeocodeResult = {
    val __obj = js.Dynamic.literal(geocodes = geocodes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], resultNum = resultNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResult]
  }
  @scala.inline
  implicit class GeocodeResultOps[Self <: GeocodeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeocodes(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultNum")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

