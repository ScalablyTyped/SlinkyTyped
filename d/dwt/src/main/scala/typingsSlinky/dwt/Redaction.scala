package typingsSlinky.dwt

import typingsSlinky.dwt.EnumDWTOCRFindTextAction.OCRFT_MARKFORREDACT
import typingsSlinky.dwt.EnumDWTOCRFindTextFlags.OCRFT_WHOLEWORD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redaction extends js.Object {
  var FindText: String = js.native
  var FindTextAction: OCRFT_MARKFORREDACT = js.native
  var FindTextFlags: OCRFT_WHOLEWORD = js.native
}

object Redaction {
  @scala.inline
  def apply(FindText: String, FindTextAction: OCRFT_MARKFORREDACT, FindTextFlags: OCRFT_WHOLEWORD): Redaction = {
    val __obj = js.Dynamic.literal(FindText = FindText.asInstanceOf[js.Any], FindTextAction = FindTextAction.asInstanceOf[js.Any], FindTextFlags = FindTextFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redaction]
  }
  @scala.inline
  implicit class RedactionOps[Self <: Redaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindTextAction(value: OCRFT_MARKFORREDACT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindTextAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindTextFlags(value: OCRFT_WHOLEWORD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindTextFlags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

