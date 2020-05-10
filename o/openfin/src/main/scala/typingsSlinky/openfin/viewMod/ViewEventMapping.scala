package typingsSlinky.openfin.viewMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.webcontentsMod.CertificateErrorEvent
import typingsSlinky.openfin.webcontentsMod.PageTitleUpdatedEvent
import typingsSlinky.openfin.webcontentsMod.WebContentsEventMapping
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsSlinky.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewEventMapping[Topic, Type] extends WebContentsEventMapping[String, String] {
  var attached: WindowEvent[Topic, Type] = js.native
  var created: WindowEvent[Topic, Type] = js.native
  var destroyed: WindowEvent[Topic, Type] = js.native
  var hidden: WindowEvent[Topic, Type] = js.native
  var shown: WindowEvent[Topic, Type] = js.native
  var `target-changed`: WindowEvent[Topic, Type] = js.native
}

object ViewEventMapping {
  @scala.inline
  def apply[Topic, Type](
    attached: WindowEvent[Topic, Type],
    `certificate-error`: CertificateErrorEvent[String, String],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    created: WindowEvent[Topic, Type],
    destroyed: WindowEvent[Topic, Type],
    `did-change-theme-color`: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    hidden: WindowEvent[Topic, Type],
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    shown: WindowEvent[Topic, Type],
    `target-changed`: WindowEvent[Topic, Type]
  ): ViewEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-changed")(`target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class ViewEventMappingOps[Self[topic, `type`] <: ViewEventMapping[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withAttached(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyed(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShown(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTarget-changed`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-changed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

