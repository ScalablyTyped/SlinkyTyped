package typingsSlinky.pino.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pino.anon.AsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptions extends js.Object {
  /**
    * key-value object added as child logger to each log line. If set to null the base child logger is not added
    */
  var base: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * Browser only, see http://getpino.io/#/docs/browser.
    */
  var browser: js.UndefOr[AsObject] = js.native
  /**
    * (DEPRECATED, use `levelKey`) Changes the property `level` to any string value you pass in. Default: 'level'
    */
  var changeLevelName: js.UndefOr[String] = js.native
  /**
    * Use this option to define additional logging levels.
    * The keys of the object correspond the namespace of the log level, and the values should be the numerical value of the level.
    */
  var customLevels: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Enables logging. Default: `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * An object containing functions for formatting the shape of the log lines.
    * These functions should return a JSONifiable object and should never throw.
    * These functions allow for full customization of the resulting log lines.
    * For example, they can be used to change the level key name or to enrich the default metadata.
    */
  var formatters: js.UndefOr[typingsSlinky.pino.anon.Bindings] = js.native
  /**
    * One of the supported levels or `silent` to disable logging. Any other value defines a custom level and
    * requires supplying a level value via `levelVal`. Default: 'info'.
    */
  var level: js.UndefOr[LevelWithSilent | String] = js.native
  /**
    * Changes the property `level` to any string value you pass in. Default: 'level'
    */
  var levelKey: js.UndefOr[String] = js.native
  /**
    * When defining a custom log level via level, set to an integer value to define the new level. Default: `undefined`.
    */
  var levelVal: js.UndefOr[Double] = js.native
  /**
    * The string key for the 'message' in the JSON object. Default: "msg".
    */
  var messageKey: js.UndefOr[String] = js.native
  /**
    * If provided, the `mixin` function is called each time one of the active logging methods
    * is called. The function must synchronously return an object. The properties of the
    * returned object will be added to the logged JSON.
    */
  var mixin: js.UndefOr[MixinFn] = js.native
  /**
    * The name of the logger. Default: `undefined`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The string key to place any logged object under.
    */
  var nestedKey: js.UndefOr[String] = js.native
  /**
    * This function will be invoked during process shutdown when `extreme` is set to `true`. If you do not specify
    * a function, Pino will invoke `process.exit(0)` when no error has occurred, and `process.exit(1)` otherwise.
    * If you do specify a function, it is up to you to terminate the process; you must perform only synchronous
    * operations at this point. See http://getpino.io/#/docs/extreme for more detail.
    */
  var onTerminated: js.UndefOr[js.Function2[/* eventName */ String, /* err */ js.Any, Unit]] = js.native
  /**
    * Enables pino.pretty. This is intended for non-production configurations. This may be set to a configuration
    * object as outlined in http://getpino.io/#/docs/API?id=pretty. Default: `false`.
    */
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.native
  /**
    * As an array, the redact option specifies paths that should have their values redacted from any log output.
    *
    * Each path must be a string using a syntax which corresponds to JavaScript dot and bracket notation.
    *
    * If an object is supplied, three options can be specified:
    *
    *      paths (String[]): Required. An array of paths
    *      censor (String): Optional. A value to overwrite key which are to be redacted. Default: '[Redacted]'
    *      remove (Boolean): Optional. Instead of censoring the value, remove both the key and the value. Default: false
    */
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.native
  /**
    * Avoid error causes by circular references in the object tree. Default: `true`.
    */
  var safe: js.UndefOr[Boolean] = js.native
  /**
    * an object containing functions for custom serialization of objects.
    * These functions should return an JSONifiable object and they should never throw. When logging an object,
    * each top-level property matching the exact key of a serializer will be serialized using the defined serializer.
    */
  var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.native
  /**
    * Enables or disables the inclusion of a timestamp in the log message. If a function is supplied, it must
    * synchronously return a JSON string representation of the time. If set to `false`, no timestamp will be included in the output.
    * See stdTimeFunctions for a set of available functions for passing in as a value for this option.
    * Caution: any sort of formatted time will significantly slow down Pino's performance.
    */
  var timestamp: js.UndefOr[TimeFn | Boolean] = js.native
  /**
    * Outputs the level as a string instead of integer. Default: `false`.
    */
  var useLevelLabels: js.UndefOr[Boolean] = js.native
  /**
    * Use this option to only use defined `customLevels` and omit Pino's levels.
    * Logger's default `level` must be changed to a value in `customLevels` in order to use `useOnlyCustomLevels`
    * Warning: this option may not be supported by downstream transports.
    */
  var useOnlyCustomLevels: js.UndefOr[Boolean] = js.native
}

object LoggerOptions {
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(null)
        ret
    }
    @scala.inline
    def withBrowser(value: AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeLevelName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLevelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeLevelName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLevelName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLevels(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLevels")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatters(value: typingsSlinky.pino.anon.Bindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatters")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: LevelWithSilent | String): Self = {
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
    def withLevelKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelVal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelVal")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMixin(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMixin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixin")(js.undefined)
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
    def withNestedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNestedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTerminated(value: (/* eventName */ String, /* err */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTerminated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTerminated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTerminated")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyPrint(value: Boolean | PrettyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withRedact(value: js.Array[String] | redactOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redact")(js.undefined)
        ret
    }
    @scala.inline
    def withSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializers(value: StringDictionary[SerializerFn]): Self = {
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
    def withTimestampFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimestamp(value: TimeFn | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLevelLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLevelLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLevelLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useLevelLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOnlyCustomLevels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOnlyCustomLevels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOnlyCustomLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOnlyCustomLevels")(js.undefined)
        ret
    }
  }
  
}

