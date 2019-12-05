package typingsSlinky.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestContext extends js.Object {
  var AudioPlayer: js.UndefOr[typingsSlinky.alexaDashSdk.alexaDashSdkMod.AudioPlayer] = js.undefined
  var Display: js.UndefOr[typingsSlinky.alexaDashSdk.alexaDashSdkMod.Display] = js.undefined
  var System: typingsSlinky.alexaDashSdk.alexaDashSdkMod.System
}

object RequestContext {
  @scala.inline
  def apply(System: System, AudioPlayer: AudioPlayer = null, Display: Display = null): RequestContext = {
    val __obj = js.Dynamic.literal(System = System.asInstanceOf[js.Any])
    if (AudioPlayer != null) __obj.updateDynamic("AudioPlayer")(AudioPlayer.asInstanceOf[js.Any])
    if (Display != null) __obj.updateDynamic("Display")(Display.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestContext]
  }
}

