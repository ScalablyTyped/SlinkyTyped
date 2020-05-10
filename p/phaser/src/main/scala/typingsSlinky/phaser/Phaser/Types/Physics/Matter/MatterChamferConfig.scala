package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterChamferConfig extends js.Object {
  /**
    * The quality of the chamfering. -1 means 'auto'.
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * The maximum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMax: js.UndefOr[Double] = js.native
  /**
    * The minimum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMin: js.UndefOr[Double] = js.native
  /**
    * A single number, or an array, to specify the radius for each vertex.
    */
  var radius: js.UndefOr[Double | js.Array[Double]] = js.native
}

object MatterChamferConfig {
  @scala.inline
  def apply(): MatterChamferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterChamferConfig]
  }
  @scala.inline
  implicit class MatterChamferConfigOps[Self <: MatterChamferConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withQualityMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualityMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityMax")(js.undefined)
        ret
    }
    @scala.inline
    def withQualityMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualityMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualityMin")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
  }
  
}

