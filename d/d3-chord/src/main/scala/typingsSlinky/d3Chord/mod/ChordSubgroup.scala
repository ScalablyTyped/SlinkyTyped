package typingsSlinky.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChordSubgroup extends js.Object {
  /***
    * End angle of the chord subgroup in radians
    */
  var endAngle: Double = js.native
  /**
    * The node index i
    */
  var index: Double = js.native
  /**
    * Start angle of the chord subgroup in radians
    */
  var startAngle: Double = js.native
  /**
    * The node index j
    */
  var subindex: Double = js.native
  /**
    * The flow value in matrix[i][j] from node i to node j
    */
  var value: Double = js.native
}

object ChordSubgroup {
  @scala.inline
  def apply(endAngle: Double, index: Double, startAngle: Double, subindex: Double, value: Double): ChordSubgroup = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], subindex = subindex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordSubgroup]
  }
  @scala.inline
  implicit class ChordSubgroupOps[Self <: ChordSubgroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

