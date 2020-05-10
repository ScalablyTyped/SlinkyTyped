package typingsSlinky.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var back: Bezier = js.native
  var bbox: BBox = js.native
  var endcap: BezierCap = js.native
  var forward: Bezier = js.native
  var startcap: BezierCap = js.native
  def intersections(shape: Shape): js.Array[js.Array[Double | String]] = js.native
}

object Shape {
  @scala.inline
  def apply(
    back: Bezier,
    bbox: BBox,
    endcap: BezierCap,
    forward: Bezier,
    intersections: Shape => js.Array[js.Array[Double | String]],
    startcap: BezierCap
  ): Shape = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], endcap = endcap.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any], intersections = js.Any.fromFunction1(intersections), startcap = startcap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: Bezier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBbox(value: BBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndcap(value: BezierCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endcap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: Bezier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntersections(value: Shape => js.Array[js.Array[Double | String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersections")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartcap(value: BezierCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startcap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

