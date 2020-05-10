package typingsSlinky.pulumiAws.outputMod.cloudhsmv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterClusterCertificates extends js.Object {
  var awsHardwareCertificate: String = js.native
  var clusterCertificate: String = js.native
  var clusterCsr: String = js.native
  var hsmCertificate: String = js.native
  var manufacturerHardwareCertificate: String = js.native
}

object GetClusterClusterCertificates {
  @scala.inline
  def apply(
    awsHardwareCertificate: String,
    clusterCertificate: String,
    clusterCsr: String,
    hsmCertificate: String,
    manufacturerHardwareCertificate: String
  ): GetClusterClusterCertificates = {
    val __obj = js.Dynamic.literal(awsHardwareCertificate = awsHardwareCertificate.asInstanceOf[js.Any], clusterCertificate = clusterCertificate.asInstanceOf[js.Any], clusterCsr = clusterCsr.asInstanceOf[js.Any], hsmCertificate = hsmCertificate.asInstanceOf[js.Any], manufacturerHardwareCertificate = manufacturerHardwareCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterClusterCertificates]
  }
  @scala.inline
  implicit class GetClusterClusterCertificatesOps[Self <: GetClusterClusterCertificates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsHardwareCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsHardwareCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterCsr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCsr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHsmCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturerHardwareCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerHardwareCertificate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

