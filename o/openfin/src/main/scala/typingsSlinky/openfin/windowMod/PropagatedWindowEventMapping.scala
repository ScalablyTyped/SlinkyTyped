package typingsSlinky.openfin.windowMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropagatedWindowEventMapping[Topic, Type] extends BaseEventMap {
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type] = js.native
  var `window-blurred`: WindowEvent[Topic, Type] = js.native
  var `window-bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  var `window-bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  var `window-closed`: WindowEvent[Topic, Type] = js.native
  var `window-closing`: WindowEvent[Topic, Type] = js.native
  var `window-crashed`: CrashedEvent with (WindowEvent[Topic, Type]) = js.native
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type] = js.native
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type] = js.native
  var `window-embedded`: WindowEvent[Topic, Type] = js.native
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type] = js.native
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type] = js.native
  var `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, Type] = js.native
  var `window-focused`: WindowEvent[Topic, Type] = js.native
  var `window-group-changed`: WindowGroupChanged[Topic, Type] = js.native
  var `window-hidden`: WindowHiddenEvent[Topic, Type] = js.native
  var `window-initialized`: WindowEvent[Topic, Type] = js.native
  var `window-maximized`: WindowEvent[Topic, Type] = js.native
  var `window-minimized`: WindowEvent[Topic, Type] = js.native
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type] = js.native
  var `window-options-changed`: WindowOptionsChangedEvent[Topic, Type] = js.native
  var `window-performance-report`: WindowPerformanceReport[Topic, Type] = js.native
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type] = js.native
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, Type] = js.native
  var `window-reloaded`: WindowReloadedEvent[Topic, Type] = js.native
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type] = js.native
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type] = js.native
  var `window-restored`: WindowEvent[Topic, Type] = js.native
  var `window-shown`: WindowEvent[Topic, Type] = js.native
  var `window-user-movement-disabled`: WindowEvent[Topic, Type] = js.native
  var `window-user-movement-enabled`: WindowEvent[Topic, Type] = js.native
  var `window-will-move`: WillMoveOrResize[Topic, Type] = js.native
  var `window-will-resize`: WillMoveOrResize[Topic, Type] = js.native
}

object PropagatedWindowEventMapping {
  @scala.inline
  def apply[Topic, Type](
    listenerRemoved: String,
    newListener: String,
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    `window-blurred`: WindowEvent[Topic, Type],
    `window-bounds-changed`: WindowBoundsChange[Topic, Type],
    `window-bounds-changing`: WindowBoundsChange[Topic, Type],
    `window-closed`: WindowEvent[Topic, Type],
    `window-closing`: WindowEvent[Topic, Type],
    `window-crashed`: CrashedEvent with (WindowEvent[Topic, Type]),
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type],
    `window-embedded`: WindowEvent[Topic, Type],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type],
    `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, Type],
    `window-focused`: WindowEvent[Topic, Type],
    `window-group-changed`: WindowGroupChanged[Topic, Type],
    `window-hidden`: WindowHiddenEvent[Topic, Type],
    `window-initialized`: WindowEvent[Topic, Type],
    `window-maximized`: WindowEvent[Topic, Type],
    `window-minimized`: WindowEvent[Topic, Type],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    `window-options-changed`: WindowOptionsChangedEvent[Topic, Type],
    `window-performance-report`: WindowPerformanceReport[Topic, Type],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, Type],
    `window-reloaded`: WindowReloadedEvent[Topic, Type],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type],
    `window-restored`: WindowEvent[Topic, Type],
    `window-shown`: WindowEvent[Topic, Type],
    `window-user-movement-disabled`: WindowEvent[Topic, Type],
    `window-user-movement-enabled`: WindowEvent[Topic, Type],
    `window-will-move`: WillMoveOrResize[Topic, Type],
    `window-will-resize`: WillMoveOrResize[Topic, Type]
  ): PropagatedWindowEventMapping[Topic, Type] = {
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
    __obj.asInstanceOf[PropagatedWindowEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class PropagatedWindowEventMappingOps[Self[topic, `type`] <: PropagatedWindowEventMapping[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def `withWindow-begin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-begin-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-blurred`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-blurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-bounds-changed`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-bounds-changing`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-closed`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-closing`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-closing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-crashed`(value: CrashedEvent with (WindowEvent[Topic, Type])): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-disabled-movement-bounds-changed`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-disabled-movement-bounds-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-disabled-movement-bounds-changing`(value: WindowBoundsChange[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-disabled-movement-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-embedded`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-end-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-end-user-bounds-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-external-process-exited`(value: WindowExternalProcessExitedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-external-process-exited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-external-process-started`(value: WindowExternalProcessStartedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-external-process-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-focused`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-group-changed`(value: WindowGroupChanged[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-group-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-hidden`(value: WindowHiddenEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-initialized`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-maximized`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-maximized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-minimized`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-minimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-navigation-rejected`(value: WindowNavigationRejectedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-options-changed`(value: WindowOptionsChangedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-options-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-performance-report`(value: WindowPerformanceReport[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-performance-report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-preload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-preload-scripts-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-preload-scripts-state-changing`(value: WindowPreloadScriptsStateChangedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-preload-scripts-state-changing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-reloaded`(value: WindowReloadedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-reloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-resource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-resource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-restored`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-restored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-shown`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-user-movement-disabled`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-user-movement-disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-user-movement-enabled`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-user-movement-enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-will-move`(value: WillMoveOrResize[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-will-move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-will-resize`(value: WillMoveOrResize[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-will-resize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

