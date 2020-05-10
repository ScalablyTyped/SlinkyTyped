package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 界面-----设置置顶信息
@js.native
trait SetTopBarTextOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 置顶栏文字内容
  		 */
  var text: String = js.native
}

object SetTopBarTextOptions {
  @scala.inline
  def apply(text: String): SetTopBarTextOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTopBarTextOptions]
  }
  @scala.inline
  implicit class SetTopBarTextOptionsOps[Self <: SetTopBarTextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

