package typingsSlinky.openfin.systemMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsApplicationMod.TrayIconClicked
import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import typingsSlinky.openfin.eventsBaseMod.BaseEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.`application-closed`
import typingsSlinky.openfin.openfinStrings.`application-connected`
import typingsSlinky.openfin.openfinStrings.`application-crashed`
import typingsSlinky.openfin.openfinStrings.`application-created`
import typingsSlinky.openfin.openfinStrings.`application-initialized`
import typingsSlinky.openfin.openfinStrings.`application-manifest-changed`
import typingsSlinky.openfin.openfinStrings.`application-not-responding`
import typingsSlinky.openfin.openfinStrings.`application-responding`
import typingsSlinky.openfin.openfinStrings.`application-started`
import typingsSlinky.openfin.openfinStrings.`application-tray-icon-clicked`
import typingsSlinky.openfin.openfinStrings.`desktop-icon-clicked`
import typingsSlinky.openfin.openfinStrings.`external-window-closed`
import typingsSlinky.openfin.openfinStrings.`external-window-created`
import typingsSlinky.openfin.openfinStrings.`external-window-hidden`
import typingsSlinky.openfin.openfinStrings.`external-window-shown`
import typingsSlinky.openfin.openfinStrings.`idle-state-changed`
import typingsSlinky.openfin.openfinStrings.`monitor-info-changed`
import typingsSlinky.openfin.openfinStrings.`session-changed`
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
import typingsSlinky.openfin.openfinStrings.`window-created`
import typingsSlinky.openfin.openfinStrings.`window-did-change-theme-color`
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
import typingsSlinky.openfin.openfinStrings.`window-page-favicon-updated`
import typingsSlinky.openfin.openfinStrings.`window-page-title-updated`
import typingsSlinky.openfin.openfinStrings.`window-performance-report`
import typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`
import typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
import typingsSlinky.openfin.openfinStrings.`window-reloaded`
import typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`
import typingsSlinky.openfin.openfinStrings.`window-resource-response-received`
import typingsSlinky.openfin.openfinStrings.`window-responding`
import typingsSlinky.openfin.openfinStrings.`window-restored`
import typingsSlinky.openfin.openfinStrings.`window-shown`
import typingsSlinky.openfin.openfinStrings.`window-start-load`
import typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`
import typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`
import typingsSlinky.openfin.openfinStrings.`window-will-move`
import typingsSlinky.openfin.openfinStrings.`window-will-resize`
import typingsSlinky.openfin.openfinStrings.system
import typingsSlinky.openfin.viewMod.InputEvent
import typingsSlinky.openfin.viewMod.TargetChangedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsSlinky.openfin.windowMod.WillMoveOrResize
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

/* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'system'> & openfin.openfin/_v2/api/events/application.PropagatedApplicationEvents<'system'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'system'> & {[ Type in keyof openfin.openfin/_v2/api/events/system.SystemEventMapping<string, string> ]: openfin.openfin/_v2/api/events/system.SystemEventMapping<'system', Type>[Type]} */
trait SystemEvents extends js.Object {
  var `application-closed`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-closed`]
  var `application-connected`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-connected`]
  var `application-crashed`: CrashedEvent with (ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-crashed`])
  var `application-created`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-created`]
  var `application-initialized`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-initialized`]
  var `application-manifest-changed`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-manifest-changed`]
  var `application-not-responding`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-not-responding`]
  var `application-responding`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-responding`]
  var `application-started`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-started`]
  var `application-tray-icon-clicked`: TrayIconClicked[system, typingsSlinky.openfin.openfinStrings.`application-tray-icon-clicked`]
  var `desktop-icon-clicked`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`desktop-icon-clicked`]
  var `external-window-closed`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-closed`]
  var `external-window-created`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-created`]
  var `external-window-hidden`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-hidden`]
  var `external-window-shown`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-shown`]
  var `idle-state-changed`: IdleEvent[system, typingsSlinky.openfin.openfinStrings.`idle-state-changed`]
  var listenerRemoved: String
  var `monitor-info-changed`: MonitorEvent[system, typingsSlinky.openfin.openfinStrings.`monitor-info-changed`]
  var newListener: String
  var `session-changed`: SessionChangedEvent[system, typingsSlinky.openfin.openfinStrings.`session-changed`]
  var `view-crashed`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-crashed`])
  var `view-created`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-created`])
  var `view-destroyed`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-destroyed`]
  var `view-did-change-theme-color`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-did-change-theme-color`]
  var `view-focused`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-focused`]
  var `view-hidden`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-hidden`]
  var `view-hotkey`: InputEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-hotkey`])
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[system, typingsSlinky.openfin.openfinStrings.`view-navigation-rejected`]
  var `view-page-favicon-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-page-favicon-updated`]
  var `view-page-title-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-page-title-updated`]
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[system, typingsSlinky.openfin.openfinStrings.`view-resource-load-failed`]
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[system, typingsSlinky.openfin.openfinStrings.`view-resource-response-received`]
  var `view-shown`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-shown`]
  var `view-target-changed`: TargetChangedEvent[system, typingsSlinky.openfin.openfinStrings.`view-target-changed`]
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[system, typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`]
  var `window-blurred`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-blurred`]
  var `window-bounds-changed`: WindowBoundsChange[system, typingsSlinky.openfin.openfinStrings.`window-bounds-changed`]
  var `window-bounds-changing`: WindowBoundsChange[system, typingsSlinky.openfin.openfinStrings.`window-bounds-changing`]
  var `window-closed`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-closed`]
  var `window-closing`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-closing`]
  var `window-crashed`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-crashed`])
  var `window-created`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-created`]
  var `window-did-change-theme-color`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-did-change-theme-color`]
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
  ]
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
  ]
  var `window-embedded`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-embedded`]
  var `window-end-load`: WindowEndLoadEvent[system, typingsSlinky.openfin.openfinStrings.`window-end-load`]
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[system, typingsSlinky.openfin.openfinStrings.`window-end-user-bounds-changing`]
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[system, typingsSlinky.openfin.openfinStrings.`window-external-process-exited`]
  var `window-external-process-started`: WindowExternalProcessStartedEvent[system, typingsSlinky.openfin.openfinStrings.`window-external-process-started`]
  var `window-focused`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-focused`]
  var `window-group-changed`: WindowGroupChanged[system, typingsSlinky.openfin.openfinStrings.`window-group-changed`]
  var `window-hidden`: WindowHiddenEvent[system, typingsSlinky.openfin.openfinStrings.`window-hidden`]
  var `window-hotkey`: InputEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-hotkey`])
  var `window-initialized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-initialized`]
  var `window-layout-initialized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-layout-initialized`]
  var `window-layout-ready`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-layout-ready`]
  var `window-maximized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-maximized`]
  var `window-minimized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-minimized`]
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[system, typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`]
  var `window-not-responding`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-not-responding`]
  var `window-options-changed`: WindowOptionsChangedEvent[system, typingsSlinky.openfin.openfinStrings.`window-options-changed`]
  var `window-page-favicon-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-page-favicon-updated`]
  var `window-page-title-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-page-title-updated`]
  var `window-performance-report`: WindowPerformanceReport[system, typingsSlinky.openfin.openfinStrings.`window-performance-report`]
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`
  ]
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
  ]
  var `window-reloaded`: WindowReloadedEvent[system, typingsSlinky.openfin.openfinStrings.`window-reloaded`]
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[system, typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`]
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[system, typingsSlinky.openfin.openfinStrings.`window-resource-response-received`]
  var `window-responding`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-responding`]
  var `window-restored`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-restored`]
  var `window-shown`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-shown`]
  var `window-start-load`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-start-load`]
  var `window-user-movement-disabled`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`]
  var `window-user-movement-enabled`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`]
  var `window-will-move`: WillMoveOrResize[system, typingsSlinky.openfin.openfinStrings.`window-will-move`]
  var `window-will-resize`: WillMoveOrResize[system, typingsSlinky.openfin.openfinStrings.`window-will-resize`]
}

object SystemEvents {
  @scala.inline
  def apply(
    `application-closed`: ApplicationEvent[system, `application-closed`],
    `application-connected`: ApplicationEvent[system, `application-connected`],
    `application-crashed`: CrashedEvent with (ApplicationEvent[system, `application-crashed`]),
    `application-created`: ApplicationEvent[system, `application-created`],
    `application-initialized`: ApplicationEvent[system, `application-initialized`],
    `application-manifest-changed`: ApplicationEvent[system, `application-manifest-changed`],
    `application-not-responding`: ApplicationEvent[system, `application-not-responding`],
    `application-responding`: ApplicationEvent[system, `application-responding`],
    `application-started`: ApplicationEvent[system, `application-started`],
    `application-tray-icon-clicked`: TrayIconClicked[system, `application-tray-icon-clicked`],
    `desktop-icon-clicked`: ApplicationEvent[system, `desktop-icon-clicked`],
    `external-window-closed`: BaseEvent[system, `external-window-closed`],
    `external-window-created`: BaseEvent[system, `external-window-created`],
    `external-window-hidden`: BaseEvent[system, `external-window-hidden`],
    `external-window-shown`: BaseEvent[system, `external-window-shown`],
    `idle-state-changed`: IdleEvent[system, `idle-state-changed`],
    listenerRemoved: String,
    `monitor-info-changed`: MonitorEvent[system, `monitor-info-changed`],
    newListener: String,
    `session-changed`: SessionChangedEvent[system, `session-changed`],
    `view-crashed`: CrashedEvent with (WindowEvent[system, `view-crashed`]),
    `view-created`: CrashedEvent with (WindowEvent[system, `view-created`]),
    `view-destroyed`: WindowEvent[system, `view-destroyed`],
    `view-did-change-theme-color`: WindowEvent[system, `view-did-change-theme-color`],
    `view-focused`: WindowEvent[system, `view-focused`],
    `view-hidden`: WindowEvent[system, `view-hidden`],
    `view-hotkey`: InputEvent with (WindowEvent[system, `view-hotkey`]),
    `view-navigation-rejected`: WindowNavigationRejectedEvent[system, `view-navigation-rejected`],
    `view-page-favicon-updated`: WindowEvent[system, `view-page-favicon-updated`],
    `view-page-title-updated`: WindowEvent[system, `view-page-title-updated`],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[system, `view-resource-load-failed`],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[system, `view-resource-response-received`],
    `view-shown`: WindowEvent[system, `view-shown`],
    `view-target-changed`: TargetChangedEvent[system, `view-target-changed`],
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[system, `window-begin-user-bounds-changing`],
    `window-blurred`: WindowEvent[system, `window-blurred`],
    `window-bounds-changed`: WindowBoundsChange[system, `window-bounds-changed`],
    `window-bounds-changing`: WindowBoundsChange[system, `window-bounds-changing`],
    `window-closed`: WindowEvent[system, `window-closed`],
    `window-closing`: WindowEvent[system, `window-closing`],
    `window-crashed`: CrashedEvent with (WindowEvent[system, `window-crashed`]),
    `window-created`: WindowEvent[system, `window-created`],
    `window-did-change-theme-color`: WindowEvent[system, `window-did-change-theme-color`],
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[system, `window-disabled-movement-bounds-changed`],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[system, `window-disabled-movement-bounds-changing`],
    `window-embedded`: WindowEvent[system, `window-embedded`],
    `window-end-load`: WindowEndLoadEvent[system, `window-end-load`],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[system, `window-end-user-bounds-changing`],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[system, `window-external-process-exited`],
    `window-external-process-started`: WindowExternalProcessStartedEvent[system, `window-external-process-started`],
    `window-focused`: WindowEvent[system, `window-focused`],
    `window-group-changed`: WindowGroupChanged[system, `window-group-changed`],
    `window-hidden`: WindowHiddenEvent[system, `window-hidden`],
    `window-hotkey`: InputEvent with (WindowEvent[system, `window-hotkey`]),
    `window-initialized`: WindowEvent[system, `window-initialized`],
    `window-layout-initialized`: WindowEvent[system, `window-layout-initialized`],
    `window-layout-ready`: WindowEvent[system, `window-layout-ready`],
    `window-maximized`: WindowEvent[system, `window-maximized`],
    `window-minimized`: WindowEvent[system, `window-minimized`],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[system, `window-navigation-rejected`],
    `window-not-responding`: WindowEvent[system, `window-not-responding`],
    `window-options-changed`: WindowOptionsChangedEvent[system, `window-options-changed`],
    `window-page-favicon-updated`: WindowEvent[system, `window-page-favicon-updated`],
    `window-page-title-updated`: WindowEvent[system, `window-page-title-updated`],
    `window-performance-report`: WindowPerformanceReport[system, `window-performance-report`],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[system, `window-preload-scripts-state-changed`],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[system, `window-preload-scripts-state-changing`],
    `window-reloaded`: WindowReloadedEvent[system, `window-reloaded`],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[system, `window-resource-load-failed`],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[system, `window-resource-response-received`],
    `window-responding`: WindowEvent[system, `window-responding`],
    `window-restored`: WindowEvent[system, `window-restored`],
    `window-shown`: WindowEvent[system, `window-shown`],
    `window-start-load`: WindowEvent[system, `window-start-load`],
    `window-user-movement-disabled`: WindowEvent[system, `window-user-movement-disabled`],
    `window-user-movement-enabled`: WindowEvent[system, `window-user-movement-enabled`],
    `window-will-move`: WillMoveOrResize[system, `window-will-move`],
    `window-will-resize`: WillMoveOrResize[system, `window-will-resize`]
  ): SystemEvents = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("application-closed")(`application-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-connected")(`application-connected`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-crashed")(`application-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-created")(`application-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-initialized")(`application-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-manifest-changed")(`application-manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-not-responding")(`application-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-responding")(`application-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-started")(`application-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-tray-icon-clicked")(`application-tray-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("desktop-icon-clicked")(`desktop-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-closed")(`external-window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-created")(`external-window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-hidden")(`external-window-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-shown")(`external-window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("idle-state-changed")(`idle-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("monitor-info-changed")(`monitor-info-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("session-changed")(`session-changed`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("window-begin-user-bounds-changing")(`window-begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-blurred")(`window-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changed")(`window-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changing")(`window-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closed")(`window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closing")(`window-closing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-crashed")(`window-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changed")(`window-preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changing")(`window-preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-reloaded")(`window-reloaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-load-failed")(`window-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-response-received")(`window-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-restored")(`window-restored`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-shown")(`window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-disabled")(`window-user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-enabled")(`window-user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-move")(`window-will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-resize")(`window-will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemEvents]
  }
}

