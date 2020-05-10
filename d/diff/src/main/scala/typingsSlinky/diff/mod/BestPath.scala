package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BestPath extends js.Object {
  var componenets: js.Array[Change] = js.native
  var newPos: Double = js.native
}

object BestPath {
  @scala.inline
  def apply(componenets: js.Array[Change], newPos: Double): BestPath = {
    val __obj = js.Dynamic.literal(componenets = componenets.asInstanceOf[js.Any], newPos = newPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[BestPath]
  }
  @scala.inline
  implicit class BestPathOps[Self <: BestPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponenets(value: js.Array[Change]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componenets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

