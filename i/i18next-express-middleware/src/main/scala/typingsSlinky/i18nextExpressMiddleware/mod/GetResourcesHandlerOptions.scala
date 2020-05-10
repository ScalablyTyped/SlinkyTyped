package typingsSlinky.i18nextExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcesHandlerOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var lngParam: js.UndefOr[String] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var nsParam: js.UndefOr[String] = js.native
}

object GetResourcesHandlerOptions {
  @scala.inline
  def apply(): GetResourcesHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesHandlerOptions]
  }
  @scala.inline
  implicit class GetResourcesHandlerOptionsOps[Self <: GetResourcesHandlerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withLngParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLngParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngParam")(js.undefined)
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
    def withNsParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNsParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nsParam")(js.undefined)
        ret
    }
  }
  
}

