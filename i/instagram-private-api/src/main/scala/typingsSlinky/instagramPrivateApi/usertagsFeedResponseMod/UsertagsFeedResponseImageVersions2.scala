package typingsSlinky.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsertagsFeedResponseImageVersions2 extends js.Object {
  var candidates: js.Array[UsertagsFeedResponseCandidatesItem] = js.native
}

object UsertagsFeedResponseImageVersions2 {
  @scala.inline
  def apply(candidates: js.Array[UsertagsFeedResponseCandidatesItem]): UsertagsFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsertagsFeedResponseImageVersions2]
  }
  @scala.inline
  implicit class UsertagsFeedResponseImageVersions2Ops[Self <: UsertagsFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidates(value: js.Array[UsertagsFeedResponseCandidatesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

