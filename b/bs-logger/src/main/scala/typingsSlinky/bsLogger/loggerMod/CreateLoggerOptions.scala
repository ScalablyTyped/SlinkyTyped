package typingsSlinky.bsLogger.loggerMod

import typingsSlinky.bsLogger.contextMod.LogContext
import typingsSlinky.bsLogger.messageMod.LogMessage
import typingsSlinky.bsLogger.messageMod.LogMessageTranslator
import typingsSlinky.bsLogger.targetMod.LogTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLoggerOptions extends js.Object {
  
  var context: js.UndefOr[LogContext] = js.native
  
  var targets: js.UndefOr[String | js.Array[LogTarget]] = js.native
  
  var translate: js.UndefOr[LogMessageTranslator] = js.native
}
object CreateLoggerOptions {
  
  @scala.inline
  def apply(): CreateLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoggerOptions]
  }
  
  @scala.inline
  implicit class CreateLoggerOptionsOps[Self <: CreateLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: LogContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: LogTarget*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: String | js.Array[LogTarget]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setTranslate(value: /* msg */ LogMessage => LogMessage): Self = this.set("translate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
  }
}
