package typingsSlinky.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageBasicCardButton extends js.Object {
  var openUrlAction: js.UndefOr[DialogflowV1MessageBasicCardButtonAction] = js.native
  var title: js.UndefOr[String] = js.native
}

object DialogflowV1MessageBasicCardButton {
  @scala.inline
  def apply(): DialogflowV1MessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageBasicCardButton]
  }
  @scala.inline
  implicit class DialogflowV1MessageBasicCardButtonOps[Self <: DialogflowV1MessageBasicCardButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenUrlAction(value: DialogflowV1MessageBasicCardButtonAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenUrlAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrlAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

