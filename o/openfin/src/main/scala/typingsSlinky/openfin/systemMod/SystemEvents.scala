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
import typingsSlinky.openfin.viewMod.PropagatedViewIdentity
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var `view-blurred`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-blurred`]) with PropagatedViewIdentity = js.native
  
  var `view-crashed`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-crashed`]) with PropagatedViewIdentity = js.native
  
  var `view-created`: CrashedEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-created`]) with PropagatedViewIdentity = js.native
  
  var `view-destroyed`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-destroyed`]) with PropagatedViewIdentity = js.native
  
  var `view-did-change-theme-color`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-did-change-theme-color`]) with PropagatedViewIdentity = js.native
  
  var `view-focused`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-focused`]) with PropagatedViewIdentity = js.native
  
  var `view-hidden`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-hidden`]) with PropagatedViewIdentity = js.native
  
  var `view-hotkey`: InputEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-hotkey`]) with PropagatedViewIdentity = js.native
  
  var `view-navigation-rejected`: (WindowNavigationRejectedEvent[system, typingsSlinky.openfin.openfinStrings.`view-navigation-rejected`]) with PropagatedViewIdentity = js.native
  
  var `view-page-favicon-updated`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-page-favicon-updated`]) with PropagatedViewIdentity = js.native
  
  var `view-page-title-updated`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-page-title-updated`]) with PropagatedViewIdentity = js.native
  
  var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[system, typingsSlinky.openfin.openfinStrings.`view-resource-load-failed`]) with PropagatedViewIdentity = js.native
  
  var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[system, typingsSlinky.openfin.openfinStrings.`view-resource-response-received`]) with PropagatedViewIdentity = js.native
  
  var `view-shown`: (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`view-shown`]) with PropagatedViewIdentity = js.native
  
  var `view-target-changed`: (TargetChangedEvent[system, typingsSlinky.openfin.openfinStrings.`view-target-changed`]) with PropagatedViewIdentity = js.native
  
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
  
  var `window-hotkey`: InputEvent with (WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-hotkey`]) = js.native
  
  var `window-initialized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-initialized`] = js.native
  
  var `window-layout-initialized`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-layout-initialized`] = js.native
  
  var `window-layout-ready`: WindowEvent[system, typingsSlinky.openfin.openfinStrings.`window-layout-ready`] = js.native
  
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
    `view-blurred`: (WindowEvent[system, `view-blurred`]) with PropagatedViewIdentity,
    `view-crashed`: CrashedEvent with (WindowEvent[system, `view-crashed`]) with PropagatedViewIdentity,
    `view-created`: CrashedEvent with (WindowEvent[system, `view-created`]) with PropagatedViewIdentity,
    `view-destroyed`: (WindowEvent[system, `view-destroyed`]) with PropagatedViewIdentity,
    `view-did-change-theme-color`: (WindowEvent[system, `view-did-change-theme-color`]) with PropagatedViewIdentity,
    `view-focused`: (WindowEvent[system, `view-focused`]) with PropagatedViewIdentity,
    `view-hidden`: (WindowEvent[system, `view-hidden`]) with PropagatedViewIdentity,
    `view-hotkey`: InputEvent with (WindowEvent[system, `view-hotkey`]) with PropagatedViewIdentity,
    `view-navigation-rejected`: (WindowNavigationRejectedEvent[system, `view-navigation-rejected`]) with PropagatedViewIdentity,
    `view-page-favicon-updated`: (WindowEvent[system, `view-page-favicon-updated`]) with PropagatedViewIdentity,
    `view-page-title-updated`: (WindowEvent[system, `view-page-title-updated`]) with PropagatedViewIdentity,
    `view-resource-load-failed`: (WindowResourceLoadFailedEvent[system, `view-resource-load-failed`]) with PropagatedViewIdentity,
    `view-resource-response-received`: (WindowResourceResponseReceivedEvent[system, `view-resource-response-received`]) with PropagatedViewIdentity,
    `view-shown`: (WindowEvent[system, `view-shown`]) with PropagatedViewIdentity,
    `view-target-changed`: (TargetChangedEvent[system, `view-target-changed`]) with PropagatedViewIdentity,
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
  
  @scala.inline
  implicit class SystemEventsOps[Self <: SystemEvents] (val x: Self) extends AnyVal {
    
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
    def `setApplication-closed`(value: ApplicationEvent[system, `application-closed`]): Self = this.set("application-closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-connected`(value: ApplicationEvent[system, `application-connected`]): Self = this.set("application-connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-crashed`(value: CrashedEvent with (ApplicationEvent[system, `application-crashed`])): Self = this.set("application-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-created`(value: ApplicationEvent[system, `application-created`]): Self = this.set("application-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-initialized`(value: ApplicationEvent[system, `application-initialized`]): Self = this.set("application-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-manifest-changed`(value: ApplicationEvent[system, `application-manifest-changed`]): Self = this.set("application-manifest-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-not-responding`(value: ApplicationEvent[system, `application-not-responding`]): Self = this.set("application-not-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-responding`(value: ApplicationEvent[system, `application-responding`]): Self = this.set("application-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-started`(value: ApplicationEvent[system, `application-started`]): Self = this.set("application-started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setApplication-tray-icon-clicked`(value: TrayIconClicked[system, `application-tray-icon-clicked`]): Self = this.set("application-tray-icon-clicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDesktop-icon-clicked`(value: ApplicationEvent[system, `desktop-icon-clicked`]): Self = this.set("desktop-icon-clicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-closed`(value: BaseEvent[system, `external-window-closed`]): Self = this.set("external-window-closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-created`(value: BaseEvent[system, `external-window-created`]): Self = this.set("external-window-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-hidden`(value: BaseEvent[system, `external-window-hidden`]): Self = this.set("external-window-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-shown`(value: BaseEvent[system, `external-window-shown`]): Self = this.set("external-window-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIdle-state-changed`(value: IdleEvent[system, `idle-state-changed`]): Self = this.set("idle-state-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerRemoved(value: String): Self = this.set("listenerRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMonitor-info-changed`(value: MonitorEvent[system, `monitor-info-changed`]): Self = this.set("monitor-info-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewListener(value: String): Self = this.set("newListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSession-changed`(value: SessionChangedEvent[system, `session-changed`]): Self = this.set("session-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-blurred`(value: (WindowEvent[system, `view-blurred`]) with PropagatedViewIdentity): Self = this.set("view-blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-crashed`(value: CrashedEvent with (WindowEvent[system, `view-crashed`]) with PropagatedViewIdentity): Self = this.set("view-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-created`(value: CrashedEvent with (WindowEvent[system, `view-created`]) with PropagatedViewIdentity): Self = this.set("view-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-destroyed`(value: (WindowEvent[system, `view-destroyed`]) with PropagatedViewIdentity): Self = this.set("view-destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-did-change-theme-color`(value: (WindowEvent[system, `view-did-change-theme-color`]) with PropagatedViewIdentity): Self = this.set("view-did-change-theme-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-focused`(value: (WindowEvent[system, `view-focused`]) with PropagatedViewIdentity): Self = this.set("view-focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hidden`(value: (WindowEvent[system, `view-hidden`]) with PropagatedViewIdentity): Self = this.set("view-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hotkey`(value: InputEvent with (WindowEvent[system, `view-hotkey`]) with PropagatedViewIdentity): Self = this.set("view-hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-navigation-rejected`(
      value: (WindowNavigationRejectedEvent[system, `view-navigation-rejected`]) with PropagatedViewIdentity
    ): Self = this.set("view-navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-favicon-updated`(value: (WindowEvent[system, `view-page-favicon-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-favicon-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-title-updated`(value: (WindowEvent[system, `view-page-title-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-title-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-load-failed`(
      value: (WindowResourceLoadFailedEvent[system, `view-resource-load-failed`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-response-received`(
      value: (WindowResourceResponseReceivedEvent[system, `view-resource-response-received`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-shown`(value: (WindowEvent[system, `view-shown`]) with PropagatedViewIdentity): Self = this.set("view-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-target-changed`(value: (TargetChangedEvent[system, `view-target-changed`]) with PropagatedViewIdentity): Self = this.set("view-target-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[system, `window-begin-user-bounds-changing`]): Self = this.set("window-begin-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-blurred`(value: WindowEvent[system, `window-blurred`]): Self = this.set("window-blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-bounds-changed`(value: WindowBoundsChange[system, `window-bounds-changed`]): Self = this.set("window-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-bounds-changing`(value: WindowBoundsChange[system, `window-bounds-changing`]): Self = this.set("window-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-closed`(value: WindowEvent[system, `window-closed`]): Self = this.set("window-closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-closing`(value: WindowEvent[system, `window-closing`]): Self = this.set("window-closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-crashed`(value: CrashedEvent with (WindowEvent[system, `window-crashed`])): Self = this.set("window-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-created`(value: WindowEvent[system, `window-created`]): Self = this.set("window-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-did-change-theme-color`(value: WindowEvent[system, `window-did-change-theme-color`]): Self = this.set("window-did-change-theme-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[system, `window-disabled-movement-bounds-changed`]): Self = this.set("window-disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[system, `window-disabled-movement-bounds-changing`]): Self = this.set("window-disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-embedded`(value: WindowEvent[system, `window-embedded`]): Self = this.set("window-embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-end-load`(value: WindowEndLoadEvent[system, `window-end-load`]): Self = this.set("window-end-load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[system, `window-end-user-bounds-changing`]): Self = this.set("window-end-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[system, `window-external-process-exited`]): Self = this.set("window-external-process-exited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-external-process-started`(value: WindowExternalProcessStartedEvent[system, `window-external-process-started`]): Self = this.set("window-external-process-started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-focused`(value: WindowEvent[system, `window-focused`]): Self = this.set("window-focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-group-changed`(value: WindowGroupChanged[system, `window-group-changed`]): Self = this.set("window-group-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-hidden`(value: WindowHiddenEvent[system, `window-hidden`]): Self = this.set("window-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-hotkey`(value: InputEvent with (WindowEvent[system, `window-hotkey`])): Self = this.set("window-hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-initialized`(value: WindowEvent[system, `window-initialized`]): Self = this.set("window-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-layout-initialized`(value: WindowEvent[system, `window-layout-initialized`]): Self = this.set("window-layout-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-layout-ready`(value: WindowEvent[system, `window-layout-ready`]): Self = this.set("window-layout-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-maximized`(value: WindowEvent[system, `window-maximized`]): Self = this.set("window-maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-minimized`(value: WindowEvent[system, `window-minimized`]): Self = this.set("window-minimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[system, `window-navigation-rejected`]): Self = this.set("window-navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-not-responding`(value: WindowEvent[system, `window-not-responding`]): Self = this.set("window-not-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-options-changed`(value: WindowOptionsChangedEvent[system, `window-options-changed`]): Self = this.set("window-options-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-page-favicon-updated`(value: WindowEvent[system, `window-page-favicon-updated`]): Self = this.set("window-page-favicon-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-page-title-updated`(value: WindowEvent[system, `window-page-title-updated`]): Self = this.set("window-page-title-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-performance-report`(value: WindowPerformanceReport[system, `window-performance-report`]): Self = this.set("window-performance-report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[system, `window-preload-scripts-state-changed`]): Self = this.set("window-preload-scripts-state-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[system, `window-preload-scripts-state-changing`]): Self = this.set("window-preload-scripts-state-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-reloaded`(value: WindowReloadedEvent[system, `window-reloaded`]): Self = this.set("window-reloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[system, `window-resource-load-failed`]): Self = this.set("window-resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[system, `window-resource-response-received`]): Self = this.set("window-resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-responding`(value: WindowEvent[system, `window-responding`]): Self = this.set("window-responding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-restored`(value: WindowEvent[system, `window-restored`]): Self = this.set("window-restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-shown`(value: WindowEvent[system, `window-shown`]): Self = this.set("window-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-start-load`(value: WindowEvent[system, `window-start-load`]): Self = this.set("window-start-load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-user-movement-disabled`(value: WindowEvent[system, `window-user-movement-disabled`]): Self = this.set("window-user-movement-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-user-movement-enabled`(value: WindowEvent[system, `window-user-movement-enabled`]): Self = this.set("window-user-movement-enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-will-move`(value: WillMoveOrResize[system, `window-will-move`]): Self = this.set("window-will-move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWindow-will-resize`(value: WillMoveOrResize[system, `window-will-resize`]): Self = this.set("window-will-resize", value.asInstanceOf[js.Any])
  }
}
