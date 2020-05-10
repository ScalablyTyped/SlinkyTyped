package typingsSlinky.openfin.viewMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsSlinky.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropagatedViewEventMapping[Topic, Type] extends BaseEventMap {
  var `view-crashed`: CrashedEvent with (WindowEvent[Topic, Type]) = js.native
  var `view-created`: CrashedEvent with (WindowEvent[Topic, Type]) = js.native
  var `view-destroyed`: WindowEvent[Topic, Type] = js.native
  var `view-did-change-theme-color`: WindowEvent[Topic, Type] = js.native
  var `view-hidden`: WindowEvent[Topic, Type] = js.native
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type] = js.native
  var `view-page-favicon-updated`: WindowEvent[Topic, Type] = js.native
  var `view-page-title-updated`: WindowEvent[Topic, Type] = js.native
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type] = js.native
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type] = js.native
  var `view-shown`: WindowEvent[Topic, Type] = js.native
  var `view-target-changed`: WindowEvent[Topic, Type] = js.native
}

object PropagatedViewEventMapping {
  @scala.inline
  def apply[Topic, Type](
    listenerRemoved: String,
    newListener: String,
    `view-crashed`: CrashedEvent with (WindowEvent[Topic, Type]),
    `view-created`: CrashedEvent with (WindowEvent[Topic, Type]),
    `view-destroyed`: WindowEvent[Topic, Type],
    `view-did-change-theme-color`: WindowEvent[Topic, Type],
    `view-hidden`: WindowEvent[Topic, Type],
    `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    `view-page-favicon-updated`: WindowEvent[Topic, Type],
    `view-page-title-updated`: WindowEvent[Topic, Type],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type],
    `view-shown`: WindowEvent[Topic, Type],
    `view-target-changed`: WindowEvent[Topic, Type]
  ): PropagatedViewEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[PropagatedViewEventMapping[Topic, Type]]
  }
  @scala.inline
  implicit class PropagatedViewEventMappingOps[Self[topic, `type`] <: PropagatedViewEventMapping[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def `withView-crashed`(value: CrashedEvent with (WindowEvent[Topic, Type])): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-created`(value: CrashedEvent with (WindowEvent[Topic, Type])): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-destroyed`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-did-change-theme-color`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-hidden`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-navigation-rejected`(value: WindowNavigationRejectedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-favicon-updated`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-title-updated`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-shown`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-target-changed`(value: WindowEvent[Topic, Type]): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-target-changed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

