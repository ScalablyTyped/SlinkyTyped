package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStreamid extends js.Object {
  var stream_id: String = js.native
}

object AnonStreamid {
  @scala.inline
  def apply(stream_id: String): AnonStreamid = {
    val __obj = js.Dynamic.literal(stream_id = stream_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStreamid]
  }
  @scala.inline
  implicit class AnonStreamidOps[Self <: AnonStreamid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

