package typingsSlinky.expressWinston.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.logform.mod.Format_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseErrorLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.native
  var blacklistedMetaFields: js.UndefOr[js.Array[String]] = js.native
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.native
  var exceptionToMeta: js.UndefOr[ExceptionToMetaFunction] = js.native
  var format: js.UndefOr[Format_] = js.native
  var headerBlacklist: js.UndefOr[js.Array[String]] = js.native
  var level: js.UndefOr[String | DynamicLevelFunction] = js.native
  var meta: js.UndefOr[Boolean] = js.native
  var metaField: js.UndefOr[String] = js.native
  var msg: js.UndefOr[MessageTemplate] = js.native
  var requestField: js.UndefOr[String] = js.native
  var requestFilter: js.UndefOr[RequestFilter] = js.native
  var requestWhitelist: js.UndefOr[js.Array[String]] = js.native
  var responseField: js.UndefOr[String] = js.native
  var skip: js.UndefOr[ErrorRouteFilter] = js.native
}

object BaseErrorLoggerOptions {
  @scala.inline
  def apply(): BaseErrorLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseErrorLoggerOptions]
  }
  @scala.inline
  implicit class BaseErrorLoggerOptionsOps[Self <: BaseErrorLoggerOptions] (val x: Self) extends AnyVal {
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
    def withBlacklistedMetaFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistedMetaFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklistedMetaFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklistedMetaFields")(js.undefined)
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
    def withExceptionToMeta(value: /* err */ js.Error => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionToMeta")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExceptionToMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionToMeta")(js.undefined)
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
    def withSkip(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any], /* err */ js.Error) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
  }
  
}

