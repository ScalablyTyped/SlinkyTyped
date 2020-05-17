package typingsSlinky.reactMapGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-map-gl.react-map-gl.PositionInput & {  scale  :number,   startPos ? :[number, number]} */
@js.native
trait PositionInputscalenumbers extends js.Object {
  var pos: js.Tuple2[Double, Double] = js.native
  var scale: Double = js.native
  var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object PositionInputscalenumbers {
  @scala.inline
  def apply(pos: js.Tuple2[Double, Double], scale: Double): PositionInputscalenumbers = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionInputscalenumbers]
  }
  @scala.inline
  implicit class PositionInputscalenumbersOps[Self <: PositionInputscalenumbers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPos(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPos(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPos")(js.undefined)
        ret
    }
  }
  
}

