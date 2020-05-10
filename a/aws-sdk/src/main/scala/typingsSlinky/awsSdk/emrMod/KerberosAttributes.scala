package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KerberosAttributes extends js.Object {
  /**
    * The Active Directory password for ADDomainJoinUser.
    */
  var ADDomainJoinPassword: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain.
    */
  var ADDomainJoinUser: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms.
    */
  var CrossRealmTrustPrincipalPassword: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster.
    */
  var KdcAdminPassword: XmlStringMaxLen256 = js.native
  /**
    * The name of the Kerberos realm to which all nodes in a cluster belong. For example, EC2.INTERNAL. 
    */
  var Realm: XmlStringMaxLen256 = js.native
}

object KerberosAttributes {
  @scala.inline
  def apply(KdcAdminPassword: XmlStringMaxLen256, Realm: XmlStringMaxLen256): KerberosAttributes = {
    val __obj = js.Dynamic.literal(KdcAdminPassword = KdcAdminPassword.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[KerberosAttributes]
  }
  @scala.inline
  implicit class KerberosAttributesOps[Self <: KerberosAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKdcAdminPassword(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KdcAdminPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Realm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withADDomainJoinPassword(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADDomainJoinPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutADDomainJoinPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADDomainJoinPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withADDomainJoinUser(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADDomainJoinUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutADDomainJoinUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADDomainJoinUser")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossRealmTrustPrincipalPassword(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossRealmTrustPrincipalPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossRealmTrustPrincipalPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossRealmTrustPrincipalPassword")(js.undefined)
        ret
    }
  }
  
}

