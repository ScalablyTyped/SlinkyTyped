package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies settings for an HTTP redirect.
  */
@js.native
trait SchemaHttpRedirectAction extends js.Object {
  /**
    * The host that will be used in the redirect response instead of the one
    * that was supplied in the request. The value must be between 1 and 255
    * characters.
    */
  var hostRedirect: js.UndefOr[String] = js.native
  /**
    * If set to true, the URL scheme in the redirected request is set to https.
    * If set to false, the URL scheme of the redirected request will remain the
    * same as that of the request. This must only be set for UrlMaps used in
    * TargetHttpProxys. Setting this true for TargetHttpsProxy is not
    * permitted. The default is set to false.
    */
  var httpsRedirect: js.UndefOr[Boolean] = js.native
  /**
    * The path that will be used in the redirect response instead of the one
    * that was supplied in the request. Only one of pathRedirect or
    * prefixRedirect must be specified. The value must be between 1 and 1024
    * characters.
    */
  var pathRedirect: js.UndefOr[String] = js.native
  /**
    * The prefix that replaces the prefixMatch specified in the
    * HttpRouteRuleMatch, retaining the remaining portion of the URL before
    * redirecting the request.
    */
  var prefixRedirect: js.UndefOr[String] = js.native
  /**
    * The HTTP Status code to use for this RedirectAction. Supported values
    * are:   - MOVED_PERMANENTLY_DEFAULT, which is the default value and
    * corresponds to 301.  - FOUND, which corresponds to 302.  - SEE_OTHER
    * which corresponds to 303.  - TEMPORARY_REDIRECT, which corresponds to
    * 307. In this case, the request method will be retained.  -
    * PERMANENT_REDIRECT, which corresponds to 308. In this case, the request
    * method will be retained.
    */
  var redirectResponseCode: js.UndefOr[String] = js.native
  /**
    * If set to true, any accompanying query portion of the original URL is
    * removed prior to redirecting the request. If set to false, the query
    * portion of the original URL is retained. The default is set to false.
    */
  var stripQuery: js.UndefOr[Boolean] = js.native
}

object SchemaHttpRedirectAction {
  @scala.inline
  def apply(): SchemaHttpRedirectAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRedirectAction]
  }
  @scala.inline
  implicit class SchemaHttpRedirectActionOps[Self <: SchemaHttpRedirectAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpsRedirect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpsRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpsRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withPathRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixRedirect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixRedirect")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectResponseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectResponseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStripQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripQuery")(js.undefined)
        ret
    }
  }
  
}

