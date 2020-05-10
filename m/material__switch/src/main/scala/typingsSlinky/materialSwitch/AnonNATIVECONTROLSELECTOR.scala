package typingsSlinky.materialSwitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNATIVECONTROLSELECTOR extends js.Object {
  var NATIVE_CONTROL_SELECTOR: String = js.native
  var RIPPLE_SURFACE_SELECTOR: String = js.native
}

object AnonNATIVECONTROLSELECTOR {
  @scala.inline
  def apply(NATIVE_CONTROL_SELECTOR: String, RIPPLE_SURFACE_SELECTOR: String): AnonNATIVECONTROLSELECTOR = {
    val __obj = js.Dynamic.literal(NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], RIPPLE_SURFACE_SELECTOR = RIPPLE_SURFACE_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNATIVECONTROLSELECTOR]
  }
  @scala.inline
  implicit class AnonNATIVECONTROLSELECTOROps[Self <: AnonNATIVECONTROLSELECTOR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNATIVE_CONTROL_SELECTOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIPPLE_SURFACE_SELECTOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIPPLE_SURFACE_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

