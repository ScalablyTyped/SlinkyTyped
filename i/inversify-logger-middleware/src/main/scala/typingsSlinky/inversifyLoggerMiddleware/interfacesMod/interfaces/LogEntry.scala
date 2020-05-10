package typingsSlinky.inversifyLoggerMiddleware.interfacesMod.interfaces

import typingsSlinky.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntry extends js.Object {
  var error: Boolean = js.native
  var exception: js.Any = js.native
  var guid: String = js.native
  var multiInject: Boolean = js.native
  var results: js.Array[_] = js.native
  var rootRequest: Request = js.native
  var serviceIdentifier: js.Any = js.native
  var time: String = js.native
}

object LogEntry {
  @scala.inline
  def apply(
    error: Boolean,
    exception: js.Any,
    guid: String,
    multiInject: Boolean,
    results: js.Array[_],
    rootRequest: Request,
    serviceIdentifier: js.Any,
    time: String
  ): LogEntry = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], multiInject = multiInject.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], rootRequest = rootRequest.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withException(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exception")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiInject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiInject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootRequest(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceIdentifier(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

