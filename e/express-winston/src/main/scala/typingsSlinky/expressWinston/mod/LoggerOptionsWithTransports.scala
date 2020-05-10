package typingsSlinky.expressWinston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerOptionsWithTransports
  extends BaseLoggerOptions
     with LoggerOptions {
  var transports: js.Array[typingsSlinky.winstonTransport.mod.^] = js.native
}

object LoggerOptionsWithTransports {
  @scala.inline
  def apply(transports: js.Array[typingsSlinky.winstonTransport.mod.^]): LoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptionsWithTransports]
  }
  @scala.inline
  implicit class LoggerOptionsWithTransportsOps[Self <: LoggerOptionsWithTransports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransports(value: js.Array[typingsSlinky.winstonTransport.mod.^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

