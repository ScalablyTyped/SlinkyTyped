package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesIndicator extends js.Object {
  /** Specifies the backgroundColor in bar indicators
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the border in bar indicators
    * @Default {null}
    */
  var border: js.UndefOr[ScalesIndicatorsBorder] = js.native
  /** Specifies the font of bar indicators
    * @Default {null}
    */
  var font: js.UndefOr[ScalesIndicatorsFont] = js.native
  /** Specifies the indicator Height of bar indicators
    * @Default {30}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies the opacity in bar indicators
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the position in bar indicators
    * @Default {null}
    */
  var position: js.UndefOr[ScalesIndicatorsPosition] = js.native
  /** Specifies the state ranges in bar indicators
    * @Default {Array}
    */
  var stateRanges: js.UndefOr[js.Array[ScalesIndicatorsStateRange]] = js.native
  /** Specifies the textLocation in bar indicators
    * @Default {null}
    */
  var textLocation: js.UndefOr[ScalesIndicatorsTextLocation] = js.native
  /** Specifies the indicator Style of font in bar indicators
    * @Default {ej.datavisualization.LinearGauge.IndicatorType.Rectangle}
    */
  var `type`: js.UndefOr[IndicatorTypes | String] = js.native
  /** Specifies the indicator Width in bar indicators
    * @Default {30}
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
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: ScalesIndicatorsBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ScalesIndicatorsFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
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
    def withTextLocation(value: ScalesIndicatorsTextLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLocation")(js.undefined)
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

