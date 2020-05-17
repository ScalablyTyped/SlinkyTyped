package typingsSlinky.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/map/digger.Options> */
@js.native
trait PartialOptionsCorridorLength extends js.Object {
  var corridorLength: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var dugPercentage: js.UndefOr[Double] = js.native
  var roomHeight: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var roomWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var timeLimit: js.UndefOr[Double] = js.native
}

object PartialOptionsCorridorLength {
  @scala.inline
  def apply(): PartialOptionsCorridorLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsCorridorLength]
  }
  @scala.inline
  implicit class PartialOptionsCorridorLengthOps[Self <: PartialOptionsCorridorLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorridorLength(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corridorLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorridorLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corridorLength")(js.undefined)
        ret
    }
    @scala.inline
    def withDugPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dugPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDugPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dugPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomHeight(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomWidth(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(js.undefined)
        ret
    }
  }
  
}

