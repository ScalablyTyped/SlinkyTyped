package typingsSlinky.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRStyle extends js.Object {
  var r: Double = js.native
}

object AnonRStyle {
  @scala.inline
  def apply(r: Double): AnonRStyle = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRStyle]
  }
  @scala.inline
  implicit class AnonRStyleOps[Self <: AnonRStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

