package typingsSlinky.ionicCliFramework

import typingsSlinky.ionicCliFramework.loggerMod.LoggerHandler
import typingsSlinky.ionicCliFramework.loggerMod.LoggerLevelWeight
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerOptions> */
trait PartialLoggerOptions extends js.Object {
  var handlers: js.UndefOr[Set[LoggerHandler]] = js.undefined
  var level: js.UndefOr[LoggerLevelWeight] = js.undefined
}

object PartialLoggerOptions {
  @scala.inline
  def apply(handlers: Set[LoggerHandler] = null, level: Int | Double = null): PartialLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLoggerOptions]
  }
}

