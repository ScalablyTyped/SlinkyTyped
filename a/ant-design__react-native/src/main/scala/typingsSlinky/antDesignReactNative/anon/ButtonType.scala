package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonType extends js.Object {
  var buttonType: String = js.native
}

object ButtonType {
  @scala.inline
  def apply(buttonType: String): ButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonType]
  }
  @scala.inline
  implicit class ButtonTypeOps[Self <: ButtonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

