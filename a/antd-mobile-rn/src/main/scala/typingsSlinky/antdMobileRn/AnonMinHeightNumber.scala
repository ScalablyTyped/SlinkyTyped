package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMinHeightNumber extends js.Object {
  var minHeight: Double = js.native
}

object AnonMinHeightNumber {
  @scala.inline
  def apply(minHeight: Double): AnonMinHeightNumber = {
    val __obj = js.Dynamic.literal(minHeight = minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinHeightNumber]
  }
  @scala.inline
  implicit class AnonMinHeightNumberOps[Self <: AnonMinHeightNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

