package typingsSlinky.onionoo.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.got.mod.Cache
import typingsSlinky.got.mod.GotPromise
import typingsSlinky.onionoo.anon.Accept
import typingsSlinky.onionoo.anon.InstancePartialEndpoints
import typingsSlinky.onionoo.anon.PartialRecord1week1month6
import typingsSlinky.onionoo.anon.PartialRecord3days1week1m
import typingsSlinky.onionoo.anon.PartialRecord6months1year
import typingsSlinky.onionoo.mod.Onionoo.Endpoints
import typingsSlinky.onionoo.mod.Onionoo.Instance
import typingsSlinky.onionoo.mod.Onionoo.Options
import typingsSlinky.onionoo.mod.Onionoo.OptionsWithEndpoints
import typingsSlinky.onionoo.onionooBooleans.`false`
import typingsSlinky.onionoo.onionooStrings.`new in series`
import typingsSlinky.onionoo.onionooStrings.bandwidth
import typingsSlinky.onionoo.onionooStrings.bridge
import typingsSlinky.onionoo.onionooStrings.clients
import typingsSlinky.onionoo.onionooStrings.details
import typingsSlinky.onionoo.onionooStrings.experimental
import typingsSlinky.onionoo.onionooStrings.obsolete
import typingsSlinky.onionoo.onionooStrings.recommended
import typingsSlinky.onionoo.onionooStrings.relay
import typingsSlinky.onionoo.onionooStrings.summary
import typingsSlinky.onionoo.onionooStrings.unrecommended
import typingsSlinky.onionoo.onionooStrings.uptime
import typingsSlinky.onionoo.onionooStrings.weights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onionoo
  extends Instantiable0[Instance with Endpoints]
     with Instantiable1[
      (/* options */ Options) | (/* options */ OptionsWithEndpoints), 
      (Instance with Endpoints) | InstancePartialEndpoints
    ]
object Onionoo {
  
  type Bandwidth = Response[NodeBandwidth, NodeBandwidth]
  
  @js.native
  trait Bridge extends StObject {
    
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
    implicit class BridgeMutableBuilder[Self <: Bridge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvertised_bandwidth(value: Double): Self = StObject.set(x, "advertised_bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvertised_bandwidthUndefined: Self = StObject.set(x, "advertised_bandwidth", js.undefined)
      
      @scala.inline
      def setFirst_seen(value: String): Self = StObject.set(x, "first_seen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      @scala.inline
      def setHashed_fingerprint(value: String): Self = StObject.set(x, "hashed_fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_restarted(value: String): Self = StObject.set(x, "last_restarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_restartedUndefined: Self = StObject.set(x, "last_restarted", js.undefined)
      
      @scala.inline
      def setLast_seen(value: String): Self = StObject.set(x, "last_seen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOr_addresses(value: js.Array[String]): Self = StObject.set(x, "or_addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOr_addressesVarargs(value: String*): Self = StObject.set(x, "or_addresses", js.Array(value :_*))
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setRecommended_version(value: Boolean): Self = StObject.set(x, "recommended_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommended_versionUndefined: Self = StObject.set(x, "recommended_version", js.undefined)
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransports(value: js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      @scala.inline
      def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVersion_status(value: recommended | experimental | obsolete | (`new in series`) | unrecommended): Self = StObject.set(x, "version_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion_statusUndefined: Self = StObject.set(x, "version_status", js.undefined)
    }
  }
  
  @js.native
  trait BridgeClients extends StObject {
    
    /**
      * Object containing graph history objects with the average number of clients connecting to this bridge.
      * Keys are string representation of the time period covered by the graph history object. Keys are fixed strings
      * `6_months`, `1_year`, and `5_years`. Keys refer to the last known clients history of a bridge, not to the time
      * when the clients document was published. A graph history object is only contained if the time period it
      * covers is not already contained in another clients graph object with shorter time period and higher
      * data resolution. The unit is number of clients. Contained graph history objects may contain null values
      * if the bridge did not report client statistics for at least 50% of a given time period.
      */
    var average_clients: js.UndefOr[PartialRecord6months1year] = js.native
    
    /**
      * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
      */
    var fingerprint: String = js.native
  }
  object BridgeClients {
    
    @scala.inline
    def apply(fingerprint: String): BridgeClients = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeClients]
    }
    
    @scala.inline
    implicit class BridgeClientsMutableBuilder[Self <: BridgeClients] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAverage_clients(value: PartialRecord6months1year): Self = StObject.set(x, "average_clients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverage_clientsUndefined: Self = StObject.set(x, "average_clients", js.undefined)
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BridgeSummary extends StObject {
    
    /**
      * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
      */
    var h: String = js.native
    
    /**
      * Bridge nickname consisting of 1–19 alphanumerical characters.
      */
    var n: String = js.native
    
    /**
      * Boolean field saying whether this bridge was listed as running in the last bridge network status.
      */
    var r: Boolean = js.native
  }
  object BridgeSummary {
    
    @scala.inline
    def apply(h: String, n: String, r: Boolean): BridgeSummary = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeSummary]
    }
    
    @scala.inline
    implicit class BridgeSummaryMutableBuilder[Self <: BridgeSummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Boolean): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BridgeUptime extends StObject {
    
    /**
      * SHA-1 hash of the bridge fingerprint consisting of 40 upper-case hexadecimal characters.
      */
    var fingerprint: String = js.native
    
    /**
      * Object containing uptime history objects for different time periods. The specification of uptime history
      * objects is similar to those in the `uptime` field of `RelayUptime`.
      */
    var uptime: js.UndefOr[PartialRecord1week1month6] = js.native
  }
  object BridgeUptime {
    
    @scala.inline
    def apply(fingerprint: String): BridgeUptime = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[BridgeUptime]
    }
    
    @scala.inline
    implicit class BridgeUptimeMutableBuilder[Self <: BridgeUptime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUptime(value: PartialRecord1week1month6): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUptimeUndefined: Self = StObject.set(x, "uptime", js.undefined)
    }
  }
  
  type Clients = Response[js.UndefOr[scala.Nothing], BridgeClients]
  
  type Details = Response[Relay, Bridge]
  
  @js.native
  trait Endpoints extends StObject {
    
    def bandwidth(): GotPromise[Bandwidth] = js.native
    def bandwidth(query: QueryParameters): GotPromise[Bandwidth] = js.native
    
    def clients(): GotPromise[Clients] = js.native
    def clients(query: QueryParameters): GotPromise[Clients] = js.native
    
    def details(): GotPromise[Details] = js.native
    def details(query: QueryParameters): GotPromise[Details] = js.native
    
    def summary(): GotPromise[Summary] = js.native
    def summary(query: QueryParameters): GotPromise[Summary] = js.native
    
    def uptime(): GotPromise[Uptime] = js.native
    def uptime(query: QueryParameters): GotPromise[Uptime] = js.native
    
    def weights(): GotPromise[Weights] = js.native
    def weights(query: QueryParameters): GotPromise[Weights] = js.native
  }
  
  @js.native
  trait Histogram extends StObject {
    
    var count: Double = js.native
    
    var factor: Double = js.native
    
    var first: String = js.native
    
    var interval: Double = js.native
    
    var last: String = js.native
    
    var values: js.Array[Double] = js.native
  }
  object Histogram {
    
    @scala.inline
    def apply(
      count: Double,
      factor: Double,
      first: String,
      interval: Double,
      last: String,
      values: js.Array[Double]
    ): Histogram = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Histogram]
    }
    
    @scala.inline
    implicit class HistogramMutableBuilder[Self <: Histogram] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    @JSName("get")
    def get_bandwidth(endpoint: bandwidth): GotPromise[Bandwidth] = js.native
    @JSName("get")
    def get_bandwidth(endpoint: bandwidth, query: QueryParameters): GotPromise[Bandwidth] = js.native
    @JSName("get")
    def get_clients(endpoint: clients): GotPromise[Clients] = js.native
    @JSName("get")
    def get_clients(endpoint: clients, query: QueryParameters): GotPromise[Clients] = js.native
    @JSName("get")
    def get_details(endpoint: details): GotPromise[Details] = js.native
    @JSName("get")
    def get_details(endpoint: details, query: QueryParameters): GotPromise[Details] = js.native
    @JSName("get")
    def get_summary(endpoint: summary): GotPromise[Summary] = js.native
    @JSName("get")
    def get_summary(endpoint: summary, query: QueryParameters): GotPromise[Summary] = js.native
    @JSName("get")
    def get_uptime(endpoint: uptime): GotPromise[Uptime] = js.native
    @JSName("get")
    def get_uptime(endpoint: uptime, query: QueryParameters): GotPromise[Uptime] = js.native
    @JSName("get")
    def get_weights(endpoint: weights): GotPromise[Weights] = js.native
    @JSName("get")
    def get_weights(endpoint: weights, query: QueryParameters): GotPromise[Weights] = js.native
  }
  
  @js.native
  trait NodeBandwidth extends StObject {
    
    /**
      * Node fingerprint consisting of 40 upper-case hexadecimal characters.
      */
    var fingerprint: String = js.native
    
    /**
      * Object containing graph history objects with read bytes for different time periods. The specification
      * of graph history objects is similar to those in the `write_history` field.
      */
    var read_history: js.UndefOr[PartialRecord3days1week1m] = js.native
    
    /**
      * Object containing graph history objects with written bytes for different time periods. Keys are string
      * representation of the time period covered by the graph history object. Keys are fixed strings `3_days`,
      * `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known bandwidth history
      * of a node, not to the time when the bandwidth document was published. A graph history object is only
      * ontained if the time period it covers is not already contained in another graph history object with shorter
      * time period and higher data resolution. Similarly, a graph history object is excluded if the node did not
      * provide bandwidth histories on the required level of detail. The unit is bytes per second. Contained
      * graph history objects may contain null values if the node did not provide any bandwidth data or only data
      * for less than 20% of a given time period.
      */
    var write_history: js.UndefOr[PartialRecord3days1week1m] = js.native
  }
  object NodeBandwidth {
    
    @scala.inline
    def apply(fingerprint: String): NodeBandwidth = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeBandwidth]
    }
    
    @scala.inline
    implicit class NodeBandwidthMutableBuilder[Self <: NodeBandwidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead_history(value: PartialRecord3days1week1m): Self = StObject.set(x, "read_history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead_historyUndefined: Self = StObject.set(x, "read_history", js.undefined)
      
      @scala.inline
      def setWrite_history(value: PartialRecord3days1week1m): Self = StObject.set(x, "write_history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrite_historyUndefined: Self = StObject.set(x, "write_history", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * String to use as the base url for all API requests.
      * @default 'https://onionoo.torproject.org'
      */
    var baseUrl: js.UndefOr[String] = js.native
    
    /**
      * Storage adapter instance for storing cached data.
      * @default false
      */
    var cache: js.UndefOr[Cache | `false`] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setCache(value: Cache | `false`): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait OptionsWithEndpoints extends Options {
    
    /**
      * Array of endpoints to be returned as methods on the `Onionoo` instance.
      * @default ['summary', 'details', 'bandwidth', 'weights', 'clients', 'uptime']
      */
    var endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime] = js.native
  }
  object OptionsWithEndpoints {
    
    @scala.inline
    def apply(endpoints: js.Array[summary | details | bandwidth | weights | clients | uptime]): OptionsWithEndpoints = {
      val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithEndpoints]
    }
    
    @scala.inline
    implicit class OptionsWithEndpointsMutableBuilder[Self <: OptionsWithEndpoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoints(value: js.Array[summary | details | bandwidth | weights | clients | uptime]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: (summary | details | bandwidth | weights | clients | uptime)*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait QueryParameters extends StObject {
    
    /**
      * Return only relays which are located in either one of the given autonomous systems (AS) as identified
      * by AS number (with or without preceding "AS" part). Multiple AS numbers can be provided separated by commas.
      * Filtering by AS number is case-insensitive. The special AS number 0 can be used for relays that were
      * not found in the GeoIP database.
      */
    var as: js.UndefOr[String] = js.native
    
    /**
      * Return only relays with the parameter value matching (part of) the autonomous system (AS) name they are
      * located in. If the parameter value contains spaces, only relays are returned which contain all
      * space-separated parts in their AS name. Only printable ASCII characters are permitted in the parameter
      * value, some of which need to be percent-encoded (# as %23, % as %25, & as %26, + as %2B, and / as %2F).
      * Comparisons are case-insensitive.
      */
    var as_name: js.UndefOr[String] = js.native
    
    /**
      * Return only relays with the parameter value matching (part of) the contact line. If the parameter value
      * contains spaces, only relays are returned which contain all space-separated parts in their contact line.
      * Only printable ASCII characters are permitted in the parameter value, some of which need to be
      * percent-encoded (# as %23, % as %25, & as %26, + as %2B, and / as %2F). Comparisons are case-insensitive.
      */
    var contact: js.UndefOr[String] = js.native
    
    /**
      * Return only relays which are located in the given country as identified by a two-letter country code.
      * Filtering by country code is case-insensitive. The special country code xz can be used for relays that
      * were not found in the GeoIP database.
      */
    var country: js.UndefOr[String] = js.native
    
    /**
      * Return only the relay whose fingerprint matches the parameter value and all relays that this relay has
      * listed in its family by fingerprint and that in turn have listed this relay in their family by fingerprint.
      * If relays have listed other relays in their family by nickname, those family relationships will not be
      * considered, regardless of whether they have the Named flag or not. The provided relay fingerprint must
      * consist of 40 hex characters where case does not matter, and it must not be hashed using SHA-1.
      * Bridges are not contained in the result, regardless of whether they define a family.
      */
    var family: js.UndefOr[String] = js.native
    
    /**
      * Response documents can be reduced in size by requesting only a subset of contained fields.
      * Comma-separated list of fields that will be included in the result. So far, only top-level fields
      * in relay or bridge objects of details documents can be specified, e.g., `nickname,hashed_fingerprint`.
      * If the fields parameter is provided, all other fields which are not contained in the provided list
      * will be removed from the result.
      */
    var fields: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Return only relays or bridges which have first been seen during the given range of days ago. A parameter
      * value "x-y" with x <= y returns relays or bridges that have first been seen at least x and at most y days ago.
      * Accepted short forms are "x", "x-", and "-y" which are interpreted as "x-x", "x-infinity", and "0-y".
      */
    var first_seen_days: js.UndefOr[String] = js.native
    
    /**
      * Return only relays which have the given relay flag assigned by the directory authorities.
      * Filtering by flag is case-insensitive.
      */
    var flag: js.UndefOr[String] = js.native
    
    /**
      * Return only relays with a domain name ending in the given (partial) host name. Searches for subdomains
      * of a specific domain should ideally be prefixed with a period, for example: ".csail.mit.edu". Non-ASCII
      * host name characters must be encoded as punycode. Filtering by host name is case-insensitive.
      */
    var host_name: js.UndefOr[String] = js.native
    
    /**
      * Return only relays or bridges which have last been seen during the given range of days ago. A parameter
      * value "x-y" with x <= y returns relays or bridges that have last been seen at least x and at most y days ago.
      * Accepted short forms are "x", "x-", and "-y" which are interpreted as "x-x", "x-infinity", and "0-y".
      * Note that relays and bridges that haven't been running in the past week are not included in results,
      * so that setting x to 8 or higher will lead to an empty result set.
      */
    var last_seen_days: js.UndefOr[String] = js.native
    
    /**
      * Limit result to the given number of relays and/or bridges. Relays are kept first, then bridges.
      * Non-positive `limit` values are treated as zero and lead to an empty result. When used together with `offset`,
      * the offsetting step precedes the limiting step.
      */
    var limit: js.UndefOr[Double] = js.native
    
    /**
      * Return only the relay with the parameter value matching the fingerprint or the bridge with the parameter
      * value matching the hashed fingerprint. Fingerprints should always be hashed using SHA-1, regardless of
      * looking up a relay or a bridge, in order to not accidentally leak non-hashed bridge fingerprints in the URL.
      * Lookups only work for full fingerprints or hashed fingerprints consisting of 40 hex characters.
      * Lookups are case-insensitive.
      */
    var lookup: js.UndefOr[String] = js.native
    
    /**
      * Skip the given number of relays and/or bridges. Relays are skipped first, then bridges.
      * Non-positive `offset` values are treated as zero and don't change the result.
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * Re-order results by a comma-separated list of fields in ascending or descending order. Results are first
      * ordered by the first list element, then by the second, and so on. Possible fields for ordering are:
      * `consensus_weight` and `first_seen`. Ascending order is the default; descending order is selected by
      * prepending fields with a minus sign (-). Field names can be listed at most once in either ascending or
      * descending order. Relays or bridges which don't have any value for a field to be ordered by are always
      * appended to the end, regardless or sorting order. The ordering is defined independent of the requested
      * document type and does not require the ordering field to be contained in the document. If no `order`
      * parameter is given, ordering of results is undefined.
      */
    var order: js.UndefOr[String] = js.native
    
    /**
      * Return only relays or bridges running on an operating system that starts with the parameter value.
      * Searches are case-insensitive.
      */
    var os: js.UndefOr[String] = js.native
    
    /**
      * Return only relays and bridges running a Tor software version that is recommended (`true`) or not
      * recommended by the directory authorities (`false`). Uses the version in the consensus or bridge network status.
      * Relays and bridges are not contained in either result, if the version they are running is not known.
      */
    var recommended_version: js.UndefOr[Boolean] = js.native
    
    /**
      * Return only running (`true`) or only non-running relays and/or bridges (`false`).
      */
    var running: js.UndefOr[Boolean] = js.native
    
    /**
      * Return only (1) relays with the parameter value matching (part of a) nickname, (possibly $-prefixed)
      * beginning of a hex-encoded fingerprint, any 4 hex character block of a space-separated fingerprint,
      * beginning of a base64-encoded fingerprint without trailing equal signs, or beginning of an IP address
      * (possibly enclosed in square brackets in case of IPv6), (2) bridges with (part of a) nickname
      * or (possibly $-prefixed) beginning of a hashed hex-encoded fingerprint, and (3) relays and/or bridges
      * matching a given qualified search term. Searches by relay IP address include all known addresses used
      * for onion routing and for exiting to the Internet. Searches for beginnings of IP addresses are performed
      * on textual representations of canonical IP address forms, so that searches using CIDR notation or
      * non-canonical forms will return empty results. Searches are case-insensitive, except for base64-encoded
      * fingerprints. If multiple search terms are given, separated by spaces, the intersection of all relays
      * and bridges matching all search terms will be returned. Complete hex-encoded fingerprints should always
      * be hashed using SHA-1, regardless of searching for a relay or a bridge, in order to not accidentally
      * leak non-hashed bridge fingerprints in the URL. Qualified search terms have the form "key:value"
      * (without double quotes) with "key" being one of the parameters listed here except for "search",
      * "fingerprint", "order", "limit", "offset", and "fields", and "value" being the string that will
      * internally be passed to that parameter. If a qualified search term for a given "key" is specified
      * more than once, only the first "value" is considered.
      */
    var search: js.UndefOr[String] = js.native
    
    /**
      * Return only `relay` or only `bridge` documents.
      */
    var `type`: js.UndefOr[relay | bridge] = js.native
    
    /**
      * Return only relays or bridges running either Tor version from a list or range given in the parameter value.
      * Tor versions must be provided without the leading "Tor" part. Multiple versions can either be provided as a
      * comma-separated list (","), as a range separated by two dots (".."), or as a list of ranges.
      * Provided versions are parsed and matched by parsed dotted numbers, rather than by string prefix.
      */
    var version: js.UndefOr[String] = js.native
  }
  object QueryParameters {
    
    @scala.inline
    def apply(): QueryParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryParameters]
    }
    
    @scala.inline
    implicit class QueryParametersMutableBuilder[Self <: QueryParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAs_name(value: String): Self = StObject.set(x, "as_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAs_nameUndefined: Self = StObject.set(x, "as_name", js.undefined)
      
      @scala.inline
      def setContact(value: String): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setFirst_seen_days(value: String): Self = StObject.set(x, "first_seen_days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_seen_daysUndefined: Self = StObject.set(x, "first_seen_days", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setHost_name(value: String): Self = StObject.set(x, "host_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost_nameUndefined: Self = StObject.set(x, "host_name", js.undefined)
      
      @scala.inline
      def setLast_seen_days(value: String): Self = StObject.set(x, "last_seen_days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_seen_daysUndefined: Self = StObject.set(x, "last_seen_days", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLookup(value: String): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setRecommended_version(value: Boolean): Self = StObject.set(x, "recommended_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommended_versionUndefined: Self = StObject.set(x, "recommended_version", js.undefined)
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setType(value: relay | bridge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Relay extends StObject {
    
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
    var exit_policy_summary: js.UndefOr[Accept] = js.native
    
    /**
      * Summary version of the relay's IPv6 exit policy containing a dictionary with either an `accept` or a `reject`
      * element. If there is an `accept` (`reject`) element, the relay accepts (rejects) all TCP ports or port ranges
      * in the given list for most IP addresses and rejects (accepts) all other ports. Missing if the relay rejects
      * all connections to IPv6 addresses. May contradict the `exit_policy_summary` field in a rare edge case:
      * this happens when the relay changes its exit policy after the directory authorities summarized the previous
      * exit policy.
      */
    var exit_policy_v6_summary: js.UndefOr[Accept] = js.native
    
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
    implicit class RelayMutableBuilder[Self <: Relay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdvertised_bandwidth(value: Double): Self = StObject.set(x, "advertised_bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvertised_bandwidthUndefined: Self = StObject.set(x, "advertised_bandwidth", js.undefined)
      
      @scala.inline
      def setAlleged_family(value: js.Array[String]): Self = StObject.set(x, "alleged_family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlleged_familyUndefined: Self = StObject.set(x, "alleged_family", js.undefined)
      
      @scala.inline
      def setAlleged_familyVarargs(value: String*): Self = StObject.set(x, "alleged_family", js.Array(value :_*))
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAs_name(value: String): Self = StObject.set(x, "as_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAs_nameUndefined: Self = StObject.set(x, "as_name", js.undefined)
      
      @scala.inline
      def setBandwidth_burst(value: Double): Self = StObject.set(x, "bandwidth_burst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandwidth_burstUndefined: Self = StObject.set(x, "bandwidth_burst", js.undefined)
      
      @scala.inline
      def setBandwidth_rate(value: Double): Self = StObject.set(x, "bandwidth_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandwidth_rateUndefined: Self = StObject.set(x, "bandwidth_rate", js.undefined)
      
      @scala.inline
      def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity_nameUndefined: Self = StObject.set(x, "city_name", js.undefined)
      
      @scala.inline
      def setConsensus_weight(value: Double): Self = StObject.set(x, "consensus_weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsensus_weight_fraction(value: Double): Self = StObject.set(x, "consensus_weight_fraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsensus_weight_fractionUndefined: Self = StObject.set(x, "consensus_weight_fraction", js.undefined)
      
      @scala.inline
      def setContact(value: String): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_nameUndefined: Self = StObject.set(x, "country_name", js.undefined)
      
      @scala.inline
      def setDir_address(value: String): Self = StObject.set(x, "dir_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir_addressUndefined: Self = StObject.set(x, "dir_address", js.undefined)
      
      @scala.inline
      def setEffective_family(value: js.Array[String]): Self = StObject.set(x, "effective_family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffective_familyUndefined: Self = StObject.set(x, "effective_family", js.undefined)
      
      @scala.inline
      def setEffective_familyVarargs(value: String*): Self = StObject.set(x, "effective_family", js.Array(value :_*))
      
      @scala.inline
      def setExit_addresses(value: js.Array[String]): Self = StObject.set(x, "exit_addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_addressesUndefined: Self = StObject.set(x, "exit_addresses", js.undefined)
      
      @scala.inline
      def setExit_addressesVarargs(value: String*): Self = StObject.set(x, "exit_addresses", js.Array(value :_*))
      
      @scala.inline
      def setExit_policy(value: js.Array[String]): Self = StObject.set(x, "exit_policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_policyUndefined: Self = StObject.set(x, "exit_policy", js.undefined)
      
      @scala.inline
      def setExit_policyVarargs(value: String*): Self = StObject.set(x, "exit_policy", js.Array(value :_*))
      
      @scala.inline
      def setExit_policy_summary(value: Accept): Self = StObject.set(x, "exit_policy_summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_policy_summaryUndefined: Self = StObject.set(x, "exit_policy_summary", js.undefined)
      
      @scala.inline
      def setExit_policy_v6_summary(value: Accept): Self = StObject.set(x, "exit_policy_v6_summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_policy_v6_summaryUndefined: Self = StObject.set(x, "exit_policy_v6_summary", js.undefined)
      
      @scala.inline
      def setExit_probability(value: Double): Self = StObject.set(x, "exit_probability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_probabilityUndefined: Self = StObject.set(x, "exit_probability", js.undefined)
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_seen(value: String): Self = StObject.set(x, "first_seen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      @scala.inline
      def setGuard_probability(value: Double): Self = StObject.set(x, "guard_probability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuard_probabilityUndefined: Self = StObject.set(x, "guard_probability", js.undefined)
      
      @scala.inline
      def setHibernating(value: Boolean): Self = StObject.set(x, "hibernating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHibernatingUndefined: Self = StObject.set(x, "hibernating", js.undefined)
      
      @scala.inline
      def setHost_name(value: String): Self = StObject.set(x, "host_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost_nameUndefined: Self = StObject.set(x, "host_name", js.undefined)
      
      @scala.inline
      def setIndirect_family(value: js.Array[String]): Self = StObject.set(x, "indirect_family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndirect_familyUndefined: Self = StObject.set(x, "indirect_family", js.undefined)
      
      @scala.inline
      def setIndirect_familyVarargs(value: String*): Self = StObject.set(x, "indirect_family", js.Array(value :_*))
      
      @scala.inline
      def setLast_changed_address_or_port(value: String): Self = StObject.set(x, "last_changed_address_or_port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_restarted(value: String): Self = StObject.set(x, "last_restarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_restartedUndefined: Self = StObject.set(x, "last_restarted", js.undefined)
      
      @scala.inline
      def setLast_seen(value: String): Self = StObject.set(x, "last_seen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setMeasured(value: Boolean): Self = StObject.set(x, "measured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasuredUndefined: Self = StObject.set(x, "measured", js.undefined)
      
      @scala.inline
      def setMiddle_probability(value: Double): Self = StObject.set(x, "middle_probability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddle_probabilityUndefined: Self = StObject.set(x, "middle_probability", js.undefined)
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserved_bandwidth(value: Double): Self = StObject.set(x, "observed_bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserved_bandwidthUndefined: Self = StObject.set(x, "observed_bandwidth", js.undefined)
      
      @scala.inline
      def setOr_addresses(value: js.Array[String]): Self = StObject.set(x, "or_addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOr_addressesVarargs(value: String*): Self = StObject.set(x, "or_addresses", js.Array(value :_*))
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setRecommended_version(value: Boolean): Self = StObject.set(x, "recommended_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommended_versionUndefined: Self = StObject.set(x, "recommended_version", js.undefined)
      
      @scala.inline
      def setRegion_name(value: String): Self = StObject.set(x, "region_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion_nameUndefined: Self = StObject.set(x, "region_name", js.undefined)
      
      @scala.inline
      def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnreachable_or_addresses(value: js.Array[String]): Self = StObject.set(x, "unreachable_or_addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnreachable_or_addressesUndefined: Self = StObject.set(x, "unreachable_or_addresses", js.undefined)
      
      @scala.inline
      def setUnreachable_or_addressesVarargs(value: String*): Self = StObject.set(x, "unreachable_or_addresses", js.Array(value :_*))
      
      @scala.inline
      def setUnverified_host_names(value: js.Array[String]): Self = StObject.set(x, "unverified_host_names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnverified_host_namesUndefined: Self = StObject.set(x, "unverified_host_names", js.undefined)
      
      @scala.inline
      def setUnverified_host_namesVarargs(value: String*): Self = StObject.set(x, "unverified_host_names", js.Array(value :_*))
      
      @scala.inline
      def setVerified_host_names(value: js.Array[String]): Self = StObject.set(x, "verified_host_names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerified_host_namesUndefined: Self = StObject.set(x, "verified_host_names", js.undefined)
      
      @scala.inline
      def setVerified_host_namesVarargs(value: String*): Self = StObject.set(x, "verified_host_names", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVersion_status(value: recommended | experimental | obsolete | (`new in series`) | unrecommended): Self = StObject.set(x, "version_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion_statusUndefined: Self = StObject.set(x, "version_status", js.undefined)
    }
  }
  
  @js.native
  trait RelaySummary extends StObject {
    
    /**
      * Array of IPv4 or IPv6 addresses where the relay accepts onion-routing connections or which the relay
      * used to exit to the Internet in the past 24 hours. The first address is the primary onion-routing address
      * that the relay used to register in the network, subsequent addresses are in arbitrary order. IPv6 hex
      * characters are all lower-case.
      */
    var a: js.Array[String] = js.native
    
    /**
      * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
      */
    var f: String = js.native
    
    /**
      * Relay nickname consisting of 1–19 alphanumerical characters.
      */
    var n: String = js.native
    
    /**
      * Boolean field saying whether this relay was listed as running in the last relay network status consensus.
      */
    var r: Boolean = js.native
  }
  object RelaySummary {
    
    @scala.inline
    def apply(a: js.Array[String], f: String, n: String, r: Boolean): RelaySummary = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelaySummary]
    }
    
    @scala.inline
    implicit class RelaySummaryMutableBuilder[Self <: RelaySummary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: js.Array[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAVarargs(value: String*): Self = StObject.set(x, "a", js.Array(value :_*))
      
      @scala.inline
      def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Boolean): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RelayUptime extends StObject {
    
    /**
      * Relay fingerprint consisting of 40 upper-case hexadecimal characters.
      */
    var fingerprint: String = js.native
    
    /**
      * Object containing fractional times of this relay having relay flags assigned. Keys are flag names like
      * `Running` or `Exit`, values are objects similar to the uptime field above, again with keys like
      * `1_week` etc. If a relay never had a given relay flag assigned, no object is included for that flag.
      */
    var flags: js.UndefOr[StringDictionary[PartialRecord1week1month6]] = js.native
    
    /**
      * Object containing graph history objects with the fractional uptime of this relay. Keys are string
      * representation of the time period covered by the graph history object. Keys are fixed strings
      * `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known uptime history
      * of a relay, not to the time when the uptime document was published. A graph history object is only
      * contained if the time period it covers is not already contained in another graph history object with
      * shorter time period and higher data resolution. The unit is fractional uptime from `0` to `1`.
      * Contained graph history objects may contain null values if less than 20% of network statuses have been
      * processed for a given time period.
      */
    var uptime: js.UndefOr[PartialRecord1week1month6] = js.native
  }
  object RelayUptime {
    
    @scala.inline
    def apply(fingerprint: String): RelayUptime = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayUptime]
    }
    
    @scala.inline
    implicit class RelayUptimeMutableBuilder[Self <: RelayUptime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: StringDictionary[PartialRecord1week1month6]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setUptime(value: PartialRecord1week1month6): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUptimeUndefined: Self = StObject.set(x, "uptime", js.undefined)
    }
  }
  
  @js.native
  trait RelayWeights extends StObject {
    
    /**
      * History object containing the absolute consensus weight of this relay. The specification of this history
      * object is similar to that in the `consensus_weight_fraction` field above.
      */
    var consensus_weight: js.UndefOr[PartialRecord1week1month6] = js.native
    
    /**
      * History object containing the fraction of this relay's consensus weight compared to the sum of all consensus
      * weights in the network. This fraction is a very rough approximation of the probability of this relay to be
      * selected by clients. Keys are string representation of the time period covered by the graph history object.
      * Keys are fixed strings `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known
      * weights history of a relay, not to the time when the weights document was published. A graph history object is
      * only contained if the time period it covers is not already contained in another graph history object with shorter
      * time period and higher data resolution. The unit is path-selection probability. Contained graph history objects
      * may contain null values if the relay was running less than 20% of a given time period.
      */
    var consensus_weight_fraction: js.UndefOr[PartialRecord1week1month6] = js.native
    
    /**
      * History object containing the probability of this relay to be selected for the exit position.
      * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
      * Path selection depends on more factors, so that this probability can only be an approximation.
      * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
      */
    var exit_probability: js.UndefOr[PartialRecord1week1month6] = js.native
    
    /**
      * Node fingerprint consisting of 40 upper-case hexadecimal characters.
      */
    var fingerprint: String = js.native
    
    /**
      * History object containing the probability of this relay to be selected for the guard position.
      * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
      * Path selection depends on more factors, so that this probability can only be an approximation.
      * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
      */
    var guard_probability: js.UndefOr[PartialRecord1week1month6] = js.native
    
    /**
      * History object containing the probability of this relay to be selected for the middle position.
      * This probability is calculated based on consensus weights, relay flags, and bandwidth weights in the consensus.
      * Path selection depends on more factors, so that this probability can only be an approximation.
      * The specification of this history object is similar to that in the `consensus_weight_fraction` field above.
      */
    var middle_probability: js.UndefOr[PartialRecord1week1month6] = js.native
  }
  object RelayWeights {
    
    @scala.inline
    def apply(fingerprint: String): RelayWeights = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayWeights]
    }
    
    @scala.inline
    implicit class RelayWeightsMutableBuilder[Self <: RelayWeights] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsensus_weight(value: PartialRecord1week1month6): Self = StObject.set(x, "consensus_weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsensus_weightUndefined: Self = StObject.set(x, "consensus_weight", js.undefined)
      
      @scala.inline
      def setConsensus_weight_fraction(value: PartialRecord1week1month6): Self = StObject.set(x, "consensus_weight_fraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsensus_weight_fractionUndefined: Self = StObject.set(x, "consensus_weight_fraction", js.undefined)
      
      @scala.inline
      def setExit_probability(value: PartialRecord1week1month6): Self = StObject.set(x, "exit_probability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit_probabilityUndefined: Self = StObject.set(x, "exit_probability", js.undefined)
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuard_probability(value: PartialRecord1week1month6): Self = StObject.set(x, "guard_probability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuard_probabilityUndefined: Self = StObject.set(x, "guard_probability", js.undefined)
      
      @scala.inline
      def setMiddle_probability(value: PartialRecord1week1month6): Self = StObject.set(x, "middle_probability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddle_probabilityUndefined: Self = StObject.set(x, "middle_probability", js.undefined)
    }
  }
  
  @js.native
  trait Response[TRelay, TBridge] extends StObject {
    
    var bridges: js.Array[TBridge] = js.native
    
    /**
      * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known bridge network status was published.
      * Indicates how recent the bridge objects in this document are.
      */
    var bridges_published: String = js.native
    
    /**
      * Number of skipped bridges as requested by a positive `offset` parameter value. Omitted if zero.
      */
    var bridges_skipped: js.UndefOr[Double] = js.native
    
    /**
      * Number of truncated bridges as requested by a positive `limit` parameter value. Omitted if zero.
      */
    var bridges_truncated: js.UndefOr[Double] = js.native
    
    /**
      * Git revision of the Onionoo instance's software used to write this response, which will be omitted if unknown.
      */
    var build_revision: js.UndefOr[String] = js.native
    
    /**
      * UTC date (YYYY-MM-DD) when the next major protocol version is scheduled to be deployed. Omitted if no major
      * protocol changes are planned.
      */
    var next_major_version_scheduled: js.UndefOr[String] = js.native
    
    var relays: js.Array[TRelay] = js.native
    
    /**
      * UTC timestamp (YYYY-MM-DD hh:mm:ss) when the last known relay network status consensus started being valid.
      * Indicates how recent the relay objects in this document are.
      */
    var relays_published: String = js.native
    
    /**
      * Number of skipped relays as requested by a positive "offset" parameter value. Omitted if zero.
      */
    var relays_skipped: js.UndefOr[Double] = js.native
    
    /**
      * Number of truncated relays as requested by a positive "limit" parameter value. Omitted if zero.
      */
    var relays_truncated: js.UndefOr[Double] = js.native
    
    /**
      * Onionoo protocol version string.
      */
    var version: String = js.native
  }
  object Response {
    
    @scala.inline
    def apply[TRelay, TBridge](
      bridges: js.Array[TBridge],
      bridges_published: String,
      relays: js.Array[TRelay],
      relays_published: String,
      version: String
    ): Response[TRelay, TBridge] = {
      val __obj = js.Dynamic.literal(bridges = bridges.asInstanceOf[js.Any], bridges_published = bridges_published.asInstanceOf[js.Any], relays = relays.asInstanceOf[js.Any], relays_published = relays_published.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[TRelay, TBridge]]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response[_, _], TRelay, TBridge] (val x: Self with (Response[TRelay, TBridge])) extends AnyVal {
      
      @scala.inline
      def setBridges(value: js.Array[TBridge]): Self = StObject.set(x, "bridges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridgesVarargs(value: TBridge*): Self = StObject.set(x, "bridges", js.Array(value :_*))
      
      @scala.inline
      def setBridges_published(value: String): Self = StObject.set(x, "bridges_published", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridges_skipped(value: Double): Self = StObject.set(x, "bridges_skipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridges_skippedUndefined: Self = StObject.set(x, "bridges_skipped", js.undefined)
      
      @scala.inline
      def setBridges_truncated(value: Double): Self = StObject.set(x, "bridges_truncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridges_truncatedUndefined: Self = StObject.set(x, "bridges_truncated", js.undefined)
      
      @scala.inline
      def setBuild_revision(value: String): Self = StObject.set(x, "build_revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuild_revisionUndefined: Self = StObject.set(x, "build_revision", js.undefined)
      
      @scala.inline
      def setNext_major_version_scheduled(value: String): Self = StObject.set(x, "next_major_version_scheduled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_major_version_scheduledUndefined: Self = StObject.set(x, "next_major_version_scheduled", js.undefined)
      
      @scala.inline
      def setRelays(value: js.Array[TRelay]): Self = StObject.set(x, "relays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaysVarargs(value: TRelay*): Self = StObject.set(x, "relays", js.Array(value :_*))
      
      @scala.inline
      def setRelays_published(value: String): Self = StObject.set(x, "relays_published", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelays_skipped(value: Double): Self = StObject.set(x, "relays_skipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelays_skippedUndefined: Self = StObject.set(x, "relays_skipped", js.undefined)
      
      @scala.inline
      def setRelays_truncated(value: Double): Self = StObject.set(x, "relays_truncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelays_truncatedUndefined: Self = StObject.set(x, "relays_truncated", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Summary = Response[RelaySummary, BridgeSummary]
  
  type Uptime = Response[RelayUptime, BridgeUptime]
  
  type Weights = Response[RelayWeights, js.UndefOr[scala.Nothing]]
}
