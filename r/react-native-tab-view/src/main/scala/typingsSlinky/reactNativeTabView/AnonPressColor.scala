package typingsSlinky.reactNativeTabView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPressColor extends js.Object {
  var pressColor: String = js.native
}

object AnonPressColor {
  @scala.inline
  def apply(pressColor: String): AnonPressColor = {
    val __obj = js.Dynamic.literal(pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPressColor]
  }
  @scala.inline
  implicit class AnonPressColorOps[Self <: AnonPressColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPressColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

