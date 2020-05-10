package typingsSlinky.amapJsApiToolBar

import typingsSlinky.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLnglat extends js.Object {
  var lnglat: LngLat = js.native
}

object AnonLnglat {
  @scala.inline
  def apply(lnglat: LngLat): AnonLnglat = {
    val __obj = js.Dynamic.literal(lnglat = lnglat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLnglat]
  }
  @scala.inline
  implicit class AnonLnglatOps[Self <: AnonLnglat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLnglat(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lnglat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

