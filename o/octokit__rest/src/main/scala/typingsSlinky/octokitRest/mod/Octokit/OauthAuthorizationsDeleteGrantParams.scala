package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthAuthorizationsDeleteGrantParams extends js.Object {
  var grant_id: Double = js.native
}

object OauthAuthorizationsDeleteGrantParams {
  @scala.inline
  def apply(grant_id: Double): OauthAuthorizationsDeleteGrantParams = {
    val __obj = js.Dynamic.literal(grant_id = grant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsDeleteGrantParams]
  }
  @scala.inline
  implicit class OauthAuthorizationsDeleteGrantParamsOps[Self <: OauthAuthorizationsDeleteGrantParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrant_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

