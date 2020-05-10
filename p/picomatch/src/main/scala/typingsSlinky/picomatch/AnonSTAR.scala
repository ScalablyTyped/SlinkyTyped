package typingsSlinky.picomatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSTAR extends js.Object {
  var STAR: String = js.native
}

object AnonSTAR {
  @scala.inline
  def apply(STAR: String): AnonSTAR = {
    val __obj = js.Dynamic.literal(STAR = STAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSTAR]
  }
  @scala.inline
  implicit class AnonSTAROps[Self <: AnonSTAR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSTAR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STAR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

