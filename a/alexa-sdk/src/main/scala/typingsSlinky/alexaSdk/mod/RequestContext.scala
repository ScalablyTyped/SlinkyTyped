package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestContext extends js.Object {
  var AudioPlayer: js.UndefOr[typingsSlinky.alexaSdk.mod.AudioPlayer] = js.native
  var Display: js.UndefOr[typingsSlinky.alexaSdk.mod.Display] = js.native
  var System: typingsSlinky.alexaSdk.mod.System = js.native
}

object RequestContext {
  @scala.inline
  def apply(System: System): RequestContext = {
    val __obj = js.Dynamic.literal(System = System.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestContext]
  }
  @scala.inline
  implicit class RequestContextOps[Self <: RequestContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSystem(value: System): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioPlayer(value: AudioPlayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPlayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioPlayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AudioPlayer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: Display): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Display")(js.undefined)
        ret
    }
  }
  
}

