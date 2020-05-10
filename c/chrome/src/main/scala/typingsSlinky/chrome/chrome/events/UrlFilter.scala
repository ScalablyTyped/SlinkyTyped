package typingsSlinky.chrome.chrome.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlFilter extends js.Object {
  /** Optional. Matches if the host name of the URL contains a specified string. To test whether a host name component has a prefix 'foo', use hostContains: '.foo'. This matches 'www.foobar.com' and 'foo.com', because an implicit dot is added at the beginning of the host name. Similarly, hostContains can be used to match against component suffix ('foo.') and to exactly match against components ('.foo.'). Suffix- and exact-matching for the last components need to be done separately using hostSuffix, because no implicit dot is added at the end of the host name.  */
  var hostContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the host name of the URL is equal to a specified string.  */
  var hostEquals: js.UndefOr[String] = js.native
  /** Optional. Matches if the host name of the URL starts with a specified string.  */
  var hostPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the host name of the URL ends with a specified string.  */
  var hostSuffix: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Since Chrome 28.
    * Matches if the URL without query segment and fragment identifier matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.
    */
  var originAndPathMatches: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL contains a specified string.  */
  var pathContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL is equal to a specified string.  */
  var pathEquals: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL starts with a specified string.  */
  var pathPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the path segment of the URL ends with a specified string.  */
  var pathSuffix: js.UndefOr[String] = js.native
  /** Optional. Matches if the port of the URL is contained in any of the specified port lists. For example [80, 443, [1000, 1200]] matches all requests on port 80, 443 and in the range 1000-1200.  */
  var ports: js.UndefOr[js.Array[_]] = js.native
  /** Optional. Matches if the query segment of the URL contains a specified string.  */
  var queryContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the query segment of the URL is equal to a specified string.  */
  var queryEquals: js.UndefOr[String] = js.native
  /** Optional. Matches if the query segment of the URL starts with a specified string.  */
  var queryPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the query segment of the URL ends with a specified string.  */
  var querySuffix: js.UndefOr[String] = js.native
  /** Optional. Matches if the scheme of the URL is equal to any of the schemes specified in the array.  */
  var schemes: js.UndefOr[js.Array[String]] = js.native
  /** Optional. Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlContains: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlEquals: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Since Chrome 23.
    * Matches if the URL (without fragment identifier) matches a specified regular expression. Port numbers are stripped from the URL if they match the default port number. The regular expressions use the RE2 syntax.
    */
  var urlMatches: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlPrefix: js.UndefOr[String] = js.native
  /** Optional. Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if they match the default port number.  */
  var urlSuffix: js.UndefOr[String] = js.native
}

object UrlFilter {
  @scala.inline
  def apply(): UrlFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlFilter]
  }
  @scala.inline
  implicit class UrlFilterOps[Self <: UrlFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostContains")(js.undefined)
        ret
    }
    @scala.inline
    def withHostEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withHostSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginAndPathMatches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originAndPathMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginAndPathMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originAndPathMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withPathContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathContains")(js.undefined)
        ret
    }
    @scala.inline
    def withPathEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPathSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryContains")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withQuerySuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuerySuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("querySuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemes")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlContains(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlContains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlContains")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlEquals(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEquals")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlMatches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlSuffix")(js.undefined)
        ret
    }
  }
  
}

