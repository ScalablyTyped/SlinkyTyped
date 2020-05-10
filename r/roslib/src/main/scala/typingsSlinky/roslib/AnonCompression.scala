package typingsSlinky.roslib

import typingsSlinky.roslib.mod.Ros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompression extends js.Object {
  var compression: js.UndefOr[String] = js.native
  var latch: js.UndefOr[Boolean] = js.native
  var messageType: String = js.native
  var name: String = js.native
  var queue_length: js.UndefOr[Double] = js.native
  var queue_size: js.UndefOr[Double] = js.native
  var ros: Ros = js.native
  var throttle_rate: js.UndefOr[Double] = js.native
}

object AnonCompression {
  @scala.inline
  def apply(messageType: String, name: String, ros: Ros): AnonCompression = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompression]
  }
  @scala.inline
  implicit class AnonCompressionOps[Self <: AnonCompression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRos(value: Ros): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withLatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latch")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue_length")(js.undefined)
        ret
    }
    @scala.inline
    def withQueue_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueue_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue_size")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle_rate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle_rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle_rate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle_rate")(js.undefined)
        ret
    }
  }
  
}

