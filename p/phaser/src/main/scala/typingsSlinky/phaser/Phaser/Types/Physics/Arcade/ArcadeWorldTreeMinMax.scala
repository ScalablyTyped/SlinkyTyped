package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeWorldTreeMinMax extends js.Object {
  /**
    * The maximum x value used in RTree searches.
    */
  var maxX: Double = js.native
  /**
    * The maximum y value used in RTree searches.
    */
  var maxY: Double = js.native
  /**
    * The minimum x value used in RTree searches.
    */
  var minX: Double = js.native
  /**
    * The minimum y value used in RTree searches.
    */
  var minY: Double = js.native
}

object ArcadeWorldTreeMinMax {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): ArcadeWorldTreeMinMax = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldTreeMinMax]
  }
  @scala.inline
  implicit class ArcadeWorldTreeMinMaxOps[Self <: ArcadeWorldTreeMinMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

