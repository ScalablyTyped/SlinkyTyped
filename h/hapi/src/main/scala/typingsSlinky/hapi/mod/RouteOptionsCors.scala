package typingsSlinky.hapi.mod

import typingsSlinky.hapi.hapiStrings.Asterisk
import typingsSlinky.hapi.hapiStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsCors extends js.Object {
  /**
    * a strings array of additional headers to exposedHeaders. Use this to keep the default headers in place.
    */
  var additionalExposedHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * a strings array of additional headers to headers. Use this to keep the default headers in place.
    */
  var additionalHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * if true, allows user credentials to be sent ('Access-Control-Allow-Credentials'). Defaults to false.
    */
  var credentials: js.UndefOr[Boolean] = js.native
  /**
    * a strings array of exposed headers ('Access-Control-Expose-Headers'). Defaults to ['WWW-Authenticate', 'Server-Authorization'].
    */
  var exposedHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * a strings array of allowed headers ('Access-Control-Allow-Headers'). Defaults to ['Accept', 'Authorization', 'Content-Type', 'If-None-Match'].
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * number of seconds the browser should cache the CORS response ('Access-Control-Max-Age'). The greater the value, the longer it will take before the browser checks for changes in policy.
    * Defaults to 86400 (one day).
    */
  var maxAge: js.UndefOr[Double] = js.native
  /**
    * an array of allowed origin servers strings ('Access-Control-Allow-Origin'). The array can contain any combination of fully qualified origins along with origin strings containing a wildcard '*'
    * character, or a single '*' origin string. If set to 'ignore', any incoming Origin header is ignored (present or not) and the 'Access-Control-Allow-Origin' header is set to '*'. Defaults to any
    * origin ['*'].
    */
  var origin: js.UndefOr[js.Array[String] | Asterisk | ignore] = js.native
}

object RouteOptionsCors {
  @scala.inline
  def apply(): RouteOptionsCors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptionsCors]
  }
  @scala.inline
  implicit class RouteOptionsCorsOps[Self <: RouteOptionsCors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalExposedHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalExposedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalExposedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalExposedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withExposedHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposedHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: js.Array[String] | Asterisk | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
  }
  
}

