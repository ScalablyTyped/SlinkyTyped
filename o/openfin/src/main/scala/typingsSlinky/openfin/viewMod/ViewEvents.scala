package typingsSlinky.openfin.viewMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.`target-changed`
import typingsSlinky.openfin.openfinStrings.attached
import typingsSlinky.openfin.openfinStrings.created
import typingsSlinky.openfin.openfinStrings.destroyed
import typingsSlinky.openfin.openfinStrings.hidden
import typingsSlinky.openfin.openfinStrings.shown
import typingsSlinky.openfin.openfinStrings.view
import typingsSlinky.openfin.webcontentsMod.CertificateErrorEvent
import typingsSlinky.openfin.webcontentsMod.PageTitleUpdatedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsSlinky.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.ViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.ViewEventMapping<'view', Type>[Type]} */
@js.native
trait ViewEvents extends js.Object {
  var attached: WindowEvent[view, typingsSlinky.openfin.openfinStrings.attached] = js.native
  var `certificate-error`: CertificateErrorEvent[String, String] = js.native
  var crashed: CrashedEvent with (WindowEvent[String, String]) = js.native
  var created: WindowEvent[view, typingsSlinky.openfin.openfinStrings.created] = js.native
  var destroyed: WindowEvent[view, typingsSlinky.openfin.openfinStrings.destroyed] = js.native
  var `did-change-theme-color`: WindowEvent[String, String] = js.native
  var `found-in-page`: WindowEvent[String, String] = js.native
  var hidden: WindowEvent[view, typingsSlinky.openfin.openfinStrings.hidden] = js.native
  var listenerRemoved: String = js.native
  var `navigation-rejected`: WindowNavigationRejectedEvent[String, String] = js.native
  var newListener: String = js.native
  var `page-favicon-updated`: WindowEvent[String, String] = js.native
  var `page-title-updated`: PageTitleUpdatedEvent[String, String] = js.native
  var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String] = js.native
  var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String] = js.native
  var shown: WindowEvent[view, typingsSlinky.openfin.openfinStrings.shown] = js.native
  var `target-changed`: WindowEvent[view, typingsSlinky.openfin.openfinStrings.`target-changed`] = js.native
}

object ViewEvents {
  @scala.inline
  def apply(
    attached: WindowEvent[view, attached],
    `certificate-error`: CertificateErrorEvent[String, String],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    created: WindowEvent[view, created],
    destroyed: WindowEvent[view, destroyed],
    `did-change-theme-color`: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    hidden: WindowEvent[view, hidden],
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    shown: WindowEvent[view, shown],
    `target-changed`: WindowEvent[view, `target-changed`]
  ): ViewEvents = {
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
    __obj.asInstanceOf[ViewEvents]
  }
  @scala.inline
  implicit class ViewEventsOps[Self <: ViewEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: WindowEvent[view, attached]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCertificate-error`(value: CertificateErrorEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate-error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrashed(value: CrashedEvent with (WindowEvent[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: WindowEvent[view, created]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroyed(value: WindowEvent[view, destroyed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDid-change-theme-color`(value: WindowEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFound-in-page`(value: WindowEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found-in-page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: WindowEvent[view, hidden]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenerRemoved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withNavigation-rejected`(value: WindowNavigationRejectedEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewListener(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage-favicon-updated`(value: WindowEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage-title-updated`(value: PageTitleUpdatedEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withResource-load-failed`(value: WindowResourceLoadFailedEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withResource-response-received`(value: WindowResourceResponseReceivedEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShown(value: WindowEvent[view, shown]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withTarget-changed`(value: WindowEvent[view, `target-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target-changed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

