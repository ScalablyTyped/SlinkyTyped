package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEncodedfullhashesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A client ID that (hopefully) uniquely identifies the client
    * implementation of the Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.native
  /**
    * A serialized FindFullHashesRequest proto.
    */
  var encodedRequest: js.UndefOr[String] = js.native
}

object ParamsResourceEncodedfullhashesGet {
  @scala.inline
  def apply(): ParamsResourceEncodedfullhashesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEncodedfullhashesGet]
  }
  @scala.inline
  implicit class ParamsResourceEncodedfullhashesGetOps[Self <: ParamsResourceEncodedfullhashesGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodedRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedRequest")(js.undefined)
        ret
    }
  }
  
}

