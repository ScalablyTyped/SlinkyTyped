package typingsSlinky.backboneRadio.mod.backboneAugmentingMod

import typingsSlinky.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radio_ extends js.Object {
  def channel(channelName: String): Channel_ = js.native
  def log(channelName: String, eventName: String, args: js.Any*): Unit = js.native
  def tuneIn(channelName: String): Radio = js.native
  def tuneOut(channelName: String): Radio = js.native
}

object Radio_ {
  @scala.inline
  def apply(
    channel: String => Channel_,
    log: (String, String, /* repeated */ js.Any) => Unit,
    tuneIn: String => Radio,
    tuneOut: String => Radio
  ): Radio_ = {
    val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), log = js.Any.fromFunction3(log), tuneIn = js.Any.fromFunction1(tuneIn), tuneOut = js.Any.fromFunction1(tuneOut))
    __obj.asInstanceOf[Radio_]
  }
  @scala.inline
  implicit class Radio_Ops[Self <: Radio_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String => Channel_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLog(value: (String, String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTuneIn(value: String => Radio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuneIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTuneOut(value: String => Radio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tuneOut")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

