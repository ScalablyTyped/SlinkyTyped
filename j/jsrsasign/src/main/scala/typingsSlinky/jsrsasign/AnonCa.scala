package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCa extends js.Object {
  var ca: Boolean = js.native
  var critical: Boolean = js.native
}

object AnonCa {
  @scala.inline
  def apply(ca: Boolean, critical: Boolean): AnonCa = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCa]
  }
  @scala.inline
  implicit class AnonCaOps[Self <: AnonCa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCritical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("critical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

