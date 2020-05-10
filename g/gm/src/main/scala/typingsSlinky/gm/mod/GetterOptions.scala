package typingsSlinky.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetterOptions extends js.Object {
  var bufferStream: js.UndefOr[Boolean] = js.native
}

object GetterOptions {
  @scala.inline
  def apply(): GetterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetterOptions]
  }
  @scala.inline
  implicit class GetterOptionsOps[Self <: GetterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferStream")(js.undefined)
        ret
    }
  }
  
}

