package typingsSlinky.antd.anon

import typingsSlinky.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success extends js.Object {
  var error: ForwardRefExoticComponent[Pickanychildrensizeciteda]
  var info: ForwardRefExoticComponent[Pickanychildrensizeciteda]
  var success: ForwardRefExoticComponent[Pickanychildrensizeciteda]
  var warning: ForwardRefExoticComponent[Pickanychildrensizeciteda]
}

object Success {
  @scala.inline
  def apply(
    error: ForwardRefExoticComponent[Pickanychildrensizeciteda],
    info: ForwardRefExoticComponent[Pickanychildrensizeciteda],
    success: ForwardRefExoticComponent[Pickanychildrensizeciteda],
    warning: ForwardRefExoticComponent[Pickanychildrensizeciteda]
  ): Success = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  @scala.inline
  implicit class SuccessOps[Self <: Success] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: ForwardRefExoticComponent[Pickanychildrensizeciteda]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: ForwardRefExoticComponent[Pickanychildrensizeciteda]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: ForwardRefExoticComponent[Pickanychildrensizeciteda]): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: ForwardRefExoticComponent[Pickanychildrensizeciteda]): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

