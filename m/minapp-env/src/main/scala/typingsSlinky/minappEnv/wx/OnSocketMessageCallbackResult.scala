package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSocketMessageCallbackResult extends js.Object {
  /** 服务器返回的消息 */
  var data: String | ArrayBuffer = js.native
}

object OnSocketMessageCallbackResult {
  @scala.inline
  def apply(data: String | ArrayBuffer): OnSocketMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSocketMessageCallbackResult]
  }
  @scala.inline
  implicit class OnSocketMessageCallbackResultOps[Self <: OnSocketMessageCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

