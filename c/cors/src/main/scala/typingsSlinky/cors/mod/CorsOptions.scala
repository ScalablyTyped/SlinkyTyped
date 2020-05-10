package typingsSlinky.cors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorsOptions extends js.Object {
  var allowedHeaders: js.UndefOr[String | js.Array[String]] = js.native
  var credentials: js.UndefOr[Boolean] = js.native
  var exposedHeaders: js.UndefOr[String | js.Array[String]] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var methods: js.UndefOr[String | js.Array[String]] = js.native
  var optionsSuccessStatus: js.UndefOr[Double] = js.native
  var origin: js.UndefOr[Boolean | String | js.RegExp | (js.Array[String | js.RegExp]) | CustomOrigin] = js.native
  var preflightContinue: js.UndefOr[Boolean] = js.native
}

object CorsOptions {
  @scala.inline
  def apply(): CorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorsOptions]
  }
  @scala.inline
  implicit class CorsOptionsOps[Self <: CorsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedHeaders(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHeaders")(js.undefined)
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
    def withExposedHeaders(value: String | js.Array[String]): Self = {
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
    def withMethods(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsSuccessStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsSuccessStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionsSuccessStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsSuccessStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginFunction2(
      value: (/* requestOrigin */ js.UndefOr[String], /* callback */ js.Function2[/* err */ js.Error | Null, /* allow */ js.UndefOr[Boolean], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOriginRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: Boolean | String | js.RegExp | (js.Array[String | js.RegExp]) | CustomOrigin): Self = {
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
    @scala.inline
    def withPreflightContinue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preflightContinue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreflightContinue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preflightContinue")(js.undefined)
        ret
    }
  }
  
}

