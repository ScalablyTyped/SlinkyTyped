package typingsSlinky.apn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Responses extends js.Object {
  var failed: js.Array[ResponseFailure] = js.native
  var sent: js.Array[ResponseSent] = js.native
}

object Responses {
  @scala.inline
  def apply(failed: js.Array[ResponseFailure], sent: js.Array[ResponseSent]): Responses = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses]
  }
  @scala.inline
  implicit class ResponsesOps[Self <: Responses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailed(value: js.Array[ResponseFailure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSent(value: js.Array[ResponseSent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

