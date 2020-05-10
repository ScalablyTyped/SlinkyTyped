package typingsSlinky.growingIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GIOInitOptions extends js.Object {
  /** 配置imp类型的数据关闭发送 */
  var imp: js.UndefOr[Boolean] = js.native
}

object GIOInitOptions {
  @scala.inline
  def apply(): GIOInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GIOInitOptions]
  }
  @scala.inline
  implicit class GIOInitOptionsOps[Self <: GIOInitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imp")(js.undefined)
        ret
    }
  }
  
}

