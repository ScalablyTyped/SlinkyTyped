package typingsSlinky.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var backend: js.UndefOr[Input[IngressBackend]] = js.native
  /**
    * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all
    * traffic is sent to the default backend.
    */
  var rules: js.UndefOr[Input[js.Array[Input[IngressRule]]]] = js.native
  /**
    * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple
    * members of this list specify different hosts, they will be multiplexed on the same port
    * according to the hostname specified through the SNI TLS extension, if the ingress
    * controller fulfilling the ingress supports SNI.
    */
  var tls: js.UndefOr[Input[js.Array[Input[IngressTLS]]]] = js.native
}

object IngressSpec {
  @scala.inline
  def apply(): IngressSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngressSpec]
  }
  @scala.inline
  implicit class IngressSpecOps[Self <: IngressSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackend(value: Input[IngressBackend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: Input[js.Array[Input[IngressRule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withTls(value: Input[js.Array[Input[IngressTLS]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tls")(js.undefined)
        ret
    }
  }
  
}

