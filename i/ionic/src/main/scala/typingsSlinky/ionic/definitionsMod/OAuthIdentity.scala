package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ A in ionic.ionic/definitions.AssociationType ]:? ionic.ionic/definitions.OAuthIdentityDetails} */
@js.native
trait OAuthIdentity extends js.Object {
  var bitbucket_cloud: js.UndefOr[OAuthIdentityDetails] = js.native
  var bitbucket_server: js.UndefOr[OAuthIdentityDetails] = js.native
  var github: js.UndefOr[OAuthIdentityDetails] = js.native
}

object OAuthIdentity {
  @scala.inline
  def apply(): OAuthIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthIdentity]
  }
  @scala.inline
  implicit class OAuthIdentityOps[Self <: OAuthIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitbucket_cloud(value: OAuthIdentityDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitbucket_cloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitbucket_cloud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitbucket_cloud")(js.undefined)
        ret
    }
    @scala.inline
    def withBitbucket_server(value: OAuthIdentityDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitbucket_server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitbucket_server: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitbucket_server")(js.undefined)
        ret
    }
    @scala.inline
    def withGithub(value: OAuthIdentityDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("github")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGithub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("github")(js.undefined)
        ret
    }
  }
  
}

