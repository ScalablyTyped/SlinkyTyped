package typingsSlinky.raygun4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracekitStackTrace extends js.Object {
  var message: String = js.native
  var mode: String = js.native
  var name: String = js.native
  var stack: js.Array[TracekitStack] = js.native
  var url: String = js.native
  var useragent: String = js.native
}

object TracekitStackTrace {
  @scala.inline
  def apply(
    message: String,
    mode: String,
    name: String,
    stack: js.Array[TracekitStack],
    url: String,
    useragent: String
  ): TracekitStackTrace = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], useragent = useragent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracekitStackTrace]
  }
  @scala.inline
  implicit class TracekitStackTraceOps[Self <: TracekitStackTrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStack(value: js.Array[TracekitStack]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseragent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useragent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

