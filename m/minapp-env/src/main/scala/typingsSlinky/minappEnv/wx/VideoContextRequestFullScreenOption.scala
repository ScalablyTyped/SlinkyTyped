package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvNumbers.`-90`
import typingsSlinky.minappEnv.minappEnvNumbers.`0`
import typingsSlinky.minappEnv.minappEnvNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoContextRequestFullScreenOption extends js.Object {
  /** 设置全屏时视频的方向，不指定则根据宽高比自动判断。
    *
    * 可选值：
    * - 0: 正常竖向;
    * - 90: 屏幕逆时针90度;
    * - -90: 屏幕顺时针90度;
    *
    * 最低基础库： `1.7.0` */
  var direction: js.UndefOr[`0` | `90` | `-90`] = js.native
}

object VideoContextRequestFullScreenOption {
  @scala.inline
  def apply(): VideoContextRequestFullScreenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoContextRequestFullScreenOption]
  }
  @scala.inline
  implicit class VideoContextRequestFullScreenOptionOps[Self <: VideoContextRequestFullScreenOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: `0` | `90` | `-90`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
  }
  
}

