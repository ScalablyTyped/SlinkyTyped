package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity delegation history of an authenticated service account.
  */
@js.native
trait SchemaServiceAccountDelegationInfo extends js.Object {
  /**
    * First party (Google) identity as the real authority.
    */
  var firstPartyPrincipal: js.UndefOr[SchemaFirstPartyPrincipal] = js.native
  /**
    * Third party identity as the real authority.
    */
  var thirdPartyPrincipal: js.UndefOr[SchemaThirdPartyPrincipal] = js.native
}

object SchemaServiceAccountDelegationInfo {
  @scala.inline
  def apply(): SchemaServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountDelegationInfo]
  }
  @scala.inline
  implicit class SchemaServiceAccountDelegationInfoOps[Self <: SchemaServiceAccountDelegationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstPartyPrincipal(value: SchemaFirstPartyPrincipal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyPrincipal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPartyPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyPrincipal")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyPrincipal(value: SchemaThirdPartyPrincipal): Self = {
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

