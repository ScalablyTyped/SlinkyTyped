package typingsSlinky.asana.mod.resources.Projects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersParams extends js.Object {
  var members: js.Array[Double | String] = js.native
}

object MembersParams {
  @scala.inline
  def apply(members: js.Array[Double | String]): MembersParams = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersParams]
  }
  @scala.inline
  implicit class MembersParamsOps[Self <: MembersParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

