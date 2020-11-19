package typingsSlinky.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error event which is returned by the Error Reporting system.
  */
@js.native
trait SchemaErrorEvent extends js.Object {
  
  /**
    * Data about the context in which the error occurred.
    */
  var context: js.UndefOr[SchemaErrorContext] = js.native
  
  /**
    * Time when the event occurred as provided in the error report. If the
    * report did not contain a timestamp, the time the error was received by
    * the Error Reporting system is used.
    */
  var eventTime: js.UndefOr[String] = js.native
  
  /**
    * The stack trace that was reported or logged by the service.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * The `ServiceContext` for which this error was reported.
    */
  var serviceContext: js.UndefOr[SchemaServiceContext] = js.native
}
object SchemaErrorEvent {
  
  @scala.inline
  def apply(): SchemaErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorEvent]
  }
  
  @scala.inline
  implicit class SchemaErrorEventOps[Self <: SchemaErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setContext(value: SchemaErrorContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setServiceContext(value: SchemaServiceContext): Self = this.set("serviceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceContext: Self = this.set("serviceContext", js.undefined)
  }
}
