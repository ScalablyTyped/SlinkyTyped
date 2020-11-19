package typingsSlinky.reactSwipeable.mod

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.reactSwipeable.reactSwipeableStrings.Down
import typingsSlinky.reactSwipeable.reactSwipeableStrings.Left
import typingsSlinky.reactSwipeable.reactSwipeableStrings.Right
import typingsSlinky.reactSwipeable.reactSwipeableStrings.Up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventData extends js.Object {
  
  var absX: Double = js.native
  
  var absY: Double = js.native
  
  var deltaX: Double = js.native
  
  var deltaY: Double = js.native
  
  var dir: Left | Right | Up | Down = js.native
  
  var event: MouseEvent | TouchEvent = js.native
  
  var first: Boolean = js.native
  
  var initial: Vector2 = js.native
  
  var velocity: Double = js.native
}
object EventData {
  
  @scala.inline
  def apply(
    absX: Double,
    absY: Double,
    deltaX: Double,
    deltaY: Double,
    dir: Left | Right | Up | Down,
    event: MouseEvent | TouchEvent,
    first: Boolean,
    initial: Vector2,
    velocity: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbsX(value: Double): Self = this.set("absX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsY(value: Double): Self = this.set("absY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: Left | Right | Up | Down): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventMouseEvent(value: MouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTouchEvent(value: TouchEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent | TouchEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(value: Vector2): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
}
