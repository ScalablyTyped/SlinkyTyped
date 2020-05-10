package typingsSlinky.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioVoice extends js.Object {
  /**
    *   Connect to p5 objects or Web Audio Nodes
    */
  def connect(unit: js.Object): Unit = js.native
  /**
    *   Disconnect from soundOut
    */
  def disconnect(): Unit = js.native
}

object AudioVoice {
  @scala.inline
  def apply(connect: js.Object => Unit, disconnect: () => Unit): AudioVoice = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction0(disconnect))
    __obj.asInstanceOf[AudioVoice]
  }
  @scala.inline
  implicit class AudioVoiceOps[Self <: AudioVoice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

