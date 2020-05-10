package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.Plussign47
import typingsSlinky.baseui.baseuiStrings.SJ
import typingsSlinky.baseui.baseuiStrings.`Svalbard and Jan Mayen`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon200 extends js.Object {
  var dialCode: Plussign47 = js.native
  var id: SJ = js.native
  var label: `Svalbard and Jan Mayen` = js.native
}

object Anon200 {
  @scala.inline
  def apply(dialCode: Plussign47, id: SJ, label: `Svalbard and Jan Mayen`): Anon200 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon200]
  }
  @scala.inline
  implicit class Anon200Ops[Self <: Anon200] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign47): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: SJ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Svalbard and Jan Mayen`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

