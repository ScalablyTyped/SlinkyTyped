package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CG
import typingsSlinky.baseui.baseuiStrings.Plussign242
import typingsSlinky.baseui.baseuiStrings.`Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `43` extends js.Object {
  var dialCode: Plussign242 = js.native
  var id: CG = js.native
  var label: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis` = js.native
}

object `43` {
  @scala.inline
  def apply(
    dialCode: Plussign242,
    id: CG,
    label: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
  ): `43` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`43`]
  }
  @scala.inline
  implicit class `43Ops`[Self <: `43`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign242): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(
      value: `Congo LeftparenthesisRepublicRightparenthesis LeftparenthesisCongo-BrazzavilleRightparenthesis`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

