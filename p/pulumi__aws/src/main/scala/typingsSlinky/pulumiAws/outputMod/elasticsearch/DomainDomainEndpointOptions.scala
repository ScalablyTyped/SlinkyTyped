package typingsSlinky.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDomainEndpointOptions extends js.Object {
  /**
    * Whether or not to require HTTPS
    */
  var enforceHttps: Boolean = js.native
  var tlsSecurityPolicy: String = js.native
}

object DomainDomainEndpointOptions {
  @scala.inline
  def apply(enforceHttps: Boolean, tlsSecurityPolicy: String): DomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal(enforceHttps = enforceHttps.asInstanceOf[js.Any], tlsSecurityPolicy = tlsSecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDomainEndpointOptions]
  }
  @scala.inline
  implicit class DomainDomainEndpointOptionsOps[Self <: DomainDomainEndpointOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnforceHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceHttps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTlsSecurityPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsSecurityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

