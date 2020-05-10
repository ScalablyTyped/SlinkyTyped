package typingsSlinky.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GesturePoint extends js.Object {
  var captured: Boolean = js.native
  var contactPos: Point = js.native
  var contactTime: Double = js.native
  var currentPos: Point = js.native
  var currentTime: Double = js.native
  var direction: Double = js.native
  var id: Double = js.native
  var insideElement: Boolean = js.native
  var insideElementPressed: Boolean = js.native
  var isPrimary: Boolean = js.native
  var lastPos: Point = js.native
  var lastTime: Double = js.native
  var speed: Double = js.native
  var `type`: String = js.native
}

object GesturePoint {
  @scala.inline
  def apply(
    captured: Boolean,
    contactPos: Point,
    contactTime: Double,
    currentPos: Point,
    currentTime: Double,
    direction: Double,
    id: Double,
    insideElement: Boolean,
    insideElementPressed: Boolean,
    isPrimary: Boolean,
    lastPos: Point,
    lastTime: Double,
    speed: Double,
    `type`: String
  ): GesturePoint = {
    val __obj = js.Dynamic.literal(captured = captured.asInstanceOf[js.Any], contactPos = contactPos.asInstanceOf[js.Any], contactTime = contactTime.asInstanceOf[js.Any], currentPos = currentPos.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], insideElement = insideElement.asInstanceOf[js.Any], insideElementPressed = insideElementPressed.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], lastPos = lastPos.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GesturePoint]
  }
  @scala.inline
  implicit class GesturePointOps[Self <: GesturePoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactPos(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPos(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideElement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideElementPressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insideElementPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastPos(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

