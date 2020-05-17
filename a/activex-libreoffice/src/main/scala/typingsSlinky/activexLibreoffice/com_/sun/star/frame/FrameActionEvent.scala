package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this event struct is broadcast for actions which can happen to components within frames
  * @see XFrameActionListener
  */
@js.native
trait FrameActionEvent extends EventObject {
  /** specifies the concrete event */
  var Action: FrameAction = js.native
  /** contains the frame in which the event occurred */
  var Frame: XFrame = js.native
}

object FrameActionEvent {
  @scala.inline
  def apply(Action: FrameAction, Frame: XFrame, Source: XInterface): FrameActionEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameActionEvent]
  }
  @scala.inline
  implicit class FrameActionEventOps[Self <: FrameActionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: FrameAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: XFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

