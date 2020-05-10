package typingsSlinky.reactMaskedinput.mod

import typingsSlinky.react.mod.InputHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskedInputProps
  extends InputHTMLAttributes[js.Any] {
  var formatCharacters: js.UndefOr[CharsFormatters] = js.native
  var mask: String = js.native
  var placeholderChar: js.UndefOr[String] = js.native
}

object MaskedInputProps {
  @scala.inline
  def apply(mask: String): MaskedInputProps = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputProps]
  }
  @scala.inline
  implicit class MaskedInputPropsOps[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatCharacters(value: CharsFormatters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderChar")(js.undefined)
        ret
    }
  }
  
}

