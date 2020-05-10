package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URL pattern and description of how the URL should be handled. App Engine
  * can handle URLs by executing application code or by serving static files
  * uploaded with the version, such as images, CSS, or JavaScript.
  */
@js.native
trait SchemaUrlMap extends js.Object {
  /**
    * Uses API Endpoints to handle requests.
    */
  var apiEndpoint: js.UndefOr[SchemaApiEndpointHandler] = js.native
  /**
    * Action to take when users access resources that require authentication.
    * Defaults to redirect.
    */
  var authFailAction: js.UndefOr[String] = js.native
  /**
    * Level of login required to access this resource. Not supported for
    * Node.js in the App Engine standard environment.
    */
  var login: js.UndefOr[String] = js.native
  /**
    * 30x code to use when performing redirects for the secure field. Defaults
    * to 302.
    */
  var redirectHttpResponseCode: js.UndefOr[String] = js.native
  /**
    * Executes a script to handle the requests that match this URL pattern.
    * Only the auto value is supported for Node.js in the App Engine standard
    * environment, for example &quot;script&quot;: &quot;auto&quot;.
    */
  var script: js.UndefOr[SchemaScriptHandler] = js.native
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String] = js.native
  /**
    * Returns the contents of a file, such as an image, as the response.
    */
  var staticFiles: js.UndefOr[SchemaStaticFilesHandler] = js.native
  /**
    * URL prefix. Uses regular expression syntax, which means regexp special
    * characters must be escaped, but should not contain groupings. All URLs
    * that begin with this prefix are handled by this handler, using the
    * portion of the URL after the prefix as part of the file path.
    */
  var urlRegex: js.UndefOr[String] = js.native
}

object SchemaUrlMap {
  @scala.inline
  def apply(): SchemaUrlMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMap]
  }
  @scala.inline
  implicit class SchemaUrlMapOps[Self <: SchemaUrlMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiEndpoint(value: SchemaApiEndpointHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthFailAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authFailAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthFailAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authFailAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectHttpResponseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectHttpResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectHttpResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectHttpResponseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withScript(value: SchemaScriptHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticFiles(value: SchemaStaticFilesHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRegex")(js.undefined)
        ret
    }
  }
  
}

