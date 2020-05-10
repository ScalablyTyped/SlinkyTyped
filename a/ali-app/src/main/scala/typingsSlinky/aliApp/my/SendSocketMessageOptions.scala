package typingsSlinky.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendSocketMessageOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
  		 */
  var data: String | js.typedarray.ArrayBuffer = js.native
  /**
  		 * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
  		 */
  var isBuffer: js.UndefOr[Boolean] = js.native
}

object SendSocketMessageOptions {
  @scala.inline
  def apply(data: String | js.typedarray.ArrayBuffer): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
  @scala.inline
  implicit class SendSocketMessageOptionsOps[Self <: SendSocketMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String | js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBuffer")(js.undefined)
        ret
    }
  }
  
}

