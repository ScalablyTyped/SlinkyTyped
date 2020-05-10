package typingsSlinky.blueprintjsCore

import typingsSlinky.blueprintjsCore.toasterMod.IToastOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToasts extends js.Object {
  var toasts: js.Array[IToastOptions] = js.native
}

object AnonToasts {
  @scala.inline
  def apply(toasts: js.Array[IToastOptions]): AnonToasts = {
    val __obj = js.Dynamic.literal(toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToasts]
  }
  @scala.inline
  implicit class AnonToastsOps[Self <: AnonToasts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToasts(value: js.Array[IToastOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toasts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

