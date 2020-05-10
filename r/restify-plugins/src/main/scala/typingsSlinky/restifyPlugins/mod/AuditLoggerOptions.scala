package typingsSlinky.restifyPlugins.mod

import typingsSlinky.bunyan.mod.^
import typingsSlinky.restify.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditLoggerOptions extends js.Object {
  var body: js.UndefOr[Boolean] = js.native
  /**
    * Bunyan logger
    */
  var log: ^ = js.native
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
  def apply(log: ^): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditLoggerOptions]
  }
  @scala.inline
  implicit class AuditLoggerOptionsOps[Self <: AuditLoggerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: ^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withLogBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintLog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printLog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintLog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printLog")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
  }
  
}

