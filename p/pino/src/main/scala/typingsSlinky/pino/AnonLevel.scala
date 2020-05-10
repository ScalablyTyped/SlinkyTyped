package typingsSlinky.pino

import typingsSlinky.pino.mod.Level
import typingsSlinky.pino.mod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLevel extends js.Object {
  /**
    * Specifies the minimum level (inclusive) of when the `send` function should be called, if not supplied
    * the `send` function will be called based on the main logging `level` (set via `options.level`,
    * defaulting to `info`).
    */
  var level: js.UndefOr[Level | String] = js.native
  /**
    * Remotely record log messages.
    *
    * @description Called after writing the log message.
    */
  def send(level: Level, logEvent: LogEvent): Unit = js.native
}

object AnonLevel {
  @scala.inline
  def apply(send: (Level, LogEvent) => Unit): AnonLevel = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[AnonLevel]
  }
  @scala.inline
  implicit class AnonLevelOps[Self <: AnonLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSend(value: (Level, LogEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLevel(value: Level | String): Self = {
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

