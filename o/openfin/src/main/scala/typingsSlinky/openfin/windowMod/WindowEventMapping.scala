package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.webcontentsMod.CertificateErrorEvent
import typingsSlinky.openfin.webcontentsMod.PageTitleUpdatedEvent
import typingsSlinky.openfin.webcontentsMod.WebContentsEventMapping
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventMapping[Topic, Type] extends WebContentsEventMapping[String, String] {
  var `auth-requested`: WindowAuthRequestedEvent[Topic, Type] = js.native
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type] = js.native
  var blurred: WindowEvent[Topic, Type] = js.native
  var `bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  var `bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  var `close-requested`: WindowEvent[Topic, Type] = js.native
  var closed: WindowEvent[Topic, Type] = js.native
  var closing: WindowEvent[Topic, Type] = js.native
  var `disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  var `disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  var embedded: WindowEvent[Topic, Type] = js.native
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[Topic, Type] = js.native
  var `external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type] = js.native
  var `external-process-started`: WindowExternalProcessStartedEvent[Topic, Type] = js.native
  var focused: WindowEvent[Topic, Type] = js.native
  var `group-changed`: WindowGroupChanged[Topic, Type] = js.native
  var hidden: WindowHiddenEvent[Topic, Type] = js.native
  var initialized: WindowEvent[Topic, Type] = js.native
  var maximized: WindowEvent[Topic, Type] = js.native
  var minimized: WindowEvent[Topic, Type] = js.native
  var `options-changed`: WindowOptionsChangedEvent[Topic, Type] = js.native
  var `performance-report`: WindowPerformanceReport[Topic, Type] = js.native
  var `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type] = js.native
  var `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[Topic, Type] = js.native
  var reloaded: WindowReloadedEvent[Topic, Type] = js.native
  var restored: WindowEvent[Topic, Type] = js.native
  var `show-requested`: WindowEvent[Topic, Type] = js.native
  var shown: WindowEvent[Topic, Type] = js.native
  var `user-movement-disabled`: WindowEvent[Topic, Type] = js.native
  var `user-movement-enabled`: WindowEvent[Topic, Type] = js.native
  var `view-attached`: WindowEvent[Topic, Type] = js.native
  var `view-detached`: WindowEvent[Topic, Type] = js.native
  var `will-move`: WillMoveOrResize[Topic, Type] = js.native
  var `will-resize`: WillMoveOrResize[Topic, Type] = js.native
}

object WindowEventMapping {
  @scala.inline
  def apply[Topic, Type](
    `auth-requested`: WindowAuthRequestedEvent[Topic, Type],
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    blurred: WindowEvent[Topic, Type],
    `bounds-changed`: WindowBoundsChange[Topic, Type],
    `bounds-changing`: WindowBoundsChange[Topic, Type],
    `certificate-error`: CertificateErrorEvent[String, String],
    `close-requested`: WindowEvent[Topic, Type],
    closed: WindowEvent[Topic, Type],
    closing: WindowEvent[Topic, Type],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    `did-change-theme-color`: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type],
    `disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type],
    embedded: WindowEvent[Topic, Type],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[Topic, Type],
    `external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type],
    `external-process-started`: WindowExternalProcessStartedEvent[Topic, Type],
    focused: WindowEvent[Topic, Type],
    `found-in-page`: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[Topic, Type],
    hidden: WindowHiddenEvent[Topic, Type],
    initialized: WindowEvent[Topic, Type],
    listenerRemoved: String,
    maximized: WindowEvent[Topic, Type],
    minimized: WindowEvent[Topic, Type],
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `options-changed`: WindowOptionsChangedEvent[Topic, Type],
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `performance-report`: WindowPerformanceReport[Topic, Type],
    `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    reloaded: WindowReloadedEvent[Topic, Type],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    restored: WindowEvent[Topic, Type],
    `show-requested`: WindowEvent[Topic, Type],
    shown: WindowEvent[Topic, Type],
    `user-movement-disabled`: WindowEvent[Topic, Type],
    `user-movement-enabled`: WindowEvent[Topic, Type],
    `view-attached`: WindowEvent[Topic, Type],
    `view-detached`: WindowEvent[Topic, Type],
    `will-move`: WillMoveOrResize[Topic, Type],
    `will-resize`: WillMoveOrResize[Topic, Type]
  ): WindowEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], reloaded = reloaded.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("auth-requested")(`auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("close-requested")(`close-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-exited")(`external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-started")(`external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("options-changed")(`options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("performance-report")(`performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changed")(`preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changing")(`preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-requested")(`show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-attached")(`view-attached`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-detached")(`view-detached`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-move")(`will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-resize")(`will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class WindowEventMappingOps[Self[topic, `type`] <: WindowEventMapping[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def `withAuth-requested`(value: WindowAuthRequestedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurred(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBounds-changed`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBounds-changing`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withClose-requested`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosing(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDisabled-movement-bounds-changed`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled-movement-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDisabled-movement-bounds-changing`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled-movement-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbedded(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-process-exited`(value: WindowExternalProcessExitedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-process-exited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-process-started`(value: WindowExternalProcessStartedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-process-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocused(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withGroup-changed`(value: WindowGroupChanged[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: WindowHiddenEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialized(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximized(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimized(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOptions-changed`(value: WindowOptionsChangedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPerformance-report`(value: WindowPerformanceReport[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance-report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPreload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload-scripts-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPreload-scripts-state-changing`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload-scripts-state-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReloaded(value: WindowReloadedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestored(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShow-requested`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShown(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-movement-disabled`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-movement-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-movement-enabled`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-movement-enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-attached`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-detached`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWill-move`(value: WillMoveOrResize[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will-move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWill-resize`(value: WillMoveOrResize[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will-resize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

