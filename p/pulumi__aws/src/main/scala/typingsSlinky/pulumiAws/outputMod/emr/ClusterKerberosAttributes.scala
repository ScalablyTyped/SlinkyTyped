package typingsSlinky.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterKerberosAttributes extends js.Object {
  var adDomainJoinPassword: js.UndefOr[String] = js.native
  var adDomainJoinUser: js.UndefOr[String] = js.native
  var crossRealmTrustPrincipalPassword: js.UndefOr[String] = js.native
  var kdcAdminPassword: String = js.native
  var realm: String = js.native
}

object ClusterKerberosAttributes {
  @scala.inline
  def apply(kdcAdminPassword: String, realm: String): ClusterKerberosAttributes = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterKerberosAttributes]
  }
  @scala.inline
  implicit class ClusterKerberosAttributesOps[Self <: ClusterKerberosAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKdcAdminPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdcAdminPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdDomainJoinPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adDomainJoinPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdDomainJoinPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adDomainJoinPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withAdDomainJoinUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adDomainJoinUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdDomainJoinUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adDomainJoinUser")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossRealmTrustPrincipalPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossRealmTrustPrincipalPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossRealmTrustPrincipalPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossRealmTrustPrincipalPassword")(js.undefined)
        ret
    }
  }
  
}

