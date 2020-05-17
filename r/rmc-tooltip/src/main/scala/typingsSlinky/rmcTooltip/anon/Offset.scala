package typingsSlinky.rmcTooltip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offset extends js.Object {
  var offset: js.Array[Double] = js.native
  var overflow: AdjustX = js.native
  var points: js.Array[String] = js.native
  var targetOffset: js.Array[Double] = js.native
}

object Offset {
  @scala.inline
  def apply(
    offset: js.Array[Double],
    overflow: AdjustX,
    points: js.Array[String],
    targetOffset: js.Array[Double]
  ): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  @scala.inline
  implicit class OffsetOps[Self <: Offset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflow(value: AdjustX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetOffset(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

