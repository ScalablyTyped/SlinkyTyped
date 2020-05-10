package typingsSlinky.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCycle extends js.Object {
  /**
    * The number of playback loops (only supported on Chrome 65 and later).
    *
    * A positive integer. The value range is [1,10000]. The default value is 1.
    */
  var cycle: js.UndefOr[Double] = js.native
  /**
    * The URL of the online audio effect file.
    *
    * The URL must contain ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Supported audio formats: MP3, AAC, and other audio formats depending on the browser.
    */
  var filePath: String = js.native
  /**
    * The ID of the specified audio effect.
    *
    * A positive integer. The value range is [1,10000]. Each audio effect has a unique ID.
    *
    * If the audio effect is preloaded into the memory through the [[preloadEffect]] method, ensure that the soundId value is set to the same value as in [[preloadEffect]].
    */
  var soundId: Double = js.native
}

object AnonCycle {
  @scala.inline
  def apply(filePath: String, soundId: Double): AnonCycle = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], soundId = soundId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCycle]
  }
  @scala.inline
  implicit class AnonCycleOps[Self <: AnonCycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCycle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cycle")(js.undefined)
        ret
    }
  }
  
}

