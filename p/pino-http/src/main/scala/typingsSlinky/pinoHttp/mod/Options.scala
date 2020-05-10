package typingsSlinky.pinoHttp.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.pino.mod.DestinationStream
import typingsSlinky.pino.mod.Level
import typingsSlinky.pino.mod.Logger
import typingsSlinky.pino.mod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for pino-http
  *
  * See https://github.com/pinojs/pino-http#pinohttpopts-stream
  */
@js.native
trait Options extends LoggerOptions {
  var autoLogging: js.UndefOr[Boolean | AutoLoggingOptions] = js.native
  var customAttributeKeys: js.UndefOr[CustomAttributeKeys] = js.native
  var customErrorMessage: js.UndefOr[js.Function1[/* req */ IncomingMessage, String]] = js.native
  var customLogLevel: js.UndefOr[js.Function2[/* res */ ServerResponse, /* error */ js.Error, Level]] = js.native
  var customSuccessMessage: js.UndefOr[js.Function1[/* req */ IncomingMessage, String]] = js.native
  var genReqId: js.UndefOr[GenReqId] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var stream: js.UndefOr[DestinationStream] = js.native
  var useLevel: js.UndefOr[Level] = js.native
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
    def withAutoLogging(value: Boolean | AutoLoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributeKeys(value: CustomAttributeKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributeKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomErrorMessage(value: /* req */ IncomingMessage => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customErrorMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLogLevel(value: (/* res */ ServerResponse, /* error */ js.Error) => Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLogLevel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLogLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSuccessMessage(value: /* req */ IncomingMessage => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSuccessMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomSuccessMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSuccessMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withGenReqId(value: /* req */ IncomingMessage => ReqId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genReqId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGenReqId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genReqId")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: DestinationStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLevel(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLevel")(js.undefined)
        ret
    }
  }
  
}

