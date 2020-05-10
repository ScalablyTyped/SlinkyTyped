package typingsSlinky.followRedirects.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowResponse extends js.Object {
  var redirects: js.Array[Redirect] = js.native
  var responseUrl: String = js.native
}

object FollowResponse {
  @scala.inline
  def apply(redirects: js.Array[Redirect], responseUrl: String): FollowResponse = {
    val __obj = js.Dynamic.literal(redirects = redirects.asInstanceOf[js.Any], responseUrl = responseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowResponse]
  }
  @scala.inline
  implicit class FollowResponseOps[Self <: FollowResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirects(value: js.Array[Redirect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

