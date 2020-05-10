package typingsSlinky.msgpack5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodeDecodeOptions extends js.Object {
  var header: js.UndefOr[Boolean] = js.native
}

object EncodeDecodeOptions {
  @scala.inline
  def apply(): EncodeDecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodeDecodeOptions]
  }
  @scala.inline
  implicit class EncodeDecodeOptionsOps[Self <: EncodeDecodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
  }
  
}

