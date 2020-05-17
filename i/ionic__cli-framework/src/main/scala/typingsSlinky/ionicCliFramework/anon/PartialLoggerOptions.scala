package typingsSlinky.ionicCliFramework.anon

import typingsSlinky.ionicCliFramework.loggerMod.LoggerHandler
import typingsSlinky.ionicCliFramework.loggerMod.LoggerLevelWeight
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerOptions> */
@js.native
trait PartialLoggerOptions extends js.Object {
  var handlers: js.UndefOr[Set[LoggerHandler]] = js.native
  var level: js.UndefOr[LoggerLevelWeight] = js.native
}

object PartialLoggerOptions {
  @scala.inline
  def apply(): PartialLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoggerOptions]
  }
  @scala.inline
  implicit class PartialLoggerOptionsOps[Self <: PartialLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandlers(value: Set[LoggerHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: LoggerLevelWeight): Self = {
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
  }
  
}

