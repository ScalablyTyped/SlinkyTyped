package typingsSlinky.googleDdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicDNSOptions extends js.Object {
  /**
    * If debug mode is enabled, debug and status information will be
    * written to the console.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Whether to fail or continue synchronizing if the current hostname
    * was not resolved. This typically happens if the domain was created
    * and has not yet been applied or propagated. See TTL (Time-to-Live)
    * for more information. Even if this fails, the update can still be
    * successful.
    */
  var failOnUnresolvedHostName: js.UndefOr[Boolean] = js.native
  /**
    * If `useHostIPAddressCache` is `true`, this option is used to force a
    * DNS request every once in a while. This is the number of seconds
    * until the cache expires.
    */
  var hostIPAddressCacheExpires: js.UndefOr[Double] = js.native
  /**
    * The dynamic DNS hostname.
    */
  var hostname: String = js.native
  /**
    * The maximum number of times to attempt synchronization despite the
    * hostname not being resolved. Applies if `failOnUnresolvedHostName`
    * is `false`.
    */
  var maxUnresolvedHostNameFail: js.UndefOr[Double] = js.native
  /**
    * The dynamic DNS password.
    */
  var password: String = js.native
  /**
    * The URL used to check the current public IP of the device.
    */
  var publicIpUrl: js.UndefOr[String] = js.native
  /**
    * The URL of the Google Dynamic DNS API. Must include the text `%HOSTNAME%` and `%IPADDRESS%` as placeholders for the hostname and IP
    * address.
    */
  var updateIpUrl: js.UndefOr[String] = js.native
  /**
    * Whether to cache the IP address of the DNS record or make a DNS
    * request every time. This can usually be left enabled since this
    * client is the only one responsible for updating the DNS record.
    */
  var useHostIPAddressCache: js.UndefOr[Boolean] = js.native
  /**
    * The HTTP header User-Agent to send when updating the IP address.
    * This is required by the Google Dynamic DNS API.
    */
  var userAgent: js.UndefOr[String] = js.native
  /**
    * The dynamic DNS username.
    */
  var username: String = js.native
}

object DynamicDNSOptions {
  @scala.inline
  def apply(hostname: String, password: String, username: String): DynamicDNSOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDNSOptions]
  }
  @scala.inline
  implicit class DynamicDNSOptionsOps[Self <: DynamicDNSOptions] (val x: Self) extends AnyVal {
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
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnUnresolvedHostName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnUnresolvedHostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnUnresolvedHostName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnUnresolvedHostName")(js.undefined)
        ret
    }
    @scala.inline
    def withHostIPAddressCacheExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIPAddressCacheExpires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostIPAddressCacheExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIPAddressCacheExpires")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUnresolvedHostNameFail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnresolvedHostNameFail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUnresolvedHostNameFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUnresolvedHostNameFail")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateIpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateIpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateIpUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHostIPAddressCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHostIPAddressCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHostIPAddressCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHostIPAddressCache")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(js.undefined)
        ret
    }
  }
  
}

