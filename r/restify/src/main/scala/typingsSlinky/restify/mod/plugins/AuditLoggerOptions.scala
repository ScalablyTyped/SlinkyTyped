package typingsSlinky.restify.mod.plugins

import typingsSlinky.bunyan.mod.^
import typingsSlinky.restify.mod.Request
import typingsSlinky.restify.mod.Response
import typingsSlinky.restify.mod.Server
import typingsSlinky.restify.restifyStrings.after
import typingsSlinky.restify.restifyStrings.routed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditLoggerOptions extends js.Object {
  var body: js.UndefOr[Boolean] = js.undefined
  /**
    * The optional context function of signature
    * f(req, res, route, err).  Invoked each time an audit log is generated. This
    * function can return an object that customizes the format of anything off the
    * req, res, route, and err objects. The output of this function will be
    * available on the `context` key in the audit object.
    */
  var context: js.UndefOr[AuditLoggerContext] = js.undefined
  /**
    * The event from the server which initiates the
    * log, one of 'pre', 'routed', or 'after'
    */
  var event: typingsSlinky.restify.restifyStrings.pre | routed | after
  /**
    * Bunyan logger
    */
  var log: ^
  /**
    * Ringbuffer which is written to if passed in
    */
  var logBuffer: js.UndefOr[js.Any] = js.undefined
  /**
    * When true, prints audit logs. default true.
    */
  var printLog: js.UndefOr[Boolean] = js.undefined
  /**
    * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
    */
  var server: js.UndefOr[Server] = js.undefined
}

object AuditLoggerOptions {
  @scala.inline
  def apply(
    event: typingsSlinky.restify.restifyStrings.pre | routed | after,
    log: ^,
    body: js.UndefOr[Boolean] = js.undefined,
    context: (/* req */ Request, /* res */ Response, /* route */ js.Any, /* error */ js.Any) => js.Any = null,
    logBuffer: js.Any = null,
    printLog: js.UndefOr[Boolean] = js.undefined,
    server: Server = null
  ): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(js.Any.fromFunction4(context))
    if (logBuffer != null) __obj.updateDynamic("logBuffer")(logBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(printLog)) __obj.updateDynamic("printLog")(printLog.get.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditLoggerOptions]
  }
}

