package typingsSlinky.koaBunyanLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLoggerOptions extends js.Object {
  var durationField: js.UndefOr[String] = js.native
  var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, String]] = js.native
  var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, String]] = js.native
  var ignorePath: js.UndefOr[js.Array[String]] = js.native
  var levelFn: js.UndefOr[js.Function2[/* status */ Double, /* err */ js.Error, String]] = js.native
  var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.native
  var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.native
  var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.native
}

object RequestLoggerOptions {
  @scala.inline
  def apply(): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLoggerOptions]
  }
  @scala.inline
  implicit class RequestLoggerOptionsOps[Self <: RequestLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationField")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatRequestMessage(value: /* requestData */ RequestData => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRequestMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatRequestMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatRequestMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatResponseMessage(value: /* responseData */ ResponseData => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponseMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatResponseMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatResponseMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePath(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePath")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelFn(value: (/* status */ Double, /* err */ js.Error) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLevelFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFn")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLogFields(value: /* data */ RequestData => RequestData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLogFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateLogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLogFields")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateRequestLogFields(value: /* requestData */ RequestData => RequestData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRequestLogFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateRequestLogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRequestLogFields")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateResponseLogFields(value: /* responseData */ ResponseData => ResponseData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateResponseLogFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateResponseLogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateResponseLogFields")(js.undefined)
        ret
    }
  }
  
}

