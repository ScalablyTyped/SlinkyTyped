package typingsSlinky.googleCloudPubsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxDelayMillis extends js.Object {
  var maxDelayMillis: Double = js.native
  var maxOutstandingBytes: Double = js.native
  var maxOutstandingMessages: Double = js.native
}

object MaxDelayMillis {
  @scala.inline
  def apply(maxDelayMillis: Double, maxOutstandingBytes: Double, maxOutstandingMessages: Double): MaxDelayMillis = {
    val __obj = js.Dynamic.literal(maxDelayMillis = maxDelayMillis.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxDelayMillis]
  }
  @scala.inline
  implicit class MaxDelayMillisOps[Self <: MaxDelayMillis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDelayMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDelayMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxOutstandingBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutstandingBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxOutstandingMessages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOutstandingMessages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

