package typingsSlinky.momentRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdjacent extends js.Object {
  var adjacent: js.UndefOr[Boolean] = js.native
}

object AnonAdjacent {
  @scala.inline
  def apply(): AnonAdjacent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdjacent]
  }
  @scala.inline
  implicit class AnonAdjacentOps[Self <: AnonAdjacent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjacent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjacent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjacent")(js.undefined)
        ret
    }
  }
  
}

