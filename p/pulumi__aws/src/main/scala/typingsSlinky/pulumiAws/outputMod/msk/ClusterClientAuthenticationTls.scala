package typingsSlinky.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterClientAuthenticationTls extends js.Object {
  /**
    * List of ACM Certificate Authority Amazon Resource Names (ARNs).
    */
  var certificateAuthorityArns: js.UndefOr[js.Array[String]] = js.native
}

object ClusterClientAuthenticationTls {
  @scala.inline
  def apply(): ClusterClientAuthenticationTls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterClientAuthenticationTls]
  }
  @scala.inline
  implicit class ClusterClientAuthenticationTlsOps[Self <: ClusterClientAuthenticationTls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityArns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityArns")(js.undefined)
        ret
    }
  }
  
}

