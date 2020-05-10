package typingsSlinky.materialTextfield.adapterMod

import typingsSlinky.materialTextfield.AnonBadInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeInputType extends js.Object {
  var badInput: Boolean = js.native
  var disabled: Boolean = js.native
  var validity: AnonBadInput = js.native
  var value: String = js.native
}

object NativeInputType {
  @scala.inline
  def apply(badInput: Boolean, disabled: Boolean, validity: AnonBadInput, value: String): NativeInputType = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeInputType]
  }
  @scala.inline
  implicit class NativeInputTypeOps[Self <: NativeInputType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidity(value: AnonBadInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

