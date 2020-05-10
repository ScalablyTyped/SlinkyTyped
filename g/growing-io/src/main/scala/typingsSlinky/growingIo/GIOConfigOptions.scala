package typingsSlinky.growingIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GIOConfigOptions extends js.Object {
  /** 是否采集数据 */
  var dataCollect: js.UndefOr[Boolean] = js.native
  /** 是否检测hash变化 */
  var hashtag: js.UndefOr[Boolean] = js.native
}

object GIOConfigOptions {
  @scala.inline
  def apply(): GIOConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GIOConfigOptions]
  }
  @scala.inline
  implicit class GIOConfigOptionsOps[Self <: GIOConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataCollect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataCollect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCollect")(js.undefined)
        ret
    }
    @scala.inline
    def withHashtag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
  }
  
}

