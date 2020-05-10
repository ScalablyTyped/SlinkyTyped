package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.AnonCustom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembershipsInputParameters extends GetObjectsParameters {
  var spaces: js.Array[AnonCustom] = js.native
  var userId: String = js.native
}

object MembershipsInputParameters {
  @scala.inline
  def apply(spaces: js.Array[AnonCustom], userId: String): MembershipsInputParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipsInputParameters]
  }
  @scala.inline
  implicit class MembershipsInputParametersOps[Self <: MembershipsInputParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpaces(value: js.Array[AnonCustom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

