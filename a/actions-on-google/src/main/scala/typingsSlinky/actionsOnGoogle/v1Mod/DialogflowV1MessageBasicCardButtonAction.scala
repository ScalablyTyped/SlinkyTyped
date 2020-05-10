package typingsSlinky.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageBasicCardButtonAction extends js.Object {
  var url: js.UndefOr[String] = js.native
}

object DialogflowV1MessageBasicCardButtonAction {
  @scala.inline
  def apply(): DialogflowV1MessageBasicCardButtonAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButtonAction]
  }
  @scala.inline
  implicit class DialogflowV1MessageBasicCardButtonActionOps[Self <: DialogflowV1MessageBasicCardButtonAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

