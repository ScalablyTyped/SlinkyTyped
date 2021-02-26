package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class DockingEventMutableBuilder[Self <: DockingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBInteractive(value: Boolean): Self = StObject.set(x, "bInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLiveMode(value: Boolean): Self = StObject.set(x, "bLiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePos(value: Point): Self = StObject.set(x, "MousePos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingRectangle(value: Rectangle): Self = StObject.set(x, "TrackingRectangle", value.asInstanceOf[js.Any])
  }
}
