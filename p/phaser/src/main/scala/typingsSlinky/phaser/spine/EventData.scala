package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var audioPath: String = js.native
  var balance: Double = js.native
  var floatValue: Double = js.native
  var intValue: Double = js.native
  var name: String = js.native
  var stringValue: String = js.native
  var volume: Double = js.native
}

object EventData {
  @scala.inline
  def apply(
    audioPath: String,
    balance: Double,
    floatValue: Double,
    intValue: Double,
    name: String,
    stringValue: String,
    volume: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(audioPath = audioPath.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], floatValue = floatValue.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
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

