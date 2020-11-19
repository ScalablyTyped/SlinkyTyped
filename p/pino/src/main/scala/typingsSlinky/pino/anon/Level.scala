package typingsSlinky.pino.anon

import typingsSlinky.pino.mod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  /**
    * Specifies the minimum level (inclusive) of when the `send` function should be called, if not supplied
    * the `send` function will be called based on the main logging `level` (set via `options.level`,
    * defaulting to `info`).
    */
  var level: js.UndefOr[typingsSlinky.pino.mod.Level | String] = js.native
  
  /**
    * Remotely record log messages.
    *
    * @description Called after writing the log message.
    */
  def send(level: typingsSlinky.pino.mod.Level, logEvent: LogEvent): Unit = js.native
}
object Level {
  
  @scala.inline
  def apply(send: (typingsSlinky.pino.mod.Level, LogEvent) => Unit): Level = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSend(value: (typingsSlinky.pino.mod.Level, LogEvent) => Unit): Self = this.set("send", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLevel(value: typingsSlinky.pino.mod.Level | String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
