package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
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
import typingsSlinky.openfin.viewMod.InputEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/window.PropagatedWindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/window.PropagatedWindowEventMapping<Topic, Type>[Type]} */
trait PropagatedWindowEvents[Topic] extends js.Object {
  var listenerRemoved: String
  var newListener: String
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`]
  var `window-blurred`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-blurred`]
  var `window-bounds-changed`: WindowBoundsChange[Topic, typingsSlinky.openfin.openfinStrings.`window-bounds-changed`]
  var `window-bounds-changing`: WindowBoundsChange[Topic, typingsSlinky.openfin.openfinStrings.`window-bounds-changing`]
  var `window-closed`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-closed`]
  var `window-closing`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-closing`]
  var `window-crashed`: CrashedEvent with (WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-crashed`])
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
    Topic, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
  ]
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
    Topic, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
  ]
  var `window-embedded`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-embedded`]
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-end-user-bounds-changing`]
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-external-process-exited`]
  var `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-external-process-started`]
  var `window-focused`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-focused`]
  var `window-group-changed`: WindowGroupChanged[Topic, typingsSlinky.openfin.openfinStrings.`window-group-changed`]
  var `window-hidden`: WindowHiddenEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-hidden`]
  var `window-hotkey`: InputEvent with (WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-hotkey`])
  var `window-initialized`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-initialized`]
  var `window-layout-initialized`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-layout-initialized`]
  var `window-layout-ready`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-layout-ready`]
  var `window-maximized`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-maximized`]
  var `window-minimized`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-minimized`]
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`]
  var `window-options-changed`: WindowOptionsChangedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-options-changed`]
  var `window-performance-report`: WindowPerformanceReport[Topic, typingsSlinky.openfin.openfinStrings.`window-performance-report`]
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`]
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
    Topic, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
  ]
  var `window-reloaded`: WindowReloadedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-reloaded`]
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`]
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-resource-response-received`]
  var `window-restored`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-restored`]
  var `window-shown`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-shown`]
  var `window-user-movement-disabled`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`]
  var `window-user-movement-enabled`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`]
  var `window-will-move`: WillMoveOrResize[Topic, typingsSlinky.openfin.openfinStrings.`window-will-move`]
  var `window-will-resize`: WillMoveOrResize[Topic, typingsSlinky.openfin.openfinStrings.`window-will-resize`]
}

object PropagatedWindowEvents {
  @scala.inline
  def apply[Topic](
    listenerRemoved: String,
    newListener: String,
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, `window-begin-user-bounds-changing`],
    `window-blurred`: WindowEvent[Topic, `window-blurred`],
    `window-bounds-changed`: WindowBoundsChange[Topic, `window-bounds-changed`],
    `window-bounds-changing`: WindowBoundsChange[Topic, `window-bounds-changing`],
    `window-closed`: WindowEvent[Topic, `window-closed`],
    `window-closing`: WindowEvent[Topic, `window-closing`],
    `window-crashed`: CrashedEvent with (WindowEvent[Topic, `window-crashed`]),
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changed`],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changing`],
    `window-embedded`: WindowEvent[Topic, `window-embedded`],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, `window-end-user-bounds-changing`],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, `window-external-process-exited`],
    `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, `window-external-process-started`],
    `window-focused`: WindowEvent[Topic, `window-focused`],
    `window-group-changed`: WindowGroupChanged[Topic, `window-group-changed`],
    `window-hidden`: WindowHiddenEvent[Topic, `window-hidden`],
    `window-hotkey`: InputEvent with (WindowEvent[Topic, `window-hotkey`]),
    `window-initialized`: WindowEvent[Topic, `window-initialized`],
    `window-layout-initialized`: WindowEvent[Topic, `window-layout-initialized`],
    `window-layout-ready`: WindowEvent[Topic, `window-layout-ready`],
    `window-maximized`: WindowEvent[Topic, `window-maximized`],
    `window-minimized`: WindowEvent[Topic, `window-minimized`],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, `window-navigation-rejected`],
    `window-options-changed`: WindowOptionsChangedEvent[Topic, `window-options-changed`],
    `window-performance-report`: WindowPerformanceReport[Topic, `window-performance-report`],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, `window-preload-scripts-state-changed`],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, `window-preload-scripts-state-changing`],
    `window-reloaded`: WindowReloadedEvent[Topic, `window-reloaded`],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, `window-resource-load-failed`],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, `window-resource-response-received`],
    `window-restored`: WindowEvent[Topic, `window-restored`],
    `window-shown`: WindowEvent[Topic, `window-shown`],
    `window-user-movement-disabled`: WindowEvent[Topic, `window-user-movement-disabled`],
    `window-user-movement-enabled`: WindowEvent[Topic, `window-user-movement-enabled`],
    `window-will-move`: WillMoveOrResize[Topic, `window-will-move`],
    `window-will-resize`: WillMoveOrResize[Topic, `window-will-resize`]
  ): PropagatedWindowEvents[Topic] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("window-begin-user-bounds-changing")(`window-begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-blurred")(`window-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changed")(`window-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changing")(`window-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closed")(`window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closing")(`window-closing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-crashed")(`window-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changed")(`window-disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changing")(`window-disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-embedded")(`window-embedded`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("window-options-changed")(`window-options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changed")(`window-preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changing")(`window-preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-reloaded")(`window-reloaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-load-failed")(`window-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-response-received")(`window-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-restored")(`window-restored`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-shown")(`window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-disabled")(`window-user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-enabled")(`window-user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-move")(`window-will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-resize")(`window-will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedWindowEvents[Topic]]
  }
}

