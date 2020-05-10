package typingsSlinky.openfin.windowMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.`auth-requested`
import typingsSlinky.openfin.openfinStrings.`begin-user-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`bounds-changed`
import typingsSlinky.openfin.openfinStrings.`bounds-changing`
import typingsSlinky.openfin.openfinStrings.`close-requested`
import typingsSlinky.openfin.openfinStrings.`disabled-movement-bounds-changed`
import typingsSlinky.openfin.openfinStrings.`disabled-movement-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`end-user-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`external-process-exited`
import typingsSlinky.openfin.openfinStrings.`external-process-started`
import typingsSlinky.openfin.openfinStrings.`group-changed`
import typingsSlinky.openfin.openfinStrings.`options-changed`
import typingsSlinky.openfin.openfinStrings.`performance-report`
import typingsSlinky.openfin.openfinStrings.`preload-scripts-state-changed`
import typingsSlinky.openfin.openfinStrings.`preload-scripts-state-changing`
import typingsSlinky.openfin.openfinStrings.`show-requested`
import typingsSlinky.openfin.openfinStrings.`user-movement-disabled`
import typingsSlinky.openfin.openfinStrings.`user-movement-enabled`
import typingsSlinky.openfin.openfinStrings.`view-attached`
import typingsSlinky.openfin.openfinStrings.`view-detached`
import typingsSlinky.openfin.openfinStrings.`will-move`
import typingsSlinky.openfin.openfinStrings.`will-resize`
import typingsSlinky.openfin.openfinStrings.blurred
import typingsSlinky.openfin.openfinStrings.closed
import typingsSlinky.openfin.openfinStrings.closing
import typingsSlinky.openfin.openfinStrings.embedded
import typingsSlinky.openfin.openfinStrings.focused
import typingsSlinky.openfin.openfinStrings.hidden
import typingsSlinky.openfin.openfinStrings.initialized
import typingsSlinky.openfin.openfinStrings.maximized
import typingsSlinky.openfin.openfinStrings.minimized
import typingsSlinky.openfin.openfinStrings.reloaded
import typingsSlinky.openfin.openfinStrings.restored
import typingsSlinky.openfin.openfinStrings.shown
import typingsSlinky.openfin.openfinStrings.window
import typingsSlinky.openfin.webcontentsMod.CertificateErrorEvent
import typingsSlinky.openfin.webcontentsMod.PageTitleUpdatedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<'window', string> & {[ Type in keyof openfin.openfin/_v2/api/events/window.WindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/window.WindowEventMapping<'window', Type>[Type]} */
@js.native
trait WindowEvents
  extends /* name */ StringDictionary[js.Any] {
  var `auth-requested`: WindowAuthRequestedEvent[window, typingsSlinky.openfin.openfinStrings.`auth-requested`] = js.native
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[window, typingsSlinky.openfin.openfinStrings.`begin-user-bounds-changing`] = js.native
  var blurred: WindowEvent[window, typingsSlinky.openfin.openfinStrings.blurred] = js.native
  var `bounds-changed`: WindowBoundsChange[window, typingsSlinky.openfin.openfinStrings.`bounds-changed`] = js.native
  var `bounds-changing`: WindowBoundsChange[window, typingsSlinky.openfin.openfinStrings.`bounds-changing`] = js.native
  var `certificate-error`: CertificateErrorEvent[String, String] = js.native
  var `close-requested`: WindowEvent[window, typingsSlinky.openfin.openfinStrings.`close-requested`] = js.native
  var closed: WindowEvent[window, typingsSlinky.openfin.openfinStrings.closed] = js.native
  var closing: WindowEvent[window, typingsSlinky.openfin.openfinStrings.closing] = js.native
  var crashed: CrashedEvent with (WindowEvent[String, String]) = js.native
  var `did-change-theme-color`: WindowEvent[String, String] = js.native
  var `disabled-movement-bounds-changed`: WindowBoundsChange[window, typingsSlinky.openfin.openfinStrings.`disabled-movement-bounds-changed`] = js.native
  var `disabled-movement-bounds-changing`: WindowBoundsChange[window, typingsSlinky.openfin.openfinStrings.`disabled-movement-bounds-changing`] = js.native
  var embedded: WindowEvent[window, typingsSlinky.openfin.openfinStrings.embedded] = js.native
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[window, typingsSlinky.openfin.openfinStrings.`end-user-bounds-changing`] = js.native
  var `external-process-exited`: WindowExternalProcessExitedEvent[window, typingsSlinky.openfin.openfinStrings.`external-process-exited`] = js.native
  var `external-process-started`: WindowExternalProcessStartedEvent[window, typingsSlinky.openfin.openfinStrings.`external-process-started`] = js.native
  var focused: WindowEvent[window, typingsSlinky.openfin.openfinStrings.focused] = js.native
  var `found-in-page`: WindowEvent[String, String] = js.native
  var `group-changed`: WindowGroupChanged[window, typingsSlinky.openfin.openfinStrings.`group-changed`] = js.native
  var hidden: WindowHiddenEvent[window, typingsSlinky.openfin.openfinStrings.hidden] = js.native
  var initialized: WindowEvent[window, typingsSlinky.openfin.openfinStrings.initialized] = js.native
  var listenerRemoved: String = js.native
  var maximized: WindowEvent[window, typingsSlinky.openfin.openfinStrings.maximized] = js.native
  var minimized: WindowEvent[window, typingsSlinky.openfin.openfinStrings.minimized] = js.native
  var `navigation-rejected`: WindowNavigationRejectedEvent[String, String] = js.native
  var newListener: String = js.native
  var `options-changed`: WindowOptionsChangedEvent[window, typingsSlinky.openfin.openfinStrings.`options-changed`] = js.native
  var `page-favicon-updated`: WindowEvent[String, String] = js.native
  var `page-title-updated`: PageTitleUpdatedEvent[String, String] = js.native
  var `performance-report`: WindowPerformanceReport[window, typingsSlinky.openfin.openfinStrings.`performance-report`] = js.native
  var `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[window, typingsSlinky.openfin.openfinStrings.`preload-scripts-state-changed`] = js.native
  var `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[window, typingsSlinky.openfin.openfinStrings.`preload-scripts-state-changing`] = js.native
  var reloaded: WindowReloadedEvent[window, typingsSlinky.openfin.openfinStrings.reloaded] = js.native
  var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String] = js.native
  var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String] = js.native
  var restored: WindowEvent[window, typingsSlinky.openfin.openfinStrings.restored] = js.native
  var `show-requested`: WindowEvent[window, typingsSlinky.openfin.openfinStrings.`show-requested`] = js.native
  var shown: WindowEvent[window, typingsSlinky.openfin.openfinStrings.shown] = js.native
  var `user-movement-disabled`: WindowEvent[window, typingsSlinky.openfin.openfinStrings.`user-movement-disabled`] = js.native
  var `user-movement-enabled`: WindowEvent[window, typingsSlinky.openfin.openfinStrings.`user-movement-enabled`] = js.native
  var `view-attached`: WindowEvent[window, typingsSlinky.openfin.openfinStrings.`view-attached`] = js.native
  var `view-crashed`: CrashedEvent with (WindowEvent[window, String]) = js.native
  var `view-created`: CrashedEvent with (WindowEvent[window, String]) = js.native
  var `view-destroyed`: WindowEvent[window, String] = js.native
  var `view-detached`: WindowEvent[window, typingsSlinky.openfin.openfinStrings.`view-detached`] = js.native
  var `view-did-change-theme-color`: WindowEvent[window, String] = js.native
  var `view-hidden`: WindowEvent[window, String] = js.native
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[window, String] = js.native
  var `view-page-favicon-updated`: WindowEvent[window, String] = js.native
  var `view-page-title-updated`: WindowEvent[window, String] = js.native
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[window, String] = js.native
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[window, String] = js.native
  var `view-shown`: WindowEvent[window, String] = js.native
  var `view-target-changed`: WindowEvent[window, String] = js.native
  var `will-move`: WillMoveOrResize[window, typingsSlinky.openfin.openfinStrings.`will-move`] = js.native
  var `will-resize`: WillMoveOrResize[window, typingsSlinky.openfin.openfinStrings.`will-resize`] = js.native
}

object WindowEvents {
  @scala.inline
  def apply(
    `auth-requested`: WindowAuthRequestedEvent[window, `auth-requested`],
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[window, `begin-user-bounds-changing`],
    blurred: WindowEvent[window, blurred],
    `bounds-changed`: WindowBoundsChange[window, `bounds-changed`],
    `bounds-changing`: WindowBoundsChange[window, `bounds-changing`],
    `certificate-error`: CertificateErrorEvent[String, String],
    `close-requested`: WindowEvent[window, `close-requested`],
    closed: WindowEvent[window, closed],
    closing: WindowEvent[window, closing],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    `did-change-theme-color`: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[window, `disabled-movement-bounds-changed`],
    `disabled-movement-bounds-changing`: WindowBoundsChange[window, `disabled-movement-bounds-changing`],
    embedded: WindowEvent[window, embedded],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[window, `end-user-bounds-changing`],
    `external-process-exited`: WindowExternalProcessExitedEvent[window, `external-process-exited`],
    `external-process-started`: WindowExternalProcessStartedEvent[window, `external-process-started`],
    focused: WindowEvent[window, focused],
    `found-in-page`: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[window, `group-changed`],
    hidden: WindowHiddenEvent[window, hidden],
    initialized: WindowEvent[window, initialized],
    listenerRemoved: String,
    maximized: WindowEvent[window, maximized],
    minimized: WindowEvent[window, minimized],
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `options-changed`: WindowOptionsChangedEvent[window, `options-changed`],
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `performance-report`: WindowPerformanceReport[window, `performance-report`],
    `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changed`],
    `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changing`],
    reloaded: WindowReloadedEvent[window, reloaded],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    restored: WindowEvent[window, restored],
    `show-requested`: WindowEvent[window, `show-requested`],
    shown: WindowEvent[window, shown],
    `user-movement-disabled`: WindowEvent[window, `user-movement-disabled`],
    `user-movement-enabled`: WindowEvent[window, `user-movement-enabled`],
    `view-attached`: WindowEvent[window, `view-attached`],
    `view-crashed`: CrashedEvent with (WindowEvent[window, String]),
    `view-created`: CrashedEvent with (WindowEvent[window, String]),
    `view-destroyed`: WindowEvent[window, String],
    `view-detached`: WindowEvent[window, `view-detached`],
    `view-did-change-theme-color`: WindowEvent[window, String],
    `view-hidden`: WindowEvent[window, String],
    `view-navigation-rejected`: WindowNavigationRejectedEvent[window, String],
    `view-page-favicon-updated`: WindowEvent[window, String],
    `view-page-title-updated`: WindowEvent[window, String],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[window, String],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[window, String],
    `view-shown`: WindowEvent[window, String],
    `view-target-changed`: WindowEvent[window, String],
    `will-move`: WillMoveOrResize[window, `will-move`],
    `will-resize`: WillMoveOrResize[window, `will-resize`]
  ): WindowEvents = {
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
    __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-detached")(`view-detached`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-did-change-theme-color")(`view-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-navigation-rejected")(`view-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-favicon-updated")(`view-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-title-updated")(`view-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-load-failed")(`view-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-response-received")(`view-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-shown")(`view-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-target-changed")(`view-target-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-move")(`will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-resize")(`will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEvents]
  }
  @scala.inline
  implicit class WindowEventsOps[Self <: WindowEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAuth-requested`(value: WindowAuthRequestedEvent[window, `auth-requested`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[window, `begin-user-bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurred(value: WindowEvent[window, blurred]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBounds-changed`(value: WindowBoundsChange[window, `bounds-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBounds-changing`(value: WindowBoundsChange[window, `bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCertificate-error`(value: CertificateErrorEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate-error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withClose-requested`(value: WindowEvent[window, `close-requested`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosed(value: WindowEvent[window, closed]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosing(value: WindowEvent[window, closing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrashed(value: CrashedEvent with (WindowEvent[String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDid-change-theme-color`(value: WindowEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDisabled-movement-bounds-changed`(value: WindowBoundsChange[window, `disabled-movement-bounds-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled-movement-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDisabled-movement-bounds-changing`(value: WindowBoundsChange[window, `disabled-movement-bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled-movement-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbedded(value: WindowEvent[window, embedded]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[window, `end-user-bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-process-exited`(value: WindowExternalProcessExitedEvent[window, `external-process-exited`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-process-exited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-process-started`(value: WindowExternalProcessStartedEvent[window, `external-process-started`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-process-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocused(value: WindowEvent[window, focused]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFound-in-page`(value: WindowEvent[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found-in-page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withGroup-changed`(value: WindowGroupChanged[window, `group-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: WindowHiddenEvent[window, hidden]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialized(value: WindowEvent[window, initialized]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenerRemoved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximized(value: WindowEvent[window, maximized]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimized(value: WindowEvent[window, minimized]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimized")(value.asInstanceOf[js.Any])
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
    def `withOptions-changed`(value: WindowOptionsChangedEvent[window, `options-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options-changed")(value.asInstanceOf[js.Any])
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
    def `withPerformance-report`(value: WindowPerformanceReport[window, `performance-report`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performance-report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPreload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload-scripts-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPreload-scripts-state-changing`(value: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload-scripts-state-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReloaded(value: WindowReloadedEvent[window, reloaded]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reloaded")(value.asInstanceOf[js.Any])
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
    def withRestored(value: WindowEvent[window, restored]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withShow-requested`(value: WindowEvent[window, `show-requested`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShown(value: WindowEvent[window, shown]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-movement-disabled`(value: WindowEvent[window, `user-movement-disabled`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-movement-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withUser-movement-enabled`(value: WindowEvent[window, `user-movement-enabled`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user-movement-enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-attached`(value: WindowEvent[window, `view-attached`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-attached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-crashed`(value: CrashedEvent with (WindowEvent[window, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-created`(value: CrashedEvent with (WindowEvent[window, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-destroyed`(value: WindowEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-detached`(value: WindowEvent[window, `view-detached`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-did-change-theme-color`(value: WindowEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-hidden`(value: WindowEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-navigation-rejected`(value: WindowNavigationRejectedEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-favicon-updated`(value: WindowEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-title-updated`(value: WindowEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-load-failed`(value: WindowResourceLoadFailedEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-response-received`(value: WindowResourceResponseReceivedEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-shown`(value: WindowEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-target-changed`(value: WindowEvent[window, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-target-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWill-move`(value: WillMoveOrResize[window, `will-move`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will-move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWill-resize`(value: WillMoveOrResize[window, `will-resize`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("will-resize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

