package typingsSlinky.openfin.webcontentsMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebContentsEventMapping[Topic, Type] extends BaseEventMap {
  var `certificate-error`: CertificateErrorEvent[Topic, Type] = js.native
  var crashed: CrashedEvent with (WindowEvent[Topic, Type]) = js.native
  var `did-change-theme-color`: WindowEvent[Topic, Type] = js.native
  var `found-in-page`: WindowEvent[Topic, Type] = js.native
  var `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type] = js.native
  var `page-favicon-updated`: WindowEvent[Topic, Type] = js.native
  var `page-title-updated`: PageTitleUpdatedEvent[Topic, Type] = js.native
  var `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type] = js.native
  var `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type] = js.native
}

object WebContentsEventMapping {
  @scala.inline
  def apply[Topic, Type](
    `certificate-error`: CertificateErrorEvent[Topic, Type],
    crashed: CrashedEvent with (WindowEvent[Topic, Type]),
    `did-change-theme-color`: WindowEvent[Topic, Type],
    `found-in-page`: WindowEvent[Topic, Type],
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    newListener: String,
    `page-favicon-updated`: WindowEvent[Topic, Type],
    `page-title-updated`: PageTitleUpdatedEvent[Topic, Type],
    `resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
  ): WebContentsEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(crashed = crashed.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebContentsEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class WebContentsEventMappingOps[Self[topic, `type`] <: WebContentsEventMapping[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def `withCertificate-error`(value: CertificateErrorEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate-error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrashed(value: CrashedEvent with (WindowEvent[Topic, Type])): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDid-change-theme-color`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFound-in-page`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found-in-page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withNavigation-rejected`(value: WindowNavigationRejectedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage-favicon-updated`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage-title-updated`(value: PageTitleUpdatedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withResource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withResource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

