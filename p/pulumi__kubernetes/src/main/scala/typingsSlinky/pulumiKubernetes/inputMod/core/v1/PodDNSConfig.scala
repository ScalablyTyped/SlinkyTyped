package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from
  * DNSPolicy.
  */
@js.native
trait PodDNSConfig extends js.Object {
  /**
    * A list of DNS name server IP addresses. This will be appended to the base nameservers
    * generated from DNSPolicy. Duplicated nameservers will be removed.
    */
  var nameservers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A list of DNS resolver options. This will be merged with the base options generated from
    * DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will
    * override those that appear in the base DNSPolicy.
    */
  var options: js.UndefOr[Input[js.Array[Input[PodDNSConfigOption]]]] = js.native
  /**
    * A list of DNS search domains for host-name lookup. This will be appended to the base search
    * paths generated from DNSPolicy. Duplicated search paths will be removed.
    */
  var searches: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object PodDNSConfig {
  @scala.inline
  def apply(): PodDNSConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodDNSConfig]
  }
  @scala.inline
  implicit class PodDNSConfigOps[Self <: PodDNSConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameservers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameservers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameservers")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Input[js.Array[Input[PodDNSConfigOption]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSearches(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searches")(js.undefined)
        ret
    }
  }
  
}

