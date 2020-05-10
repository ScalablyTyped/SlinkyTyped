package typingsSlinky.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeText extends js.Object {
  var disabled: String = js.native
  var hint: String = js.native
  var primary: String = js.native
  var secondary: String = js.native
}

object TypeText {
  @scala.inline
  def apply(disabled: String, hint: String, primary: String, secondary: String): TypeText = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeText]
  }
  @scala.inline
  implicit class TypeTextOps[Self <: TypeText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

