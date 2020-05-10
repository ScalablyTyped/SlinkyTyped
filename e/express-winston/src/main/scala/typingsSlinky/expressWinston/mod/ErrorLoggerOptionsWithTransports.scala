package typingsSlinky.expressWinston.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorLoggerOptionsWithTransports
  extends BaseErrorLoggerOptions
     with ErrorLoggerOptions {
  var transports: js.Array[typingsSlinky.winstonTransport.mod.^] = js.native
}

object ErrorLoggerOptionsWithTransports {
  @scala.inline
  def apply(transports: js.Array[typingsSlinky.winstonTransport.mod.^]): ErrorLoggerOptionsWithTransports = {
    val __obj = js.Dynamic.literal(transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorLoggerOptionsWithTransports]
  }
  @scala.inline
  implicit class ErrorLoggerOptionsWithTransportsOps[Self <: ErrorLoggerOptionsWithTransports] (val x: Self) extends AnyVal {
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

