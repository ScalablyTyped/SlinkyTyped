package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapControlEvent extends js.Object {
  var center: Center = js.native
  var delta: js.UndefOr[Double] = js.native
  var key: js.UndefOr[Double] = js.native
  var leftButton: js.UndefOr[Boolean] = js.native
  var middleButton: js.UndefOr[Boolean] = js.native
  var offsetCenter: Center = js.native
  var pointerType: js.UndefOr[String] = js.native
  var rightButton: js.UndefOr[Boolean] = js.native
  var srcEvent: js.Any = js.native
  var target: js.Any = js.native
  var `type`: String = js.native
}

object MapControlEvent {
  @scala.inline
  def apply(center: Center, offsetCenter: Center, srcEvent: js.Any, target: js.Any, `type`: String): MapControlEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], offsetCenter = offsetCenter.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControlEvent]
  }
  @scala.inline
  implicit class MapControlEventOps[Self <: MapControlEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: Center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetCenter(value: Center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
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
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftButton")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddleButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddleButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middleButton")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerType")(js.undefined)
        ret
    }
    @scala.inline
    def withRightButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightButton")(js.undefined)
        ret
    }
  }
  
}

