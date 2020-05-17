package typingsSlinky.hammerjs

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HammerInput extends js.Object {
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
  /** Direction moved. Matches the DIRECTION constants. */
  var direction: Double = js.native
  /** Distance moved. */
  var distance: Double = js.native
  /** Event type, matches the INPUT constants. */
  var eventType: Double = js.native
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
  def destroy(): Unit = js.native
  def handler(): Unit = js.native
  def init(): Unit = js.native
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
  implicit class HammerInputOps[Self <: HammerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: HammerPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedPointers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFinal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcEventPointerEvent(value: PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcEventMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcEventTouchEvent(value: TouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcEvent(value: TouchEvent | MouseEvent | PointerEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

