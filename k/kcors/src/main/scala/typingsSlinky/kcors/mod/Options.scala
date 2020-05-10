package typingsSlinky.kcors.mod

import typingsSlinky.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[String] | String] = js.native
  var allowMethods: js.UndefOr[js.Array[String] | String] = js.native
  var credentials: js.UndefOr[Boolean] = js.native
  var exposeHeaders: js.UndefOr[js.Array[String] | String] = js.native
  var keepHeadersOnError: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double | String] = js.native
  var origin: js.UndefOr[(js.Function1[/* ctx */ Context, String]) | String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHeaders(value: js.Array[String] | String): Self = {
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
    def withAllowMethods(value: js.Array[String] | String): Self = {
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
    def withExposeHeaders(value: js.Array[String] | String): Self = {
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
    def withKeepHeadersOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepHeadersOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepHeadersOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepHeadersOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double | String): Self = {
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
    def withOriginFunction1(value: /* ctx */ Context => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOrigin(value: (js.Function1[/* ctx */ Context, String]) | String): Self = {
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

