package typingsSlinky.openfin.eventsApplicationMod

import typingsSlinky.openfin.eventsBaseMod.ApplicationEvent
import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.`application-closed`
import typingsSlinky.openfin.openfinStrings.`application-connected`
import typingsSlinky.openfin.openfinStrings.`application-crashed`
import typingsSlinky.openfin.openfinStrings.`application-initialized`
import typingsSlinky.openfin.openfinStrings.`application-manifest-changed`
import typingsSlinky.openfin.openfinStrings.`application-not-responding`
import typingsSlinky.openfin.openfinStrings.`application-responding`
import typingsSlinky.openfin.openfinStrings.`application-started`
import typingsSlinky.openfin.openfinStrings.`application-tray-icon-clicked`
import typingsSlinky.openfin.openfinStrings.`window-created`
import typingsSlinky.openfin.openfinStrings.`window-did-change-theme-color`
import typingsSlinky.openfin.openfinStrings.`window-end-load`
import typingsSlinky.openfin.openfinStrings.`window-not-responding`
import typingsSlinky.openfin.openfinStrings.`window-page-favicon-updated`
import typingsSlinky.openfin.openfinStrings.`window-page-title-updated`
import typingsSlinky.openfin.openfinStrings.`window-performance-report`
import typingsSlinky.openfin.openfinStrings.`window-responding`
import typingsSlinky.openfin.openfinStrings.`window-start-load`
import typingsSlinky.openfin.windowMod.WindowEndLoadEvent
import typingsSlinky.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<Topic, Type>[Type]} */
@js.native
trait PropagatedApplicationEvents[Topic] extends js.Object {
  var `application-closed`: ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-closed`] = js.native
  var `application-connected`: ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-connected`] = js.native
  var `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-crashed`]) = js.native
  var `application-initialized`: ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-initialized`] = js.native
  var `application-manifest-changed`: ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-manifest-changed`] = js.native
  var `application-not-responding`: ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-not-responding`] = js.native
  var `application-responding`: ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-responding`] = js.native
  var `application-started`: ApplicationEvent[Topic, typingsSlinky.openfin.openfinStrings.`application-started`] = js.native
  var `application-tray-icon-clicked`: TrayIconClicked[Topic, typingsSlinky.openfin.openfinStrings.`application-tray-icon-clicked`] = js.native
  var `window-created`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-created`] = js.native
  var `window-did-change-theme-color`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-did-change-theme-color`] = js.native
  var `window-end-load`: WindowEndLoadEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-end-load`] = js.native
  var `window-not-responding`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-not-responding`] = js.native
  var `window-page-favicon-updated`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-page-favicon-updated`] = js.native
  var `window-page-title-updated`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-page-title-updated`] = js.native
  var `window-performance-report`: WindowPerformanceReport[Topic, typingsSlinky.openfin.openfinStrings.`window-performance-report`] = js.native
  var `window-responding`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-responding`] = js.native
  var `window-start-load`: WindowEvent[Topic, typingsSlinky.openfin.openfinStrings.`window-start-load`] = js.native
}

object PropagatedApplicationEvents {
  @scala.inline
  def apply[Topic](
    `application-closed`: ApplicationEvent[Topic, `application-closed`],
    `application-connected`: ApplicationEvent[Topic, `application-connected`],
    `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, `application-crashed`]),
    `application-initialized`: ApplicationEvent[Topic, `application-initialized`],
    `application-manifest-changed`: ApplicationEvent[Topic, `application-manifest-changed`],
    `application-not-responding`: ApplicationEvent[Topic, `application-not-responding`],
    `application-responding`: ApplicationEvent[Topic, `application-responding`],
    `application-started`: ApplicationEvent[Topic, `application-started`],
    `application-tray-icon-clicked`: TrayIconClicked[Topic, `application-tray-icon-clicked`],
    `window-created`: WindowEvent[Topic, `window-created`],
    `window-did-change-theme-color`: WindowEvent[Topic, `window-did-change-theme-color`],
    `window-end-load`: WindowEndLoadEvent[Topic, `window-end-load`],
    `window-not-responding`: WindowEvent[Topic, `window-not-responding`],
    `window-page-favicon-updated`: WindowEvent[Topic, `window-page-favicon-updated`],
    `window-page-title-updated`: WindowEvent[Topic, `window-page-title-updated`],
    `window-performance-report`: WindowPerformanceReport[Topic, `window-performance-report`],
    `window-responding`: WindowEvent[Topic, `window-responding`],
    `window-start-load`: WindowEvent[Topic, `window-start-load`]
  ): PropagatedApplicationEvents[Topic] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application-closed")(`application-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-connected")(`application-connected`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-crashed")(`application-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-initialized")(`application-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-manifest-changed")(`application-manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-not-responding")(`application-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-responding")(`application-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-started")(`application-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-tray-icon-clicked")(`application-tray-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedApplicationEvents[Topic]]
  }
  @scala.inline
  implicit class PropagatedApplicationEventsOps[Self[topic] <: PropagatedApplicationEvents[topic], Topic] (val x: Self[Topic]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Topic] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Topic] with Other]
    @scala.inline
    def `withApplication-closed`(value: ApplicationEvent[Topic, `application-closed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-closed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-connected`(value: ApplicationEvent[Topic, `application-connected`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-crashed`(value: CrashedEvent with (ApplicationEvent[Topic, `application-crashed`])): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-crashed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-initialized`(value: ApplicationEvent[Topic, `application-initialized`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-manifest-changed`(value: ApplicationEvent[Topic, `application-manifest-changed`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-manifest-changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-not-responding`(value: ApplicationEvent[Topic, `application-not-responding`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-not-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-responding`(value: ApplicationEvent[Topic, `application-responding`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-started`(value: ApplicationEvent[Topic, `application-started`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withApplication-tray-icon-clicked`(value: TrayIconClicked[Topic, `application-tray-icon-clicked`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application-tray-icon-clicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-created`(value: WindowEvent[Topic, `window-created`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-did-change-theme-color`(value: WindowEvent[Topic, `window-did-change-theme-color`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-did-change-theme-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-end-load`(value: WindowEndLoadEvent[Topic, `window-end-load`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-end-load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-not-responding`(value: WindowEvent[Topic, `window-not-responding`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-not-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-page-favicon-updated`(value: WindowEvent[Topic, `window-page-favicon-updated`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-page-favicon-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-page-title-updated`(value: WindowEvent[Topic, `window-page-title-updated`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-page-title-updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-performance-report`(value: WindowPerformanceReport[Topic, `window-performance-report`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-performance-report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-responding`(value: WindowEvent[Topic, `window-responding`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-responding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWindow-start-load`(value: WindowEvent[Topic, `window-start-load`]): Self[Topic] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window-start-load")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

