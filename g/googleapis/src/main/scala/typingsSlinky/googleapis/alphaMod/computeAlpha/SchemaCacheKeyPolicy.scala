package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing what to include in the cache key for a request for Cloud
  * CDN.
  */
@js.native
trait SchemaCacheKeyPolicy extends js.Object {
  /**
    * If true, requests to different hosts will be cached separately.
    */
  var includeHost: js.UndefOr[Boolean] = js.native
  /**
    * If true, http and https requests will be cached separately.
    */
  var includeProtocol: js.UndefOr[Boolean] = js.native
  /**
    * If true, include query string parameters in the cache key according to
    * query_string_whitelist and query_string_blacklist. If neither is set, the
    * entire query string will be included. If false, the query string will be
    * excluded from the cache key entirely.
    */
  var includeQueryString: js.UndefOr[Boolean] = js.native
  /**
    * Names of query string parameters to exclude in cache keys. All other
    * parameters will be included. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringBlacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * Names of query string parameters to include in cache keys. All other
    * parameters will be excluded. Either specify query_string_whitelist or
    * query_string_blacklist, not both. &#39;&amp;&#39; and &#39;=&#39; will be
    * percent encoded and not treated as delimiters.
    */
  var queryStringWhitelist: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCacheKeyPolicy {
  @scala.inline
  def apply(): SchemaCacheKeyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCacheKeyPolicy]
  }
  @scala.inline
  implicit class SchemaCacheKeyPolicyOps[Self <: SchemaCacheKeyPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeHost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHost")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeQueryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeQueryString")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStringBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStringWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStringWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStringWhitelist")(js.undefined)
        ret
    }
  }
  
}

