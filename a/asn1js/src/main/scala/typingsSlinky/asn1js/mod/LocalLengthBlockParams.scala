package typingsSlinky.asn1js.mod

import typingsSlinky.asn1js.AnonIsIndefiniteForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalLengthBlockParams extends js.Object {
  var lenBlock: js.UndefOr[AnonIsIndefiniteForm] = js.native
}

object LocalLengthBlockParams {
  @scala.inline
  def apply(): LocalLengthBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalLengthBlockParams]
  }
  @scala.inline
  implicit class LocalLengthBlockParamsOps[Self <: LocalLengthBlockParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLenBlock(value: AnonIsIndefiniteForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenBlock")(js.undefined)
        ret
    }
  }
  
}

