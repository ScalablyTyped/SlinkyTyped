package typingsSlinky.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMargin extends js.Object {
  var margin: Double = js.native
}

object AnonMargin {
  @scala.inline
  def apply(margin: Double): AnonMargin = {
    val __obj = js.Dynamic.literal(margin = margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMargin]
  }
  @scala.inline
  implicit class AnonMarginOps[Self <: AnonMargin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

