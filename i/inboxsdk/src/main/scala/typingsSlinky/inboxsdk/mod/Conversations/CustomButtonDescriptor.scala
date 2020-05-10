package typingsSlinky.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomButtonDescriptor extends js.Object {
  var iconUrl: String = js.native
  var tooltip: String = js.native
  def onClick(event: AttachmentCardClickEvent): Unit = js.native
}

object CustomButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: AttachmentCardClickEvent => Unit, tooltip: String): CustomButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomButtonDescriptor]
  }
  @scala.inline
  implicit class CustomButtonDescriptorOps[Self <: CustomButtonDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: AttachmentCardClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

