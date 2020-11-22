package typingsSlinky.bsLogger.targetMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLevelMap[T] extends js.Object {
  
  var debug: T = js.native
  
  var error: T = js.native
  
  var fatal: T = js.native
  
  var info: T = js.native
  
  var trace: T = js.native
  
  var warn: T = js.native
}
object LogLevelMap {
  
  @scala.inline
  def apply[T](debug: T, error: T, fatal: T, info: T, trace: T, warn: T): LogLevelMap[T] = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogLevelMap[T]]
  }
  
  @scala.inline
  implicit class LogLevelMapOps[Self <: LogLevelMap[_], T] (val x: Self with LogLevelMap[T]) extends AnyVal {
    
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
    def setDebug(value: T): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: T): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: T): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: T): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: T): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: T): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
