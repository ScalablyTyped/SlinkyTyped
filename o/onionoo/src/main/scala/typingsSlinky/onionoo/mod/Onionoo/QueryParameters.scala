package typingsSlinky.onionoo.mod.Onionoo

import typingsSlinky.onionoo.onionooStrings.bridge
import typingsSlinky.onionoo.onionooStrings.relay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParameters extends js.Object {
  
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
  implicit class QueryParametersOps[Self <: QueryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAs_name(value: String): Self = this.set("as_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs_name: Self = this.set("as_name", js.undefined)
    
    @scala.inline
    def setContact(value: String): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFirst_seen_days(value: String): Self = this.set("first_seen_days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_seen_days: Self = this.set("first_seen_days", js.undefined)
    
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    
    @scala.inline
    def setHost_name(value: String): Self = this.set("host_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost_name: Self = this.set("host_name", js.undefined)
    
    @scala.inline
    def setLast_seen_days(value: String): Self = this.set("last_seen_days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_seen_days: Self = this.set("last_seen_days", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLookup(value: String): Self = this.set("lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    
    @scala.inline
    def setRecommended_version(value: Boolean): Self = this.set("recommended_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommended_version: Self = this.set("recommended_version", js.undefined)
    
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setType(value: relay | bridge): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
