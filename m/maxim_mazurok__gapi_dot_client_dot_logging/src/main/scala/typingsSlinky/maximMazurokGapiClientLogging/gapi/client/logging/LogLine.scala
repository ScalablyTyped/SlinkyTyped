package typingsSlinky.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogLine extends js.Object {
  
  /** App-provided log message. */
  var logMessage: js.UndefOr[String] = js.native
  
  /** Severity of this log entry. */
  var severity: js.UndefOr[String] = js.native
  
  /** Where in the source code this log message was written. */
  var sourceLocation: js.UndefOr[SourceLocation] = js.native
  
  /** Approximate time when this log entry was made. */
  var time: js.UndefOr[String] = js.native
}
object LogLine {
  
  @scala.inline
  def apply(): LogLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogLine]
  }
  
  @scala.inline
  implicit class LogLineOps[Self <: LogLine] (val x: Self) extends AnyVal {
    
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
    def setLogMessage(value: String): Self = this.set("logMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogMessage: Self = this.set("logMessage", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: SourceLocation): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLocation: Self = this.set("sourceLocation", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
