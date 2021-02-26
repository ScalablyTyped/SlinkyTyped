package typingsSlinky.restify.mod.plugins

import typingsSlinky.restify.mod.Request
import typingsSlinky.restify.mod.Response
import typingsSlinky.restify.mod.Server
import typingsSlinky.restify.restifyStrings.after
import typingsSlinky.restify.restifyStrings.routed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditLoggerOptions extends StObject {
  
  var body: js.UndefOr[Boolean] = js.native
  
  /**
    * The optional context function of signature
    * f(req, res, route, err).  Invoked each time an audit log is generated. This
    * function can return an object that customizes the format of anything off the
    * req, res, route, and err objects. The output of this function will be
    * available on the `context` key in the audit object.
    */
  var context: js.UndefOr[AuditLoggerContext] = js.native
  
  /**
    * The event from the server which initiates the
    * log, one of 'pre', 'routed', or 'after'
    */
  var event: typingsSlinky.restify.restifyStrings.pre | routed | after = js.native
  
  /**
    * Bunyan logger
    */
  var log: typingsSlinky.bunyan.mod.^ = js.native
  
  /**
    * Ringbuffer which is written to if passed in
    */
  var logBuffer: js.UndefOr[js.Any] = js.native
  
  /**
    * When true, prints audit logs. default true.
    */
  var printLog: js.UndefOr[Boolean] = js.native
  
  /**
    * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
    */
  var server: js.UndefOr[Server] = js.native
}
object AuditLoggerOptions {
  
  @scala.inline
  def apply(event: typingsSlinky.restify.restifyStrings.pre | routed | after, log: typingsSlinky.bunyan.mod.^): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditLoggerOptions]
  }
  
  @scala.inline
  implicit class AuditLoggerOptionsMutableBuilder[Self <: AuditLoggerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContext(value: (/* req */ Request, /* res */ Response, /* route */ js.Any, /* error */ js.Any) => js.Any): Self = StObject.set(x, "context", js.Any.fromFunction4(value))
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setEvent(value: typingsSlinky.restify.restifyStrings.pre | routed | after): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: typingsSlinky.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBuffer(value: js.Any): Self = StObject.set(x, "logBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBufferUndefined: Self = StObject.set(x, "logBuffer", js.undefined)
    
    @scala.inline
    def setPrintLog(value: Boolean): Self = StObject.set(x, "printLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintLogUndefined: Self = StObject.set(x, "printLog", js.undefined)
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
