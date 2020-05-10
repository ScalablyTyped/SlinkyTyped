package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val nameservers: js.Array[String] = js.native
  /**
    * A list of DNS resolver options. This will be merged with the base options generated from
    * DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will
    * override those that appear in the base DNSPolicy.
    */
  val options: js.Array[PodDNSConfigOption] = js.native
  /**
    * A list of DNS search domains for host-name lookup. This will be appended to the base search
    * paths generated from DNSPolicy. Duplicated search paths will be removed.
    */
  val searches: js.Array[String] = js.native
}

object PodDNSConfig {
  @scala.inline
  def apply(nameservers: js.Array[String], options: js.Array[PodDNSConfigOption], searches: js.Array[String]): PodDNSConfig = {
    val __obj = js.Dynamic.literal(nameservers = nameservers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], searches = searches.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodDNSConfig]
  }
  @scala.inline
  implicit class PodDNSConfigOps[Self <: PodDNSConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameservers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[PodDNSConfigOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searches")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

