package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var balance: Double = js.native
  var data: EventData = js.native
  var floatValue: Double = js.native
  var intValue: Double = js.native
  var stringValue: String = js.native
  var time: Double = js.native
  var volume: Double = js.native
}

object Event {
  @scala.inline
  def apply(
    balance: Double,
    data: EventData,
    floatValue: Double,
    intValue: Double,
    stringValue: String,
    time: Double,
    volume: Double
  ): Event = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], floatValue = floatValue.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: EventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

