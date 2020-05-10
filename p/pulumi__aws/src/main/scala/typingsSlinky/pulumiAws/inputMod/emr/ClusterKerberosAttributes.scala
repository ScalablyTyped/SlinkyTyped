package typingsSlinky.pulumiAws.inputMod.emr

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterKerberosAttributes extends js.Object {
  var adDomainJoinPassword: js.UndefOr[Input[String]] = js.native
  var adDomainJoinUser: js.UndefOr[Input[String]] = js.native
  var crossRealmTrustPrincipalPassword: js.UndefOr[Input[String]] = js.native
  var kdcAdminPassword: Input[String] = js.native
  var realm: Input[String] = js.native
}

object ClusterKerberosAttributes {
  @scala.inline
  def apply(kdcAdminPassword: Input[String], realm: Input[String]): ClusterKerberosAttributes = {
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
    def withKdcAdminPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdcAdminPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdDomainJoinPassword(value: Input[String]): Self = {
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
    def withAdDomainJoinUser(value: Input[String]): Self = {
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
    def withCrossRealmTrustPrincipalPassword(value: Input[String]): Self = {
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

