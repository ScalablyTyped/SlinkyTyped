package typingsSlinky.pulumiAws.kinesisMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamEvent extends js.Object {
  var Records: js.Array[StreamEventRecord] = js.native
}

object StreamEvent {
  @scala.inline
  def apply(Records: js.Array[StreamEventRecord]): StreamEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEvent]
  }
  @scala.inline
  implicit class StreamEventOps[Self <: StreamEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: js.Array[StreamEventRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

