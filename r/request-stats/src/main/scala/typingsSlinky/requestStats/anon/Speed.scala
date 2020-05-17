package typingsSlinky.requestStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Speed extends js.Object {
  /**
    * Total bytes send back to the client
    */
  var bytes: Double = js.native
  /**
    * Bytes sent back to the client since previous call to `.progress()`
    */
  var bytesDelta: Double = js.native
  /**
    * Bytes per second calculated since previous call to `.progress()`
    */
  var speed: Double = js.native
}

object Speed {
  @scala.inline
  def apply(bytes: Double, bytesDelta: Double, speed: Double): Speed = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], bytesDelta = bytesDelta.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Speed]
  }
  @scala.inline
  implicit class SpeedOps[Self <: Speed] (val x: Self) extends AnyVal {
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
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

