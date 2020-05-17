package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a docking event. */
@js.native
trait DockingEvent extends EventObject {
  /** specifies the current mouse position in frame coordinates */
  var MousePos: Point = js.native
  /** specifies the current tracking rectangle */
  var TrackingRectangle: Rectangle = js.native
  /**
    * specifies if the docking procedure is interactive which means that the user is currently dragging the window to a new position if this member is
    * `FALSE` the window will be docked or undocked immediately using the returned tracking rectangle
    */
  var bInteractive: Boolean = js.native
  /** specifies if the layout should be adjusted immediately */
  var bLiveMode: Boolean = js.native
}

object DockingEvent {
  @scala.inline
  def apply(
    MousePos: Point,
    Source: XInterface,
    TrackingRectangle: Rectangle,
    bInteractive: Boolean,
    bLiveMode: Boolean
  ): DockingEvent = {
    val __obj = js.Dynamic.literal(MousePos = MousePos.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], TrackingRectangle = TrackingRectangle.asInstanceOf[js.Any], bInteractive = bInteractive.asInstanceOf[js.Any], bLiveMode = bLiveMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockingEvent]
  }
  @scala.inline
  implicit class DockingEventOps[Self <: DockingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMousePos(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MousePos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackingRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bInteractive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLiveMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bLiveMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

