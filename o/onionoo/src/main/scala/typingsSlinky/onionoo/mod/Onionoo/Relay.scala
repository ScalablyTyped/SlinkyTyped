package typingsSlinky.onionoo.mod.Onionoo

import typingsSlinky.onionoo.AnonAccept
import typingsSlinky.onionoo.onionooStrings.`new in series`
import typingsSlinky.onionoo.onionooStrings.experimental
import typingsSlinky.onionoo.onionooStrings.obsolete
import typingsSlinky.onionoo.onionooStrings.recommended
import typingsSlinky.onionoo.onionooStrings.unrecommended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relay extends js.Object {
  /**
    * Bandwidth in bytes per second that this relay is willing and capable to provide. This bandwidth
    * value is the minimum of `bandwidth_rate`, `bandwidth_burst`, and `observed_bandwidth`.
    * Missing if router descriptor containing this information cannot be found.
    */
  var advertised_bandwidth: js.UndefOr[Double] = js.native
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family but they don't consider this relay to be part of their family.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var alleged_family: js.UndefOr[js.Array[String]] = js.native
  /**
    * AS number as found in an AS database by resolving the relay's first onion-routing IP address.
    * AS number strings start with "AS", followed directly by the AS number. Omitted if the relay IP
    * address could not be found in the AS database.
    */
  var as: js.UndefOr[String] = js.native
  /**
    * AS name as found in an AS database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the AS database.
    */
  var as_name: js.UndefOr[String] = js.native
  /**
    * Bandwidth in bytes per second that this relay is willing to sustain in very short intervals.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_burst: js.UndefOr[Double] = js.native
  /**
    * Average bandwidth in bytes per second that this relay is willing to sustain over long periods.
    * Missing if router descriptor containing this information cannot be found.
    */
  var bandwidth_rate: js.UndefOr[Double] = js.native
  /**
    * City name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a city name.
    */
  var city_name: js.UndefOr[String] = js.native
  /**
    * Weight assigned to this relay by the directory authorities that clients use in their path selection algorithm.
    * The unit is arbitrary; currently it's kilobytes per second, but that might change in the future.
    */
  var consensus_weight: Double = js.native
  /**
    * Fraction of this relay's consensus weight compared to the sum of all consensus weights in the network.
    * This fraction is a very rough approximation of the probability of this relay to be selected by clients.
    * Omitted if the relay is not running.
    */
  var consensus_weight_fraction: js.UndefOr[Double] = js.native
  /**
    * Contact address of the relay operator. Omitted if empty or if descriptor containing this information
    * cannot be found.
    */
  var contact: js.UndefOr[String] = js.native
  /**
    * Two-letter lower-case country code as found in a GeoIP database by resolving the relay's first
    * onion-routing IP address. Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a country name.
    */
  var country_name: js.UndefOr[String] = js.native
  /**
    * IPv4 address and TCP port where the relay accepts directory connections.
    * Omitted if the relay does not accept directory connections.
    */
  var dir_address: js.UndefOr[String] = js.native
  /**
    * Array of fingerprints of relays that are in an effective, mutual family relationship with this relay.
    * These relays are part of this relay's family and they consider this relay to be part of their family.
    * Always contains the relay's own fingerprint. Omitted if the descriptor containing this information
    * cannot be found.
    */
  var effective_family: js.UndefOr[js.Array[String]] = js.native
  /**
    * Array of IPv4 addresses that the relay used to exit to the Internet in the past 24 hours. Omitted if
    * array is empty. Includes all exit addresses, regardless of whether they are used as onion-routing addresses
    * or not.
    */
  var exit_addresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Array of exit-policy lines. Missing if router descriptor containing this information cannot be found.
    * May contradict the `exit_policy_summary` field in a rare edge case: this happens when the relay changes
    * its exit policy after the directory authorities summarized the previous exit policy.
    */
  var exit_policy: js.UndefOr[js.Array[String]] = js.native
  /**
    * Summary version of the relay's exit policy containing a dictionary with either an `accept` or a `reject` element.
    * If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. May contradict the
    * `exit_policy` field in a rare edge case: this happens when the relay changes its exit policy after
    * the directory authorities summarized the previous exit policy.
    */
  var exit_policy_summary: js.UndefOr[AnonAccept] = js.native
  /**
    * Summary version of the relay's IPv6 exit policy containing a dictionary with either an `accept` or a `reject`
    * element. If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
    * in the given list for most IP addresses and rejects (accepts) all other ports. Missing if the relay rejects
    * all connections to IPv6 addresses. May contradict the `exit_policy_summary` field in a rare edge case:
    * this happens when the relay changes its exit policy after the directory authorities summarized the previous
    * exit policy.
    */
  var exit_policy_v6_summary: js.UndefOr[AnonAccept] = js.native
  /**
    * Probability of this relay to be selected for the exit position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var exit_probability: js.UndefOr[Double] = js.native
  /**
    * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: String = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was first seen in a network status consensus.
    */
  var first_seen: String = js.native
  /**
    * Array of relay flags that the directory authorities assigned to this relay. May be omitted if empty.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Probability of this relay to be selected for the guard position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var guard_probability: js.UndefOr[Double] = js.native
  /**
    * Boolean field saying whether this relay indicated that it is hibernating in its last known server descriptor.
    * This information may be helpful to decide whether a relay that is not running anymore has reached its
    * accounting limit and has not dropped out of the network for another, unknown reason. Omitted if either
    * the relay is not hibernating, or if no information is available about the hibernation status of the relay.
    */
  var hibernating: js.UndefOr[Boolean] = js.native
  /**
    * Host name as found in a reverse DNS lookup of the relay's primary IP address. This field is updated at most
    * once in 12 hours, unless the relay IP address changes. Omitted if the relay IP address was not looked up,
    * if no lookup request was successful yet, or if no A record was found matching the PTR record.
    * @deprecated
    */
  var host_name: js.UndefOr[String] = js.native
  /**
    * Array of fingerprints of relays that are not in an effective, mutual family relationship with this relay
    * but that can be reached by following effective, mutual family relationships starting at this relay.
    * Omitted if empty or if descriptor containing this information cannot be found.
    */
  var indirect_family: js.UndefOr[js.Array[String]] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay last stopped announcing an IPv4 or IPv6 address or
    * TCP port where it previously accepted onion-routing or directory connections. This timestamp can serve
    * as indicator whether this relay would be a suitable fallback directory.
    */
  var last_changed_address_or_port: String = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the relay was last (re-)started.
    * Missing if router descriptor containing this information cannot be found.
    */
  var last_restarted: js.UndefOr[String] = js.native
  /**
    * UTC timestamp (YYYY-MM-DD hh:mm:ss) when this relay was last seen in a network status consensus.
    */
  var last_seen: String = js.native
  /**
    * Latitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database.
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * Boolean field saying whether the consensus weight of this relay is based on a threshold of 3 or more
    * measurements by Tor bandwidth authorities. Omitted if the network status consensus containing this
    * relay does not contain measurement information.
    */
  var measured: js.UndefOr[Boolean] = js.native
  /**
    * Probability of this relay to be selected for the middle position. This probability is calculated based on
    * consensus weights, relay flags, and bandwidth weights in the consensus. Path selection depends on more
    * factors, so that this probability can only be an approximation. Omitted if the relay is not running,
    * or the consensus does not contain bandwidth weights.
    */
  var middle_probability: js.UndefOr[Double] = js.native
  /**
    * Relay nickname consisting of 1–19 alphanumerical characters.
    */
  var nickname: String = js.native
  /**
    * Bandwidth estimate in bytes per second of the capacity this relay can handle. The relay remembers
    * the maximum bandwidth sustained output over any ten second period in the past day, and another
    * sustained input. The `observed_bandwidth` value is the lesser of these two numbers. Missing if
    * router descriptor containing this information cannot be found.
    */
  var observed_bandwidth: js.UndefOr[Double] = js.native
  /**
    * Array of IPv4 or IPv6 addresses and TCP ports or port lists where the relay accepts onion-routing connections.
    * The first address is the primary onion-routing address that the relay used to register in the network,
    * subsequent addresses are in arbitrary order. IPv6 hex characters are all lower-case.
    */
  var or_addresses: js.Array[String] = js.native
  /**
    * Platform string containing operating system and Tor version details. Omitted if empty or if descriptor
    * containing this information cannot be found.
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * Boolean field saying whether the Tor software version of this relay is recommended by the directory
    * authorities or not. Uses the relay version in the consensus. Omitted if either the directory authorities
    * did not recommend versions, or the relay did not report which version it runs.
    */
  var recommended_version: js.UndefOr[Boolean] = js.native
  /**
    * Region name as found in a GeoIP database by resolving the relay's first onion-routing IP address.
    * Omitted if the relay IP address could not be found in the GeoIP database, or if the GeoIP database
    * did not contain a region name.
    */
  var region_name: js.UndefOr[String] = js.native
  /**
    * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
    */
  var running: Boolean = js.native
  /**
    * Array of IPv4 or IPv6 addresses and TCP ports or port lists where the relay claims in its descriptor to
    * accept onion-routing connections but that the directory authorities failed to confirm as reachable.
    * Contains only additional addresses of a relay that are found unreachable and only as long as a minority of
    * directory authorities performs reachability tests on these additional addresses. Relays with an unreachable
    * primary address are not included in the network status consensus and excluded entirely. Likewise, relays
    * with unreachable additional addresses tested by a majority of directory authorities are not included in
    * the network status consensus and excluded here, too. If at any point network status votes will be added
    * to the processing, relays with unreachable addresses will be included here. Addresses are in arbitrary order.
    * IPv6 hex characters are all lower-case. Omitted if empty.
    */
  var unreachable_or_addresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address that for which a matching
    * A record was not found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if A records
    * were found matching all PTR records (i.e. it was possible to verify the value of each of the PTR records).
    * A DNSSEC validating resolver is used for these lookups. Failure to validate DNSSEC signatures will prevent
    * those names from appearing in this field.
    */
  var unverified_host_names: js.UndefOr[js.Array[String]] = js.native
  /**
    * Host names as found in a reverse DNS lookup of the relay's primary IP address for which a matching A record
    * was also found. This field is updated at most once in 12 hours, unless the relay IP address changes.
    * Omitted if the relay IP address was not looked up, if no lookup request was successful yet, or if no
    * A records were found matching the PTR records (i.e. it was not possible to verify the value of any
    * of the PTR records). A DNSSEC validating resolver is used for these lookups. Failure to validate
    * DNSSEC signatures will prevent those names from appearing in this field.
    */
  var verified_host_names: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tor software version without leading "Tor" as reported by the directory authorities in the "v" line of
    * the consensus. Omitted if either the directory authorities or the relay did not report which version
    * the relay runs or if the relay runs an alternative Tor implementation.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * Status of the Tor software version of this relay based on the versions recommended by the directory authorities.
    * Possible version statuses are: `recommended` if a version is listed as recommended; `experimental` if a version
    * is newer than every recommended version; `obsolete` if a version is older than every recommended version;
    * `new in series` if a version has other recommended versions with the same first three components,
    * and the version is newer than all such recommended versions, but it is not newer than every recommended version;
    * `unrecommended` if none of the above conditions hold. Omitted if either the directory authorities did not
    * recommend versions, or the relay did not report which version it runs.
    */
  var version_status: js.UndefOr[recommended | experimental | obsolete | (`new in series`) | unrecommended] = js.native
}

object Relay {
  @scala.inline
  def apply(
    consensus_weight: Double,
    fingerprint: String,
    first_seen: String,
    last_changed_address_or_port: String,
    last_seen: String,
    nickname: String,
    or_addresses: js.Array[String],
    running: Boolean
  ): Relay = {
    val __obj = js.Dynamic.literal(consensus_weight = consensus_weight.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], first_seen = first_seen.asInstanceOf[js.Any], last_changed_address_or_port = last_changed_address_or_port.asInstanceOf[js.Any], last_seen = last_seen.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], or_addresses = or_addresses.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relay]
  }
  @scala.inline
  implicit class RelayOps[Self <: Relay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsensus_weight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensus_weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_seen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_seen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_changed_address_or_port(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_changed_address_or_port")(value.asInstanceOf[js.Any])
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
    def withAlleged_family(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alleged_family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlleged_family: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alleged_family")(js.undefined)
        ret
    }
    @scala.inline
    def withAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAs_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as_name")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidth_burst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth_burst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth_burst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth_burst")(js.undefined)
        ret
    }
    @scala.inline
    def withBandwidth_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth_rate")(js.undefined)
        ret
    }
    @scala.inline
    def withCity_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city_name")(js.undefined)
        ret
    }
    @scala.inline
    def withConsensus_weight_fraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensus_weight_fraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsensus_weight_fraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensus_weight_fraction")(js.undefined)
        ret
    }
    @scala.inline
    def withContact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_name")(js.undefined)
        ret
    }
    @scala.inline
    def withDir_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir_address")(js.undefined)
        ret
    }
    @scala.inline
    def withEffective_family(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective_family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffective_family: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective_family")(js.undefined)
        ret
    }
    @scala.inline
    def withExit_addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit_addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withExit_policy(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit_policy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_policy")(js.undefined)
        ret
    }
    @scala.inline
    def withExit_policy_summary(value: AnonAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_policy_summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit_policy_summary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_policy_summary")(js.undefined)
        ret
    }
    @scala.inline
    def withExit_policy_v6_summary(value: AnonAccept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_policy_v6_summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit_policy_v6_summary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_policy_v6_summary")(js.undefined)
        ret
    }
    @scala.inline
    def withExit_probability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_probability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit_probability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit_probability")(js.undefined)
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
    def withGuard_probability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guard_probability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuard_probability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guard_probability")(js.undefined)
        ret
    }
    @scala.inline
    def withHibernating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hibernating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHibernating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hibernating")(js.undefined)
        ret
    }
    @scala.inline
    def withHost_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_name")(js.undefined)
        ret
    }
    @scala.inline
    def withIndirect_family(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indirect_family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndirect_family: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indirect_family")(js.undefined)
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
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measured")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddle_probability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle_probability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddle_probability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle_probability")(js.undefined)
        ret
    }
    @scala.inline
    def withObserved_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observed_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserved_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observed_bandwidth")(js.undefined)
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
    def withRegion_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region_name")(js.undefined)
        ret
    }
    @scala.inline
    def withUnreachable_or_addresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreachable_or_addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnreachable_or_addresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unreachable_or_addresses")(js.undefined)
        ret
    }
    @scala.inline
    def withUnverified_host_names(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unverified_host_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnverified_host_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unverified_host_names")(js.undefined)
        ret
    }
    @scala.inline
    def withVerified_host_names(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_host_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerified_host_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verified_host_names")(js.undefined)
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

