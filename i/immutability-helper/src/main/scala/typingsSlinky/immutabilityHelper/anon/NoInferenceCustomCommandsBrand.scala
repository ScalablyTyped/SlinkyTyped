package typingsSlinky.immutabilityHelper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoInferenceCustomCommandsBrand extends js.Object {
  var __noInferenceCustomCommandsBrand: js.Any = js.native
}

object NoInferenceCustomCommandsBrand {
  @scala.inline
  def apply(__noInferenceCustomCommandsBrand: js.Any): NoInferenceCustomCommandsBrand = {
    val __obj = js.Dynamic.literal(__noInferenceCustomCommandsBrand = __noInferenceCustomCommandsBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoInferenceCustomCommandsBrand]
  }
  @scala.inline
  implicit class NoInferenceCustomCommandsBrandOps[Self <: NoInferenceCustomCommandsBrand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__noInferenceCustomCommandsBrand(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__noInferenceCustomCommandsBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

