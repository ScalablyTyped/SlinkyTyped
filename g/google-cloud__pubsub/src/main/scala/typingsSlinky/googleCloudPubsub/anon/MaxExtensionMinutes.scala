package typingsSlinky.googleCloudPubsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxExtensionMinutes extends js.Object {
  var maxExtensionMinutes: Double = js.native
  var maxOutstandingBytes: Double = js.native
  var maxOutstandingMessages: Double = js.native
  var maxStreams: Double = js.native
}

object MaxExtensionMinutes {
  @scala.inline
  def apply(
    maxExtensionMinutes: Double,
    maxOutstandingBytes: Double,
    maxOutstandingMessages: Double,
    maxStreams: Double
  ): MaxExtensionMinutes = {
    val __obj = js.Dynamic.literal(maxExtensionMinutes = maxExtensionMinutes.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any], maxStreams = maxStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxExtensionMinutes]
  }
  @scala.inline
  implicit class MaxExtensionMinutesOps[Self <: MaxExtensionMinutes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxExtensionMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxExtensionMinutes")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withMaxStreams(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStreams")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

