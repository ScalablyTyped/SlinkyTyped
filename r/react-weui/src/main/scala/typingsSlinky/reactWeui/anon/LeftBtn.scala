package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftBtn extends js.Object {
  var leftBtn: String = js.native
  var rightBtn: String = js.native
}

object LeftBtn {
  @scala.inline
  def apply(leftBtn: String, rightBtn: String): LeftBtn = {
    val __obj = js.Dynamic.literal(leftBtn = leftBtn.asInstanceOf[js.Any], rightBtn = rightBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftBtn]
  }
  @scala.inline
  implicit class LeftBtnOps[Self <: LeftBtn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBtn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

