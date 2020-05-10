package typingsSlinky.javascriptAstar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClosest extends js.Object {
  var closest: js.UndefOr[Boolean] = js.native
  var heuristic: js.UndefOr[Heuristic] = js.native
}

object AnonClosest {
  @scala.inline
  def apply(): AnonClosest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonClosest]
  }
  @scala.inline
  implicit class AnonClosestOps[Self <: AnonClosest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClosest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closest")(js.undefined)
        ret
    }
    @scala.inline
    def withHeuristic(value: (/* pos0 */ AnonX, /* pos1 */ AnonX) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heuristic")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeuristic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heuristic")(js.undefined)
        ret
    }
  }
  
}

