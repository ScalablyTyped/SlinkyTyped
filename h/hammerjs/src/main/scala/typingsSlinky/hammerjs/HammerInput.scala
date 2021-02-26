package typingsSlinky.hammerjs

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HammerInput extends StObject {
  
  /** Angle moved. */
  var angle: Double = js.native
  
  /** Center position for multi-touch, or just the single pointer. */
  var center: HammerPoint = js.native
  
  /** Array with all new/moved/lost pointers. */
  var changedPointers: js.Array[_] = js.native
  
  /** Total time in ms since the first input. */
  var deltaTime: Double = js.native
  
  /** Movement of the X axis. */
  var deltaX: Double = js.native
  
  /** Movement of the Y axis. */
  var deltaY: Double = js.native
  
  def destroy(): Unit = js.native
  
  /** Direction moved. Matches the DIRECTION constants. */
  var direction: Double = js.native
  
  /** Distance moved. */
  var distance: Double = js.native
  
  /** Event type, matches the INPUT constants. */
  var eventType: Double = js.native
  
  def handler(): Unit = js.native
  
  def init(): Unit = js.native
  
  /** true when the final (last) input. */
  var isFinal: Boolean = js.native
  
  /** true when the first input. */
  var isFirst: Boolean = js.native
  
  /** Direction moved from it's starting point. Matches the DIRECTION constants. */
  var offsetDirection: Double = js.native
  
  /** Primary pointer type, could be touch, mouse, pen or kinect. */
  var pointerType: String = js.native
  
  /** Array with all pointers, including the ended pointers (touchend, mouseup). */
  var pointers: js.Array[_] = js.native
  
  /** Reference to the srcEvent.preventDefault() method. Only for experts! */
  var preventDefault: js.Function = js.native
  
  /** Rotation that has been done when multi-touch. 0 on a single touch. */
  var rotation: Double = js.native
  
  /** Scaling that has been done when multi-touch. 1 on a single touch. */
  var scale: Double = js.native
  
  /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
  var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
  
  /** Target that received the event. */
  var target: HTMLElement = js.native
  
  /** Name of the event. Like panstart. */
  var `type`: String = js.native
  
  /** Highest velocityX/Y value. */
  var velocity: Double = js.native
  
  /** Velocity on the X axis, in px/ms. */
  var velocityX: Double = js.native
  
  /** Velocity on the Y axis, in px/ms */
  var velocityY: Double = js.native
}
object HammerInput {
  
  @scala.inline
  def apply(
    angle: Double,
    center: HammerPoint,
    changedPointers: js.Array[_],
    deltaTime: Double,
    deltaX: Double,
    deltaY: Double,
    destroy: () => Unit,
    direction: Double,
    distance: Double,
    eventType: Double,
    handler: () => Unit,
    init: () => Unit,
    isFinal: Boolean,
    isFirst: Boolean,
    offsetDirection: Double,
    pointerType: String,
    pointers: js.Array[_],
    preventDefault: js.Function,
    rotation: Double,
    scale: Double,
    srcEvent: TouchEvent | MouseEvent | PointerEvent,
    target: HTMLElement,
    `type`: String,
    velocity: Double,
    velocityX: Double,
    velocityY: Double
  ): HammerInput = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], changedPointers = changedPointers.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], handler = js.Any.fromFunction0(handler), init = js.Any.fromFunction0(init), isFinal = isFinal.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], offsetDirection = offsetDirection.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerInput]
  }
  
  @scala.inline
  implicit class HammerInputMutableBuilder[Self <: HammerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: HammerPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedPointers(value: js.Array[_]): Self = StObject.set(x, "changedPointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedPointersVarargs(value: js.Any*): Self = StObject.set(x, "changedPointers", js.Array(value :_*))
    
    @scala.inline
    def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: Double): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFinal(value: Boolean): Self = StObject.set(x, "isFinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDirection(value: Double): Self = StObject.set(x, "offsetDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointers(value: js.Array[_]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointersVarargs(value: js.Any*): Self = StObject.set(x, "pointers", js.Array(value :_*))
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcEvent(value: TouchEvent | MouseEvent | PointerEvent): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcEventMouseEvent(value: MouseEvent): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcEventPointerEvent(value: PointerEvent): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcEventTouchEvent(value: TouchEvent): Self = StObject.set(x, "srcEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
  }
}
