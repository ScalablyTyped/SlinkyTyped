package typingsSlinky.pulumiAws.inputMod.cloudhsmv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClusterCertificates extends js.Object {
  var awsHardwareCertificate: js.UndefOr[Input[String]] = js.native
  var clusterCertificate: js.UndefOr[Input[String]] = js.native
  var clusterCsr: js.UndefOr[Input[String]] = js.native
  var hsmCertificate: js.UndefOr[Input[String]] = js.native
  var manufacturerHardwareCertificate: js.UndefOr[Input[String]] = js.native
}

object ClusterClusterCertificates {
  @scala.inline
  def apply(): ClusterClusterCertificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterClusterCertificates]
  }
  @scala.inline
  implicit class ClusterClusterCertificatesOps[Self <: ClusterClusterCertificates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsHardwareCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsHardwareCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsHardwareCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsHardwareCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterCsr(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCsr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCsr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterCsr")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsmCertificate")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturerHardwareCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerHardwareCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturerHardwareCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturerHardwareCertificate")(js.undefined)
        ret
    }
  }
  
}

