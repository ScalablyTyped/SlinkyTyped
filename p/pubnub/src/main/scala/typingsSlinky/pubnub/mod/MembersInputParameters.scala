package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.AnonCustom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersInputParameters extends GetObjectsParameters {
  var spaceId: String = js.native
  var users: js.Array[AnonCustom] = js.native
}

object MembersInputParameters {
  @scala.inline
  def apply(spaceId: String, users: js.Array[AnonCustom]): MembersInputParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersInputParameters]
  }
  @scala.inline
  implicit class MembersInputParametersOps[Self <: MembersInputParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[AnonCustom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

