package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class FrameActionEventMutableBuilder[Self <: FrameActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: FrameAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: XFrame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
  }
}
