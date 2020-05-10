package typingsSlinky.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheResource extends js.Object {
  /**
    * Whether or not to store the audio mixing file in the cache.
    *
    * - `true`: (default) store the audio mixing file in the cache to speed up mixing this file the next time.
    * - `false`: do not store the audio mixing file in the cache to save RAM.
    */
  var cacheResource: js.UndefOr[Boolean] = js.native
  /**
    * Number of playback loops (only supports Chrome 65+)
    *
    * A positive integer. The value range is [1,10000]. The default value is 1.
    */
  var cycle: js.UndefOr[Double] = js.native
  /**
    * Path of the online audio file to mix. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes.
    *
    * Supported audio formats: mp3, aac, and other audio formats depending on the browser.
    */
  var filePath: String = js.native
  /**
    * Whether the audio mixing file loops infinitely.
    *
    * - `true`: The audio mixing file loops infinitely. Do not use this option if `cycle` is specified.
    * - `false`: (Default) Disables the infinite loops.
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Sets the playback position (ms) of the audio mixing file. An integer, and the value range is [0,100000000].
    *
    * If you need to play the file from the beginning, set this paramter to 0.
    */
  var playTime: Double = js.native
  /**
    * Whether the online audio file replaces the local audio stream.
    *
    * - `true`: The content of the online audio file replaces the audio stream from the microphone.
    * - `false`: (Default) The online audio file is mixed with the audio stream from the microphone.
    *
    * **Note:**
    *
    * Safari does not support this parameter.
    */
  var replace: js.UndefOr[Boolean] = js.native
}

object AnonCacheResource {
  @scala.inline
  def apply(filePath: String, playTime: Double): AnonCacheResource = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], playTime = playTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCacheResource]
  }
  @scala.inline
  implicit class AnonCacheResourceOps[Self <: AnonCacheResource] (val x: Self) extends AnyVal {
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
    def withPlayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheResource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheResource")(js.undefined)
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
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
  }
  
}

