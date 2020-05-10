package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlexDirectionString extends js.Object {
  var flexDirection: String = js.native
}

object AnonFlexDirectionString {
  @scala.inline
  def apply(flexDirection: String): AnonFlexDirectionString = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlexDirectionString]
  }
  @scala.inline
  implicit class AnonFlexDirectionStringOps[Self <: AnonFlexDirectionString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlexDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

