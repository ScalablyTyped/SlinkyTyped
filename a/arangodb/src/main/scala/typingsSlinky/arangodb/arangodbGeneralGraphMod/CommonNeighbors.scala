package typingsSlinky.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonNeighbors extends js.Object {
  var left: String = js.native
  var neighbors: js.Array[String] = js.native
  var right: String = js.native
}

object CommonNeighbors {
  @scala.inline
  def apply(left: String, neighbors: js.Array[String], right: String): CommonNeighbors = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonNeighbors]
  }
  @scala.inline
  implicit class CommonNeighborsOps[Self <: CommonNeighbors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeighbors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighbors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

