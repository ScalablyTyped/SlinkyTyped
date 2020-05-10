package typingsSlinky.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAhead extends js.Object {
  var ahead: Double = js.native
  var behind: Double = js.native
}

object AnonAhead {
  @scala.inline
  def apply(ahead: Double, behind: Double): AnonAhead = {
    val __obj = js.Dynamic.literal(ahead = ahead.asInstanceOf[js.Any], behind = behind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAhead]
  }
  @scala.inline
  implicit class AnonAheadOps[Self <: AnonAhead] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ahead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBehind(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

