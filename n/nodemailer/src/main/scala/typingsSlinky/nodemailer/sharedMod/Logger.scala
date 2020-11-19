package typingsSlinky.nodemailer.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  def debug(params: js.Any*): Unit = js.native
  
  def error(params: js.Any*): Unit = js.native
  
  def fatal(params: js.Any*): Unit = js.native
  
  def info(params: js.Any*): Unit = js.native
  
  def level(level: LoggerLevel): Unit = js.native
  
  def trace(params: js.Any*): Unit = js.native
  
  def warn(params: js.Any*): Unit = js.native
}
object Logger {
  
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    error: /* repeated */ js.Any => Unit,
    fatal: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    level: LoggerLevel => Unit,
    trace: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), fatal = js.Any.fromFunction1(fatal), info = js.Any.fromFunction1(info), level = js.Any.fromFunction1(level), trace = js.Any.fromFunction1(trace), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: /* repeated */ js.Any => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFatal(value: /* repeated */ js.Any => Unit): Self = this.set("fatal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevel(value: LoggerLevel => Unit): Self = this.set("level", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrace(value: /* repeated */ js.Any => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
}
