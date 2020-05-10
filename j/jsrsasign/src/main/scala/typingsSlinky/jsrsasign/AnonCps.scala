package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCps extends js.Object {
  var cps: String = js.native
  var id: String = js.native
  var unotice: String = js.native
}

object AnonCps {
  @scala.inline
  def apply(cps: String, id: String, unotice: String): AnonCps = {
    val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unotice = unotice.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCps]
  }
  @scala.inline
  implicit class AnonCpsOps[Self <: AnonCps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnotice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unotice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

