package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBordered extends js.Object {
  var bordered: Boolean = js.native
  var expandIconPosition: String = js.native
}

object AnonBordered {
  @scala.inline
  def apply(bordered: Boolean, expandIconPosition: String): AnonBordered = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], expandIconPosition = expandIconPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBordered]
  }
  @scala.inline
  implicit class AnonBorderedOps[Self <: AnonBordered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBordered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandIconPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIconPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

