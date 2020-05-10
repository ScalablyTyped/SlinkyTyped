package typingsSlinky.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodeNumber extends js.Object {
  /**
    * The event code for media stream relay.
    *
    * - 0: The user disconnects from the server due to a poor network connection.
    * - 1: The user is connected to the server.
    * - 2: The user joins the source channel.
    * - 3: The user joins the destination channel.
    * - 4: The SDK starts relaying the media stream to the destination channel.
    * - 5: The server receives the video stream from the source channel.
    * - 6: The server receives the audio stream from the source channel.
    * - 7: The destination channel is updated.
    */
  var code: Double = js.native
}

object AnonCodeNumber {
  @scala.inline
  def apply(code: Double): AnonCodeNumber = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeNumber]
  }
  @scala.inline
  implicit class AnonCodeNumberOps[Self <: AnonCodeNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

