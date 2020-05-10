package typingsSlinky.openfin.systemMod

import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import typingsSlinky.openfin.eventsBaseMod.BaseEvent
import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemEventMapping[Topic, Type] extends BaseEventMap {
  var `application-created`: ApplicationEvent[Topic, Type] = js.native
  var `desktop-icon-clicked`: ApplicationEvent[Topic, Type] = js.native
  var `external-window-closed`: BaseEvent[Topic, Type] = js.native
  var `external-window-created`: BaseEvent[Topic, Type] = js.native
  var `external-window-hidden`: BaseEvent[Topic, Type] = js.native
  var `external-window-shown`: BaseEvent[Topic, Type] = js.native
  var `idle-state-changed`: IdleEvent[Topic, Type] = js.native
  var `monitor-info-changed`: MonitorEvent[Topic, Type] = js.native
  var `session-changed`: SessionChangedEvent[Topic, Type] = js.native
}

object SystemEventMapping {
  @scala.inline
  def apply[Topic, Type](
    `application-created`: ApplicationEvent[Topic, Type],
    `desktop-icon-clicked`: ApplicationEvent[Topic, Type],
    `external-window-closed`: BaseEvent[Topic, Type],
    `external-window-created`: BaseEvent[Topic, Type],
    `external-window-hidden`: BaseEvent[Topic, Type],
    `external-window-shown`: BaseEvent[Topic, Type],
    `idle-state-changed`: IdleEvent[Topic, Type],
    listenerRemoved: String,
    `monitor-info-changed`: MonitorEvent[Topic, Type],
    newListener: String,
    `session-changed`: SessionChangedEvent[Topic, Type]
  ): SystemEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("application-created")(`application-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("desktop-icon-clicked")(`desktop-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-closed")(`external-window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-created")(`external-window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-hidden")(`external-window-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-shown")(`external-window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("idle-state-changed")(`idle-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("monitor-info-changed")(`monitor-info-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("session-changed")(`session-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class SystemEventMappingOps[Self[topic, `type`] <: SystemEventMapping[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def `withApplication-created`(value: ApplicationEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDesktop-icon-clicked`(value: ApplicationEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop-icon-clicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-closed`(value: BaseEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-created`(value: BaseEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-hidden`(value: BaseEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withExternal-window-shown`(value: BaseEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external-window-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withIdle-state-changed`(value: IdleEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idle-state-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonitor-info-changed`(value: MonitorEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor-info-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSession-changed`(value: SessionChangedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session-changed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

