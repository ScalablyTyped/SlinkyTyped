package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScreenBrightnessSuccessCallbackOption extends js.Object {
  /** 屏幕亮度值，范围 0 ~ 1，0 最暗，1 最亮 */
  var value: Double = js.native
}

object GetScreenBrightnessSuccessCallbackOption {
  @scala.inline
  def apply(value: Double): GetScreenBrightnessSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenBrightnessSuccessCallbackOption]
  }
  @scala.inline
  implicit class GetScreenBrightnessSuccessCallbackOptionOps[Self <: GetScreenBrightnessSuccessCallbackOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

