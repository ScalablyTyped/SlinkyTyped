package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesLabel extends js.Object {
  /** Specifies the angle of labels.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  /** Specifies the DistanceFromScale of labels.
    * @Default {null}
    */
  var distanceFromScale: js.UndefOr[ScalesLabelsDistanceFromScale] = js.native
  /** Specifies the font of labels.
    * @Default {null}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.native
  /** need to includeFirstValue.
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[Boolean] = js.native
  /** Specifies the opacity of label.
    * @Default {0}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the label Placement of label. See
    * @Default {Near}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.native
  /** Specifies the textColor of font.
    * @Default {null}
    */
  var textColor: js.UndefOr[String] = js.native
  /** Specifies the label Style of label. See
    * @Default {ej.datavisualization.LinearGauge.LabelType.Major}
    */
  var `type`: js.UndefOr[ScaleType | String] = js.native
  /** Specifies the unitText of label.
    */
  var unitText: js.UndefOr[String] = js.native
  /** Specifies the unitText Position of label.See
    * @Default {Back}
    */
  var unitTextPlacement: js.UndefOr[UnitTextPlacement | String] = js.native
}

object ScalesLabel {
  @scala.inline
  def apply(): ScalesLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesLabel]
  }
  @scala.inline
  implicit class ScalesLabelOps[Self <: ScalesLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceFromScale(value: ScalesLabelsDistanceFromScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceFromScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFromScale")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ScalesLabelsFont): Self = {
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
    def withIncludeFirstValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFirstValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFirstValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFirstValue")(js.undefined)
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
    def withPlacement(value: PointerPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ScaleType | String): Self = {
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
    def withUnitText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitText")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitTextPlacement(value: UnitTextPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitTextPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitTextPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitTextPlacement")(js.undefined)
        ret
    }
  }
  
}

