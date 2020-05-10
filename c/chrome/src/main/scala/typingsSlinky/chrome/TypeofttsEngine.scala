package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.events.Event
import typingsSlinky.chrome.chrome.ttsEngine.TtsEngineSpeakEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofttsEngine extends js.Object {
  var onPause: Event[js.Function0[Unit]] = js.native
  var onResume: Event[js.Function0[Unit]] = js.native
  var onSpeak: TtsEngineSpeakEvent = js.native
  var onStop: Event[js.Function0[Unit]] = js.native
}

object TypeofttsEngine {
  @scala.inline
  def apply(
    onPause: Event[js.Function0[Unit]],
    onResume: Event[js.Function0[Unit]],
    onSpeak: TtsEngineSpeakEvent,
    onStop: Event[js.Function0[Unit]]
  ): TypeofttsEngine = {
    val __obj = js.Dynamic.literal(onPause = onPause.asInstanceOf[js.Any], onResume = onResume.asInstanceOf[js.Any], onSpeak = onSpeak.asInstanceOf[js.Any], onStop = onStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofttsEngine]
  }
  @scala.inline
  implicit class TypeofttsEngineOps[Self <: TypeofttsEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnPause(value: Event[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnResume(value: Event[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSpeak(value: TtsEngineSpeakEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnStop(value: Event[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

