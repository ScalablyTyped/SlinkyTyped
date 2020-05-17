package typingsSlinky.angularMaterial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLOSE_ extends js.Object {
  var CLOSE: String = js.native
}

object CLOSE_ {
  @scala.inline
  def apply(CLOSE: String): CLOSE_ = {
    val __obj = js.Dynamic.literal(CLOSE = CLOSE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLOSE_]
  }
  @scala.inline
  implicit class CLOSE_Ops[Self <: CLOSE_] (val x: Self) extends AnyVal {
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

