package typingsSlinky.hellosignEmbedded.mod.HelloSign

import typingsSlinky.hellosignEmbedded.anon.Ccroles
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.template_created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCreatedMessageEvent extends MessageEvent {
  var event: template_created = js.native
  var template_id: String = js.native
  var template_info: Ccroles = js.native
}

object TemplateCreatedMessageEvent {
  @scala.inline
  def apply(event: template_created, template_id: String, template_info: Ccroles): TemplateCreatedMessageEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any], template_info = template_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCreatedMessageEvent]
  }
  @scala.inline
  implicit class TemplateCreatedMessageEventOps[Self <: TemplateCreatedMessageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: template_created): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate_info(value: Ccroles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_info")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

