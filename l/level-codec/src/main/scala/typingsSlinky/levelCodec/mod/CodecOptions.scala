package typingsSlinky.levelCodec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodecOptions extends js.Object {
  var keyEncoding: js.UndefOr[String | CodecEncoder] = js.native
  var valueEncoding: js.UndefOr[String | CodecEncoder] = js.native
}

object CodecOptions {
  @scala.inline
  def apply(): CodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodecOptions]
  }
  @scala.inline
  implicit class CodecOptionsOps[Self <: CodecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyEncoding(value: String | CodecEncoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyEncoding")(js.undefined)
        ret
    }
    @scala.inline
    def withValueEncoding(value: String | CodecEncoder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueEncoding")(js.undefined)
        ret
    }
  }
  
}

