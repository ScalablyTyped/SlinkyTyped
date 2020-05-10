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
import typingsSlinky.openfin.openfinStrings.`view-hidden`
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
import typingsSlinky.openfin.openfinStrings.`window-initialized`
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
@js.native
trait SystemEvents extends js.Object {
  var `application-closed`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-closed`] = js.native
  var `application-connected`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-connected`] = js.native
  var `application-crashed`: CrashedEvent with (ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-crashed`]) = js.native
  var `application-created`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-created`] = js.native
  var `application-initialized`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-initialized`] = js.native
  var `application-manifest-changed`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-manifest-changed`] = js.native
  var `application-not-responding`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-not-responding`] = js.native
  var `application-responding`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-responding`] = js.native
  var `application-started`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`application-started`] = js.native
  var `application-tray-icon-clicked`: TrayIconClicked[system, typingsSlinky.openfin.openfinStrings.`application-tray-icon-clicked`] = js.native
  var `desktop-icon-clicked`: ApplicationEvent[system, typingsSlinky.openfin.openfinStrings.`desktop-icon-clicked`] = js.native
  var `external-window-closed`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-closed`] = js.native
  var `external-window-created`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-created`] = js.native
  var `external-window-hidden`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-hidden`] = js.native
  var `external-window-shown`: BaseEvent[system, typingsSlinky.openfin.openfinStrings.`external-window-shown`] = js.native
  var `idle-state-changed`: IdleEvent[system, typingsSlinky.openfin.openfinStrings.`idle-state-changed`] = js.native
  var listenerRemoved: String = js.native
  var `monitor-info-changed`: MonitorEvent[system, typingsSlinky.openfin.openfinStrings.`monitor-info-changed`] = js.native
  var newListener: String = js.native
  var `session-changed`: SessionChangedEvent[system, typingsSlinky.openfin.openfinStrings.`session-changed`] = js.native
  var `view-crashed`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-crashed`]) = js.native
  var `view-created`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-created`]) = js.native
  var `view-destroyed`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-destroyed`] = js.native
  var `view-did-change-theme-color`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-did-change-theme-color`] = js.native
  var `view-hidden`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-hidden`] = js.native
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[system, typingsSlinky.openfin.openfinStrings.`view-navigation-rejected`] = js.native
  var `view-page-favicon-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-page-favicon-updated`] = js.native
  var `view-page-title-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-page-title-updated`] = js.native
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[system, typingsSlinky.openfin.openfinStrings.`view-resource-load-failed`] = js.native
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[system, typingsSlinky.openfin.openfinStrings.`view-resource-response-received`] = js.native
  var `view-shown`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-shown`] = js.native
  var `view-target-changed`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-target-changed`] = js.native
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[system, typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`] = js.native
  var `window-blurred`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-blurred`] = js.native
  var `window-bounds-changed`: WindowBoundsChange[system, typingsSlinky.openfin.openfinStrings.`window-bounds-changed`] = js.native
  var `window-bounds-changing`: WindowBoundsChange[system, typingsSlinky.openfin.openfinStrings.`window-bounds-changing`] = js.native
  var `window-closed`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-closed`] = js.native
  var `window-closing`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-closing`] = js.native
  var `window-crashed`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-crashed`]) = js.native
  var `window-created`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-created`] = js.native
  var `window-did-change-theme-color`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-did-change-theme-color`] = js.native
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
  ] = js.native
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
  ] = js.native
  var `window-embedded`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-embedded`] = js.native
  var `window-end-load`: WindowEndLoadEvent[system, typingsSlinky.openfin.openfinStrings.`window-end-load`] = js.native
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[system, typingsSlinky.openfin.openfinStrings.`window-end-user-bounds-changing`] = js.native
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[system, typingsSlinky.openfin.openfinStrings.`window-external-process-exited`] = js.native
  var `window-external-process-started`: WindowExternalProcessStartedEvent[system, typingsSlinky.openfin.openfinStrings.`window-external-process-started`] = js.native
  var `window-focused`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-focused`] = js.native
  var `window-group-changed`: WindowGroupChanged[system, typingsSlinky.openfin.openfinStrings.`window-group-changed`] = js.native
  var `window-hidden`: WindowHiddenEvent[system, typingsSlinky.openfin.openfinStrings.`window-hidden`] = js.native
  var `window-initialized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-initialized`] = js.native
  var `window-maximized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-maximized`] = js.native
  var `window-minimized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-minimized`] = js.native
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[system, typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`] = js.native
  var `window-not-responding`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-not-responding`] = js.native
  var `window-options-changed`: WindowOptionsChangedEvent[system, typingsSlinky.openfin.openfinStrings.`window-options-changed`] = js.native
  var `window-page-favicon-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-page-favicon-updated`] = js.native
  var `window-page-title-updated`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-page-title-updated`] = js.native
  var `window-performance-report`: WindowPerformanceReport[system, typingsSlinky.openfin.openfinStrings.`window-performance-report`] = js.native
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`
  ] = js.native
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
    system, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
  ] = js.native
  var `window-reloaded`: WindowReloadedEvent[system, typingsSlinky.openfin.openfinStrings.`window-reloaded`] = js.native
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[system, typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`] = js.native
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[system, typingsSlinky.openfin.openfinStrings.`window-resource-response-received`] = js.native
  var `window-responding`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-responding`] = js.native
  var `window-restored`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-restored`] = js.native
  var `window-shown`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-shown`] = js.native
  var `window-start-load`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-start-load`] = js.native
  var `window-user-movement-disabled`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`] = js.native
  var `window-user-movement-enabled`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`] = js.native
  var `window-will-move`: WillMoveOrResize[system, typingsSlinky.openfin.openfinStrings.`window-will-move`] = js.native
  var `window-will-resize`: WillMoveOrResize[system, typingsSlinky.openfin.openfinStrings.`window-will-resize`] = js.native
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
    `view-hidden`: WindowEvent[system, `view-hidden`],
    `view-navigation-rejected`: WindowNavigationRejectedEvent[system, `view-navigation-rejected`],
    `view-page-favicon-updated`: WindowEvent[system, `view-page-favicon-updated`],
    `view-page-title-updated`: WindowEvent[system, `view-page-title-updated`],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[system, `view-resource-load-failed`],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[system, `view-resource-response-received`],
    `view-shown`: WindowEvent[system, `view-shown`],
    `view-target-changed`: WindowEvent[system, `view-target-changed`],
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
    `window-initialized`: WindowEvent[system, `window-initialized`],
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
    __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("window-initialized")(`window-initialized`.asInstanceOf[js.Any])
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
  @scala.inline
  implicit class SystemEventsOps[Self <: SystemEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withApplication-closed`(value: ApplicationEvent[system, `application-closed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-connected`(value: ApplicationEvent[system, `application-connected`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-crashed`(value: CrashedEvent with (ApplicationEvent[system, `application-crashed`])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-created`(value: ApplicationEvent[system, `application-created`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-initialized`(value: ApplicationEvent[system, `application-initialized`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-manifest-changed`(value: ApplicationEvent[system, `application-manifest-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-manifest-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-not-responding`(value: ApplicationEvent[system, `application-not-responding`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-not-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-responding`(value: ApplicationEvent[system, `application-responding`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-started`(value: ApplicationEvent[system, `application-started`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-tray-icon-clicked`(value: TrayIconClicked[system, `application-tray-icon-clicked`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-tray-icon-clicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDesktop-icon-clicked`(value: ApplicationEvent[system, `desktop-icon-clicked`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop-icon-clicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-closed`(value: BaseEvent[system, `external-window-closed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-created`(value: BaseEvent[system, `external-window-created`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-hidden`(value: BaseEvent[system, `external-window-hidden`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-shown`(value: BaseEvent[system, `external-window-shown`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIdle-state-changed`(value: IdleEvent[system, `idle-state-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenerRemoved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonitor-info-changed`(value: MonitorEvent[system, `monitor-info-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor-info-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewListener(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSession-changed`(value: SessionChangedEvent[system, `session-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-crashed`(value: CrashedEvent with (WindowEvent[system, `view-crashed`])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-created`(value: CrashedEvent with (WindowEvent[system, `view-created`])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-destroyed`(value: WindowEvent[system, `view-destroyed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-did-change-theme-color`(value: WindowEvent[system, `view-did-change-theme-color`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-hidden`(value: WindowEvent[system, `view-hidden`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-navigation-rejected`(value: WindowNavigationRejectedEvent[system, `view-navigation-rejected`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-favicon-updated`(value: WindowEvent[system, `view-page-favicon-updated`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-title-updated`(value: WindowEvent[system, `view-page-title-updated`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-load-failed`(value: WindowResourceLoadFailedEvent[system, `view-resource-load-failed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-response-received`(value: WindowResourceResponseReceivedEvent[system, `view-resource-response-received`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-shown`(value: WindowEvent[system, `view-shown`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-target-changed`(value: WindowEvent[system, `view-target-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-target-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[system, `window-begin-user-bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-begin-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-blurred`(value: WindowEvent[system, `window-blurred`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-blurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-bounds-changed`(value: WindowBoundsChange[system, `window-bounds-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-bounds-changing`(value: WindowBoundsChange[system, `window-bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-closed`(value: WindowEvent[system, `window-closed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-closing`(value: WindowEvent[system, `window-closing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-closing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-crashed`(value: CrashedEvent with (WindowEvent[system, `window-crashed`])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-created`(value: WindowEvent[system, `window-created`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-did-change-theme-color`(value: WindowEvent[system, `window-did-change-theme-color`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[system, `window-disabled-movement-bounds-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-disabled-movement-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[system, `window-disabled-movement-bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-disabled-movement-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-embedded`(value: WindowEvent[system, `window-embedded`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-end-load`(value: WindowEndLoadEvent[system, `window-end-load`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-end-load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[system, `window-end-user-bounds-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-end-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[system, `window-external-process-exited`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-external-process-exited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-external-process-started`(value: WindowExternalProcessStartedEvent[system, `window-external-process-started`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-external-process-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-focused`(value: WindowEvent[system, `window-focused`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-group-changed`(value: WindowGroupChanged[system, `window-group-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-group-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-hidden`(value: WindowHiddenEvent[system, `window-hidden`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-initialized`(value: WindowEvent[system, `window-initialized`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-maximized`(value: WindowEvent[system, `window-maximized`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-maximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-minimized`(value: WindowEvent[system, `window-minimized`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-minimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[system, `window-navigation-rejected`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-not-responding`(value: WindowEvent[system, `window-not-responding`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-not-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-options-changed`(value: WindowOptionsChangedEvent[system, `window-options-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-options-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-page-favicon-updated`(value: WindowEvent[system, `window-page-favicon-updated`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-page-title-updated`(value: WindowEvent[system, `window-page-title-updated`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-performance-report`(value: WindowPerformanceReport[system, `window-performance-report`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-performance-report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[system, `window-preload-scripts-state-changed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-preload-scripts-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[system, `window-preload-scripts-state-changing`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-preload-scripts-state-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-reloaded`(value: WindowReloadedEvent[system, `window-reloaded`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-reloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[system, `window-resource-load-failed`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[system, `window-resource-response-received`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-responding`(value: WindowEvent[system, `window-responding`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-restored`(value: WindowEvent[system, `window-restored`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-shown`(value: WindowEvent[system, `window-shown`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-start-load`(value: WindowEvent[system, `window-start-load`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-start-load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-user-movement-disabled`(value: WindowEvent[system, `window-user-movement-disabled`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-user-movement-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-user-movement-enabled`(value: WindowEvent[system, `window-user-movement-enabled`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-user-movement-enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-will-move`(value: WillMoveOrResize[system, `window-will-move`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-will-move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-will-resize`(value: WillMoveOrResize[system, `window-will-resize`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-will-resize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

