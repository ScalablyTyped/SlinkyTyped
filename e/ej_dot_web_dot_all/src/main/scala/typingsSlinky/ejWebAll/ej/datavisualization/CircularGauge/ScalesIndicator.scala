package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesIndicator extends js.Object {
  /** Specify indicator height of circular gauge
    * @Default {15}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specify imageUrl of circular gauge
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.native
  /** Specify position of circular gauge
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.native
  /** Specify the various states of circular gauge
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.native
  /** Specify indicator style of circular gauge. See
    * @Default {Circle}
    */
  var `type`: js.UndefOr[IndicatorTypes | String] = js.native
  /** Specify indicator width of circular gauge
    * @Default {15}
    */
  var width: js.UndefOr[Double] = js.native
}

object ScalesIndicator {
  @scala.inline
  def apply(): ScalesIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesIndicator]
  }
  @scala.inline
  implicit class ScalesIndicatorOps[Self <: ScalesIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: ScalesIndicatorsPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withStateRanges(value: js.Array[ScalesIndicatorsStateRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: IndicatorTypes | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

