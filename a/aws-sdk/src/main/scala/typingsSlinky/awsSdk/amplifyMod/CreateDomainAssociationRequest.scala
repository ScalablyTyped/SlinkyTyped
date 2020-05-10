package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainAssociationRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Domain name for the Domain Association. 
    */
  var domainName: DomainName = js.native
  /**
    *  Enables automated creation of Subdomains for branches. (Currently not supported) 
    */
  var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.native
  /**
    *  Setting structure for the Subdomain. 
    */
  var subDomainSettings: SubDomainSettings = js.native
}

object CreateDomainAssociationRequest {
  @scala.inline
  def apply(appId: AppId, domainName: DomainName, subDomainSettings: SubDomainSettings): CreateDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], subDomainSettings = subDomainSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainAssociationRequest]
  }
  @scala.inline
  implicit class CreateDomainAssociationRequestOps[Self <: CreateDomainAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubDomainSettings(value: SubDomainSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDomainSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAutoSubDomain(value: EnableAutoSubDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoSubDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoSubDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoSubDomain")(js.undefined)
        ret
    }
  }
  
}

