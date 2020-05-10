package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsMeasured extends js.Object {
  var isMeasured: Boolean = js.native
}

object AnonIsMeasured {
  @scala.inline
  def apply(isMeasured: Boolean): AnonIsMeasured = {
    val __obj = js.Dynamic.literal(isMeasured = isMeasured.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsMeasured]
  }
  @scala.inline
  implicit class AnonIsMeasuredOps[Self <: AnonIsMeasured] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMeasured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMeasured")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

