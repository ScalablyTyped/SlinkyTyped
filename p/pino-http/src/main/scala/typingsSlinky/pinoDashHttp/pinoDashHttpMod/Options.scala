package typingsSlinky.pinoDashHttp.pinoDashHttpMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.pino.Anon_AsObject
import typingsSlinky.pino.pinoMod.DestinationStream
import typingsSlinky.pino.pinoMod.Level
import typingsSlinky.pino.pinoMod.LevelWithSilent
import typingsSlinky.pino.pinoMod.Logger
import typingsSlinky.pino.pinoMod.LoggerOptions
import typingsSlinky.pino.pinoMod.PrettyOptions
import typingsSlinky.pino.pinoMod.SerializerFn
import typingsSlinky.pino.pinoMod.TimeFn
import typingsSlinky.pino.pinoMod.redactOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for pino-http
  *
  * See https://github.com/pinojs/pino-http#pinohttpopts-stream
  */
trait Options extends LoggerOptions {
  var autoLogging: js.UndefOr[Boolean] = js.undefined
  var customLogLevel: js.UndefOr[js.Function2[/* res */ ServerResponse, /* error */ js.Error, Level]] = js.undefined
  var genReqId: js.UndefOr[GenReqId] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var stream: js.UndefOr[DestinationStream] = js.undefined
  var useLevel: js.UndefOr[Level] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoLogging: js.UndefOr[Boolean] = js.undefined,
    base: StringDictionary[js.Any] = null,
    browser: Anon_AsObject = null,
    changeLevelName: String = null,
    customLevels: StringDictionary[Double] = null,
    customLogLevel: (/* res */ ServerResponse, /* error */ js.Error) => Level = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    genReqId: /* req */ IncomingMessage => ReqId = null,
    level: LevelWithSilent | String = null,
    levelVal: Int | Double = null,
    logger: Logger = null,
    messageKey: String = null,
    name: String = null,
    onTerminated: (/* eventName */ String, /* err */ js.Any) => Unit = null,
    prettyPrint: Boolean | PrettyOptions = null,
    redact: js.Array[String] | redactOptions = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    serializers: StringDictionary[SerializerFn] = null,
    stream: DestinationStream = null,
    timestamp: TimeFn | Boolean = null,
    useLevel: Level = null,
    useLevelLabels: js.UndefOr[Boolean] = js.undefined,
    useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLogging)) __obj.updateDynamic("autoLogging")(autoLogging.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (changeLevelName != null) __obj.updateDynamic("changeLevelName")(changeLevelName.asInstanceOf[js.Any])
    if (customLevels != null) __obj.updateDynamic("customLevels")(customLevels.asInstanceOf[js.Any])
    if (customLogLevel != null) __obj.updateDynamic("customLogLevel")(js.Any.fromFunction2(customLogLevel))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (genReqId != null) __obj.updateDynamic("genReqId")(js.Any.fromFunction1(genReqId))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelVal != null) __obj.updateDynamic("levelVal")(levelVal.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onTerminated != null) __obj.updateDynamic("onTerminated")(js.Any.fromFunction2(onTerminated))
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (redact != null) __obj.updateDynamic("redact")(redact.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (useLevel != null) __obj.updateDynamic("useLevel")(useLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(useLevelLabels)) __obj.updateDynamic("useLevelLabels")(useLevelLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnlyCustomLevels)) __obj.updateDynamic("useOnlyCustomLevels")(useOnlyCustomLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

