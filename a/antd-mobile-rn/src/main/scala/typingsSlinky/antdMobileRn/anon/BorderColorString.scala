package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorString extends js.Object {
  var borderColor: String = js.native
}

object BorderColorString {
  @scala.inline
  def apply(borderColor: String): BorderColorString = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorString]
  }
  @scala.inline
  implicit class BorderColorStringOps[Self <: BorderColorString] (val x: Self) extends AnyVal {
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

