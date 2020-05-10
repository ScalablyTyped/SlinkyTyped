package typingsSlinky.msgpackLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncoderOptions extends js.Object {
  var codec: js.UndefOr[Codec_] = js.native
}

object EncoderOptions {
  @scala.inline
  def apply(): EncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncoderOptions]
  }
  @scala.inline
  implicit class EncoderOptionsOps[Self <: EncoderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: Codec_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(js.undefined)
        ret
    }
  }
  
}

