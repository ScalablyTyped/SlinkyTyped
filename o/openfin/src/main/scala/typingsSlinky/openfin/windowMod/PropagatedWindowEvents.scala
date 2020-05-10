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
import typingsSlinky.openfin.openfinStrings.`window-initialized`
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
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/window.PropagatedWindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/window.PropagatedWindowEventMapping<Topic, Type>[Type]} */
@js.native
trait PropagatedWindowEvents[Topic] extends js.Object {
  var listenerRemoved: String = js.native
  var newListener: String = js.native
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-begin-user-bounds-changing`] = js.native
  var `window-blurred`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-blurred`] = js.native
  var `window-bounds-changed`: WindowBoundsChange[Topic, typingsSlinky.openfin.openfinStrings.`window-bounds-changed`] = js.native
  var `window-bounds-changing`: WindowBoundsChange[Topic, typingsSlinky.openfin.openfinStrings.`window-bounds-changing`] = js.native
  var `window-closed`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-closed`] = js.native
  var `window-closing`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-closing`] = js.native
  var `window-crashed`: CrashedEvent with (WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-crashed`]) = js.native
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
    Topic, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
  ] = js.native
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
    Topic, 
    typingsSlinky.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
  ] = js.native
  var `window-embedded`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-embedded`] = js.native
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-end-user-bounds-changing`] = js.native
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-external-process-exited`] = js.native
  var `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-external-process-started`] = js.native
  var `window-focused`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-focused`] = js.native
  var `window-group-changed`: WindowGroupChanged[Topic, typingsSlinky.openfin.openfinStrings.`window-group-changed`] = js.native
  var `window-hidden`: WindowHiddenEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-hidden`] = js.native
  var `window-initialized`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-initialized`] = js.native
  var `window-maximized`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-maximized`] = js.native
  var `window-minimized`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-minimized`] = js.native
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-navigation-rejected`] = js.native
  var `window-options-changed`: WindowOptionsChangedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-options-changed`] = js.native
  var `window-performance-report`: WindowPerformanceReport[Topic, typingsSlinky.openfin.openfinStrings.`window-performance-report`] = js.native
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changed`] = js.native
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
    Topic, 
    typingsSlinky.openfin.openfinStrings.`window-preload-scripts-state-changing`
  ] = js.native
  var `window-reloaded`: WindowReloadedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-reloaded`] = js.native
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-resource-load-failed`] = js.native
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-resource-response-received`] = js.native
  var `window-restored`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-restored`] = js.native
  var `window-shown`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-shown`] = js.native
  var `window-user-movement-disabled`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-user-movement-disabled`] = js.native
  var `window-user-movement-enabled`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-user-movement-enabled`] = js.native
  var `window-will-move`: WillMoveOrResize[Topic, typingsSlinky.openfin.openfinStrings.`window-will-move`] = js.native
  var `window-will-resize`: WillMoveOrResize[Topic, typingsSlinky.openfin.openfinStrings.`window-will-resize`] = js.native
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
    `window-initialized`: WindowEvent[Topic, `window-initialized`],
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
    __obj.updateDynamic("window-initialized")(`window-initialized`.asInstanceOf[js.Any])
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
  @scala.inline
  implicit class PropagatedWindowEventsOps[Self[topic] <: PropagatedWindowEvents[topic], Topic] (val x: Self[Topic]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Topic] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Topic] with Other]
    @scala.inline
    def withListenerRemoved(value: String): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewListener(value: String): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, `window-begin-user-bounds-changing`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-begin-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-blurred`(value: WindowEvent[Topic, `window-blurred`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-blurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-bounds-changed`(value: WindowBoundsChange[Topic, `window-bounds-changed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-bounds-changing`(value: WindowBoundsChange[Topic, `window-bounds-changing`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-closed`(value: WindowEvent[Topic, `window-closed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-closing`(value: WindowEvent[Topic, `window-closing`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-closing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-crashed`(value: CrashedEvent with (WindowEvent[Topic, `window-crashed`])): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-disabled-movement-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[Topic, `window-disabled-movement-bounds-changing`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-disabled-movement-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-embedded`(value: WindowEvent[Topic, `window-embedded`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, `window-end-user-bounds-changing`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-end-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[Topic, `window-external-process-exited`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-external-process-exited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-external-process-started`(value: WindowExternalProcessStartedEvent[Topic, `window-external-process-started`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-external-process-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-focused`(value: WindowEvent[Topic, `window-focused`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-group-changed`(value: WindowGroupChanged[Topic, `window-group-changed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-group-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-hidden`(value: WindowHiddenEvent[Topic, `window-hidden`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-initialized`(value: WindowEvent[Topic, `window-initialized`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-maximized`(value: WindowEvent[Topic, `window-maximized`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-maximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-minimized`(value: WindowEvent[Topic, `window-minimized`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-minimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[Topic, `window-navigation-rejected`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-options-changed`(value: WindowOptionsChangedEvent[Topic, `window-options-changed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-options-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-performance-report`(value: WindowPerformanceReport[Topic, `window-performance-report`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-performance-report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[Topic, `window-preload-scripts-state-changed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-preload-scripts-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[Topic, `window-preload-scripts-state-changing`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-preload-scripts-state-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-reloaded`(value: WindowReloadedEvent[Topic, `window-reloaded`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-reloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, `window-resource-load-failed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, `window-resource-response-received`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-restored`(value: WindowEvent[Topic, `window-restored`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-shown`(value: WindowEvent[Topic, `window-shown`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-user-movement-disabled`(value: WindowEvent[Topic, `window-user-movement-disabled`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-user-movement-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-user-movement-enabled`(value: WindowEvent[Topic, `window-user-movement-enabled`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-user-movement-enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-will-move`(value: WillMoveOrResize[Topic, `window-will-move`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-will-move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-will-resize`(value: WillMoveOrResize[Topic, `window-will-resize`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-will-resize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

