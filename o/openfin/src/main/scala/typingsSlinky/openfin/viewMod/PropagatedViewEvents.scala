package typingsSlinky.openfin.viewMod

import typingsSlinky.openfin.eventsApplicationMod.CrashedEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
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
import typingsSlinky.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsSlinky.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsSlinky.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<Topic, Type>[Type]} */
@js.native
trait PropagatedViewEvents[Topic] extends js.Object {
  var listenerRemoved: String = js.native
  var newListener: String = js.native
  var `view-crashed`: CrashedEvent with (WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-crashed`]) = js.native
  var `view-created`: CrashedEvent with (WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-created`]) = js.native
  var `view-destroyed`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-destroyed`] = js.native
  var `view-did-change-theme-color`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-did-change-theme-color`] = js.native
  var `view-hidden`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-hidden`] = js.native
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-navigation-rejected`] = js.native
  var `view-page-favicon-updated`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-page-favicon-updated`] = js.native
  var `view-page-title-updated`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-page-title-updated`] = js.native
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-resource-load-failed`] = js.native
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-resource-response-received`] = js.native
  var `view-shown`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-shown`] = js.native
  var `view-target-changed`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`view-target-changed`] = js.native
}

object PropagatedViewEvents {
  @scala.inline
  def apply[Topic](
    listenerRemoved: String,
    newListener: String,
    `view-crashed`: CrashedEvent with (WindowEvent[Topic, `view-crashed`]),
    `view-created`: CrashedEvent with (WindowEvent[Topic, `view-created`]),
    `view-destroyed`: WindowEvent[Topic, `view-destroyed`],
    `view-did-change-theme-color`: WindowEvent[Topic, `view-did-change-theme-color`],
    `view-hidden`: WindowEvent[Topic, `view-hidden`],
    `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`],
    `view-page-favicon-updated`: WindowEvent[Topic, `view-page-favicon-updated`],
    `view-page-title-updated`: WindowEvent[Topic, `view-page-title-updated`],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`],
    `view-shown`: WindowEvent[Topic, `view-shown`],
    `view-target-changed`: WindowEvent[Topic, `view-target-changed`]
  ): PropagatedViewEvents[Topic] = {
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
    __obj.asInstanceOf[PropagatedViewEvents[Topic]]
  }
  @scala.inline
  implicit class PropagatedViewEventsOps[Self[topic] <: PropagatedViewEvents[topic], Topic] (val x: Self[Topic]) extends AnyVal {
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
    def `withView-crashed`(value: CrashedEvent with (WindowEvent[Topic, `view-crashed`])): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-created`(value: CrashedEvent with (WindowEvent[Topic, `view-created`])): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-destroyed`(value: WindowEvent[Topic, `view-destroyed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-did-change-theme-color`(value: WindowEvent[Topic, `view-did-change-theme-color`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-hidden`(value: WindowEvent[Topic, `view-hidden`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-navigation-rejected`(value: WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-navigation-rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-favicon-updated`(value: WindowEvent[Topic, `view-page-favicon-updated`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-page-title-updated`(value: WindowEvent[Topic, `view-page-title-updated`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-load-failed`(value: WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-load-failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-resource-response-received`(value: WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-resource-response-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-shown`(value: WindowEvent[Topic, `view-shown`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withView-target-changed`(value: WindowEvent[Topic, `view-target-changed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view-target-changed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

