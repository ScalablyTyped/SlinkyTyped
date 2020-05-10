package typingsSlinky.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsertagsFeedResponseUsertags extends js.Object {
  var in: js.Array[UsertagsFeedResponseInItem] = js.native
}

object UsertagsFeedResponseUsertags {
  @scala.inline
  def apply(in: js.Array[UsertagsFeedResponseInItem]): UsertagsFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsertagsFeedResponseUsertags]
  }
  @scala.inline
  implicit class UsertagsFeedResponseUsertagsOps[Self <: UsertagsFeedResponseUsertags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: js.Array[UsertagsFeedResponseInItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

