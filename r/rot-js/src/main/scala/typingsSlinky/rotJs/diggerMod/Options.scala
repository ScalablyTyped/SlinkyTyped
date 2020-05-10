package typingsSlinky.rotJs.diggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var corridorLength: js.Tuple2[Double, Double] = js.native
  var dugPercentage: Double = js.native
  var roomHeight: js.Tuple2[Double, Double] = js.native
  var roomWidth: js.Tuple2[Double, Double] = js.native
  var timeLimit: Double = js.native
}

object Options {
  @scala.inline
  def apply(
    corridorLength: js.Tuple2[Double, Double],
    dugPercentage: Double,
    roomHeight: js.Tuple2[Double, Double],
    roomWidth: js.Tuple2[Double, Double],
    timeLimit: Double
  ): Options = {
    val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any], dugPercentage = dugPercentage.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withDugPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dugPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomHeight(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoomWidth(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

