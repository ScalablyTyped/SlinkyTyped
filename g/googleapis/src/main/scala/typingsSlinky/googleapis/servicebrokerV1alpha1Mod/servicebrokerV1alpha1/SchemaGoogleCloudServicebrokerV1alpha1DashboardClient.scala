package typingsSlinky.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing information required to activate Dashboard SSO feature.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1alpha1DashboardClient extends js.Object {
  /**
    * The id of the Oauth client that the dashboard will use.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A URI for the service dashboard. Validated by the OAuth token server when
    * the dashboard requests a token.
    */
  var redirect_uri: js.UndefOr[String] = js.native
  /**
    * A secret for the dashboard client.
    */
  var secret: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1alpha1DashboardClient {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1DashboardClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1DashboardClient]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1DashboardClientOps[Self <: SchemaGoogleCloudServicebrokerV1alpha1DashboardClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRedirect_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_uri")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
  }
  
}

