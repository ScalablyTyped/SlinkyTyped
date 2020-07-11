package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeTouchEvent extends js.Object {
  /**
    * Array of all touch events that have changed since the last event
    */
  var changedTouches: js.Array[NativeTouchEvent]
  /**
    * The ID of the touch
    */
  var identifier: String
  /**
    * The X position of the touch, relative to the element
    */
  var locationX: Double
  /**
    * The Y position of the touch, relative to the element
    */
  var locationY: Double
  /**
    * The X position of the touch, relative to the screen
    */
  var pageX: Double
  /**
    * The Y position of the touch, relative to the screen
    */
  var pageY: Double
  /**
    * The node id of the element receiving the touch event
    */
  var target: String
  /**
    * A time identifier for the touch, useful for velocity calculation
    */
  var timestamp: Double
  /**
    * Array of all current touches on the screen
    */
  var touches: js.Array[NativeTouchEvent]
}

object NativeTouchEvent {
  @scala.inline
  def apply(
    changedTouches: js.Array[NativeTouchEvent],
    identifier: String,
    locationX: Double,
    locationY: Double,
    pageX: Double,
    pageY: Double,
    target: String,
    timestamp: Double,
    touches: js.Array[NativeTouchEvent]
  ): NativeTouchEvent = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], locationX = locationX.asInstanceOf[js.Any], locationY = locationY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeTouchEvent]
  }
  @scala.inline
  implicit class NativeTouchEventOps[Self <: NativeTouchEvent] (val x: Self) extends AnyVal {
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
    def setChangedTouchesVarargs(value: NativeTouchEvent*): Self = this.set("changedTouches", js.Array(value :_*))
    @scala.inline
    def setChangedTouches(value: js.Array[NativeTouchEvent]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationX(value: Double): Self = this.set("locationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationY(value: Double): Self = this.set("locationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchesVarargs(value: NativeTouchEvent*): Self = this.set("touches", js.Array(value :_*))
    @scala.inline
    def setTouches(value: js.Array[NativeTouchEvent]): Self = this.set("touches", value.asInstanceOf[js.Any])
  }
  
}

