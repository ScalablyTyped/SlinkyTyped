package typingsSlinky.grpc.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyCertPair extends js.Object {
  /**
    * The server's certificate chain
    */
  var cert_chain: Buffer = js.native
  /**
    * The server's private key
    */
  var private_key: Buffer = js.native
}

object KeyCertPair {
  @scala.inline
  def apply(cert_chain: Buffer, private_key: Buffer): KeyCertPair = {
    val __obj = js.Dynamic.literal(cert_chain = cert_chain.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCertPair]
  }
  @scala.inline
  implicit class KeyCertPairOps[Self <: KeyCertPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCert_chain(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert_chain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate_key(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

