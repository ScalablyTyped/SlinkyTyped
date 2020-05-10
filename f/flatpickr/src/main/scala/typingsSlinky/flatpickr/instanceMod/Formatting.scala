package typingsSlinky.flatpickr.instanceMod

import typingsSlinky.flatpickr.formattingMod.Formats_
import typingsSlinky.flatpickr.formattingMod.RevFormat_
import typingsSlinky.flatpickr.formattingMod.TokenRegex_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formatting extends js.Object {
  var formats: Formats_ = js.native
  var revFormat: RevFormat_ = js.native
  var tokenRegex: TokenRegex_ = js.native
}

object Formatting {
  @scala.inline
  def apply(formats: Formats_, revFormat: RevFormat_, tokenRegex: TokenRegex_): Formatting = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], revFormat = revFormat.asInstanceOf[js.Any], tokenRegex = tokenRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formatting]
  }
  @scala.inline
  implicit class FormattingOps[Self <: Formatting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: Formats_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevFormat(value: RevFormat_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokenRegex(value: TokenRegex_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenRegex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

