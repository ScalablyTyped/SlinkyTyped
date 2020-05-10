package typingsSlinky.restifyCorsMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** user defined headers to allow */
  var allowHeaders: js.Array[String] = js.native
  /** if true, uses creds */
  var credentials: js.UndefOr[Boolean] = js.native
  /** user defined headers to expose */
  var exposeHeaders: js.Array[String] = js.native
  /**
    * an array of whitelisted origins
    * can be both strings and regular expressions
    */
  var origins: js.Array[String | js.RegExp] = js.native
  /** ms to cache preflight requests */
  var preflightMaxAge: js.UndefOr[Double] = js.native
  /** customize preflight request handling */
  var preflightStrategy: js.UndefOr[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[String],
    exposeHeaders: js.Array[String],
    origins: js.Array[String | js.RegExp]
  ): Options = {
    val __obj = js.Dynamic.literal(allowHeaders = allowHeaders.asInstanceOf[js.Any], exposeHeaders = exposeHeaders.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExposeHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposeHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigins(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
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
    def withPreflightMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preflightMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreflightMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preflightMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withPreflightStrategy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preflightStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreflightStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preflightStrategy")(js.undefined)
        ret
    }
  }
  
}

