package typingsSlinky.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VcardTypedText extends js.Object {
  /** The text string associated with this item. For example, for an org field: ACME, inc. For an email field: smith@example.com. */
  var text: js.UndefOr[String] = js.native
}

object VcardTypedText {
  @scala.inline
  def apply(): VcardTypedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcardTypedText]
  }
  @scala.inline
  implicit class VcardTypedTextOps[Self <: VcardTypedText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

