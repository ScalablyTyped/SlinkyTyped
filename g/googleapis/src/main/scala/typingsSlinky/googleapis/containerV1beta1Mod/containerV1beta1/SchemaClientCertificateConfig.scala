package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for client certificates on the cluster.
  */
@js.native
trait SchemaClientCertificateConfig extends js.Object {
  /**
    * Issue a client certificate.
    */
  var issueClientCertificate: js.UndefOr[Boolean] = js.native
}

object SchemaClientCertificateConfig {
  @scala.inline
  def apply(): SchemaClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientCertificateConfig]
  }
  @scala.inline
  implicit class SchemaClientCertificateConfigOps[Self <: SchemaClientCertificateConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssueClientCertificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueClientCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueClientCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueClientCertificate")(js.undefined)
        ret
    }
  }
  
}

