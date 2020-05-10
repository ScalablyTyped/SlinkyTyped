package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesLabel extends js.Object {
  /** Specify the angle for the labels of circular gauge
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  /** Specify labels autoAngle value of circular gauge
    * @Default {false}
    */
  var autoAngle: js.UndefOr[Boolean] = js.native
  /** Specify label color of circular gauge
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specify distanceFromScale value for labels of circular gauge
    * @Default {0}
    */
  var distanceFromScale: js.UndefOr[Double] = js.native
  /** Specify font for labels of circular gauge
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesLabelsFont] = js.native
  /** Specify includeFirstValue of circular gauge
    * @Default {true}
    */
  var includeFirstValue: js.UndefOr[Boolean] = js.native
  /** Specify opacity value for labels of circular gauge
    * @Default {null}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specify label placement of circular gauge. See
    * @Default {Near}
    */
  var placement: js.UndefOr[Placement | String] = js.native
  /** Specify label Style of circular gauge. See
    * @Default {Major}
    */
  var `type`: js.UndefOr[LabelType | String] = js.native
  /** Specify unitText of circular gauge
    */
  var unitText: js.UndefOr[String] = js.native
  /** Specify unitTextPosition of circular gauge. See UnitTextPosition
    * @Default {Back}
    */
  var unitTextPosition: js.UndefOr[UnitTextPlacement | String] = js.native
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
    def withAutoAngle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceFromScale(value: Double): Self = {
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
    def withPlacement(value: Placement | String): Self = {
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
    def withType(value: LabelType | String): Self = {
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
    def withUnitTextPosition(value: UnitTextPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitTextPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitTextPosition")(js.undefined)
        ret
    }
  }
  
}

