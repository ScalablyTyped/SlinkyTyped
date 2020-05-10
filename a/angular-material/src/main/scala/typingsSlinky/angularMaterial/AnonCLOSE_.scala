package typingsSlinky.angularMaterial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCLOSE_ extends js.Object {
  var CLOSE: String = js.native
}

object AnonCLOSE_ {
  @scala.inline
  def apply(CLOSE: String): AnonCLOSE_ = {
    val __obj = js.Dynamic.literal(CLOSE = CLOSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCLOSE_]
  }
  @scala.inline
  implicit class AnonCLOSE_Ops[Self <: AnonCLOSE_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLOSE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

