package typingsSlinky.echarts.echarts

import typingsSlinky.zrender.zrender.LinearGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graphic extends js.Object {
  /**
    * x, y, x2, y2 are all percent from 0 to 1
    */
  var LinearGradient: typingsSlinky.zrender.zrender.LinearGradient = js.native
  /**
    * Clip the given points by the given rectangular.
    *
    * @param {number[][]} points The points to be clipped,
    *     like [[23, 44], [12, 15], ...].
    * @param {ERectangle} rect The rectangular that is used to clip points.
    */
  def clipPointsByRect(points: js.Array[js.Array[Double]], rect: ERectangle): js.Array[js.Array[Double]] = js.native
  /**
    * Clip the first input rectangular by the second input rectangular.
    *
    * @param {ERectangle} targetRect The rectangular to be clipped.
    * @param {ERectangle} rect The rectangular that is used to clip
    *     targetRect.
    */
  def clipRectByRect(targetRect: ERectangle, rect: ERectangle): ERectangle = js.native
}

object Graphic {
  @scala.inline
  def apply(
    LinearGradient: LinearGradient,
    clipPointsByRect: (js.Array[js.Array[Double]], ERectangle) => js.Array[js.Array[Double]],
    clipRectByRect: (ERectangle, ERectangle) => ERectangle
  ): Graphic = {
    val __obj = js.Dynamic.literal(LinearGradient = LinearGradient.asInstanceOf[js.Any], clipPointsByRect = js.Any.fromFunction2(clipPointsByRect), clipRectByRect = js.Any.fromFunction2(clipRectByRect))
    __obj.asInstanceOf[Graphic]
  }
  @scala.inline
  implicit class GraphicOps[Self <: Graphic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinearGradient(value: LinearGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinearGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClipPointsByRect(value: (js.Array[js.Array[Double]], ERectangle) => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPointsByRect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClipRectByRect(value: (ERectangle, ERectangle) => ERectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipRectByRect")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

