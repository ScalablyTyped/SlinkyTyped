package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationOptions extends js.Object {
  var numPois: js.UndefOr[Double] = js.native
  var poiRadius: js.UndefOr[Double] = js.native
}

object LocationOptions {
  @scala.inline
  def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  @scala.inline
  implicit class LocationOptionsOps[Self <: LocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumPois(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPois")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumPois: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPois")(js.undefined)
        ret
    }
    @scala.inline
    def withPoiRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poiRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoiRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poiRadius")(js.undefined)
        ret
    }
  }
  
}

