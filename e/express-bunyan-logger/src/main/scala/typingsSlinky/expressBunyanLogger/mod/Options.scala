package typingsSlinky.expressBunyanLogger.mod

import typingsSlinky.bunyan.mod.LogLevel
import typingsSlinky.bunyan.mod.Serializers
import typingsSlinky.bunyan.mod.Stream
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<bunyan.bunyan.LoggerOptions> */
@js.native
trait Options extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.native
  var format: js.UndefOr[String | FormatFunction] = js.native
  var genReqId: js.UndefOr[RequestIdGenFunction] = js.native
  var immediate: js.UndefOr[Boolean] = js.native
  var includesFn: js.UndefOr[IncludesFunction] = js.native
  var level: js.UndefOr[LogLevel] = js.native
  var levelFn: js.UndefOr[LevelFunction] = js.native
  var logger: js.UndefOr[typingsSlinky.bunyan.mod.^] = js.native
  var name: js.UndefOr[String] = js.native
  var obfuscate: js.UndefOr[js.Array[String]] = js.native
  var obfuscatePlaceholder: js.UndefOr[String] = js.native
  var parseUA: js.UndefOr[Boolean] = js.native
  var serializers: js.UndefOr[Serializers] = js.native
  var src: js.UndefOr[Boolean] = js.native
  var stream: js.UndefOr[WritableStream] = js.native
  var streams: js.UndefOr[js.Array[Stream]] = js.native
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
    def withExcludes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* meta */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: String | FormatFunction): Self = {
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
    def withGenReqId(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = {
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
    def withImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediate")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludesFn(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includesFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIncludesFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includesFn")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: LogLevel): Self = {
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
    def withLevelFn(value: (/* status */ Double, /* err */ js.Error | Null, /* meta */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutLevelFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelFn")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: typingsSlinky.bunyan.mod.^): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withObfuscate(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObfuscate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscate")(js.undefined)
        ret
    }
    @scala.inline
    def withObfuscatePlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscatePlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObfuscatePlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obfuscatePlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withParseUA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseUA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseUA")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializers(value: Serializers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializers")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: WritableStream): Self = {
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
    def withStreams(value: js.Array[Stream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streams")(js.undefined)
        ret
    }
  }
  
}

