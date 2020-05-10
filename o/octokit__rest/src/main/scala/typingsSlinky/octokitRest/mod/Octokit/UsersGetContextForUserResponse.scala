package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetContextForUserResponse extends js.Object {
  var contexts: js.Array[UsersGetContextForUserResponseContextsItem] = js.native
}

object UsersGetContextForUserResponse {
  @scala.inline
  def apply(contexts: js.Array[UsersGetContextForUserResponseContextsItem]): UsersGetContextForUserResponse = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetContextForUserResponse]
  }
  @scala.inline
  implicit class UsersGetContextForUserResponseOps[Self <: UsersGetContextForUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[UsersGetContextForUserResponseContextsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

