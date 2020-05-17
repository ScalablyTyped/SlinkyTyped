package typingsSlinky.grpcGrpcJs.callStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallStreamOptions extends js.Object {
  var deadline: Deadline = js.native
  var flags: Double = js.native
  var host: String = js.native
  var parentCall: Call | Null = js.native
}

object CallStreamOptions {
  @scala.inline
  def apply(deadline: Deadline, flags: Double, host: String): CallStreamOptions = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStreamOptions]
  }
  @scala.inline
  implicit class CallStreamOptionsOps[Self <: CallStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadlineDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadline(value: Deadline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentCall(value: Call): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentCallNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCall")(null)
        ret
    }
  }
  
}

