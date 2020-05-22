package typingsSlinky.openfin.eventsApplicationMod

import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.`manifest-changed`
import typingsSlinky.openfin.openfinStrings.`not-responding`
import typingsSlinky.openfin.openfinStrings.`run-requested`
import typingsSlinky.openfin.openfinStrings.`tray-icon-clicked`
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
import typingsSlinky.openfin.openfinStrings.`window-alert-requested`
import typingsSlinky.openfin.openfinStrings.`window-auth-requested`
import typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`window-blurred`
import typingsSlinky.openfin.openfinStrings.`window-bounds-changed`
import typingsSlinky.openfin.openfinStrings.`window-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`window-closed`
import typingsSlinky.openfin.openfinStrings.`window-closing`
import typingsSlinky.openfin.openfinStrings.`window-crashed`
import typingsSlinky.openfin.openfinStrings.`window-created`
import typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
import typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
import typingsSlinky.openfin.openfinStrings.`window-embedded`
import typingsSlinky.openfin.openfinStrings.`window-end-load`
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
import typingsSlinky.openfin.openfinStrings.`window-not-responding`
import typingsSlinky.openfin.openfinStrings.`window-options-changed`
import typingsSlinky.openfin.openfinStrings.`window-performance-report`
import typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`
import typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
import typingsSlinky.openfin.openfinStrings.`window-reloaded`
import typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`
import typingsSlinky.openfin.openfinStrings.`window-resource-response-received`
import typingsSlinky.openfin.openfinStrings.`window-responding`
import typingsSlinky.openfin.openfinStrings.`window-restored`
import typingsSlinky.openfin.openfinStrings.`window-show-requested`
import typingsSlinky.openfin.openfinStrings.`window-shown`
import typingsSlinky.openfin.openfinStrings.`window-start-load`
import typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`
import typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`
import typingsSlinky.openfin.openfinStrings.`window-will-move`
import typingsSlinky.openfin.openfinStrings.`window-will-resize`
import typingsSlinky.openfin.openfinStrings.application
import typingsSlinky.openfin.openfinStrings.closed
import typingsSlinky.openfin.openfinStrings.connected
import typingsSlinky.openfin.openfinStrings.crashed
import typingsSlinky.openfin.openfinStrings.initialized
import typingsSlinky.openfin.openfinStrings.responding
import typingsSlinky.openfin.openfinStrings.started
import typingsSlinky.openfin.viewMod.InputEvent
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
import scala.scalajs.js.annotation._

/* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/application.ApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.ApplicationEventMapping<'application', Type>[Type]} */
trait ApplicationEvents extends js.Object {
  var closed: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.closed]
  var connected: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.connected]
  var crashed: CrashedEvent with (ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.crashed])
  var initialized: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.initialized]
  var listenerRemoved: String
  var `manifest-changed`: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.`manifest-changed`]
  var newListener: String
  var `not-responding`: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.`not-responding`]
  var responding: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.responding]
  var `run-requested`: RunRequestedEvent[application, typingsSlinky.openfin.openfinStrings.`run-requested`]
  var started: ApplicationEvent[application, typingsSlinky.openfin.openfinStrings.started]
  var `tray-icon-clicked`: TrayIconClicked[application, typingsSlinky.openfin.openfinStrings.`tray-icon-clicked`]
  var `view-crashed`: CrashedEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-crashed`])
  var `view-created`: CrashedEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-created`])
  var `view-destroyed`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-destroyed`]
  var `view-did-change-theme-color`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-did-change-theme-color`]
  var `view-focused`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-focused`]
  var `view-hidden`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-hidden`]
  var `view-hotkey`: InputEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-hotkey`])
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[application, typingsSlinky.openfin.openfinStrings.`view-navigation-rejected`]
  var `view-page-favicon-updated`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-page-favicon-updated`]
  var `view-page-title-updated`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-page-title-updated`]
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[application, typingsSlinky.openfin.openfinStrings.`view-resource-load-failed`]
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`view-resource-response-received`
  ]
  var `view-shown`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`view-shown`]
  var `view-target-changed`: TargetChangedEvent[application, typingsSlinky.openfin.openfinStrings.`view-target-changed`]
  var `window-alert-requested`: WindowAlertRequestedEvent[application, typingsSlinky.openfin.openfinStrings.`window-alert-requested`]
  var `window-auth-requested`: WindowAuthRequestedEvent[application, typingsSlinky.openfin.openfinStrings.`window-auth-requested`]
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`
  ]
  var `window-blurred`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-blurred`]
  var `window-bounds-changed`: WindowBoundsChange[application, typingsSlinky.openfin.openfinStrings.`window-bounds-changed`]
  var `window-bounds-changing`: WindowBoundsChange[application, typingsSlinky.openfin.openfinStrings.`window-bounds-changing`]
  var `window-closed`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-closed`]
  var `window-closing`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-closing`]
  var `window-crashed`: CrashedEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-crashed`])
  var `window-created`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-created`]
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
  ]
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
  ]
  var `window-embedded`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-embedded`]
  var `window-end-load`: WindowEndLoadEvent[application, typingsSlinky.openfin.openfinStrings.`window-end-load`]
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-end-user-bounds-changing`
  ]
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[application, typingsSlinky.openfin.openfinStrings.`window-external-process-exited`]
  var `window-external-process-started`: WindowExternalProcessStartedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-external-process-started`
  ]
  var `window-focused`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-focused`]
  var `window-group-changed`: WindowGroupChanged[application, typingsSlinky.openfin.openfinStrings.`window-group-changed`]
  var `window-hidden`: WindowHiddenEvent[application, typingsSlinky.openfin.openfinStrings.`window-hidden`]
  var `window-hotkey`: InputEvent with (WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-hotkey`])
  var `window-initialized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-initialized`]
  var `window-layout-initialized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-layout-initialized`]
  var `window-layout-ready`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-layout-ready`]
  var `window-maximized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-maximized`]
  var `window-minimized`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-minimized`]
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[application, typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`]
  var `window-not-responding`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-not-responding`]
  var `window-options-changed`: WindowOptionsChangedEvent[application, typingsSlinky.openfin.openfinStrings.`window-options-changed`]
  var `window-performance-report`: WindowPerformanceReport[application, typingsSlinky.openfin.openfinStrings.`window-performance-report`]
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`
  ]
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
  ]
  var `window-reloaded`: WindowReloadedEvent[application, typingsSlinky.openfin.openfinStrings.`window-reloaded`]
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`]
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[
    application, 
    typingsSlinky.openfin.openfinStrings.`window-resource-response-received`
  ]
  var `window-responding`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-responding`]
  var `window-restored`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-restored`]
  var `window-show-requested`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-show-requested`]
  var `window-shown`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-shown`]
  var `window-start-load`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-start-load`]
  var `window-user-movement-disabled`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`]
  var `window-user-movement-enabled`: WindowEvent[application, typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`]
  var `window-will-move`: WillMoveOrResize[application, typingsSlinky.openfin.openfinStrings.`window-will-move`]
  var `window-will-resize`: WillMoveOrResize[application, typingsSlinky.openfin.openfinStrings.`window-will-resize`]
}

object ApplicationEvents {
  @scala.inline
  def apply(
    closed: ApplicationEvent[application, closed],
    connected: ApplicationEvent[application, connected],
    crashed: CrashedEvent with (ApplicationEvent[application, crashed]),
    initialized: ApplicationEvent[application, initialized],
    listenerRemoved: String,
    `manifest-changed`: ApplicationEvent[application, `manifest-changed`],
    newListener: String,
    `not-responding`: ApplicationEvent[application, `not-responding`],
    responding: ApplicationEvent[application, responding],
    `run-requested`: RunRequestedEvent[application, `run-requested`],
    started: ApplicationEvent[application, started],
    `tray-icon-clicked`: TrayIconClicked[application, `tray-icon-clicked`],
    `view-crashed`: CrashedEvent with (WindowEvent[application, `view-crashed`]),
    `view-created`: CrashedEvent with (WindowEvent[application, `view-created`]),
    `view-destroyed`: WindowEvent[application, `view-destroyed`],
    `view-did-change-theme-color`: WindowEvent[application, `view-did-change-theme-color`],
    `view-focused`: WindowEvent[application, `view-focused`],
    `view-hidden`: WindowEvent[application, `view-hidden`],
    `view-hotkey`: InputEvent with (WindowEvent[application, `view-hotkey`]),
    `view-navigation-rejected`: WindowNavigationRejectedEvent[application, `view-navigation-rejected`],
    `view-page-favicon-updated`: WindowEvent[application, `view-page-favicon-updated`],
    `view-page-title-updated`: WindowEvent[application, `view-page-title-updated`],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[application, `view-resource-load-failed`],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[application, `view-resource-response-received`],
    `view-shown`: WindowEvent[application, `view-shown`],
    `view-target-changed`: TargetChangedEvent[application, `view-target-changed`],
    `window-alert-requested`: WindowAlertRequestedEvent[application, `window-alert-requested`],
    `window-auth-requested`: WindowAuthRequestedEvent[application, `window-auth-requested`],
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`],
    `window-blurred`: WindowEvent[application, `window-blurred`],
    `window-bounds-changed`: WindowBoundsChange[application, `window-bounds-changed`],
    `window-bounds-changing`: WindowBoundsChange[application, `window-bounds-changing`],
    `window-closed`: WindowEvent[application, `window-closed`],
    `window-closing`: WindowEvent[application, `window-closing`],
    `window-crashed`: CrashedEvent with (WindowEvent[application, `window-crashed`]),
    `window-created`: WindowEvent[application, `window-created`],
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`],
    `window-embedded`: WindowEvent[application, `window-embedded`],
    `window-end-load`: WindowEndLoadEvent[application, `window-end-load`],
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
    `window-not-responding`: WindowEvent[application, `window-not-responding`],
    `window-options-changed`: WindowOptionsChangedEvent[application, `window-options-changed`],
    `window-performance-report`: WindowPerformanceReport[application, `window-performance-report`],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`],
    `window-reloaded`: WindowReloadedEvent[application, `window-reloaded`],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`],
    `window-responding`: WindowEvent[application, `window-responding`],
    `window-restored`: WindowEvent[application, `window-restored`],
    `window-show-requested`: WindowEvent[application, `window-show-requested`],
    `window-shown`: WindowEvent[application, `window-shown`],
    `window-start-load`: WindowEvent[application, `window-start-load`],
    `window-user-movement-disabled`: WindowEvent[application, `window-user-movement-disabled`],
    `window-user-movement-enabled`: WindowEvent[application, `window-user-movement-enabled`],
    `window-will-move`: WillMoveOrResize[application, `window-will-move`],
    `window-will-resize`: WillMoveOrResize[application, `window-will-resize`]
  ): ApplicationEvents = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("run-requested")(`run-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("tray-icon-clicked")(`tray-icon-clicked`.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[ApplicationEvents]
  }
}

