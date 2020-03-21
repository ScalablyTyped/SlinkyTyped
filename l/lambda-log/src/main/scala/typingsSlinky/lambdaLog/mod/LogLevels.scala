package typingsSlinky.lambdaLog.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.lambdaLog.lambdaLogBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogLevels
  extends /* key */ StringDictionary[js.Any] {
  var debug: typingsSlinky.lambdaLog.lambdaLogStrings.log | `false`
  var error: typingsSlinky.lambdaLog.lambdaLogStrings.error
  var info: typingsSlinky.lambdaLog.lambdaLogStrings.info
  var warn: typingsSlinky.lambdaLog.lambdaLogStrings.warn
}

object LogLevels {
  @scala.inline
  def apply(
    debug: typingsSlinky.lambdaLog.lambdaLogStrings.log | `false`,
    error: typingsSlinky.lambdaLog.lambdaLogStrings.error,
    info: typingsSlinky.lambdaLog.lambdaLogStrings.info,
    warn: typingsSlinky.lambdaLog.lambdaLogStrings.warn,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): LogLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LogLevels]
  }
}

