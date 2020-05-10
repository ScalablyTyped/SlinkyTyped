package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvNumbers.`0`
import typingsSlinky.minappEnv.minappEnvNumbers.`1`
import typingsSlinky.minappEnv.minappEnvNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackgroundAudioPlayerStateSuccessCallbackResult extends js.Object {
  /** 选定音频的播放位置（单位：s），只有在音乐播放中时返回 */
  var currentPosition: Double = js.native
  /** 歌曲数据链接，只有在音乐播放中时返回 */
  var dataUrl: String = js.native
  /** 音频的下载进度百分比，只有在音乐播放中时返回 */
  var downloadPercent: Double = js.native
  /** 选定音频的长度（单位：s），只有在音乐播放中时返回 */
  var duration: Double = js.native
  /** 播放状态
    *
    * 可选值：
    * - 0: 暂停中;
    * - 1: 播放中;
    * - 2: 没有音乐播放; */
  var status: `0` | `1` | `2` = js.native
}

object GetBackgroundAudioPlayerStateSuccessCallbackResult {
  @scala.inline
  def apply(
    currentPosition: Double,
    dataUrl: String,
    downloadPercent: Double,
    duration: Double,
    status: `0` | `1` | `2`
  ): GetBackgroundAudioPlayerStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], downloadPercent = downloadPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateSuccessCallbackResultOps[Self <: GetBackgroundAudioPlayerStateSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

