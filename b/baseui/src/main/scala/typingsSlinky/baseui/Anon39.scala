package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.CC
import typingsSlinky.baseui.baseuiStrings.Plussign61
import typingsSlinky.baseui.baseuiStrings.`Cocos LeftparenthesisKeelingRightparenthesis Islands`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon39 extends js.Object {
  var dialCode: Plussign61 = js.native
  var id: CC = js.native
  var label: `Cocos LeftparenthesisKeelingRightparenthesis Islands` = js.native
}

object Anon39 {
  @scala.inline
  def apply(dialCode: Plussign61, id: CC, label: `Cocos LeftparenthesisKeelingRightparenthesis Islands`): Anon39 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon39]
  }
  @scala.inline
  implicit class Anon39Ops[Self <: Anon39] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign61): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Cocos LeftparenthesisKeelingRightparenthesis Islands`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

