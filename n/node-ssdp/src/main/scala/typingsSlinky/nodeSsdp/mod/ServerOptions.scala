package typingsSlinky.nodeSsdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends ClientOptions {
  /**
  	 * Interval at which to send out advertisement (ms)
  	 * @default 10000
  	 */
  var adInterval: js.UndefOr[Double] = js.native
  /**
  	 * Allow wildcards in M-SEARCH packets (non-standard)
  	 * @default false
  	 */
  var allowWildcards: js.UndefOr[Boolean] = js.native
  /**
  	 * URL pointing to description of your service, or a function that returns that URL.
  	 * For cases where there are multiple network interfaces or the IP of the host isn't known in advance,
  	 * it's possible to specify location as an object. Host will be set to the IP of the responding interface.
  	 */
  var location: js.UndefOr[String | ServiceDescriptionLocation] = js.native
  /**
  	 * When true the SSDP server will not advertise the root device (i.e. the bare UDN). In some scenarios, this advertisement is not needed.
  	 * @default false
  	 */
  var suppressRootDeviceAdvertisements: js.UndefOr[Boolean] = js.native
  /**
  	 * Packet TTL
  	 * @default 1800
  	 */
  var ttl: js.UndefOr[Double] = js.native
  /**
  	 * SSDP Unique Device Name
  	 * @default 'uuid:f40c2981-7329-40b7-8b04-27f187aecfb5'
  	 */
  var udn: js.UndefOr[String] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowWildcards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowWildcards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWildcards")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String | ServiceDescriptionLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressRootDeviceAdvertisements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRootDeviceAdvertisements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressRootDeviceAdvertisements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRootDeviceAdvertisements")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withUdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUdn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("udn")(js.undefined)
        ret
    }
  }
  
}

