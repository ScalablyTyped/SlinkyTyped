package typingsSlinky.onionoo.mod.Onionoo

import typingsSlinky.onionoo.onionooStrings.`new in series`
import typingsSlinky.onionoo.onionooStrings.experimental
import typingsSlinky.onionoo.onionooStrings.obsolete
import typingsSlinky.onionoo.onionooStrings.recommended
import typingsSlinky.onionoo.onionooStrings.unrecommended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bridge extends js.Object {
  /**
    * Bandwidth in bytes per second that this bridge is willing and capable to provide. This bandwidth value
    * is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[Double] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was first seen in a bridge network status.
    */
  var first_seen: String = js.native
  /**
    * Array of relay flags that the bridge authority assigned to this bridge. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  /**
    * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var hashed_fingerprint: String = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the bridge was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[String] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this bridge was last seen in a bridge network status.
    */
  var last_seen: String = js.native
  /**
    * Bridge nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: String = js.native
  /**
    * Array of sanitized IPv4 or IPv6 addresses and TCP ports or port lists where the bridge accepts
    * onion-routing connections. The first address is the primary onion-routing address that the bridge used
    * to register in the network, subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    * Sanitized IP addresses are always in `10/8` or `[fd9f:2e19:3bcf/48]` IP networks and are only useful
    * to learn which IP version the bridge uses and to detect whether the bridge changed its address.
    * Sanitized IP addresses always change on the 1st of every month at 00:00:00 UTC, regardless of the bridge
    * actually changing its IP address. TCP ports are not sanitized.
    */
  var or_addresses: js.Array[String] = js.native
  /**
    * Platform string containing operating system and Tor version details.
    * Omitted if not provided by the bridge or if descriptor containing this information cannot be found.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Boolean field saying whether the Tor software version of this bridge is recommended by the directory
    * authorities or not. Uses the bridge version in the bridge network status. Omitted if either the directory
    * authorities did not recommend versions, or the bridge did not report which version it runs.
    */
  var recommended_version: js.UndefOr[Boolean] = js.native
  /**
    * Boolean field saying whether this bridge was listed as running in the last bridge network status.
    */
  var running: Boolean = js.native
  /**
    * Array of (pluggable) transport names supported by this bridge.
    */
  var transports: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tor software version without leading "Tor" as reported by the bridge in the "platform" line of its server
    * descriptor. Omitted if not provided by the bridge, if the descriptor containing this information cannot
    * be found, or if the bridge runs an alternative Tor implementation.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Status of the Tor software version of this bridge based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a
    * version is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components, and the
    * version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the bridge did not report which version it runs.
    */
  var version_status: js.UndefOr[recommended | experimental | obsolete | (`new in series`) | unrecommended] = js.native
}

object Bridge {
  @scala.inline
  def apply(
    first_seen: String,
    hashed_fingerprint: String,
    last_seen: String,
    nickname: String,
    or_addresses: js.Array[String],
    running: Boolean
  ): Bridge = {
    val __obj = js.Dynamic.literal(first_seen = first_seen.asInstanceOf[js.Any], hashed_fingerprint = hashed_fingerprint.asInstanceOf[js.Any], last_seen = last_seen.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], or_addresses = or_addresses.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  @scala.inline
  implicit class BridgeOps[Self <: Bridge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst_seen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_seen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashed_fingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashed_fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_seen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_seen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOr_addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or_addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvertised_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertised_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertised_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertised_bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_restarted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_restarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_restarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_restarted")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommended_version(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommended_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommended_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommended_version")(js.undefined)
        ret
    }
    @scala.inline
    def withTransports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion_status(value: recommended | experimental | obsolete | (`new in series`) | unrecommended): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_status")(js.undefined)
        ret
    }
  }
  
}

