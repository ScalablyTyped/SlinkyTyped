package typingsSlinky.grpcGrpcJs.callStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.CallStreamOptions> */
@js.native
trait PartialCallStreamOptions extends js.Object {
  var deadline: js.UndefOr[Deadline] = js.native
  var flags: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var parentCall: js.UndefOr[Call] = js.native
}

object PartialCallStreamOptions {
  @scala.inline
  def apply(): PartialCallStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCallStreamOptions]
  }
  @scala.inline
  implicit class PartialCallStreamOptionsOps[Self <: PartialCallStreamOptions] (val x: Self) extends AnyVal {
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
    def withoutDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withParentCall(value: Call): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCall")(js.undefined)
        ret
    }
  }
  
}

