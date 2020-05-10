package typingsSlinky.requestStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBytesDelta extends js.Object {
  /**
    * Total bytes received
    */
  var bytes: Double = js.native
  /**
    * Bytes received since previous call to `.progress()`
    */
  var bytesDelta: Double = js.native
  /**
    * If the request contains a Content-Size header
    */
  var bytesLeft: Double = js.native
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: Double = js.native
  /**
    * If the request contains a Content-Size header
    */
  var timeLeft: Double = js.native
}

object AnonBytesDelta {
  @scala.inline
  def apply(bytes: Double, bytesDelta: Double, bytesLeft: Double, speed: Double, timeLeft: Double): AnonBytesDelta = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], bytesLeft = bytesLeft.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesDelta]
  }
  @scala.inline
  implicit class AnonBytesDeltaOps[Self <: AnonBytesDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLeft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

