package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressSpec describes the Ingress the user wishes to exist.
  */
@js.native
trait IngressSpec extends js.Object {
  /**
    * A default backend capable of servicing requests that don't match any rule. At least one of
    * 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer
    * controller or defaulting logic to specify a global default.
    */
  val backend: IngressBackend = js.native
  /**
    * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all
    * traffic is sent to the default backend.
    */
  val rules: js.Array[IngressRule] = js.native
  /**
    * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple
    * members of this list specify different hosts, they will be multiplexed on the same port
    * according to the hostname specified through the SNI TLS extension, if the ingress
    * controller fulfilling the ingress supports SNI.
    */
  val tls: js.Array[IngressTLS] = js.native
}

object IngressSpec {
  @scala.inline
  def apply(backend: IngressBackend, rules: js.Array[IngressRule], tls: js.Array[IngressTLS]): IngressSpec = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressSpec]
  }
  @scala.inline
  implicit class IngressSpecOps[Self <: IngressSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackend(value: IngressBackend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[IngressRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTls(value: js.Array[IngressTLS]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

