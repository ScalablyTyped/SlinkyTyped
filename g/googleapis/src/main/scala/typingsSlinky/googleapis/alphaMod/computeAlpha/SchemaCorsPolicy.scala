package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for allowing client side cross-origin requests. Please
  * see W3C Recommendation for Cross Origin Resource Sharing
  */
@js.native
trait SchemaCorsPolicy extends js.Object {
  /**
    * In response to a preflight request, setting this to true indicates that
    * the actual request can include user credentials. This translates to the
    * Access-Control-Allow-Credentials header. Default is false.
    */
  var allowCredentials: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the content for the Access-Control-Allow-Headers header.
    */
  var allowHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies the content for the Access-Control-Allow-Methods header.
    */
  var allowMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies the regualar expression patterns that match allowed origins.
    * For regular expression grammar please see
    * en.cppreference.com/w/cpp/regex/ecmascript  An origin is allowed if it
    * matches either allow_origins or allow_origin_regex.
    */
  var allowOriginRegexes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies the list of origins that will be allowed to do CORS requests.
    * An origin is allowed if it matches either allow_origins or
    * allow_origin_regex.
    */
  var allowOrigins: js.UndefOr[js.Array[String]] = js.native
  /**
    * If true, specifies the CORS policy is disabled. The default value of
    * false, which indicates that the CORS policy is in effect.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the content for the Access-Control-Expose-Headers header.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies how long the results of a preflight request can be cached. This
    * translates to the content for the Access-Control-Max-Age header.
    */
  var maxAge: js.UndefOr[Double] = js.native
}

object SchemaCorsPolicy {
  @scala.inline
  def apply(): SchemaCorsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorsPolicy]
  }
  @scala.inline
  implicit class SchemaCorsPolicyOps[Self <: SchemaCorsPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOriginRegexes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOriginRegexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOriginRegexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOriginRegexes")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOrigins(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOrigins")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExposeHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeHeaders")(js.undefined)
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
  }
  
}

