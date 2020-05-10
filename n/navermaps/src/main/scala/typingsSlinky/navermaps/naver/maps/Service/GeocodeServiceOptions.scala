package typingsSlinky.navermaps.naver.maps.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocodeServiceOptions extends ServiceOptions {
  var address: js.UndefOr[String] = js.native
}

object GeocodeServiceOptions {
  @scala.inline
  def apply(): GeocodeServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodeServiceOptions]
  }
  @scala.inline
  implicit class GeocodeServiceOptionsOps[Self <: GeocodeServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
  }
  
}

