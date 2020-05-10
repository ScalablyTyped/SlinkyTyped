package typingsSlinky.reactMaskedinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatCharacter extends js.Object {
  var transform: js.UndefOr[js.Function1[/* char */ String, String]] = js.native
  def validate(char: String): String = js.native
}

object FormatCharacter {
  @scala.inline
  def apply(validate: String => String): FormatCharacter = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[FormatCharacter]
  }
  @scala.inline
  implicit class FormatCharacterOps[Self <: FormatCharacter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidate(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransform(value: /* char */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

