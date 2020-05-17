package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.CI
import typingsSlinky.baseui.baseuiStrings.Plussign225
import typingsSlinky.baseui.baseuiStrings.`Côte dRightsinglequotationmarkIvoire`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `46` extends js.Object {
  var dialCode: Plussign225 = js.native
  var id: CI = js.native
  var label: `Côte dRightsinglequotationmarkIvoire` = js.native
}

object `46` {
  @scala.inline
  def apply(dialCode: Plussign225, id: CI, label: `Côte dRightsinglequotationmarkIvoire`): `46` = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  @scala.inline
  implicit class `46Ops`[Self <: `46`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign225): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Côte dRightsinglequotationmarkIvoire`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

