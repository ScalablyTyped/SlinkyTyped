package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationInfo extends js.Object {
  /**
    * The authority selector specified by the requestor, if any.
    * It is not guaranteed that the principal was allowed to use this authority.
    */
  var authoritySelector: js.UndefOr[String] = js.native
  /**
    * The email address of the authenticated user (or service account on behalf
    * of third party principal) making the request. For privacy reasons, the
    * principal email address is redacted for all read-only operations that fail
    * with a "permission denied" error.
    */
  var principalEmail: js.UndefOr[String] = js.native
  /**
    * The third party identification (if any) of the authenticated user making
    * the request.
    * When the JSON object represented here has a proto equivalent, the proto
    * name will be indicated in the `@type` property.
    */
  var thirdPartyPrincipal: js.UndefOr[Record[String, _]] = js.native
}

object AuthenticationInfo {
  @scala.inline
  def apply(): AuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationInfo]
  }
  @scala.inline
  implicit class AuthenticationInfoOps[Self <: AuthenticationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthoritySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoritySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthoritySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authoritySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyPrincipal(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyPrincipal")(js.undefined)
        ret
    }
  }
  
}

