package typingsSlinky.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultLinkObject extends js.Object {
  /**
    * Source node of the link.
    *
    * For a link in a Cartesian coordinate system, the two element array contains
    * the coordinates [x, y].
    *
    * For a radial link, the two element array contains
    * the coordinates [angle, radius]. The angle is stated in radians, with 0 at -y (12 o’clock).
    * The radius measures the distance from the origin ⟨0,0⟩.
    */
  var source: js.Tuple2[Double, Double] = js.native
  /**
    * Target node of the link.
    *
    * For a link in a Cartesian coordinate system, the two element array contains
    * the coordinates [x, y].
    *
    * For a radial link, the two element array contains
    * the coordinates [angle, radius]. The angle is stated in radians, with 0 at -y (12 o’clock).
    * The radius measures the distance from the origin ⟨0,0⟩.
    */
  var target: js.Tuple2[Double, Double] = js.native
}

object DefaultLinkObject {
  @scala.inline
  def apply(source: js.Tuple2[Double, Double], target: js.Tuple2[Double, Double]): DefaultLinkObject = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLinkObject]
  }
  @scala.inline
  implicit class DefaultLinkObjectOps[Self <: DefaultLinkObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

