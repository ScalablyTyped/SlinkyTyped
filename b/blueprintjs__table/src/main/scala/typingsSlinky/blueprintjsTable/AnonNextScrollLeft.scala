package typingsSlinky.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextScrollLeft extends js.Object {
  var nextScrollLeft: Double = js.native
  var nextScrollTop: Double = js.native
}

object AnonNextScrollLeft {
  @scala.inline
  def apply(nextScrollLeft: Double, nextScrollTop: Double): AnonNextScrollLeft = {
    val __obj = js.Dynamic.literal(nextScrollLeft = nextScrollLeft.asInstanceOf[js.Any], nextScrollTop = nextScrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextScrollLeft]
  }
  @scala.inline
  implicit class AnonNextScrollLeftOps[Self <: AnonNextScrollLeft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextScrollLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScrollLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextScrollTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextScrollTop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

