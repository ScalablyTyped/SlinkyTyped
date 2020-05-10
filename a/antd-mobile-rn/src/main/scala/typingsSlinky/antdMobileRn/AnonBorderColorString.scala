package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBorderColorString extends js.Object {
  var borderColor: String = js.native
}

object AnonBorderColorString {
  @scala.inline
  def apply(borderColor: String): AnonBorderColorString = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderColorString]
  }
  @scala.inline
  implicit class AnonBorderColorStringOps[Self <: AnonBorderColorString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

