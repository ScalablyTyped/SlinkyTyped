package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.KP
import typingsSlinky.baseui.baseuiStrings.Plussign850
import typingsSlinky.baseui.baseuiStrings.`North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon152 extends js.Object {
  var dialCode: Plussign850 = js.native
  var id: KP = js.native
  var label: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis` = js.native
}

object Anon152 {
  @scala.inline
  def apply(dialCode: Plussign850, id: KP, label: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`): Anon152 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon152]
  }
  @scala.inline
  implicit class Anon152Ops[Self <: Anon152] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign850): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: KP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `North Korea Leftparenthesis조선 민주주의 인민 공화국Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

