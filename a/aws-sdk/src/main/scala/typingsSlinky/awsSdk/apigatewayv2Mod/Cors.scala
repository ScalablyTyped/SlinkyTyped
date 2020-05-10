package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cors extends js.Object {
  /**
    * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
    */
  var AllowCredentials: js.UndefOr[boolean] = js.native
  /**
    * Represents a collection of allowed headers. Supported only for HTTP APIs.
    */
  var AllowHeaders: js.UndefOr[CorsHeaderList] = js.native
  /**
    * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
    */
  var AllowMethods: js.UndefOr[CorsMethodList] = js.native
  /**
    * Represents a collection of allowed origins. Supported only for HTTP APIs.
    */
  var AllowOrigins: js.UndefOr[CorsOriginList] = js.native
  /**
    * Represents a collection of exposed headers. Supported only for HTTP APIs.
    */
  var ExposeHeaders: js.UndefOr[CorsHeaderList] = js.native
  /**
    * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
    */
  var MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400] = js.native
}

object Cors {
  @scala.inline
  def apply(): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cors]
  }
  @scala.inline
  implicit class CorsOps[Self <: Cors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCredentials(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHeaders(value: CorsHeaderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMethods(value: CorsMethodList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOrigins(value: CorsOriginList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowOrigins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowOrigins")(js.undefined)
        ret
    }
    @scala.inline
    def withExposeHeaders(value: CorsHeaderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposeHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposeHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExposeHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: IntegerWithLengthBetweenMinus1And86400): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxAge")(js.undefined)
        ret
    }
  }
  
}

