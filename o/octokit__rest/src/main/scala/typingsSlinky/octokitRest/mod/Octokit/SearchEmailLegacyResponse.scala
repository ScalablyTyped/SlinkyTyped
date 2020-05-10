package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchEmailLegacyResponse extends js.Object {
  var user: SearchEmailLegacyResponseUser = js.native
}

object SearchEmailLegacyResponse {
  @scala.inline
  def apply(user: SearchEmailLegacyResponseUser): SearchEmailLegacyResponse = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEmailLegacyResponse]
  }
  @scala.inline
  implicit class SearchEmailLegacyResponseOps[Self <: SearchEmailLegacyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser(value: SearchEmailLegacyResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

