package typingsSlinky.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificates extends js.Object {
  /**
    * The HSM hardware certificate issued (signed) by AWS CloudHSM.
    */
  var AwsHardwareCertificate: js.UndefOr[Cert] = js.native
  /**
    * The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
    */
  var ClusterCertificate: js.UndefOr[Cert] = js.native
  /**
    * The cluster's certificate signing request (CSR). The CSR exists only when the cluster's state is UNINITIALIZED.
    */
  var ClusterCsr: js.UndefOr[Cert] = js.native
  /**
    * The HSM certificate issued (signed) by the HSM hardware.
    */
  var HsmCertificate: js.UndefOr[Cert] = js.native
  /**
    * The HSM hardware certificate issued (signed) by the hardware manufacturer.
    */
  var ManufacturerHardwareCertificate: js.UndefOr[Cert] = js.native
}

object Certificates {
  @scala.inline
  def apply(): Certificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificates]
  }
  @scala.inline
  implicit class CertificatesOps[Self <: Certificates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsHardwareCertificate(value: Cert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsHardwareCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsHardwareCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsHardwareCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterCertificate(value: Cert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterCsr(value: Cert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCsr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCsr")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmCertificate(value: Cert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturerHardwareCertificate(value: Cert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManufacturerHardwareCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturerHardwareCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManufacturerHardwareCertificate")(js.undefined)
        ret
    }
  }
  
}

