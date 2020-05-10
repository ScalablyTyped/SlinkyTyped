package typingsSlinky.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowJoinData extends js.Object {
  var id: String = js.native
  var r: Double = js.native
  var un: String = js.native
}

object FollowJoinData {
  @scala.inline
  def apply(id: String, r: Double, un: String): FollowJoinData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowJoinData]
  }
  @scala.inline
  implicit class FollowJoinDataOps[Self <: FollowJoinData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("un")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

