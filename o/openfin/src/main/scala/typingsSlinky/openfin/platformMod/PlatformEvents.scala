package typingsSlinky.openfin.platformMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsApplicationMod.RunRequestedEvent
import typingsSlinky.openfin.eventsApplicationMod.TrayIconClicked
import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.`platform-api-ready`
import typingsSlinky.openfin.openfinStrings.`platform-snapshot-applied`
import typingsSlinky.openfin.openfinStrings.`view-blurred`
import typingsSlinky.openfin.openfinStrings.`view-crashed`
import typingsSlinky.openfin.openfinStrings.`view-created`
import typingsSlinky.openfin.openfinStrings.`view-destroyed`
import typingsSlinky.openfin.openfinStrings.`view-did-change-theme-color`
import typingsSlinky.openfin.openfinStrings.`view-focused`
import typingsSlinky.openfin.openfinStrings.`view-hidden`
import typingsSlinky.openfin.openfinStrings.`view-hotkey`
import typingsSlinky.openfin.openfinStrings.`view-navigation-rejected`
import typingsSlinky.openfin.openfinStrings.`view-page-favicon-updated`
import typingsSlinky.openfin.openfinStrings.`view-page-title-updated`
import typingsSlinky.openfin.openfinStrings.`view-resource-load-failed`
import typingsSlinky.openfin.openfinStrings.`view-resource-response-received`
import typingsSlinky.openfin.openfinStrings.`view-shown`
import typingsSlinky.openfin.openfinStrings.`view-target-changed`
import typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`window-blurred`
import typingsSlinky.openfin.openfinStrings.`window-bounds-changed`
import typingsSlinky.openfin.openfinStrings.`window-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`window-closed`
import typingsSlinky.openfin.openfinStrings.`window-closing`
import typingsSlinky.openfin.openfinStrings.`window-crashed`
import typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
import typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`window-embedded`
import typingsSlinky.openfin.openfinStrings.`window-end-user-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`window-external-process-exited`
import typingsSlinky.openfin.openfinStrings.`window-external-process-started`
import typingsSlinky.openfin.openfinStrings.`window-focused`
import typingsSlinky.openfin.openfinStrings.`window-group-changed`
import typingsSlinky.openfin.openfinStrings.`window-hidden`
import typingsSlinky.openfin.openfinStrings.`window-hotkey`
import typingsSlinky.openfin.openfinStrings.`window-initialized`
import typingsSlinky.openfin.openfinStrings.`window-layout-initialized`
import typingsSlinky.openfin.openfinStrings.`window-layout-ready`
import typingsSlinky.openfin.openfinStrings.`window-maximized`
import typingsSlinky.openfin.openfinStrings.`window-minimized`
import typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`
import typingsSlinky.openfin.openfinStrings.`window-options-changed`
import typingsSlinky.openfin.openfinStrings.`window-performance-report`
import typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`
import typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
import typingsSlinky.openfin.openfinStrings.`window-reloaded`
import typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`
import typingsSlinky.openfin.openfinStrings.`window-resource-response-received`
import typingsSlinky.openfin.openfinStrings.`window-restored`
import typingsSlinky.openfin.openfinStrings.`window-shown`
import typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`
import typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`
import typingsSlinky.openfin.openfinStrings.`window-will-move`
import typingsSlinky.openfin.openfinStrings.`window-will-resize`
import typingsSlinky.openfin.openfinStrings.application
import typingsSlinky.openfin.viewMod.InputEvent
import typingsSlinky.openfin.viewMod.PropagatedViewIdentity
import typingsSlinky.openfin.viewMod.TargetChangedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsSlinky.openfin.windowMod.WillMoveOrResize
import typingsSlinky.openfin.windowMod.WindowAlertRequestedEvent
import typingsSlinky.openfin.windowMod.WindowAuthRequestedEvent
import typingsSlinky.openfin.windowMod.WindowBeginBoundsChangingEvent
import typingsSlinky.openfin.windowMod.WindowBoundsChange
import typingsSlinky.openfin.windowMod.WindowEndLoadEvent
import typingsSlinky.openfin.windowMod.WindowExternalProcessExitedEvent
import typingsSlinky.openfin.windowMod.WindowExternalProcessStartedEvent
import typingsSlinky.openfin.windowMod.WindowGroupChanged
import typingsSlinky.openfin.windowMod.WindowHiddenEvent
import typingsSlinky.openfin.windowMod.WindowNavigationRejectedEvent
import typingsSlinky.openfin.windowMod.WindowOptionsChangedEvent
import typingsSlinky.openfin.windowMod.WindowPerformanceReport
import typingsSlinky.openfin.windowMod.WindowPreloadScriptsStateChangeEvent
import typingsSlinky.openfin.windowMod.WindowPreloadScriptsStateChangedEvent
import typingsSlinky.openfin.windowMod.WindowReloadedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/platform.PlatformEventMapping<string, string> ]: openfin.openfin/_v2/api/events/platform.PlatformEventMapping<'application', Type>[Type]} */
@js.native
trait PlatformEvents extends js.Object {
  
  var closed: ApplicationEvent[String, String] = js.native
  
  var connected: ApplicationEvent[String, String] = js.native
  
  var crashed: CrashedEvent with (ApplicationEvent[String, String]) = js.native
  
  var initialized: ApplicationEvent[String, String] = js.native
  
  var listenerRemoved: String = js.native
  
  var `manifest-changed`: ApplicationEvent[String, String] = js.native
  
  var newListener: String = js.native
  
  var `not-responding`: ApplicationEvent[String, String] = js.native
  
  var `platform-api-ready`: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.`platform-api-ready`] = js.native
  
  var `platform-snapshot-applied`: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.`platform-snapshot-applied`] = js.native
  
  var responding: ApplicationEvent[String, String] = js.native
  
  var `run-requested`: RunRequestedEvent[String, String] = js.native
  
  var started: ApplicationEvent[String, String] = js.native
  
  var `tray-icon-clicked`: TrayIconClicked[String, String] = js.native
  
  var `view-blurred`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-blurred`]) with PropagatedViewIdentity = js.native
  
  var `view-crashed`: CrashedEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-crashed`]) with PropagatedViewIdentity = js.native
  
  var `view-created`: CrashedEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-created`]) with PropagatedViewIdentity = js.native
  
  var `view-destroyed`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-destroyed`]) with PropagatedViewIdentity = js.native
  
  var `view-did-change-theme-color`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-did-change-theme-color`]) with PropagatedViewIdentity = js.native
  
  var `view-focused`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-focused`]) with PropagatedViewIdentity = js.native
  
  var `view-hidden`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-hidden`]) with PropagatedViewIdentity = js.native
  
  var `view-hotkey`: InputEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-hotkey`]) with PropagatedViewIdentity = js.native
  
  var `view-navigation-rejected`: (WindowNavigationRejectedEvent[application, typingsSlinky.openfin.openfinStrings.`view-navigation-rejected`]) with PropagatedViewIdentity = js.native
  
  var `view-page-favicon-updated`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-page-favicon-updated`]) with PropagatedViewIdentity = js.native
  
  var `view-page-title-updated`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-page-title-updated`]) with PropagatedViewIdentity = js.native
  
  var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[application, typingsSlinky.openfin.openfinStrings.`view-resource-load-failed`]) with PropagatedViewIdentity = js.native
  
  var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`view-resource-response-received`
  ]) with PropagatedViewIdentity = js.native
  
  var `view-shown`: (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-shown`]) with PropagatedViewIdentity = js.native
  
  var `view-target-changed`: (TargetChangedEvent[application, typingsSlinky.openfin.openfinStrings.`view-target-changed`]) with PropagatedViewIdentity = js.native
  
  var `window-alert-requested`: WindowAlertRequestedEvent[String, String] = js.native
  
  var `window-auth-requested`: WindowAuthRequestedEvent[String, String] = js.native
  
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`
  ] = js.native
  
  var `window-blurred`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-blurred`] = js.native
  
  var `window-bounds-changed`: WindowBoundsChange[application, typingsSlinky.openfin.openfinStrings.`window-bounds-changed`] = js.native
  
  var `window-bounds-changing`: WindowBoundsChange[application, typingsSlinky.openfin.openfinStrings.`window-bounds-changing`] = js.native
  
  var `window-closed`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-closed`] = js.native
  
  var `window-closing`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-closing`] = js.native
  
  var `window-crashed`: CrashedEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-crashed`]) = js.native
  
  var `window-created`: WindowEvent[String, String] = js.native
  
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
  ] = js.native
  
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
  ] = js.native
  
  var `window-embedded`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-embedded`] = js.native
  
  var `window-end-load`: WindowEndLoadEvent[String, String] = js.native
  
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-end-user-bounds-changing`
  ] = js.native
  
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[application, typingsSlinky.openfin.openfinStrings.`window-external-process-exited`] = js.native
  
  var `window-external-process-started`: WindowExternalProcessStartedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-external-process-started`
  ] = js.native
  
  var `window-focused`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-focused`] = js.native
  
  var `window-group-changed`: WindowGroupChanged[application, typingsSlinky.openfin.openfinStrings.`window-group-changed`] = js.native
  
  var `window-hidden`: WindowHiddenEvent[application, typingsSlinky.openfin.openfinStrings.`window-hidden`] = js.native
  
  var `window-hotkey`: InputEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-hotkey`]) = js.native
  
  var `window-initialized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-initialized`] = js.native
  
  var `window-layout-initialized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-layout-initialized`] = js.native
  
  var `window-layout-ready`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-layout-ready`] = js.native
  
  var `window-maximized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-maximized`] = js.native
  
  var `window-minimized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-minimized`] = js.native
  
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[application, typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`] = js.native
  
  var `window-not-responding`: WindowEvent[String, String] = js.native
  
  var `window-options-changed`: WindowOptionsChangedEvent[application, typingsSlinky.openfin.openfinStrings.`window-options-changed`] = js.native
  
  var `window-performance-report`: (WindowPerformanceReport[application, typingsSlinky.openfin.openfinStrings.`window-performance-report`]) with (WindowPerformanceReport[String, String]) = js.native
  
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`
  ] = js.native
  
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
  ] = js.native
  
  var `window-reloaded`: WindowReloadedEvent[application, typingsSlinky.openfin.openfinStrings.`window-reloaded`] = js.native
  
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`] = js.native
  
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-resource-response-received`
  ] = js.native
  
  var `window-responding`: WindowEvent[String, String] = js.native
  
  var `window-restored`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-restored`] = js.native
  
  var `window-show-requested`: WindowEvent[String, String] = js.native
  
  var `window-shown`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-shown`] = js.native
  
  var `window-start-load`: WindowEvent[String, String] = js.native
  
  var `window-user-movement-disabled`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`] = js.native
  
  var `window-user-movement-enabled`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`] = js.native
  
  var `window-will-move`: WillMoveOrResize[application, typingsSlinky.openfin.openfinStrings.`window-will-move`] = js.native
  
  var `window-will-resize`: WillMoveOrResize[application, typingsSlinky.openfin.openfinStrings.`window-will-resize`] = js.native
}
object PlatformEvents {
  
  @scala.inline
  def apply(
    closed: ApplicationEvent[String, String],
    connected: ApplicationEvent[String, String],
    crashed: CrashedEvent with (ApplicationEvent[String, String]),
    initialized: ApplicationEvent[String, String],
    listenerRemoved: String,
    `manifest-changed`: ApplicationEvent[String, String],
    newListener: String,
    `not-responding`: ApplicationEvent[String, String],
    `platform-api-ready`: ApplicationEvent[application, `platform-api-ready`],
    `platform-snapshot-applied`: ApplicationEvent[application, `platform-snapshot-applied`],
    responding: ApplicationEvent[String, String],
    `run-requested`: RunRequestedEvent[String, String],
    started: ApplicationEvent[String, String],
    `tray-icon-clicked`: TrayIconClicked[String, String],
    `view-blurred`: (WindowEvent[application, `view-blurred`]) with PropagatedViewIdentity,
    `view-crashed`: CrashedEvent with (WindowEvent[application, `view-crashed`]) with PropagatedViewIdentity,
    `view-created`: CrashedEvent with (WindowEvent[application, `view-created`]) with PropagatedViewIdentity,
    `view-destroyed`: (WindowEvent[application, `view-destroyed`]) with PropagatedViewIdentity,
    `view-did-change-theme-color`: (WindowEvent[application, `view-did-change-theme-color`]) with PropagatedViewIdentity,
    `view-focused`: (WindowEvent[application, `view-focused`]) with PropagatedViewIdentity,
    `view-hidden`: (WindowEvent[application, `view-hidden`]) with PropagatedViewIdentity,
    `view-hotkey`: InputEvent with (WindowEvent[application, `view-hotkey`]) with PropagatedViewIdentity,
    `view-navigation-rejected`: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) with PropagatedViewIdentity,
    `view-page-favicon-updated`: (WindowEvent[application, `view-page-favicon-updated`]) with PropagatedViewIdentity,
    `view-page-title-updated`: (WindowEvent[application, `view-page-title-updated`]) with PropagatedViewIdentity,
    `view-resource-load-failed`: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) with PropagatedViewIdentity,
    `view-resource-response-received`: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) with PropagatedViewIdentity,
    `view-shown`: (WindowEvent[application, `view-shown`]) with PropagatedViewIdentity,
    `view-target-changed`: (TargetChangedEvent[application, `view-target-changed`]) with PropagatedViewIdentity,
    `window-alert-requested`: WindowAlertRequestedEvent[String, String],
    `window-auth-requested`: WindowAuthRequestedEvent[String, String],
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`],
    `window-blurred`: WindowEvent[application, `window-blurred`],
    `window-bounds-changed`: WindowBoundsChange[application, `window-bounds-changed`],
    `window-bounds-changing`: WindowBoundsChange[application, `window-bounds-changing`],
    `window-closed`: WindowEvent[application, `window-closed`],
    `window-closing`: WindowEvent[application, `window-closing`],
    `window-crashed`: CrashedEvent with (WindowEvent[application, `window-crashed`]),
    `window-created`: WindowEvent[String, String],
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`],
    `window-embedded`: WindowEvent[application, `window-embedded`],
    `window-end-load`: WindowEndLoadEvent[String, String],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-end-user-bounds-changing`],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[application, `window-external-process-exited`],
    `window-external-process-started`: WindowExternalProcessStartedEvent[application, `window-external-process-started`],
    `window-focused`: WindowEvent[application, `window-focused`],
    `window-group-changed`: WindowGroupChanged[application, `window-group-changed`],
    `window-hidden`: WindowHiddenEvent[application, `window-hidden`],
    `window-hotkey`: InputEvent with (WindowEvent[application, `window-hotkey`]),
    `window-initialized`: WindowEvent[application, `window-initialized`],
    `window-layout-initialized`: WindowEvent[application, `window-layout-initialized`],
    `window-layout-ready`: WindowEvent[application, `window-layout-ready`],
    `window-maximized`: WindowEvent[application, `window-maximized`],
    `window-minimized`: WindowEvent[application, `window-minimized`],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[application, `window-navigation-rejected`],
    `window-not-responding`: WindowEvent[String, String],
    `window-options-changed`: WindowOptionsChangedEvent[application, `window-options-changed`],
    `window-performance-report`: (WindowPerformanceReport[application, `window-performance-report`]) with (WindowPerformanceReport[String, String]),
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`],
    `window-reloaded`: WindowReloadedEvent[application, `window-reloaded`],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`],
    `window-responding`: WindowEvent[String, String],
    `window-restored`: WindowEvent[application, `window-restored`],
    `window-show-requested`: WindowEvent[String, String],
    `window-shown`: WindowEvent[application, `window-shown`],
    `window-start-load`: WindowEvent[String, String],
    `window-user-movement-disabled`: WindowEvent[application, `window-user-movement-disabled`],
    `window-user-movement-enabled`: WindowEvent[application, `window-user-movement-enabled`],
    `window-will-move`: WillMoveOrResize[application, `window-will-move`],
    `window-will-resize`: WillMoveOrResize[application, `window-will-resize`]
  ): PlatformEvents = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("platform-api-ready")(`platform-api-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("platform-snapshot-applied")(`platform-snapshot-applied`.asInstanceOf[js.Any])
    __obj.updateDynamic("run-requested")(`run-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("tray-icon-clicked")(`tray-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-blurred")(`view-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-did-change-theme-color")(`view-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-focused")(`view-focused`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hotkey")(`view-hotkey`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-navigation-rejected")(`view-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-favicon-updated")(`view-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-title-updated")(`view-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-load-failed")(`view-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-response-received")(`view-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-shown")(`view-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-target-changed")(`view-target-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-alert-requested")(`window-alert-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-auth-requested")(`window-auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-begin-user-bounds-changing")(`window-begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-blurred")(`window-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changed")(`window-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changing")(`window-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closed")(`window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closing")(`window-closing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-crashed")(`window-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changed")(`window-disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changing")(`window-disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-embedded")(`window-embedded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-user-bounds-changing")(`window-end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-external-process-exited")(`window-external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-external-process-started")(`window-external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-focused")(`window-focused`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-group-changed")(`window-group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-hidden")(`window-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-hotkey")(`window-hotkey`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-initialized")(`window-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-layout-initialized")(`window-layout-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-layout-ready")(`window-layout-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-maximized")(`window-maximized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-minimized")(`window-minimized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-navigation-rejected")(`window-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-options-changed")(`window-options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changed")(`window-preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changing")(`window-preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-reloaded")(`window-reloaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-load-failed")(`window-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-response-received")(`window-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-restored")(`window-restored`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-show-requested")(`window-show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-shown")(`window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-disabled")(`window-user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-enabled")(`window-user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-move")(`window-will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-resize")(`window-will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformEvents]
  }
  
  @scala.inline
  implicit class PlatformEventsOps[Self <: PlatformEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClosed(value: ApplicationEvent[String, String]): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnected(value: ApplicationEvent[String, String]): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrashed(value: CrashedEvent with (ApplicationEvent[String, String])): Self = this.set("crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialized(value: ApplicationEvent[String, String]): Self = this.set("initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerRemoved(value: String): Self = this.set("listenerRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setManifest-changed`(value: ApplicationEvent[String, String]): Self = this.set("manifest-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewListener(value: String): Self = this.set("newListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNot-responding`(value: ApplicationEvent[String, String]): Self = this.set("not-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlatform-api-ready`(value: ApplicationEvent[application, `platform-api-ready`]): Self = this.set("platform-api-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlatform-snapshot-applied`(value: ApplicationEvent[application, `platform-snapshot-applied`]): Self = this.set("platform-snapshot-applied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponding(value: ApplicationEvent[String, String]): Self = this.set("responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRun-requested`(value: RunRequestedEvent[String, String]): Self = this.set("run-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: ApplicationEvent[String, String]): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTray-icon-clicked`(value: TrayIconClicked[String, String]): Self = this.set("tray-icon-clicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-blurred`(value: (WindowEvent[application, `view-blurred`]) with PropagatedViewIdentity): Self = this.set("view-blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-crashed`(value: CrashedEvent with (WindowEvent[application, `view-crashed`]) with PropagatedViewIdentity): Self = this.set("view-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-created`(value: CrashedEvent with (WindowEvent[application, `view-created`]) with PropagatedViewIdentity): Self = this.set("view-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-destroyed`(value: (WindowEvent[application, `view-destroyed`]) with PropagatedViewIdentity): Self = this.set("view-destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-did-change-theme-color`(value: (WindowEvent[application, `view-did-change-theme-color`]) with PropagatedViewIdentity): Self = this.set("view-did-change-theme-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-focused`(value: (WindowEvent[application, `view-focused`]) with PropagatedViewIdentity): Self = this.set("view-focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hidden`(value: (WindowEvent[application, `view-hidden`]) with PropagatedViewIdentity): Self = this.set("view-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hotkey`(value: InputEvent with (WindowEvent[application, `view-hotkey`]) with PropagatedViewIdentity): Self = this.set("view-hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-navigation-rejected`(
      value: (WindowNavigationRejectedEvent[application, `view-navigation-rejected`]) with PropagatedViewIdentity
    ): Self = this.set("view-navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-favicon-updated`(value: (WindowEvent[application, `view-page-favicon-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-favicon-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-title-updated`(value: (WindowEvent[application, `view-page-title-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-title-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-load-failed`(
      value: (WindowResourceLoadFailedEvent[application, `view-resource-load-failed`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-response-received`(
      value: (WindowResourceResponseReceivedEvent[application, `view-resource-response-received`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-shown`(value: (WindowEvent[application, `view-shown`]) with PropagatedViewIdentity): Self = this.set("view-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-target-changed`(value: (TargetChangedEvent[application, `view-target-changed`]) with PropagatedViewIdentity): Self = this.set("view-target-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-alert-requested`(value: WindowAlertRequestedEvent[String, String]): Self = this.set("window-alert-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-auth-requested`(value: WindowAuthRequestedEvent[String, String]): Self = this.set("window-auth-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`]): Self = this.set("window-begin-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-blurred`(value: WindowEvent[application, `window-blurred`]): Self = this.set("window-blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-bounds-changed`(value: WindowBoundsChange[application, `window-bounds-changed`]): Self = this.set("window-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-bounds-changing`(value: WindowBoundsChange[application, `window-bounds-changing`]): Self = this.set("window-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-closed`(value: WindowEvent[application, `window-closed`]): Self = this.set("window-closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-closing`(value: WindowEvent[application, `window-closing`]): Self = this.set("window-closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-crashed`(value: CrashedEvent with (WindowEvent[application, `window-crashed`])): Self = this.set("window-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-created`(value: WindowEvent[String, String]): Self = this.set("window-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`]): Self = this.set("window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`]): Self = this.set("window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-embedded`(value: WindowEvent[application, `window-embedded`]): Self = this.set("window-embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-end-load`(value: WindowEndLoadEvent[String, String]): Self = this.set("window-end-load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[application, `window-end-user-bounds-changing`]): Self = this.set("window-end-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[application, `window-external-process-exited`]): Self = this.set("window-external-process-exited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-external-process-started`(value: WindowExternalProcessStartedEvent[application, `window-external-process-started`]): Self = this.set("window-external-process-started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-focused`(value: WindowEvent[application, `window-focused`]): Self = this.set("window-focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-group-changed`(value: WindowGroupChanged[application, `window-group-changed`]): Self = this.set("window-group-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-hidden`(value: WindowHiddenEvent[application, `window-hidden`]): Self = this.set("window-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-hotkey`(value: InputEvent with (WindowEvent[application, `window-hotkey`])): Self = this.set("window-hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-initialized`(value: WindowEvent[application, `window-initialized`]): Self = this.set("window-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-layout-initialized`(value: WindowEvent[application, `window-layout-initialized`]): Self = this.set("window-layout-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-layout-ready`(value: WindowEvent[application, `window-layout-ready`]): Self = this.set("window-layout-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-maximized`(value: WindowEvent[application, `window-maximized`]): Self = this.set("window-maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-minimized`(value: WindowEvent[application, `window-minimized`]): Self = this.set("window-minimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[application, `window-navigation-rejected`]): Self = this.set("window-navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-not-responding`(value: WindowEvent[String, String]): Self = this.set("window-not-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-options-changed`(value: WindowOptionsChangedEvent[application, `window-options-changed`]): Self = this.set("window-options-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-performance-report`(
      value: (WindowPerformanceReport[application, `window-performance-report`]) with (WindowPerformanceReport[String, String])
    ): Self = this.set("window-performance-report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`]): Self = this.set("window-preload-scripts-state-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`]): Self = this.set("window-preload-scripts-state-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-reloaded`(value: WindowReloadedEvent[application, `window-reloaded`]): Self = this.set("window-reloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`]): Self = this.set("window-resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`]): Self = this.set("window-resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-responding`(value: WindowEvent[String, String]): Self = this.set("window-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-restored`(value: WindowEvent[application, `window-restored`]): Self = this.set("window-restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-show-requested`(value: WindowEvent[String, String]): Self = this.set("window-show-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-shown`(value: WindowEvent[application, `window-shown`]): Self = this.set("window-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-start-load`(value: WindowEvent[String, String]): Self = this.set("window-start-load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-user-movement-disabled`(value: WindowEvent[application, `window-user-movement-disabled`]): Self = this.set("window-user-movement-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-user-movement-enabled`(value: WindowEvent[application, `window-user-movement-enabled`]): Self = this.set("window-user-movement-enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-will-move`(value: WillMoveOrResize[application, `window-will-move`]): Self = this.set("window-will-move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-will-resize`(value: WillMoveOrResize[application, `window-will-resize`]): Self = this.set("window-will-resize", value.asInstanceOf[js.Any])
  }
}
