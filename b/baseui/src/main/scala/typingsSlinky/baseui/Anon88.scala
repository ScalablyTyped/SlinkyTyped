package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.HK
import typingsSlinky.baseui.baseuiStrings.Plussign852
import typingsSlinky.baseui.baseuiStrings.`Hong Kong Leftparenthesis香港Rightparenthesis`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon88 extends js.Object {
  var dialCode: Plussign852 = js.native
  var id: HK = js.native
  var label: `Hong Kong Leftparenthesis香港Rightparenthesis` = js.native
}

object Anon88 {
  @scala.inline
  def apply(dialCode: Plussign852, id: HK, label: `Hong Kong Leftparenthesis香港Rightparenthesis`): Anon88 = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon88]
  }
  @scala.inline
  implicit class Anon88Ops[Self <: Anon88] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign852): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: HK): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: `Hong Kong Leftparenthesis香港Rightparenthesis`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

