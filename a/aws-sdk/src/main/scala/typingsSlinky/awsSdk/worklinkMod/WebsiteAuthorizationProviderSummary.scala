package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteAuthorizationProviderSummary extends js.Object {
  /**
    * A unique identifier for the authorization provider.
    */
  var AuthorizationProviderId: js.UndefOr[Id] = js.native
  /**
    * The authorization provider type.
    */
  var AuthorizationProviderType: typingsSlinky.awsSdk.worklinkMod.AuthorizationProviderType = js.native
  /**
    * The time of creation.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DomainName] = js.native
}

object WebsiteAuthorizationProviderSummary {
  @scala.inline
  def apply(AuthorizationProviderType: AuthorizationProviderType): WebsiteAuthorizationProviderSummary = {
    val __obj = js.Dynamic.literal(AuthorizationProviderType = AuthorizationProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteAuthorizationProviderSummary]
  }
  @scala.inline
  implicit class WebsiteAuthorizationProviderSummaryOps[Self <: WebsiteAuthorizationProviderSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationProviderType(value: AuthorizationProviderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationProviderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizationProviderId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationProviderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorizationProviderId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
  }
  
}

