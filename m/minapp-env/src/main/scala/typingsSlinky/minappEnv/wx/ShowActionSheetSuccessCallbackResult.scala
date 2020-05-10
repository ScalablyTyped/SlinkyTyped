package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowActionSheetSuccessCallbackResult extends js.Object {
  /** 用户点击的按钮序号，从上到下的顺序，从0开始 */
  var tapIndex: Double = js.native
}

object ShowActionSheetSuccessCallbackResult {
  @scala.inline
  def apply(tapIndex: Double): ShowActionSheetSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowActionSheetSuccessCallbackResult]
  }
  @scala.inline
  implicit class ShowActionSheetSuccessCallbackResultOps[Self <: ShowActionSheetSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTapIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

