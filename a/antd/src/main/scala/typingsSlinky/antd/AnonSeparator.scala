package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSeparator extends js.Object {
  var separator: String = js.native
}

object AnonSeparator {
  @scala.inline
  def apply(separator: String): AnonSeparator = {
    val __obj = js.Dynamic.literal(separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeparator]
  }
  @scala.inline
  implicit class AnonSeparatorOps[Self <: AnonSeparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

