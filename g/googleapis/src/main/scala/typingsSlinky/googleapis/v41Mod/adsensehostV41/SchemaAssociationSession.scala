package typingsSlinky.googleapis.v41Mod.adsensehostV41

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAssociationSession extends js.Object {
  /**
    * Hosted account id of the associated publisher after association. Present
    * if status is ACCEPTED.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Unique identifier of this association session.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsensehost#associationSession.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The products to associate with the user. Options: AFC, AFG, AFV, AFS
    * (deprecated), AFMC (deprecated)
    */
  var productCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Redirect URL of this association session. Used to redirect users into the
    * AdSense association flow.
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * Status of the completed association, available once the association
    * callback token has been verified. One of ACCEPTED, REJECTED, or ERROR.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The preferred locale of the user themselves when going through the
    * AdSense association flow.
    */
  var userLocale: js.UndefOr[String] = js.native
  /**
    * The locale of the user&#39;s hosted website.
    */
  var websiteLocale: js.UndefOr[String] = js.native
  /**
    * The URL of the user&#39;s hosted website.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}

object SchemaAssociationSession {
  @scala.inline
  def apply(): SchemaAssociationSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssociationSession]
  }
  @scala.inline
  implicit class SchemaAssociationSessionOps[Self <: SchemaAssociationSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProductCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteUrl")(js.undefined)
        ret
    }
  }
  
}

