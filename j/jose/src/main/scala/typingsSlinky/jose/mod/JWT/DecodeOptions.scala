package typingsSlinky.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeOptions[komplet] extends js.Object {
  var complete: js.UndefOr[komplet] = js.native
}

object DecodeOptions {
  @scala.inline
  def apply[komplet](): DecodeOptions[komplet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeOptions[komplet]]
  }
  @scala.inline
  implicit class DecodeOptionsOps[Self[komplet_] <: DecodeOptions[komplet_], komplet] (val x: Self[komplet]) extends AnyVal {
    @scala.inline
    def duplicate: Self[komplet] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[komplet]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[komplet] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[komplet] with Other]
    @scala.inline
    def withComplete(value: komplet): Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplete: Self[komplet] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
  }
  
}

