package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveCallbackResult extends js.Object {
  /** 目标边界 */
  var boundingClientRect: BoundingClientRectResult = js.native
  /** 相交比例 */
  var intersectionRatio: Double = js.native
  /** 相交区域的边界 */
  var intersectionRect: IntersectionRectResult = js.native
  /** 参照区域的边界 */
  var relativeRect: RelativeRectResult = js.native
  /** 相交检测时的时间戳 */
  var time: Double = js.native
}

object ObserveCallbackResult {
  @scala.inline
  def apply(
    boundingClientRect: BoundingClientRectResult,
    intersectionRatio: Double,
    intersectionRect: IntersectionRectResult,
    relativeRect: RelativeRectResult,
    time: Double
  ): ObserveCallbackResult = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveCallbackResult]
  }
  @scala.inline
  implicit class ObserveCallbackResultOps[Self <: ObserveCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingClientRect(value: BoundingClientRectResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingClientRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersectionRect(value: IntersectionRectResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeRect(value: RelativeRectResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

