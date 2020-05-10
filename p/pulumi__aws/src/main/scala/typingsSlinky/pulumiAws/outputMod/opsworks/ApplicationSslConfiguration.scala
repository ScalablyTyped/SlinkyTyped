package typingsSlinky.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSslConfiguration extends js.Object {
  var certificate: String = js.native
  var chain: js.UndefOr[String] = js.native
  var privateKey: String = js.native
}

object ApplicationSslConfiguration {
  @scala.inline
  def apply(certificate: String, privateKey: String): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
  @scala.inline
  implicit class ApplicationSslConfigurationOps[Self <: ApplicationSslConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(js.undefined)
        ret
    }
  }
  
}

