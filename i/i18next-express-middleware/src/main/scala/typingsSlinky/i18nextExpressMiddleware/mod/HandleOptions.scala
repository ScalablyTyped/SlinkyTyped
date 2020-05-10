package typingsSlinky.i18nextExpressMiddleware.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleOptions extends js.Object {
  var ignoreRoutes: js.UndefOr[js.Array[String] | IgnoreRoutesFunction] = js.native
  var removeLngFromUrl: js.UndefOr[Boolean] = js.native
}

object HandleOptions {
  @scala.inline
  def apply(): HandleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleOptions]
  }
  @scala.inline
  implicit class HandleOptionsOps[Self <: HandleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreRoutesFunction4(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* options */ HandleOptions, /* i18next */ I18next) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoutes")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withIgnoreRoutes(value: js.Array[String] | IgnoreRoutesFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveLngFromUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLngFromUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveLngFromUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLngFromUrl")(js.undefined)
        ret
    }
  }
  
}

