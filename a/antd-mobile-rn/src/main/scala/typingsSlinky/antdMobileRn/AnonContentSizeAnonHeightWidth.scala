package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentSizeAnonHeightWidth extends js.Object {
  var contentSize: AnonHeightWidth = js.native
}

object AnonContentSizeAnonHeightWidth {
  @scala.inline
  def apply(contentSize: AnonHeightWidth): AnonContentSizeAnonHeightWidth = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentSizeAnonHeightWidth]
  }
  @scala.inline
  implicit class AnonContentSizeAnonHeightWidthOps[Self <: AnonContentSizeAnonHeightWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSize(value: AnonHeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

