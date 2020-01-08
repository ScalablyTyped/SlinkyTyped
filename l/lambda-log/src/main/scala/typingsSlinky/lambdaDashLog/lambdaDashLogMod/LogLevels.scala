package typingsSlinky.lambdaDashLog.lambdaDashLogMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lambdaDashLog.lambdaDashLogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  var debug: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.log | `false`
  var error: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.error
  var info: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.info
  var warn: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.warn
}

object LogLevels {
  @scala.inline
  def apply(
    debug: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.log | `false`,
    error: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.error,
    info: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.info,
    warn: typingsSlinky.lambdaDashLog.lambdaDashLogStrings.warn,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevels]
  }
}

