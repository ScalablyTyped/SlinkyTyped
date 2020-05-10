package typingsSlinky.screeps

import typingsSlinky.screeps.screepsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDismantle extends js.Object {
  var dismantle: `2` = js.native
}

object AnonDismantle {
  @scala.inline
  def apply(dismantle: `2`): AnonDismantle = {
    val __obj = js.Dynamic.literal(dismantle = dismantle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDismantle]
  }
  @scala.inline
  implicit class AnonDismantleOps[Self <: AnonDismantle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismantle(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismantle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

