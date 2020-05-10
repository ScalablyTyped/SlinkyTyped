package typingsSlinky.chrome.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateVerificationDetails extends js.Object {
  /** The hostname of the server to verify the certificate for, e.g. the server that presented the serverCertificateChain. */
  var hostname: String = js.native
  /** Each chain entry must be the DER encoding of a X.509 certificate, the first entry must be the server certificate and each entry must certify the entry preceding it. */
  var serverCertificateChain: js.Array[js.typedarray.ArrayBuffer] = js.native
}

object ServerCertificateVerificationDetails {
  @scala.inline
  def apply(hostname: String, serverCertificateChain: js.Array[js.typedarray.ArrayBuffer]): ServerCertificateVerificationDetails = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], serverCertificateChain = serverCertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateVerificationDetails]
  }
  @scala.inline
  implicit class ServerCertificateVerificationDetailsOps[Self <: ServerCertificateVerificationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCertificateChain(value: js.Array[js.typedarray.ArrayBuffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCertificateChain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

