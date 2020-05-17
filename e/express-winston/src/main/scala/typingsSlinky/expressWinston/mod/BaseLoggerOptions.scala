package typingsSlinky.expressWinston.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressWinston.anon.Error
import typingsSlinky.logform.mod.Format_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.native
  var bodyBlacklist: js.UndefOr[js.Array[String]] = js.native
  var bodyWhitelist: js.UndefOr[js.Array[String]] = js.native
  var colorize: js.UndefOr[Boolean] = js.native
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.native
  var expressFormat: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Format_] = js.native
  var headerBlacklist: js.UndefOr[js.Array[String]] = js.native
  var ignoreRoute: js.UndefOr[RouteFilter] = js.native
  var ignoredRoutes: js.UndefOr[js.Array[String]] = js.native
  var level: js.UndefOr[String | DynamicLevelFunction] = js.native
  var meta: js.UndefOr[Boolean] = js.native
  var metaField: js.UndefOr[String] = js.native
  var msg: js.UndefOr[MessageTemplate] = js.native
  var requestField: js.UndefOr[String] = js.native
  var requestFilter: js.UndefOr[RequestFilter] = js.native
  var requestWhitelist: js.UndefOr[js.Array[String]] = js.native
  var responseField: js.UndefOr[String] = js.native
  var responseFilter: js.UndefOr[ResponseFilter] = js.native
  var responseWhitelist: js.UndefOr[js.Array[String]] = js.native
  var skip: js.UndefOr[RouteFilter] = js.native
  var statusLevels: js.UndefOr[Error] = js.native
}

object BaseLoggerOptions {
  @scala.inline
  def apply(): BaseLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLoggerOptions]
  }
  @scala.inline
  implicit class BaseLoggerOptionsOps[Self <: BaseLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseMeta(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withColorize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorize")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicMeta(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ js.Error) => js.Object
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicMeta")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDynamicMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withExpressFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpressFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Format_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderBlacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBlacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBlacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRoute(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIgnoreRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredRoutes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredRoutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredRoutes")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelFunction3(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ js.Error) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLevel(value: String | DynamicLevelFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaField")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMsg(value: MessageTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestField")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestFilter(value: (/* req */ FilterRequest, /* propName */ String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRequestFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseField")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseFilter(value: (/* res */ FilterResponse, /* propName */ String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResponseFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseWhitelist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseWhitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseWhitelist")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusLevels(value: Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusLevels")(js.undefined)
        ret
    }
  }
  
}

