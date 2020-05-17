package typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.PushConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OidcToken. */
@js.native
trait IOidcToken extends js.Object {
  /** OidcToken audience */
  var audience: js.UndefOr[String | Null] = js.native
  /** OidcToken serviceAccountEmail */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.native
}

object IOidcToken {
  @scala.inline
  def apply(): IOidcToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOidcToken]
  }
  @scala.inline
  implicit class IOidcTokenOps[Self <: IOidcToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withAudienceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(null)
        ret
    }
    @scala.inline
    def withServiceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmailNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmail")(null)
        ret
    }
  }
  
}

