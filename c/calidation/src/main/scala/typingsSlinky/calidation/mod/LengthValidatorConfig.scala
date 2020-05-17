package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LengthValidatorConfig
  extends SimpleValidatorConfig
     with LengthValidator {
  var length: Double = js.native
}

object LengthValidatorConfig {
  @scala.inline
  def apply(length: Double, message: String): LengthValidatorConfig = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthValidatorConfig]
  }
  @scala.inline
  implicit class LengthValidatorConfigOps[Self <: LengthValidatorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

