package typingsSlinky.baseui

import typingsSlinky.baseui.baseuiStrings.AD
import typingsSlinky.baseui.baseuiStrings.Andorra
import typingsSlinky.baseui.baseuiStrings.Plussign376
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDialCodeIdLabel extends js.Object {
  var dialCode: Plussign376 = js.native
  var id: AD = js.native
  var label: Andorra = js.native
}

object AnonDialCodeIdLabel {
  @scala.inline
  def apply(dialCode: Plussign376, id: AD, label: Andorra): AnonDialCodeIdLabel = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDialCodeIdLabel]
  }
  @scala.inline
  implicit class AnonDialCodeIdLabelOps[Self <: AnonDialCodeIdLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialCode(value: Plussign376): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: AD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: Andorra): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

